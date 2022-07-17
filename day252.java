import java.util.*;

public class day252 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        body(a, b);
        sc.close();
    }
    static void body (int a, int b){
        if(a == 0 || b == 0){
            System.out.println("Not valid fraction.");
        }
        else if(b%a == 0){
            System.out.println("1/" + b/a);
        }
        else{
            int newDenominator = b/a + 1;
            System.out.print("1/" + newDenominator + " + ");
            body((int)a*newDenominator-b, (int)b*newDenominator);
        }
    }   
}
