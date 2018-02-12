import java.io.*;
import java.util.Scanner;

public class SortAlgorithms {
	public static void main(String[] args) throws IOException {
		int[] array = getArray();

		while(true) {
			System.out.println("\n1) Show Array\n2) Bubble Sort Array\n3) Selection Sort Array\n4) Insertion Sort Array\n5) Simple Search\n6) Binary Search w/o Recursion\n7) Binary Search w/ Recursion\n8) Reset Array\n9) Quit\n");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
            int q;
			switch (n) {
				case 1:
					showArray(array);
					break;
				case 2:
					bubbleSort(array);
					break;
				case 3:
					selectionSort(array);
					break;
				case 4:
					insertionSort(array);
					break;
                case 5:
                    System.out.println("What element would to count?");
                    q = sc.nextInt();
					simpleSearch(array, q);
					break;
				case 6:
                    insertionSort(array);
                    System.out.println("What element would you like the index of?");
                    q = sc.nextInt();
					binarySearch(array, q);
					break;
                case 7:
                    insertionSort(array);
                    System.out.println("Recursive Binary Search\n");
                    System.out.println("What element would you like the index of?");
                    q = sc.nextInt();
                    int lengthOfArr = array.length;
    				int answer = binarySearchRec(array, 0, lengthOfArr - 1, q);
                    if (answer == -1)
                        System.out.println("Element not in the array :(");
                    else
                        System.out.println("Element at index " + answer);
    				break;
                case 8:
					array = getArray();
					break;
				case 9:
					System.exit(0);
					break;
				default:
					System.out.println("NOT ALLOWED");
					break;
			}
		}
	}

	public static int[] getArray() throws IOException {
		int[] intArray = MakeArrayFromFile.getArray();
		return intArray;
	}

	public static void showArray(int[] array) {
			for(int x = 0; x < array.length; x++) {
				System.out.println(array[x]);
			}
	}

	public static void bubbleSort(int[] array) {
		System.out.println("Bubble Sort\n");
		int n;
        int h = 0;
        outerloop:
        for (int x = 0; x < 10000; x++) {
            for (int i = array.length-1; i > 0; i--) {
                if (array[i] < array[i-1]) {
                    h = 0;
                    n = array[i-1];
                    array[i-1] = array[i];
                    array[i] = n;
                } else {
                    h++;
                    if (h == array.length) {
                        break outerloop;
                    }
                }
            }
        }
	}

	public static void selectionSort(int[] array) {
		System.out.println("Selection Sort\n");
		int i, j;
		int len = array.length;
        int temp;

        for (j = 0; j < len-1; j++) {
             int iMin = j;
             for (i = j+1; i < len; i++) {
                 if (array[i] < array[iMin]) {
                     iMin = i;
                 }
             }

             if (iMin != j) {
                 temp = array[iMin];
                 array[iMin] = array[j];
                 array[j] = temp;
             }
        }
	}

	public static void insertionSort(int[] array) {
		System.out.println("Insertion Sort\n");
		int n = array.length;

        for(int i = 1; i < n; i++) {
            int j = i - 1;
            int temp = array[i];

            while(j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                j--;;
            }

            array[j + 1] = temp;
		}

	}

    public static void simpleSearch(int[] array, int query) {
        int count = 0;
        for (int iter = 0; iter < array.length; iter++) {
            if (iter == query) {
                count++;
            }
        }
        System.out.println(query + " appears in the array " + count + " times!");
    }

    public static void binarySearch(int[] array, int query) {
		System.out.println("Iterative Binary Search\n");
        int low = 0;
        int high = array.length - 1;
        boolean found = false;

        while (low <= high) {

            int index = low + (high-1)/2;

            if (array[index] == query) {
                System.out.println(query + " is at index " + index + "\n");
                found = true;
                break;
            }
            if (array[index] < query){
                low = index+1;
            }
            else {
                high = index-1;
            }
        }

        if (found == false) {
            System.out.println(query + " is not in the array");
        }
    }

    public static int binarySearchRec(int[] array, int low, int high, int query) {
        int index = (low + high)/2;
        if (high >= low) {
            if (array[index] == query)
                return index;
            if (array[index] > query)
                return binarySearchRec(array, low, index - 1, query);
            return binarySearchRec(array, index + 1, high, query);
        }
        return -1;
	}
}
