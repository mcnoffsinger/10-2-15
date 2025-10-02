import java.util.Scanner;
public class MaxDifferencer {

    /*
     * MaxDifferencer
     * 
     * Name: Maxwell Noffsinger
     * 
     * Date: 10/2/25
     * 
     * Description: Accepts multiple strings separated by spaces, 
     * then finds the difference between the largest and smallest number entered. 
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
    public static int maxDifference(int max, int min){

        return max - min;
    }

    public static void main(String[] args) {
        System.out.println("Enter numbers: ");
        int[] input = intSplitter(getInput(""));
        int min = input[0];
        int max = input[0];
        for(int i = 1;i<input.length;i++){
            if (input[i] > max){
                max = input[i];
            }
            if (input[i] < min){
                min = input[i];
            }

        }

        System.out.println("Maximum difference: " + maxDifference(max,min));

    }

    
}
