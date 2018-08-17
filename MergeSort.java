package sort;

import java.util.Arrays;

/**
 * Created by JasonHe on 2018/8/16.
 */
public class MergeSort {

    /**
     * 归并排序
     * @param a
     * @param low
     * @param mid
     * @param high
     */
    static  void mergerSort(int []a, int low, int mid, int high){
        int []tmp = new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while (i <= mid && j <= high){
            if(a[i] < a[j]){
                tmp[k] = a[i];
                i++;
            }else{
                tmp[k] = a[j];
                j++;
            }
            k++;
        }
        while (i <= mid){
            tmp[k] = a[i];
            k++;
            i++;
        }
        while (j <= high){
            tmp[k] = a[j];
            k++;
            j++;
        }
        k=0;
        for(int t=low;t<=high;t++){
            a[t]=tmp[k++];
        }
        System.out.println("low="+low+";mid="+mid+";high="+high+";tmp:"+Arrays.toString(tmp) + ";a:"+Arrays.toString(a));
    }

    //递归
    static void sortRecursion(int []a,int low,int high){
        int mid = (low+high)/2;
        if(low < high){
            sort(a,low,mid);
            sort(a,mid+1,high);
            mergerSort(a,low,mid,high);
        }

    }

    static void sort(int []a,int low,int high){
        int i=low;
        int n=1;
        int inHigh;
        while (n < a.length){
            System.out.println("n="+n+"-----------------");
            inHigh = i+2*n-1;
            while((inHigh) < high){
                mergerSort(a,i,(2*i+2*n-1)/2,inHigh);
                i=i+2*n;
                inHigh = i+2*n-1;
            }
            if((i+n) < a.length){
                //如果末尾还有未归并的，并且剩余的数量小于n，把剩余的进行排序
                mergerSort(a,i,i+n-1,a.length-1);
            }
            n=n*2;
            i=low;
        }
    }


    public static void main(String[] args) {
//        int []a ={10,20,15,0,6,7,2,1,-5,55};
        int []a ={7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(a));
        sort(a,0,a.length);
//        sortRecursion(a,0,a.length-1);
    }
}
