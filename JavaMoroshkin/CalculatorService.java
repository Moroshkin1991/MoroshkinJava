package JavaMoroshkin;

import java.util.Scanner;

public class CalculatorService {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int num1 = scan.nextInt();

        System.out.print("Введите 2 число: ");
        int num2 = scan.nextInt();
        float res;

        if (num1 > num2)
            System.out.println(num1 + ">" + num2);
        else if (num1 < num2)
            System.out.println(num1 + "<" + num2);
        else
            System.out.println(num1 + "=" + num2);
        System.out.println("Введите действие(+, -, *, /): ");
        String action = scan.nextLine();
        action = scan.nextLine();

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Результат: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;
            case "/":
                if(num2 == 0)
                    System.out.println("На ноль делить нельзя");
                else {
                    res = (float) num1 / num2;
                    System.out.println("Результат: " + res);
                }
                break;
        }
    }
}