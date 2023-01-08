import java.util.Scanner;

public class daySoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dương n: ");
        int n = sc.nextInt();
        System.out.println("So nguyen to nho hon hoac bang n la: ");
        if (n == 2) {
            System.out.println("2");
        } else if (n == 3) {
            System.out.print("2, 3");
        } else {
            System.out.print("2, 3");
            soNguyenTo(n);
        }
    }

    public static void soNguyenTo(int a) {
        for (int i = 4; i <= a; i++) {
            boolean flag = true;
            double cBH = Math.sqrt(i);
            for (int j = 2; j <= cBH; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.print(", " + i);
            }
        }
    }
}
//Nhập vào số nguyên dương n, in ra các số nguyên tố nhỏ hơn hoặc bằng n
