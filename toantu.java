public class toantu {
    // toan tu + - * / %
    // toan tu ++ -- += -= 
    // toan tu ==, !=
    // toan tu ><, >=
    public static void main(String[] args) {
        int result = 3+2;
        System.out.println(result);
        int newResult = result*10;
        System.out.println(result + "*10= " + newResult);
        int previousResult=newResult;
        newResult = newResult/15;
        System.out.println(previousResult + "/15= " + newResult );
        
        newResult=previousResult%15;
        System.out.println(previousResult + "%15= " + newResult);

        newResult++; // newResult = newResult+1;
        System.out.println("the result is = "+ newResult);
        newResult--;
        System.out.println("the result is = "+ newResult);

        newResult+=2;
        // newResult = newResult+2;
        System.out.println("the result is = "+ newResult);
        newResult-=2;
        // newResult = newResult-2;
        System.out.println("the result is = "+ newResult);
 
        if(newResult==2) {
            System.out.println("The Result is 2");
        }
        if(newResult!=2) {
            System.out.println("the Result is not 2");
        }
    
        if(newResult>1) {
            System.out.println("the Result is higher than 1");
        }
        if(newResult>=2) {
            System.out.println("the Result is higher or equal than 1");
        }

        // toan tu && ||
        // toan tu boolean
        // toan tu dieu kien

        int firstNumber = 10;
        if ((firstNumber<5) && (firstNumber<15)) {
            // ca 2 dieu kien phai dung
            System.out.println("The number in the range 5 to 15");
        }

        if ((firstNumber>5) || (firstNumber<10)) {
            // 1 trong 2 dieu kien dung
            System.out.println("The number is higher 5 or lower than 10");
        }

        boolean isBoss= false;
        if(isBoss ==true) {
            System.out.println("this is boss");
        }else{
            System.out.println("this isn't boss");
        }
        
        if(isBoss=true){
            System.out.println("why run");
            // >> day chi la phep gan nen bieu thuc nay van chay
        }

        // toan tu dieu kien
        int score = 9;
        boolean ishighScore= score>8?true:false;
        if (ishighScore) {
            System.out.println(" You are get the high score");
        } else {
            System.out.println(" You are get lower score");
        }
    }   

    
}
