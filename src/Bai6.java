import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        n = Math.abs(n);
        while (n != 0) {
            int temp = n % 10;
            sum += temp;
            n /= 10;
        }
        System.out.println("Tổng các chữ số là: " + sum);
        sc.close();
    }
}
