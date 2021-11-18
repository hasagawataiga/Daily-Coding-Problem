import java.util.*;

class day2{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter the list numbers separated by space: ");
        }while (!scanner.hasNextInt());

        List<Integer> listNumbers = new ArrayList<Integer>();

        while(!scanner.hasNext("\n")){
            listNumbers.add(scanner.nextInt());
        }

        List<Integer> ansListNumbers = new ArrayList<Integer>();
        ansListNumbers = SolveProblem(listNumbers);

        for (int i = 0; i < ansListNumbers.size(); i++) {
            System.out.print(ansListNumbers.get(i) + " ");
        }
        scanner.close();
    }
    public static List<Integer> SolveProblem(List<Integer> listNumbers){
        List<Integer> subListNumbers = new ArrayList<Integer>(listNumbers);
        for (int i = 0; i < listNumbers.size(); i++){
            subListNumbers.set(i, 1);
            for (int j = 0; j < listNumbers.size(); j++){
                if (j != i){
                    subListNumbers.set(i, subListNumbers.get(i) * listNumbers.get(j));
                }
            }
        }
        return subListNumbers;
    }
}