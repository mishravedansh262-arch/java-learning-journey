import java.util.*;
public class table_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter the Number that you want the table of :");
         int n = sc.nextInt();

         


         for(int i = 1; i<=10;i++){
            int mul = n*i;
            
             System.out.println("The table of "+n+" is :" +mul);

         }
        



    
        sc.close();
    }
    




} 
