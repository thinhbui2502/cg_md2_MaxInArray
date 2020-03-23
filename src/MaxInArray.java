import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter the size of array: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Wrong! Size should not exceed 20 ");
            }
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }

        System.out.print("List of elements:");
        for (int value : array) {
            System.out.print(value + "\t");
        }

        int max = array[0];
        for (int value : array) {
            if (max < value) {
                max = value;
            }
        }
        System.out.println("The largest element in the array is: " + max);
    }
}
