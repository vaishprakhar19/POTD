import java.util.Scanner;

public class POTD2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 64 + n; j >=65+n-i; j--) {
                System.out.printf("%c", j);
            }
           System.out.println();
        }
        sc.close();
    }
}
