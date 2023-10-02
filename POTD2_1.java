import java.util.Scanner;

public class POTD2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--){
                // System.out.printf("%c", j+64);
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
        
        sc.close();
    }
}

// for (int i = 1; i <= n; i++) {
//     for (int j = 64 + n; j >=65+n-i; j--) {
//         System.out.printf("%c", j);
//     }
//     System.out.println();
// }
