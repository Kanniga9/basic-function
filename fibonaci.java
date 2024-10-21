import java.util.Scanner;
class fibonaci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row = sc.nextInt();
        int a = 0, b = 1;
        int next;
        int count=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                if(count==9)
                break;
                System.out.print(a + " ");
                next = a + b;
                a = b;
                b = next;
                count++;
            }
            System.out.println();
        }
    }
}
