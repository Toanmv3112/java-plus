public class sapXepGiam {
    public static void main(String[] args) {
        int arr[] = {3, 9, 10, 4, 1, 6, 4, 2, 4, 5, 6};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int trungGian=arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1]= trungGian;
                }
            }
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }
    }
}
//sắp xếp theo thứ tự giảm dần các phần tử trong mảng