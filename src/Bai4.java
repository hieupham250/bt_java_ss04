import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            sum += n;
        }
        System.out.println("Tổng các số đã nhập là: " + sum);
        sc.close();
    }
}
