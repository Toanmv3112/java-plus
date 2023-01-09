public class sapXepPlus {
    public static void main(String[] args) {
        int arr[] = {3, 9, 10, 7, 8, 1, 4, 1, 6, 4, 2, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minstt = i;
//            stt: số thứ tự
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minstt = j;
                }
            }
            int trungGian = arr[i];
            arr[i] = arr[minstt];
            arr[minstt] = trungGian;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
