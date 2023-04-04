// Task_1.2. Алгоритм сортировки слиянием


public class Task_1_2 {
    public static void Select(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    index = j;
                    min = array[j];
                }
            }
            array[index] = array[i];
            array[i] = min;
        }
    }
    
    public static void main(String args[]) {
        int[] array = {50, 11, 2, 8, 354, 1};
        Select(array);
        for(int item : array){
            System.out.print(item + ", ");
        }
    }
}
