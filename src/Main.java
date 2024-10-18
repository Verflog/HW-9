public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int [] everyMondayOfMonth = new int[5];
        everyMondayOfMonth[0] = 40500;
        everyMondayOfMonth[1] = 36503;
        everyMondayOfMonth[2] = 48192;
        everyMondayOfMonth[3] = 43016;
        everyMondayOfMonth[4] = 44038;
        int monthSummary = 0;
        for (int i: everyMondayOfMonth) {
            monthSummary += i;
        }
        System.out.println("Сумма трат за месяц составила " + monthSummary + " рублей");
        System.out.println("Задание 2");
        int lowestExpenses = 1_000_000;
        int highestExpenses = 0;
        for (int i: everyMondayOfMonth) {
            if (i < lowestExpenses) {
                lowestExpenses = i;
            }
            if (i > highestExpenses) {
                highestExpenses = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + lowestExpenses + " рублей." +
                " Максимальная сумма трат за неделю составила " + highestExpenses + " рублей.");
        System.out.println("Задание 3");
        float midMonth = (float) monthSummary / everyMondayOfMonth.length;
        System.out.println("Средняя сумма трат за месяц составила " + midMonth + " рублей");
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i --) {
            System.out.print(reverseFullName[i]);
        }
    }
}