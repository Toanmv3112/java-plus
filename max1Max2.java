public class max1Max2 {
    public static void main(String[] args) {
        int arr[] = {23, 25, 9, 6, 14, 16, 15, 8, 2, 110, 110, 6, 100};
        int max1 = arr[0];
        int max2 = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] >= max2) {
                max2 = arr[i];
            }
        }
        if (max1 != max2) {
            System.out.println("to nhất: " + max1);
            System.out.println("to nhì: " + max2);
        } else {
            System.out.println("to nhất = to nhì = " + max1);
        }
    }
}
//tìm ra số lớn nhất và số lớn thứ 2 bằng 1 vòng lặp

