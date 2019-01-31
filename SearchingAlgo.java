package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class SearchingAlgo {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                int arr1[] = {1, 12, 15, 26, 38};
                int arr2[] = {2, 13, 17, 30, 45};

                int len1 = arr1.length;
                int len2 = arr2.length;

                if (len1 == len2) {
                    medianOfArray(arr1, arr2, len1);
                } else {
                    System.out.println("Array of uneven length");
                }
                break;

            case 2:
                int arr[] = {12, 13, 1, 10, 34, 1};
                secondSmallestNumber(arr);
                break;

            case 3:
                int arr4[] = {1000, 11, 445, 1, 330, 3000};
                minAndMax(arr4);
                break;

            case 4:
                Integer arr5[] = {1, 23, 12, 9, 30, 2, 50};
                int k = 3;
                kLargestElement(arr5, k);
                break;

            case 5:
                int arr6[] = {1, 1, 2, 2, 2, 2, 3};
                n = 2;
                numberOfOccurence(arr6, n);
                break;

            case 6:
                Integer arr7[] = {4, 3, 6, 2, 1, 1};
                findRepeatingAndMissing(arr7);
                break;

            case 7:
                int arr8[] = {-10, -1, 0, 3, 10, 11, 30, 50, 100};
                n = arr8.length;
                int ans = fixedPoint(arr8, 0, n - 1);
                System.out.println("fixed point is:-" + ans);
                break;

            case 8:
                int arr9[] = {1, 3, 50, 10, 9, 7, 6};
                System.out.println("Maximum element:-"
                        + findLargestElement(arr9, 0, (arr9.length - 1)));
                break;

            case 9:
                int arr10[] = {1, 8, 30, 40, 100};
                n = 60;
                findDifference(arr10, n);
                break;
        }
    }

    public void medianOfArray(int arr1[], int arr2[], int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2[0];
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1[0];
                break;
            }
            if (arr1[i] < arr2[j]) {
                m1 = m2;
                m2 = arr1[i];
                i++;
            } else {
                m1 = m2;
                m2 = arr2[j];
                j++;
            }
        }
    }

    public void secondSmallestNumber(int arr[]) {
        int max1, max2;
        max1 = max2 = Integer.MAX_VALUE;
        if (arr.length < 2) {
            System.out.println(" Invalid Input ");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] < max2 && arr[i] != max1) {
                max2 = arr[i];
            }

        }
        if (max2 == Integer.MAX_VALUE) {
            System.out.println("No second max value");
        } else {
            System.out.println("Smallest element:-" + max1 + " second smallest:-" + max2);
        }
    }

    public void minAndMax(int arr[]) {
        int min, max;
        min = arr[0];
        max = arr[1];
        if (arr.length == 2) {
            if (min > max) {
                int temp = max;
                max = min;
                min = temp;
                System.out.println("min:-" + min + " max:-" + max);
            } else {
                System.out.println("min:-" + min + " max:-" + max);
            }
            return;
        } else if (arr.length < 2) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("min:-" + min + " max:-" + max);
    }

    public void kLargestElement(Integer arr[], int key) {
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < key; i++) {
            System.out.println(arr[i]);
        }
    }

    public void numberOfOccurence(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println("Count:-" + count);
    }

    public void findRepeatingAndMissing(Integer arr[]) {
        Arrays.sort(arr);
        int num1 = arr[0];
        int count = 0;
        int repeatedNum = 0;
        int missingNumber;
        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(arr[i], arr[i + 1])) {
                count++;
                repeatedNum = arr[i];
                break;
            }
        }
        System.out.println(repeatedNum);
    }

    public int fixedPoint(int arr[], int start, int end) {
        if (end >= start) {
            int mid = (start + end) / 2;
            System.out.println("mid:-" + mid);
            if (mid == arr[mid]) {
                System.out.println("mid2_" + mid);
                return mid;
            }
            if (mid > arr[mid]) {
                return fixedPoint(arr, (mid + 1), end);
            } else {
                return fixedPoint(arr, start, (mid - 1));
            }
        }
        return -1;
    }

    public int findLargestElement(int arr[], int start, int end) {

        if (start == end) {
            return arr[start];
        }

        if ((start == end + 1) && arr[start] >= arr[end]) {
            return arr[start];
        }

        if ((start == end + 1) && arr[start] < arr[end]) {
            return arr[end];
        }

        int mid = (start + end) / 2;

        if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
            return arr[mid];
        }

        if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]) {
            return findLargestElement(arr, start, mid - 1);
        } else {
            return findLargestElement(arr, mid + 1, end);
        }
    }

    public int findDifference(int arr[], int n) {
        int size = arr.length;
        int i = 0, j = 1;
        while (i < size && j < size) {
            if (i != j && arr[j] - arr[i] == n) {
                System.out.print("Found:(" + arr[i] + "," + arr[j] + ")");
                return 0;
            } else if (arr[j] - arr[i] < n) {
                j++;
            } else {
                i++;
            }
        }
        System.out.print("No such pair");
        return -1;
    }
}
