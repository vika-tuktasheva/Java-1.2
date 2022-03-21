public class Main {
    public static void main(String[] args) {
        int balance = 100; //баланс клиента
        int amount = 1756; //сумма пополнения

        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        int finalScore = balance + amount + bonus;//итоговый счет
        System.out.println("Ваш баланс составил: " + finalScore + " рублей. Вам начислен бонус: " + bonus);
    }
}

