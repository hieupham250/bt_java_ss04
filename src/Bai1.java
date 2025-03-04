import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if (n < 0) {
            System.out.println("Số nhập vào ko hợp lệ");
            return;
        }
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tổng các số từ 1 đến "+ n + " là: " + sum);
        sc.close();
    }
}
