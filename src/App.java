import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    static int inputSizeOfArray() {
        System.out.print("Enter the size of array:");
        return scanner.nextInt();
    }

    static int[] inputArray(int sizeOfArray) {
        int[] intArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.printf("Enter item number '%d':", i);
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    static void showArray(int[] neededToShowArray) {
        for (int index = 0; index < neededToShowArray.length; index++) {
            System.out.print(" " + neededToShowArray[index] + " ");
        }

    }

    static int[] reverseArray(int[] neededToReveseArray) {
        for (int i = 0; i < neededToReveseArray.length / 2; i++) {
            int temp = neededToReveseArray[i];
            neededToReveseArray[i] = neededToReveseArray[neededToReveseArray.length - 1 - i];
            neededToReveseArray[neededToReveseArray.length - 1 - i] = temp;
        }
        return neededToReveseArray;
    }

    public static void main(String[] args) {
        int sizeOfArray = inputSizeOfArray();
        int[] neededToProcess = inputArray(sizeOfArray);

        System.out.print("Array before reverse:");
        showArray(neededToProcess);
        System.out.println("\n");
        int[] reservedArray = reverseArray(neededToProcess);
        System.out.print("Array after reverse:");
        showArray(reservedArray);


    }
}
