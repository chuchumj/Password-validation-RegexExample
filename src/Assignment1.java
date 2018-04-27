import java.util.Scanner;
public class Assignment1 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        final long startTime = System.currentTimeMillis();
        int h = Smax2(a, n);
        final long endTime = System.currentTimeMillis();
        final long duration = endTime - startTime;
        System.out.println("array sum = " + h + " and it took : " + duration + " ms");
    }

    static int Smax2(int[] a, int n) {
        int Smax = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + a[j];
                if (Smax < sum) {
                    Smax = sum;
                }
            }
        }
        return Smax;
    }
}