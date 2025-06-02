import java.util.Scanner;

public class MinMaxInArray {
    public static void main(String[] args) {
        MinAndMax();
    }

    public static void MinAndMax() {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of elements you want in array: ");
        int size = input.nextInt();

        int[] MyArray = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("Enter Element " + (i + 1) + ": ");
            MyArray[i] = input.nextInt();
            i++;
        }
        // int [] MyArray = { 12, 43, 56, 78, 32, 98, 67, 54, 37 };

        int minimum = MyArray[0];
        int maximum = MyArray[0];

        for (int j = 1; j < MyArray.length; j++) {
            if (MyArray[j] < minimum) {
                minimum = MyArray[j];
            }
            if (MyArray[j] > maximum) {
                maximum = MyArray[j];
            }
        }

        System.out.println("Minimum Number in array is: " + minimum);
        System.out.println("Maximum Number in array is: " + maximum);

    }
}
