package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "";
        double result = 0;
        for (;;) {
            System.out.println("Enter the equation : ");
            str = s.nextLine();
            if (str.equalsIgnoreCase("quit")) {
                break;
            } else {
                result = calculator(str); //call the first method
                System.out.println(str + " = " + result);
            }
        }

    }

    //first method
    private static double calculator(String a) {
        ArrayList<Double> numbers = new ArrayList<>();
        ArrayList<Integer> operands = new ArrayList<>();
        int i,j=0,counter=0;
        String brac = "";
        double numb = 0, value = 0,num = 0;
        double res = 0;
        char ch = ' ';

        for (i = 0; i < a.length(); i++) {  //loop to read the equation char by char
            numb = 0;
            ch = a.charAt(i);
            if(a.charAt(i) == 's'){
                if(i>0){
                    if (Character.isDigit(a.charAt(i - 1))) {
                        operands.add(3);
                }
                }
                while(ch != '('){
                    ch = a.charAt(++i);
                }
                String lol = a.substring(i+1);
                double value2 = calculator2(lol);
                double temp = Math.sin(value2);
                numbers.add(temp);
                while(ch != ')'){
                    ch = a.charAt(++i);
                }
            }
            else if(a.charAt(i) == 'c'){
                if(i>0){
                    if (Character.isDigit(a.charAt(i - 1))) {
                        operands.add(3);
                }
                }
                while(ch != '('){
                    ch = a.charAt(++i);
                }
                String lol = a.substring(i+1);
                double value2 = calculator2(lol);
                double temp = Math.cos(value2);
                numbers.add(temp);
                while(ch != ')'){
                    ch = a.charAt(++i);
                }
            }
            else if(a.charAt(i) == 't'){
                if(i>0){
                    if (Character.isDigit(a.charAt(i - 1))) {
                        operands.add(3);
                }
                }
                while(ch != '('){
                    ch = a.charAt(++i);
                }
                String lol = a.substring(i+1);
                double value2 = calculator2(lol);
                double temp = Math.tan(value2);
                numbers.add(temp);
                while(ch != ')'){
                    ch = a.charAt(++i);
                }
            }
            else if (Character.isDigit(ch)) {    //check the character is a digit
                while (Character.isDigit(ch)) {
                    int digit = ch - '0';       //convert the digit from char(ascii code) to int
                    numb = numb * 10 + digit;   //if more than one digit in the number
                    if (i == a.length() - 1) {  //if the char is the last char in the equation, it will break and start the calculation
                        i++;
                        break;
                    }
                    if (i < a.length() - 1) {   //move to the next char
                        ch = a.charAt(++i);
                    }
                }
                numbers.add(numb);     //save the number into the array list (numbers)
                i--;                   //to neutralize from the i++ in the for loop
            } else if (ch == '(') {
                if (i > 0) {            //if the user use bracket as a multiply operand eg : 2(3+1)
                    if (Character.isDigit(a.charAt(i - 1))) {
                        operands.add(3);
                    }
                }
                brac = a.substring(i + 1);  //get the string inside the parantheses
                value = calculator2(brac);  //call the second method
                numbers.add(value);
                while (true) {                  /*move the value of i until it meets to ')' index
                                                bcs already calculate the string inside the paratheses*/
                    ch = a.charAt(++i);
                   if(counter>0){
                    if(ch == '('){
                        i = j;
                        break;
                    }
                   }
                    if (ch == ')') {
                        counter++;
                        j = i;
                    }
                    if (i == a.length() - 1) {
                        ch = a.charAt(j);
                        i = j;
                        break;
                    }
                }
            }
//             else if (ch == ')') {
//                while (a.charAt(i) == ')') {
//                    /*to move at the furthest ')' if 
//                                                         there are multiple paratheses eg 2+3-(2+4+(3*2-(10/2+3)))-10*/
//                    if (i == a.length() - 1) {
//                        break;
//                    } else if (i < a.length() - 1) {
//                        ch = a.charAt(++i);
//                    }
//                }
//            }
               else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {      //to save the operands into the arraylist : operands
                switch (ch) {
                    case '+':
                        operands.add(1);
                        break;
                    case '-':
                        operands.add(2);
                        break;
                    case '*':
                        operands.add(3);
                        break;
                    case '/':
                        operands.add(4);
                        break;
                }
            }
        }

        //for the calculation
        int b = 0;
        while (b < operands.size()) {
            if (operands.get(b) == 3) {
                numbers.set(b, numbers.get(b) * numbers.get(b + 1));
                operands.remove(b);
                numbers.remove(b + 1);
                b = 0;
            } else if (operands.get(b) == 4) {
                numbers.set(b, numbers.get(b) / numbers.get(b + 1));
                operands.remove(b);
                numbers.remove(b + 1);
                b = 0;
            } else {
                b = b + 1;
            }
        }
        int c = 0;
        while (c < operands.size()) {
            if (operands.get(c) == 1) {
                numbers.set(c, numbers.get(c) + numbers.get(c + 1));
                operands.remove(c);
                numbers.remove(c + 1);
                c = 0;
            } else if (operands.get(c) == 2) {
                numbers.set(c, numbers.get(c) - numbers.get(c + 1));
                operands.remove(c);
                numbers.remove(c + 1);
                c = 0;
            }
        }
        res = numbers.get(0);
        return res;
    }

    //second method (basically the same with the first, except at the ')' part
    //just to calculate any string inside paratheseses
    private static double calculator2(String b) {
        ArrayList<Double> numbers = new ArrayList<>();
        ArrayList<Integer> operands = new ArrayList<>();
        int i, counter = 0;
        String brac = "";
        double numb = 0, value = 0,num = 0;
        double res = 0;
        char ch = ' ';

        for (i = 0; i < b.length(); i++) {
            numb = 0;
            ch = b.charAt(i);
            if(b.charAt(i) == 's'){
                if(i>0){
                    if (Character.isDigit(b.charAt(i - 1))) {
                        operands.add(3);
                }
                }
                while(ch != '('){
                    ch = b.charAt(++i);
                }
                ch = b.charAt(++i);
                while(Character.isDigit(ch)){
                    int dig = ch - '0';
                    num = num * 10 + dig;
                    if(b.charAt(i+1) == ')'){
                        break;
                    }
                    ch = b.charAt(++i);
                }
                double temp = Math.sin(num);
                numbers.add(temp);
                i++;
            }
            else if(b.charAt(i) == 'c'){
                if(i>0){
                    if (Character.isDigit(b.charAt(i - 1))) {
                        operands.add(3);
                }
                }
                while(ch != '('){
                    ch = b.charAt(++i);
                }
                ch = b.charAt(++i);
                while(Character.isDigit(ch)){
                    int dig = ch - '0';
                    num = num * 10 + dig;
                    if(b.charAt(i+1) == ')'){
                        break;
                    }
                    ch = b.charAt(++i);
                }
                double temp = Math.cos(num);
                numbers.add(temp);
                i++;
            }
            else if(b.charAt(i) == 't'){
                if(i>0){
                    if (Character.isDigit(b.charAt(i - 1))) {
                        operands.add(3);
                }
                }
                while(ch != '('){
                    ch = b.charAt(++i);
                }
                ch = b.charAt(++i);
                while(Character.isDigit(ch)){
                    int dig = ch - '0';
                    num = num * 10 + dig;
                    if(b.charAt(i+1) == ')'){
                        break;
                    }
                    ch = b.charAt(++i);
                }
                double temp = Math.tan(num);
                numbers.add(temp);
                i++;
            }
            else if (Character.isDigit(ch)) {
                while (Character.isDigit(ch)) {
                    int digit = ch - '0';
                    numb = numb * 10 + digit;
                    if (i == b.length() - 1) {
                        i++;
                        break;
                    }
                    if (i < b.length() - 1) {
                        ch = b.charAt(++i);
                    }
                }
                numbers.add(numb);
                i--;
            } else if (ch == '(') {
                if (Character.isDigit(b.charAt(i - 1))) {
                    operands.add(3);
                }
                brac = b.substring(i + 1);
                value = calculator2(brac);
                numbers.add(value);
                while (b.charAt(i) != ')') {
                    ch = b.charAt(++i);
                }
            } else if (ch == ')') {
                if (i == b.length() - 1) {
                    break;
                } else if (i < b.length() - 1) {
                    ch = b.charAt(++i);
                }
                break;
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                switch (ch) {
                    case '+':
                        operands.add(1);
                        break;
                    case '-':
                        operands.add(2);
                        break;
                    case '*':
                        operands.add(3);
                        break;
                    case '/':
                        operands.add(4);
                        break;
                }
            }
        }

        int d = 0;
        while (d < operands.size()) {
            if (operands.get(d) == 3) {
                numbers.set(d, numbers.get(d) * numbers.get(d + 1));
                operands.remove(d);
                numbers.remove(d + 1);
                d = 0;
            } else if (operands.get(d) == 4) {
                numbers.set(d, numbers.get(d) / numbers.get(d + 1));
                operands.remove(d);
                numbers.remove(d + 1);
                d = 0;
            } else {
                d = d + 1;
            }
        }
        int c = 0;
        while (c < operands.size()) {
            if (operands.get(c) == 1) {
                numbers.set(c, numbers.get(c) + numbers.get(c + 1));
                operands.remove(c);
                numbers.remove(c + 1);
                c = 0;
            } else if (operands.get(c) == 2) {
                numbers.set(c, numbers.get(c) - numbers.get(c + 1));
                operands.remove(c);
                numbers.remove(c + 1);
                c = 0;
            }
        }
        res = numbers.get(0);
        return res;
    }
}
        
