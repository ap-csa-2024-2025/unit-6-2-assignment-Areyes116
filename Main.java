import java.util.Scanner;

public class ArrayMethods
{
    
    // Problem 1: Check if array contains a negative value
    public static boolean containsNeg(double[] arr)
    {
        for (double num : arr)
        {
            if (num < 0)
            {
                return true;
            }
        }
        return false;
    }

    // Problem 2: Count numbers divisible by 3
    public static int numDivisibleBy3(int[] arr)
    {
        int count = 0;
        for (int num : arr)
        {
            if (num % 3 == 0)
            {
                count++;
            }
        }
        return count;
    }

    // Problem 3: Count numbers divisible by a given number
    public static int numDivisible(int[] arr, int num)
    {
        int count = 0;
        for (int element : arr)
        {
            if (element % num == 0)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Problem 1: containsNeg
        System.out.print("Enter array length: ");
        int length = scanner.nextInt();
        double[] doubleArr = new double[length];
        System.out.println("Enter values:");
        for (int i = 0; i < length; i++)
        {
            doubleArr[i] = scanner.nextDouble();
        }
        System.out.println("Contains negative: " + containsNeg(doubleArr));

        // Problem 2: numDivisibleBy3
        System.out.print("\nEnter array length: ");
        length = scanner.nextInt();
        int[] intArr = new int[length];
        System.out.println("Enter values:");
        for (int i = 0; i < length; i++)
        {
            intArr[i] = scanner.nextInt();
        }
        System.out.println("Number divisible by three: " + numDivisibleBy3(intArr));

        // Problem 3: numDivisible
        System.out.print("\nEnter a value for num: ");
        int num = scanner.nextInt();
        System.out.print("Enter array length: ");
        length = scanner.nextInt();
        intArr = new int[length];
        System.out.println("Enter values:");
        for (int i = 0; i < length; i++)
        {
            intArr[i] = scanner.nextInt();
        }
        System.out.println("Num divisible by " + num + ": " + numDivisible(intArr, num));

        scanner.close();
    }
}
