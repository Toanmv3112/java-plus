import java.util.Scanner;

public class ktKyTuVaMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi đi nào!");
        String chuoi = sc.nextLine();
        System.out.println("Nhập ký tự muốn kiểm tra: ");
        char kyTu = sc.next().charAt(0);
        char arr[] = chuoi.toCharArray();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (kyTu == arr[i]) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("có trùng bạn ơi");
        } else {
            System.out.println("không trùng chữ nào");
        }
    }
}
//nhập vào 1 chuỗi và 1 ký tự. Kiểm tra xem chuỗi có chứa ký tự ko?
