package sort;

import java.util.Arrays;

/**
 * Created by JasonHe on 2018/8/15.
 * 快速排序
 */
public class QuickSort {

    static void quickSort(int []a,int low,int high){
        if(low >= high || low<0 || high > (a.length-1)){
            System.out.println("low="+low+";high="+high);
            return;
        }
        int begin = low;
        int end = high;
        int key = a[low];
        while(low < high){
            while(key <= a[high] && low < high){
                high--;
            }
            a[low] = a[high];
            a[high] = key;
            while(key >= a[low] && low < high){
                low++;
            }
            a[high] = a[low];
            a[low] = key;
            System.out.println(Arrays.toString(a));
        }
        quickSort(a,begin,low-1);
        quickSort(a,high+1,end);
    }



    public static void main(String[] args) {
        int []a ={10,20,15,0,6,7,2,1,-5,55};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
