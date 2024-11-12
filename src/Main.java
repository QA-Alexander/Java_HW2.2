public class Main {
    public static void main(String[] args) {
        double balance = 100; //Баланс счета в рублях
        int payment = 1100; //Платёж в рублях
        int bonus = payment / 100;
        if (bonus > 10) {
            System.out.println("Ваш бонус составил:" + bonus + "рублей(ля)");
            System.out.println("Ваш баланс:" + (balance + payment + bonus) + "рублей(ля)");
        } else {
            System.out.println("Ваш бонус составил:" + 0 + "рублей(ля)");
            System.out.println("Ваш баланс:" + (balance + payment) + "рублей(ля)");
        }
    }
}
