public class btDoWhile {
    public static void main(String[] args) {
        int num=1;
        // kiem tra dieu kien truoc
        while (num<10) {
            System.out.println("Day la so " + num);
            num++;
        }
        // = for(int i=0; i<10; i++) {}

        // do while thuc thi it nhat 1 lan

        do {
            System.out.println(" Day la so "+ num);
            num++;
        } while (num<10);
        
        // ko muon in ra so mong muon 
        // continue ko thuc hien cac dong lenh cuoi va tro ve ban dau va bat dau vong lap moi

        do {
            num++;
            if(num == 5 || num ==6) {
                continue;
            }
            System.out.println(" Day la so "+ num);
        } while (num<10);
    }
}
