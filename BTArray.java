import java.util.Arrays;

public class BTArray {
    public static void main(String[] args) {
        // Cách sắp xếp một Mảng (Array) 
        //và tìm kiếm một phần tử trong Mảng (Array) trong Java?
        // --> sử dụng phương thức sort() và binarySearch()
        int array[] = {2,5,-2,6,-3,8,0,-7,-9,-4};
        Arrays.sort(array);
        printArray("Sorted array", array);
        int index = Arrays.binarySearch(array, 2);
        System.out.println("found " + index);
    }

    private static void printArray(String string, int[] array) {
        
    }
}
