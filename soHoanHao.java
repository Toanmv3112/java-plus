import java.util.Scanner;

public class soHoanHao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: num=");
        int num = sc.nextInt();
        int check= 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                check+=i;
            }
        }
        if (check == num) {
            System.out.println("Đây là số hoàn hảo");
        } else {
            System.out.println("Đây ko là số hoàn hảo");
        }
    }
}
