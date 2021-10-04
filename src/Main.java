import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int initialBalance = 100; //Начальный баланс в 100 рублей
        int bonus; //Бонусные баллы
        int finalBalance; //Окончательный баланс

        Scanner console = new Scanner(System.in);
        System.out.println("Введите пополняемую сумму");
        int additionalBalance = console.nextInt();
        if (additionalBalance >= 1000) {
            bonus = additionalBalance / 100;
            finalBalance = initialBalance + additionalBalance + bonus;
            System.out.println("Дополнительный бонус составит: " + bonus + "\nОкончательный баланс составит: " + finalBalance);
        } else {
            finalBalance = initialBalance + additionalBalance;
            System.out.println("К сожалению пополняемой суммы недостаточно для начисления бонусов \nОкончательный баланс составит: " + finalBalance);
        }
    }
}
