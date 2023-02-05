

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ввведите два числа: ");
        double num1 = reader.nextDouble();
        double num2 = reader.nextDouble();
        double sumz = 0;
        int oper = 1;
        while (oper == 1) {
            sumz = sum(num1, num2);
            System.out.printf("Ваш результат:" +  + sumz);
            System.out.println("\nДля продолжения вычислений с результатом введите 1, для отмены операции нажмите 0, для выхода из калькулятора введите 10");
            System.out.println("ввод:");
            oper = reader.nextInt();
            if (oper == 1) {
                System.out.println("Введите второе число: ");
                num1 = sumz;
                num2 = reader.nextDouble();
            }
            if (oper == 0) {
                while (oper == 0){
                    double sumz_prom = sum(num1,num2);
                    System.out.println(sumz_prom);
                    System.out.println("Для продолжения вычислений с результатом введите 1, для отмены операции нажмите 0, для выхода из калькулятора введите 10");

                    oper = reader.nextInt();
                    if (oper == 1) num1 = sumz_prom;
                    System.out.println("Введите второе число: ");
                    num2 = reader.nextDouble();

                }

            }
            if (oper == 10) break;

        }

    }

    public static double sum(double num1, double num2) {
        double ans = 0;
        System.out.print("\nВведите оператор действия (+, -, *, /): ");
        char op;
        Scanner reader = new Scanner(System.in);
        op = reader.next().charAt(0);
        switch (op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
            default:
                System.out.printf("Ошибка! Неверный оператор!");

        }
        return ans;
    }
}



