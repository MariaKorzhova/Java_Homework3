// Task_1.1. Алгоритм сортировки слиянием

public class Task_1_1 {
    public static void merge1(int[] arr, int length) {
        if (length < 2) {
            return;
        }
        int middle = length / 2;
        int[] LeftArr = new int[middle];
        int[] RightArr = new int[length - middle];

        for (int i = 0; i < middle; i++) {
            LeftArr[i] = arr[i];
        }
        for (int i = middle; i < length; i++) {
            RightArr[i - middle] = arr[i];
        }
        merge1(LeftArr, middle);
        merge1(RightArr, length - middle);

        merge(arr, LeftArr, RightArr, middle, length - middle);
    }

    public static void merge(int[] arr, int[] LeftArr, int[] RightArr, int middle, int right) {
        int i = 0, j = 0, k = 0;
        while (i < middle && j < right) {
            if (LeftArr[i] <= RightArr[j]) {
                arr[k++] = LeftArr[i++];
            }
            else {
                arr[k++] = RightArr[j++];
            }
        }
        while (i < middle) {
            arr[k++] = LeftArr[i++];
        }
        while (j < right) {
            arr[k++] = RightArr[j++];
        }
    }
        public static void main (String[] args) {
            int[] array = { 50, 11, 2, 8, 354, 1 };
            merge1(array, array.length);
            for (int item : array){
                System.out.print(item + ", ");
            }
    }
}
        
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Arrays;
// import java.lang.Integer;

// public class Task_1 {
//     public static List <Integer> merge_sort(List <Integer> list) {
//         if (list.size() > 1) {
//             int middle = list.size()/2;
//             int startIndex = 0;
//             int endIndex = list.size();
//             List <Integer> new_left_list = new  ArrayList(list.subList(startIndex, middle));
//             List <Integer> new_right_list = new  ArrayList(list.subList(middle, endIndex));
//         System.out.println(merge_sort(new_left_list)); 
//         merge_sort(new_right_list);}
//         return list;
//     }


    


