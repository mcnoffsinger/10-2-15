import java.util.Scanner;
public class EvenOddSplitter{

/*
 * EvenOddSplitter
 * 
 * Name: Maxwell Noffsinger
 * 
 * Date: 10/2/25
 * 
 * Description: asks the user for 15 integers separated by spaces 
 * and splits them into even and odd lists
 * 
 * 
 */
public static Scanner scanner = new Scanner(System.in);
     public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }



    public static int[] intSplitter(String strlist){
        String[] thing = strlist.split(" ");//I had to look this method up
        int[] output = new int[thing.length];
        for (int i = 0; i < thing.length; i++){
            output[i] = Integer.parseInt(thing[i]);

        };
        return output;


    }
    public static int[] getOdds(int[] input){
        int OddCounter = 0;
        for (int number : input){
            if (number % 2 == 1){
                OddCounter++;
            }

        }
        int[] odds = new int[OddCounter];
        int oddCount = 0;
        for (int number : input){
            if(number%2 == 1){
                odds[oddCount] = number;
                oddCount ++;


            }
        }
        return odds;


    }
    public static int[] getEvens(int[] input){
        int evenCounter = 0;
        for (int number : input){
            if (number % 2 == 0){
                evenCounter++;
            }

        }
        int[] evens = new int[evenCounter];
        int evenCount = 0;
        for (int number : input){
            if(number%2 == 0){
                evens[evenCount] = number;
                evenCount ++;


            }
        }
        return evens;


    }


    public static void main(String[] args){
        System.out.println("Enter 15 integers with one space between each integer: ");
        int[] input = intSplitter(getInput(""));
        
        
        

    

        
        System.out.print("Even Numbers: ");
        for(int x : getEvens(input)){
            System.out.print(x + " ");
        }
        System.out.println("");
        System.out.print("Odd Numbers: ");
        for(int x : getOdds(input)){
            System.out.print(x + " ");
        }

    
    }

}