import java.util.Scanner;

public class soNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số muốn kiểm tra: num=");
        int num = sc.nextInt();
        boolean flag= false;
        double square = Math.sqrt(num);
        for (int i = 2; i <= square; i++) {
            if (num % i == 0) {
                flag=false;
                break;
            } else {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Đây là số nguyên tố");
        } else {
            System.out.println("Đây ko là số nguyên tố");
        }
    }
}
