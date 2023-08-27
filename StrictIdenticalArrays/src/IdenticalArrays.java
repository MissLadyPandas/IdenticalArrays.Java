import java.util.Scanner;

public class IdenticalArrays {

    public static void main(String[] args) {
        // Ask user to enter two 3x3 arrays
        System.out.print("Enter list 1: ");
        int[][] list1 = getInputArray();
        
        System.out.print("Enter list2: ");
        int[][] list2 = getInputArray();

        // displays the check if identical or if not identical.
        if (areMatricesEqual(list1, list2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
    }

    // Get the 3x3 matrix input from the user
    public static int[][] getInputArray() {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    // Checks to see if the two arrays are equal to each other
    public static boolean areMatricesEqual(int[][] m1, int[][] m2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
