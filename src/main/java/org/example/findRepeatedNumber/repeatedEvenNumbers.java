package org.example.findRepeatedNumber;

import java.util.Arrays;
import java.util.List;

public class repeatedEvenNumbers {
    static boolean isFind(int[] arr,int value){
        for(int i : arr ){
            if(i==value)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {3,2,2,3,2,9,10,21,1,10,10};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0 ; i<list.length;i++){
            int count = 0;
            if(list[i]%2 == 0){
                for (int j =0;j<list.length;j++) {
                    if (list[i] == list[j]){
                        count ++;
                    }
                }

                if(!isFind(duplicate,list[i])&&count >1){
                    duplicate[startIndex++]= list[i];
                }
            }
        }
        for (int x = 0; x<duplicate.length;x++){
            if(duplicate[x]!=0){
                System.out.println(duplicate[x]);
            }
        }

    }
}
