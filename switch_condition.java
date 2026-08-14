import java.util.*;

public class switch_condition {
    public static void main(String[] args) {
        System.out.println("Press a button (1, 2, or 3):");
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();

    switch (button){
        case 1:
            System.out.println("hello");
            break;
        case 2:
            System.out.println("hola");
            break;
        case 3:
            System.out.println("bonjour");
            break;
        default:
            System.out.println("Invalid button");
    }
    
    sc.close();
    }
}
