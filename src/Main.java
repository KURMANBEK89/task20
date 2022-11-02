import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Days days = Days.valueOf(s.toUpperCase());
        switch (days) {
            case MONDAY, WEDNESDAY, FRIDAY -> System.out.println(days.getName() + " kunu uchim Java");
            case TUESDAY -> System.out.println(days.getName() + " kunu uchim English i Java practise");
            case THURSDAY -> System.out.println(days.getName() + " kunu uchim Soft Skills i Java practice");
            case SATURDAY -> System.out.println(days.getName() + " kunu tolko Java practice");
            case SUNDAY -> System.out.println(days.getName() + " kunu we have a rest");
        }
    }
}