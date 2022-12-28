public class Main {
    public static void main(String[] args) {
        int amount = 500;
        int payment = 1100;

        int bonus;

        if (payment >= 1100) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int balance = amount + payment + bonus;
        System.out.println("Баланс пополнен!" + "Сумма пополнения:" + payment + "рублей." + "Бонусов начислено:" + bonus);
        System.out.println("Ваш баланс:" + balance);
    }
}