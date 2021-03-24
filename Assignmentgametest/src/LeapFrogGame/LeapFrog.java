package LeapFrogGame;

import java.util.ArrayList;
import java.util.Scanner;

public class LeapFrog {

    public static void main(String[] args) {
        ArrayList<Character> movement = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String move;
        char[] space = new char[9];
        int i;
        System.out.println("==========WELCOME TO TRANSFER.IO GAME==========");
        System.out.println("To win this game, YOU HAVE TO MOVE ALL THE CIRCLES TO THE X POSITION AND ALL THE X TO THE CIRCLES POSITION");
        System.out.println("circle only can jump over an x, and x only can jump over a circle. GOODLUCK!");
        System.out.println();
        System.out.println();
        System.out.print("Enter O/o to move 'o'");
        System.out.print("        Enter X/x to move 'x'");
        System.out.println("        Enter \"reset\" to restart");
        for (i = 0; i < 4; i++) {
            if (i == 0) {
                space[i] = '(';
                System.out.print(space[i]);
            } else {
                space[i] = 'o';
                System.out.print(space[i]);
            }
        }
        space[4] = '_';
        System.out.print(space[4]);
        i = i + 1;
        for (i = 5; i < 9; i++) {
            if (i == 8) {
                space[i] = ')';
                System.out.print(space[i]);
            } else {
                space[i] = 'x';
                System.out.print(space[i]);
            }
        }
        System.out.println();
        for (;;) {
            if(movement.contains('1') && movement.contains('0')){
                System.out.println("There is no more possible move to win !");
                System.out.println("You lose !");
                break;
            }
            move = sc.nextLine();
            
            if (move.equalsIgnoreCase("reset")) {
                for (i = 0; i < 4; i++) {
                    if (i == 0) {
                        space[i] = '(';
                        System.out.print(space[i]);
                    } else {
                        space[i] = 'o';
                        System.out.print(space[i]);
                    }
                }
                space[4] = '_';
                System.out.print(space[4]);
                i = i + 1;
                for (i = 5; i < 9; i++) {
                    if (i == 8) {
                        space[i] = ')';
                        System.out.print(space[i]);
                    } else {
                        space[i] = 'x';
                        System.out.print(space[i]);
                    }
                }
                System.out.println();
            } else if (move.equalsIgnoreCase("o")) {
                int j = 0;
                while (j < space.length) {
                    if (space[j] == 'o') {
                        if (space[j + 1] == 'o' || space[j + 1] == ')') {
                            j++;
                            movement.add('0');
                            continue;
                        } else if (space[j + 1] == '_') {
                            space[j] = '_';
                            space[j + 1] = 'o';
                            movement.clear();
                            for (i = 0; i < space.length; i++) {
                                System.out.print(space[i]);
                            }
                            System.out.println();
                        } else if (space[j + 1] == 'x') {
                            if (space[j + 2] == 'x' || space[j + 2] == 'o' || space[j + 2] == ')') {
                                j++;
                                movement.add('0');
                                continue;
                            } else if (space[j + 2] == '_') {
                                space[j + 2] = 'o';
                                space[j] = '_';
                                movement.clear();
                                for (i = 0; i < space.length; i++) {
                                    System.out.print(space[i]);
                                }
                                System.out.println();
                            }
                        }
                    }
                    j++;
                }
            } else if (move.equalsIgnoreCase("x")) {
                int j = 8;
                while (j >= 0) {
                    if (space[j] == 'x') {
                        if (space[j - 1] == 'x' || space[j - 1] == '(') {
                            j--;
                            movement.add('1');
                            continue;
                        } else if (space[j - 1] == '_') {
                            space[j] = '_';
                            space[j - 1] = 'x';
                            movement.clear();
                            for (i = 0; i < space.length; i++) {
                                System.out.print(space[i]);
                            }
                            System.out.println();
                        } else if (space[j - 1] == 'o') {
                            if (space[j - 2] == 'x' || space[j - 2] == 'o' || space[j - 2] == '(') {
                                j--;
                                movement.add('1');
                                continue;
                            } else if (space[j - 2] == '_') {
                                space[j - 2] = 'x';
                                space[j] = '_';
                                movement.clear();
                                for (i = 0; i < space.length; i++) {
                                    System.out.print(space[i]);
                                }
                                System.out.println();
                            }
                        }
                    }
                    j--;
                }
            } else {
                System.out.println("Use o or x key to move");
            }
            if (space[1] == 'x' && space[2] == 'x' && space[3] == 'x' && space[5] == 'o' && space[6] == 'o' && space[7] == 'o') {
                System.out.println("YOU WIN !");
                break;
            }
        }
    }
}
