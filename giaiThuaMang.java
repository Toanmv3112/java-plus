public class giaiThuaMang {
    public static void main(String[] args) {
        int arr[] = {3, 4, 10, 4, 5, 6, 4, 2, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Giai thừa của " + arr[i] + " là:");
            int ketQua = giaiThua(arr[i]);
            System.out.println(ketQua);
        }
    }

    public static int giaiThua(int a) {
        int giaiThua = 1;
        for (int i = 1; i <= a; i++) {
            giaiThua *= i;
        }
        return giaiThua;
    }

}
