import java.util.*;

class day4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();           //Create a list to store numbers from input {6-9}
        while(scanner.hasNextInt()){
            numbers.add(scanner.nextInt());
        }
        Integer[] numbersArr = new Integer[numbers.size()];         //Create an array to store numbers from list {10-11}        
        numbersArr = numbers.toArray(numbersArr);
        if (numbers.size() == 0){                                   //Check if the input is empty {12-16}
            System.out.println("No suitable answer.");
            scanner.close();
            return;
        }
        Arrays.sort(numbersArr);
        boolean checked = false;
        for (int i = 0; i < (numbersArr.length - 1); i++){          //Loop for looking for the missing number in the array.
            if (numbersArr[i] >= 0 &&                               //Check if there is an element is greater than or equal to 0
            (numbersArr[i + 1] - numbersArr[i] >= 2)){              // and the gap between this element and the next element is bigger than 1, for ex:3 and 5 (3>0 and 5-3>1 then the missing element is 4).
                System.out.println(numbersArr[i] + 1);              //i is from 0 to [numbersArr.length - 1], prevent the exception out of range because
                checked = true;                                     // we have call numbersArr[i+1] in the block.
                break;
            }
        }
        if (!checked && (numbersArr[numbersArr.length-1]>= 0)){     //Another case, when the input has at least one positive element and those are in order
            System.out.println(numbersArr[numbersArr.length-1] + 1);// we output the maximum element + 1.
        }                                                           
        else{
            System.out.println("No suitable answers.");
        }
        scanner.close();        
    }
}