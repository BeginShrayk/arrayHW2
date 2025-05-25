//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Task 1");
        int[] arrayPayMonth = {100_000, 35_000, 70_000, 175_000, 30_000};
        int SumMonth = 0;
        for (int i = 0; i < arrayPayMonth.length; i++) {
            SumMonth += arrayPayMonth[i];
        }
        System.out.println("Сумма трат за месяц составила " + SumMonth + " рублей.");

        // task 2
        System.out.println("Task 2");
        int[] arrayPayWeek = {25_000, 17_000, 84_000, 10_000, 3_000};
        int minWeek = arrayPayWeek[0];
        int maxWeek = arrayPayWeek[0];
        for (int i = 0; i < arrayPayWeek.length; i++) {
            if (arrayPayWeek[i] > maxWeek){
                maxWeek = arrayPayWeek[i];
            }
            if (arrayPayWeek[i] < minWeek){
                minWeek = arrayPayWeek[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minWeek + " рублей. Максимальная сумма трат за неделю составила " + maxWeek + " рублей.");

        // task 3
        System.out.println("Task 3");
        int[] arrayPayMonthMedium = {200_000, 35_000, 48_000, 76_000, 84_000};
        double payMonthMedium = 0;
        int payMonth = 0;
        for (int i = 0; i < arrayPayMonthMedium.length; i++) {
            payMonth += arrayPayMonthMedium[i];
            payMonthMedium = payMonth / arrayPayMonthMedium.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + payMonthMedium + " рублей.");

        // task 4
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I' };

        int start = 0;
        int end = reverseFullName.length - 1;

        while (start < end) {
            char temp = reverseFullName[start];
            reverseFullName[start] = reverseFullName[end];
            reverseFullName[end] = temp;
            start++;
            end--;
        }

        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
    }
}