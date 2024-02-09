package HackerRank.Praktikum2;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bilanganL = input.nextInt();

        int arr[] = new int[bilanganL];

        for(int i=0; i<bilanganL;i++){
            arr[i] = input.nextInt();
        }

        int sum = input.nextInt();

        int i=0; int j=bilanganL-1;

        while(i<j){
            if(arr[i]+arr[j]==sum){
                System.out.println(i + " " + j);
                break;
            } else if(arr[i]+arr[j]<sum){
                i++;
            } else if(arr[i]+arr[j]>sum){
                j++;
                if(j==bilanganL){
                    j=bilanganL-2;
                }
            }
        }

        
    }
}
