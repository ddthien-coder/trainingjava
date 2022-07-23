public class kieusothuc {
    // kieu dau phẩy động
    // double 8 bytes (64bit)
    // float 4 bytes (32bit)

    public static void main(String[] args) {
        int firstVar=5;
        float firstFloat=5.0f;
        double firstDouble=5.0d;

        int finalVar = firstVar/2;
        float finalFloat = firstFloat/2;
        double finalDouble= firstDouble/2;

        System.out.println(finalVar);
        System.out.println(finalFloat);
        System.out.println(finalDouble);

        // tinh dien tich hinh tron co bán kính là 5
        // s=PI*r^2;
        System.out.println("dien tich hinh tron: " + (3.14*5*5));
    }
}
