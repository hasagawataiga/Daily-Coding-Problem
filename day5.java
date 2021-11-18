import java.util.Scanner;

public class day5 {
    public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    int firstNum = scanner.nextInt();
    int secondNum = scanner.nextInt();
    Cons pair = new Cons(firstNum, secondNum);
    System.out.println("First element is: " + pair.car());
    System.out.println("Second element is: " + pair.cdr());
    scanner.close();     
    }    

}
class Cons {
        private int num1 = 0;
        private int num2 = 0;
        public Cons(int num1, int num2){
            this.num1 = num1;
            this.num2 = num2;
        }
        public int car(){
            return this.num1;
        }
        public int cdr(){
            return this.num2;
        }
}
