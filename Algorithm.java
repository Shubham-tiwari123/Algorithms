package algorithm;
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
    
    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();
        int arr1[] = {1,12,15,26,38};
        int arr2[] = {2,13,17,30,45};
        
        int len1 = arr1.length;
        int len2 = arr2.length;
        
        if(len1==len2)
            algorithm.medianOfArray(arr1,arr2,len1);
        else
            System.out.println("Array of uneven length");
    }
    
}
