/**
 * Method
 * Phuong thuc or Ham
 */
public class Method {

    // 1 nhom code co muc dich chung nao do
    // 1 khoi tap trung cac dong code 
    // muc dich thuan tien cho viec su dung lai

    public static void main(String[] args) {
        int a=5;
        int b=10;
        int c=15;
        int min;
        min = findSmallLestNumber(a, b);
        System.out.println("So nho nhat trong 2 so 5 vaf 10 la:" + min );
        int mins = findSmallLestNumber(a, b, c);
        int minss = findSmallLestNumber2(a, b, c);
        System.out.println("So nho nhat trong 3 so " +a +","+b+ "," + c+ " la: "+ mins);
        System.out.println("So nho nhat trong 3 so " +a +","+b+ "," + c+ " la: "+ minss);
    }

// Overloading cho phép một lớp có khả năng định nghĩa ra nhiều phương thức có cùng tên, 
// nhưng khác nhau về tham số truyền vào
    public static int findSmallLestNumber(int a, int b) {
        int min;
        if(a<=b) {
            min=a;
        }else {
            min=b;
        }
        return min;
    }


    public static int findSmallLestNumber(int a, int b, int c) {
        int min=0;
        min = findSmallLestNumber(a, findSmallLestNumber(b, c));
        return min;
     
    }

    public static int findSmallLestNumber2(int a, int b, int c) {
        int min;
        if ((a<=b) && (a<=c)) {
            min=a;
        } else if ((b <=a) && (b<=c)) {
            min=b;
        } else {
            min=c;
        }
        return min;
     
    }

}