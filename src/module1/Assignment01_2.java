package module1;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by merkulovvs on 4/24/2017.
 */
public class Assignment01_2 {
    public static void main(String[] args) {

        int[] initArray = new int[5];
        int[] sortedAarray = new int[5];
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            sortedAarray[i] = in.nextInt();
        }

        for(int i = 0; i < 5; i++)
            initArray[i] = sortedAarray[i];

        int temp;
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++){
               if(sortedAarray[j] > sortedAarray[j+1]){
                   temp = sortedAarray[j+1];
                   sortedAarray[j+1] = sortedAarray[j];
                   sortedAarray[j] = temp;
               }
            }

        System.out.println("\nInitial array: " + Arrays.toString(initArray));
        System.out.println("Sorted array: " + Arrays.toString(sortedAarray));
    }
}
