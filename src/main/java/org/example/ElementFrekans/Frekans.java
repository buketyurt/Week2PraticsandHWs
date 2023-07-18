package org.example.ElementFrekans;

import java.util.Arrays;

public class Frekans {
    static boolean isFind(int[] arr,int value){
        for(int i : arr ){
            if(i==value)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int startedIndex= 0;
        int[] array= {10, 20, 20, 10, 10, 20, 5, 20};
        int[] visited = new int[array.length];
        System.out.println("Dizi: "+Arrays.toString(array)+"\nTekrar Sayıları");
        for (int i = 0; i<array.length;i++) {
            if (!isFind(visited, array[i])) {
                int count= 0;
                for (int j = 0; j < array.length; j++) {

                    if (array[i] == array[j]) {
                        count++;
                    }
                }
                System.out.println(array[i] +" sayısı "+ count + " kere tekrar edildi.");
                visited[startedIndex++] = array[i];
            }
        }

    }
}
