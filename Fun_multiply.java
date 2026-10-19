import java.util.*;
class Fun_multiply {
    public static int CalculateMultiply(int a,int b){
        int multiply = a*b;

        return multiply;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First value for the multiplication : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second value for the multipliction : ");
        int b = sc.nextInt();

        int multiply = CalculateMultiply(a, b);
        System.out.println("The Multipliction of both Numbers is : " +multiply);

    }
    
}
