import java.util.*;
class day283{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number N:");
        int n = sc.nextInt();
        printRegularNumber(n);
    }
    static void printRegularNumber(int n){
        for(int i = 0; i < n; i++){
            System.out.print(30*(i+1) + " ");
        }
    }
}