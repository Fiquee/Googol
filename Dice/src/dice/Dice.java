package dice;

import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("How many dice you want to roll? (1-6) ");
        for (;;) {

            num = s.nextInt();
            if (num == 0) {
                System.out.println("you can't roll 0 die");
                System.out.println("Enter 1-6 only");
                continue;
            } else if (num > 6) {
                System.out.println("Enter 1-6 only");
                continue;
            } else if (num < 0) {
                System.out.println("are you okay?");
                System.out.println("Enter 1-6 only");
                continue;
            }
            switch (num) {
                case 1:
                    rolldice(num);
                    System.out.println("How many dice you want to roll? (1-6)");
                    break;
                case 2:
                    rolldice(num);
                    System.out.println("How many dice you want to roll? (1-6)");
                    break;
                case 3:
                    rolldice(num);
                    System.out.println("How many dice you want to roll? (1-6)");
                    break;
                case 4:
                    rolldice(num);
                    System.out.println("How many dice you want to roll? (1-6)");
                    break;
                case 5:
                    rolldice(num);
                    System.out.println("How many dice you want to roll? (1-6)");
                    break;
                case 6:
                    rolldice(num);
                    System.out.println("How many dice you want to roll? (1-6)");
                    break;
            }
        }
    }

    public static void rolldice(int a) {
        int sum = 0;
        Random r = new Random();
        int[] dice = new int[6];
        for (int i = 0; i < a; i++) {
            dice[i] = r.nextInt(6) + 1;
            sum = sum + dice[i];
        }
        if (a == 1) {
            System.out.println("You roll " + sum + "\n");
        } else {
            for (int j = 0; j < a; j++) {
                System.out.println("You roll " + dice[j]);
            }
            System.out.println("The total is : " + sum + "\n");
        }
    }
}
