import java.util.Scanner;

public class Kiemtranamnhuan1LeapYear {
    // nam nhuan (leap year)
    // chia het cho 4 va ko chia het cho 100
    // hoac la chia het cho 400
    // 2004,2005,2000,1900,1800

    public static void main(String[] args) {
        System.out.println("Input the year: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int year = scanner.nextInt();
            if((year%4==0) && (year%100!=0)) {
                System.out.println("Year: "+ year + " is the leap year");
            }else if (year%400==0) {
                System.out.println("Year: "+ year + " is the leap year");
            } else {
                System.out.println("Year: "+ year + " isn't the leap year");
            }
        }
    }
}
