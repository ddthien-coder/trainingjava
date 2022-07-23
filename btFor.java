import java.util.Scanner;

public class btFor {
 // tam giac so
    public static void main(String[] args) {
        System.out.println("Input the number of rows: ");
        Scanner scanner= new Scanner(System.in);
        int rows = scanner.nextInt();
        System.out.println("-----------------------");
        for (int i=1; i<=rows; i++) {
            for(int j=1;j<=i;j++) {
                 // in ra so 1
                // System.out.print(j);
                // System.out.print(i);
                if((i+j)%2==1){
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
    
}
