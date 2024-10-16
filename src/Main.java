import java.util.Arrays;

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
        Arrays.sort(everyMondayOfMonth);
        System.out.println("Минимальная сумма трат за неделю составила " + everyMondayOfMonth[0] + " рублей." +
                " Максимальная сумма трат за неделю составила " + everyMondayOfMonth[4] + " рублей.");
        System.out.println("Задание 3");
        float midMonth = (float) monthSummary / everyMondayOfMonth.length;
        System.out.println("Средняя сумма трат за месяц составила " + midMonth + " рублей");
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char letter;
        for (int i = 0; i < reverseFullName.length / 2; i ++) {
            letter = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = letter;
        }
        System.out.println(reverseFullName);
    }
}