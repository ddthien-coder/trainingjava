public class Vonglapfor {
    public static void main(String[] args) {
        // for(int i=0; i<10;i++){
        //     System.out.println("Day la so :" + i);
        // }

        // for(int i=9; i>=0;i--){
        //     System.out.println("Day la so :" + i);
        // }

        // in ra cac so nguyen to nho hon 100
        int count=0;
        for(int i=1;i<100; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println(i+ " la so nguyen to");
            }     
        }
        System.out.println("Co Tong cong "+ count + " la so nguyen to tu 1 den 100");
    }
    public static boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }
        for(int i=2; i<=num/2; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
