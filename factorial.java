import java.util.*;

class factorial {
    
    public static int   CalculateFactorials(int n ){
        int  factorial = 1 ;
        for (int  i =  n ; i >= 1 ; i--){
            factorial *= i;

        }
        return factorial;

    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        int factorial = CalculateFactorials(n);


       System.out.println("The factorial of the given number is : "+factorial);



    }
}
