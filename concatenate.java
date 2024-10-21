import java.util.Arrays;
import java.util.Scanner;

public class concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        int[] res = new int[a + b];

        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < b; i++) {
            arr2[i] = sc.nextInt();
        }

        System.arraycopy(arr1, 0, res, 0, a);
        System.arraycopy(arr2, 0, res, a, b);

        System.out.println("Concatenated array: " + Arrays.toString(res));
    }
}
