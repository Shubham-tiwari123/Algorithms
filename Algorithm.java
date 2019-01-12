package algorithm;

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
        }
        
    }
    
}
