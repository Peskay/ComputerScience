// Thomas Huber 1/17/2018
// tryed to make selection sort
// but whoops accidentally independantly invented bubble sort ¯\_(ツ)_/¯
// #accidentalgenius
public class SelectionSort {
    public static void main(String[] args) {
        int[] unsorted = {42, 193, 289, 1492, 3, 25, 12, 1776, 1814, 302, 357, 454, 500, 7, 1912, 2012, 350, 1525, 911, 1};
        int n;
        int h = 0;
        outerloop:
        for (int x = 0; x < 10000; x++) {
            for (int i = 0; i < unsorted.length-1; i++) {
                if (unsorted[i] < unsorted[i+1]) {
                    h = 0;
                    n = unsorted[i+1];
                    unsorted[i+1] = unsorted[i];
                    unsorted[i] = n;
                } else {
                    h++;
                    if (h == unsorted.length) {
                        break outerloop;
                    }
                }
            }
        }
        for (int i = unsorted.length-1; i >= 0; i--) {
            System.out.print(unsorted[i] + " ");
        }
    }
}
