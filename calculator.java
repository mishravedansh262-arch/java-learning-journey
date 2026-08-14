
import java.util.*;
 class calculator {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the first number :");
        a = sc.nextInt();
        System.out.println("Enter the second number :");
        b = sc.nextInt();
        System.out.println("Enter the operator (+, -, *, /, %):");

        String sign = sc.next();    

        switch(sign){
            
            case "+":
                System.out.println("The sum is : " + (a+b));
                break;
            case "-":
                System.out.println("The difference is : " + (a-b));
                break;
            case "*":
                System.out.println("The product is : " + (a*b));
                break;
            case "/":
                System.out.println("The quotient is : " + (a/b));
                break;
            case "%":
                System.out.println("The remainder is : " + (a%b));
                break;    
            default:
                System.out.println("Invalid operator");
        }


    }
    
}
   
