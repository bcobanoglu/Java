package timsort_app;

import java.util.Arrays;
/*İlk olarak, diziyi belirli bir boyutta küçük parçalara böler ve her parçayı sıralamak için insertionSort metodunu kullanır. 
 * Ardından, birleştirme işlemi yapılır ve dizinin parçaları birleştirilerek sıralı bir dizi elde etmek için merge metodunu kullanır.*/
public class timsort {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 3, 4, 8, 11, 6};
        System.out.println("Dizi öncesi: " + Arrays.toString(array));
        
        timSort(array);
        
        System.out.println("Dizi sonrası: " + Arrays.toString(array));
    }
    
    public static void timSort(int[] array) {
        int minMerge = 32;
        int n = array.length;
        
        for (int i = 0; i < n; i += minMerge) {
            insertionSort(array, i, Math.min((i + minMerge - 1), (n - 1)));
        }
        
        int size = minMerge;
        
        while (size < n) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1), (n - 1));
                
                merge(array, left, mid, right);
            }
            
            size = 2 * size;
        }
    }
    
    public static void insertionSort(int[] array, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= left && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            
            array[j + 1] = key;
        }
    }
    
    public static void merge(int[] array, int left, int mid, int right) {
        int[] leftArray = Arrays.copyOfRange(array, left, mid + 1);
        int[] rightArray = Arrays.copyOfRange(array, mid + 1, right + 1);
        
        int i = 0, j = 0, k = left;
        
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            
            k++;
        }
        
        while (i < leftArray.length) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        
        while (j < rightArray.length) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
