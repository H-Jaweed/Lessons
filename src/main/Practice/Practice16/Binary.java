package Practice16;

import java.util.*;

public class Binary {
    static int binary_serarch(int[] my_arr, int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right = left) / 2;
            if (my_arr[mid] == x) {
                return mid;
            }
            if (my_arr[mid] > x) {
                return binary_serarch(my_arr, left, mid - 1, x);
            } else if (my_arr[mid] > x) {
                return binary_serarch(my_arr, mid + 1, right, x);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {23, 43, 12, 55, 76, 45};

    }

    public static Integer[] getRandomArray(int range, int numberCount) {
        Random random = new Random();
        Integer[] arr = new Integer[numberCount];
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < numberCount; i++) {
            list.add(random.nextInt(12));
        }
        int i=0;
        for (Integer a : list) {
            arr[i++] = a;
        }
        return arr;
    }
}
