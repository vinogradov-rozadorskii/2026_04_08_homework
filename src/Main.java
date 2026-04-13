import java.time.LocalDate;
import java.time.Year;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        checkIsLeapYear(2022);
        checkIsLeapYear(2025);

        System.out.println("Задача 2");
        defineAppVersion(0, 2022);
        defineAppVersion(1, 2026);

        System.out.println("Задача 3");
        printCardDeliveryDistance(40);
        printCardDeliveryDistance(90);
        printCardDeliveryDistance(190);

    }

    public static void checkIsLeapYear(int year) {
        if (Year.isLeap(year)) {
            System.out.println(year + " - високосный год");
        } else {
                System.out.println(year + " - не високосный год");
        }
    }

    public static void defineAppVersion(int mobileOs, int mobileYear) {
        int currentYear = LocalDate.now().getYear();

        String mobileOsName = switch (mobileOs) {
            case 0 -> "iOS";
            case 1 -> "Android";
            default -> "неизвестная ОС";
        };

        if (mobileYear != currentYear) {
            System.out.println("Установите облегченную версию приложения для " + mobileOsName);
        } else {
            System.out.println("Установите обычную версию приложения для " + mobileOsName);
        }
    }

    public static int calcCardDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void printCardDeliveryDistance(int distance) {
        int days = calcCardDeliveryDays(distance);

        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
}