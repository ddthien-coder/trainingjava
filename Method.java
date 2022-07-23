/**
 * Method
 * Phuong thuc or Ham
 */
public class Method {

    // 1 nhom code co muc dich chung nao do
    // 1 khoi tap trung cac dong code 
    // muc dich thuan tien cho viec su dung lai

    public static void main(String[] args) {
        int min;
        min = findSmallLestIn2Number(5, 10);
        System.out.println("So nho nhat trong 2 so 5 vaf 10 la:" + min );
        int a=5;
        int b=10;
        int c=15;
        int mins = findSmallLestIn3Number(a, b, c);
        int minss = findSmallLestIn3Number2(a, b, c);
        System.out.println("So nho nhat trong 3 so " +a +","+b+ "," + c+ " la: "+ mins);
        System.out.println("So nho nhat trong 3 so " +a +","+b+ "," + c+ " la: "+ minss);
    }


    public static int findSmallLestIn2Number(int a, int b) {
        int min;
        if(a<=b) {
            min=a;
        }else {
            min=b;
        }
        return min;
    }


    public static int findSmallLestIn3Number(int a, int b, int c) {
        int min=0;
        min = findSmallLestIn2Number(a, findSmallLestIn2Number(b, c));
        return min;
     
    }

    public static int findSmallLestIn3Number2(int a, int b, int c) {
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