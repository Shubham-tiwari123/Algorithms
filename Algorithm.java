package algorithm;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Algorithm {
    
    void medianOfArray(int arr1[], int arr2[], int n){
        int i = 0;   
        int j = 0;  
        int count; 
        int m1 = -1, m2 = -1; 
        for(count=0;count<=n;count++){
            if (i == n){ 
                m1 = m2; 
                m2 = arr2[0]; 
                break; 
            } 
            else if (j == n){ 
                m1 = m2; 
                m2 = arr1[0]; 
                break; 
            } 
            if (arr1[i] < arr2[j]){    
                m1 = m2;   
                m2 = arr1[i];
                i++;
            } 
            else{ 
                m1 = m2;   
                m2 = arr2[j]; 
                j++;
            } 
        }
    }
    
    void secondSmallestNumber(int arr[]){
        int max1,max2;
        max1=max2=Integer.MAX_VALUE;
        if (arr.length < 2){ 
            System.out.println(" Invalid Input "); 
            return; 
        } 
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max1){
                max2 = max1;
                max1=arr[i];
            }
            else if (arr[i] < max2 && arr[i] != max1) 
                max2 = arr[i]; 
            
        }
        if (max2==Integer.MAX_VALUE)
            System.out.println("No second max value");
        else
            System.out.println("Smallest element:-"+max1+" second smallest:-"+max2);
    }
    
    void minAndMax(int arr[]){
        int min,max;
        min = arr[0];
        max = arr[1];
        if(arr.length==2){
            if(min>max){
                int temp = max;
                max = min;
                min = temp;
                System.out.println("min:-"+min+" max:-"+max);
            }
            else
                System.out.println("min:-"+min+" max:-"+max);
            return;
        }
        else if(arr.length<2){
            System.out.println("Invalid input");
            return;
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
            else if(arr[i]<min)
                min = arr[i];
        }
        
        System.out.println("min:-"+min+" max:-"+max);
    }
    
    void kLargestElement(Integer arr[],int key){
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0;i<key;i++)
            System.out.println(arr[i]);
    }
    
    void numberOfOccurence(int arr[],int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
                count++;
        }
        System.out.println("Count:-"+count);
    }
    
    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch(n){
            case 1: 
                int arr1[] = {1,12,15,26,38};
                int arr2[] = {2,13,17,30,45};

                int len1 = arr1.length;
                int len2 = arr2.length;

                if(len1==len2)
                    algorithm.medianOfArray(arr1,arr2,len1);
                else
                    System.out.println("Array of uneven length");
                break;
                
            case 2:
                 int arr[] = {12, 13, 1, 10, 34, 1}; 
                 algorithm.secondSmallestNumber(arr);
                 break;
                 
            case 3:
                 int arr4[] = {1000,11,445,1,330,3000}; 
                 algorithm.minAndMax(arr4);
                 break;
                 
            case 4:
                Integer arr5[] = {1, 23, 12, 9,30, 2, 50}; 
                int k = 3; 
                algorithm.kLargestElement(arr5, k);
                break;
                
            case 5:
                int arr6[] = {1,1,2,2,2,2,3};
                n=2;
                algorithm.numberOfOccurence(arr6, n);
        }
        
    }
    
}
