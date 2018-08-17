package sort;

import java.util.Arrays;

/**
 * Created by JasonHe on 2018/8/15.
 * 选择排序
 */
public class SelectSort {

    static void SelectSort(int []a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    swap(a,i,j);
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }

    static int[] swap(int []a,int start,int end){
        int tmp = a[start];
        a[start] = a[end];
        a[end] = tmp;
        return a;
    }

    public static void main(String[] args) {
        int []a ={10,20,15,0,6,7,2,1,-5,55};
        SelectSort(a);
    }
}
