// Thomas Huber

public class SelectionSort {
    public static void main(String[] args) {

        int[] a = {42, 193, 289, 1492, 3, 25, 12, 1776, 1814, 302, 357, 454, 500, 7, 1912, 2012, 350, 1525, 911, 1};
        int i, j;
        int n = a.length;
        int temp;

        for (j = 0; j < n-1; j++) {
             int iMin = j;
             for (i = j+1; i < n; i++) {
                 if (a[i] < a[iMin]) {
                     iMin = i;
                 }
             }

             if (iMin != j) {
                 temp = a[iMin];
                 a[iMin] = a[j];
                 a[j] = temp;
             }
        }

        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
