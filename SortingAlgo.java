package algorithm;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SortingAlgo {
    
    public void start(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n) {
            case 1: List<Integer> arr = new LinkedList<>();
                    arr.add(2);
                    arr.add(5);
                    arr.add(2);
                    arr.add(8);
                    arr.add(5);
                    arr.add(6);
                    arr.add(8);
                    arr.add(8);
                    sortElementByFrequency(arr);
                    break;
            case 2: 
                    break;
        }
    }
    void sortElementByFrequency(List<Integer> arr){
        HashMap<Integer,Integer> hashMap = new HashMap();
        for(int i=0;i<arr.size();i++){
            if(hashMap.isEmpty()){
                hashMap.put(arr.get(i), 1);
            }
            else{
                if(hashMap.containsKey(arr.get(i))){
                    int num = hashMap.get(arr.get(i));
                    num =num+1;
                    hashMap.replace(arr.get(i), num);
                }
                else
                    hashMap.put(arr.get(i), 1);
            }
        }
        for(int i=0;i<hashMap.size()-1;i++){
            int min_idx = hashMap.get(i);
            for(int j=i+1;j<hashMap.size();j++)
                if(hashMap.get(j)<hashMap.get(min_idx))
                    min_idx=j;
        }
        System.out.println("hash:-"+hashMap);
    }
}
