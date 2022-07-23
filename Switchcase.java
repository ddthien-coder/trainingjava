public class Switchcase {
    public static void main(String[] args) {
        int a =2;
        // int, short,byte,char,enum,string
        if(a==1) {
            System.out.println("Gia tri a la 1");
        }else if(a==2) {
            System.out.println("Gia tri a la 2");
        }else if (a==3) {
            System.out.println("Gia tri a la 3");
        } else {
            System.out.println("Khong phai gia tri 1,2,3");
        }
        // thay the bang switch
        switch (a) {
            case 1:
                System.out.println("Gia tri a la 1");
                break;
            case 2:
                System.out.println("Gia tri a la 2");
                break;
            case 3:
                System.out.println("Gia tri a la 3");
                break;    
            default:
                System.out.println("Khong phai gia tri 1,2,3");
                break;
        }
    }

}
