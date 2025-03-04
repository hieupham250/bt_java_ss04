import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Không phải số nguyên tố");
            return;
        }
        Boolean check = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println(n + " không phải là số nguyên tố");
        } else {
            System.out.println(n + " là số nguyên tố");
        }
        sc.close();
    }
}
