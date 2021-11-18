import java.util.Scanner;
import java.util.*;

class day1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the list of number: ");
        int k = scanner.nextInt();
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();
        boolean checked = false;
        System.out.println("Enter the list: ");
        while(scanner.hasNextInt()){
            int i = scanner.nextInt();
            listNumbers.add(i);
        }
        for(int i = 0; i < listNumbers.size(); i++){
            for(int j = i + 1; j < listNumbers.size(); j++){
                if (listNumbers.get(i) + listNumbers.get(j) == k)
                    checked = true;
            }
        }
        scanner.close();
        if (checked)
            System.out.println(true);
        else
            System.out.println(false);

    }
}

