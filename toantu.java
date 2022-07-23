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
    }   

    
}
