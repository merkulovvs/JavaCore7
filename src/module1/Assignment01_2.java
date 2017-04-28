package module1;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by merkulovvs on 4/24/2017.
 */
public class Assignment01_2 {
    public static void main(String[] args) {

        int[] array = new int[5];
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < array.length; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            array[i] = in.nextInt();
        }

        System.out.println("\nInitial array: " + Arrays.toString(array));

        int temp;
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++){
               if(array[j] > array[j+1]){
                   temp = array[j+1];
                   array[j+1] = array[j];
                   array[j] = temp;
               }
            }

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
