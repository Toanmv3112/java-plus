import java.util.Scanner;

public class soNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào năm và tháng: ");
        System.out.println("Năm: ");
        int year = sc.nextInt();
        System.out.println("Tháng: ");
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng " + month + " năm " + year + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng " + month + " năm " + year + " có 30 ngày");
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("tháng " + month + " năm " + year + " có 29 ngày");

                } else System.out.println("tháng " + month + " năm " + year + " có 28 ngày");

        }
    }
}
//nhập vào tháng và năm, in ra tháng, năm đó có bao nhiêu ngày
