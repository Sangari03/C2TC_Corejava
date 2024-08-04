package array;

import java.util.Arrays;
import java.util.Random;

public class array4
{
    public static void main(String [] args)
    {
        int[] numbers;
        numbers = new int [20];
        Random rand = new Random(2621); 
        int maxRange = 65;
        int minRange = 20;
 
        for(int i=0; i<20; i++)
        {
            numbers[i] = rand.nextInt(maxRange - minRange + 1) + minRange;       
        }
 
        Arrays.sort(numbers);
    }
}