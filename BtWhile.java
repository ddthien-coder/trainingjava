import java.util.Scanner;

/**
 * BtWhile
 * Tinh tong cac chu so khi biet 1 so cho truoc
 */
public class BtWhile {
    //3456 chia 10 du 6
    //345 chia 10 du 5
    //34 chia 10 du 4
    //3 chia 10 du 3

    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int temp=number;
        while (temp>0) {
            sum+= temp%10;
            temp=temp/10;
            
        }
        System.out.println("Sum of digits: " + number + " is: " + sum);
    }
    
}