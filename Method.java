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
        min = findSmallLestNumber(5, 10);
        System.out.println("So nho nhat trong 2 so 5 vaf 10 la:" + min );
    }
    

    public static int findSmallLestNumber(int a, int b) {
        int min;
        if(a<=b) {
            min=a;
        }else {
            min=b;
        }
        return min;
    }

}