package sort;

import java.util.Arrays;

/**
 * Created by JasonHe on 2018/8/15.
 * 插入排序
 */
public class InsertSort {

    static void insertSort(int []a){
        for(int i=1;i<a.length;i++){
            if(a[i] < a[i-1]){
                int key = a[i];
                int j=i-1;
                while (j>=0){
                    if(key < a[j]){
                        a[j+1] = a[j];
                        j--;
                    }else{
                        break;
                    }
                }
                a[j+1] = key;
            }
            System.out.println(i+1+"==="+Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        int []a ={10,20,15,0,6,7,2,1,-5,55};
        insertSort(a);
    }
}
