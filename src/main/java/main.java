import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first;
        System.out.println("Enter ur 1st number");
        first = scanner.nextInt();
        int second;
        System.out.println("Enter ur 2nd number");
        second = scanner.nextInt();
        int multiply;
        System.out.println("What is the multiply of these two numbers?");
        multiply = scanner.nextInt();

        if (multiply==first*second) {
            System.out.println("Correct");
        } else
            System.out.println("Not correct");
        }

        }


