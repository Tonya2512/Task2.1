public class Main {
    public static void main(String[] args) {
        int initialBalance = 6700;
        int addend = 1800;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }
        int finalBalance = initialBalance + addend + bonus;
        System.out.println("Итоговый счёт: " + finalBalance);
        System.out.println("Бонус: " + bonus);
    }
}


