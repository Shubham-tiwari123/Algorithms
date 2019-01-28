package algorithm;
import java.util.Scanner;
public class Algorithm {

    public static void main(String[] args) {
        SearchingAlgo searchingAlgo = new SearchingAlgo();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                int arr1[] = {1, 12, 15, 26, 38};
                int arr2[] = {2, 13, 17, 30, 45};

                int len1 = arr1.length;
                int len2 = arr2.length;

                if (len1 == len2) {
                    searchingAlgo.medianOfArray(arr1, arr2, len1);
                } else {
                    System.out.println("Array of uneven length");
                }
                break;

            case 2:
                int arr[] = {12, 13, 1, 10, 34, 1};
                searchingAlgo.secondSmallestNumber(arr);
                break;

            case 3:
                int arr4[] = {1000, 11, 445, 1, 330, 3000};
                searchingAlgo.minAndMax(arr4);
                break;

            case 4:
                Integer arr5[] = {1, 23, 12, 9, 30, 2, 50};
                int k = 3;
                searchingAlgo.kLargestElement(arr5, k);
                break;

            case 5:
                int arr6[] = {1, 1, 2, 2, 2, 2, 3};
                n = 2;
                searchingAlgo.numberOfOccurence(arr6, n);
                break;

            case 6:
                Integer arr7[] = {4, 3, 6, 2, 1, 1};
                searchingAlgo.findRepeatingAndMissing(arr7);
                break;
                
            case 7:
                int arr8[] = {-10, -1, 0, 3 , 10, 11, 30, 50, 100}; 
                n = arr8.length;
                int ans= searchingAlgo.fixedPoint(arr8, 0, n-1);
                System.out.println("fixed point is:-"+ans);
                break;
                
            case 8:
                int arr9[]=  {1, 3, 50, 10, 9, 7, 6}; 
                System.out.println("Maximum element:-"+
                        searchingAlgo.findLargestElement(arr9, 0, (arr9.length-1)));
                break;
                
            case 9:
                int arr10[]={1, 8, 30, 40, 100};
                n =60;
                searchingAlgo.findDifference(arr10, n);
                break;
        }

    }

}
