public class DivideandConquer {
    //mergeSort
/*public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" "); 
   }
   System.out.println();
}

public static void mergeSort(int arr[], int si,int ei){
    if(si>=ei){
        return;
    }

    int mid=si+(ei-si)/2;//mid ((si+ei)/2)
    mergeSort(arr, 0, mid);//left part of arr
    mergeSort(arr,mid+1, ei);//right part of arr
    merge(arr,si,ei,mid);
}
public static void merge(int arr[], int si,int mid,int ei){
    //left(0,3)=4 and right(4,6)=3 -> 6-0+1=7
    int temp[]=new int[ei-si+1];
    int i=si;//iterator for left part
    int j=mid+1;//iterator for right part
    int k=0; //iterartor for temp arr

    while(i<=mid && j<= ei){
        if(arr[i]<arr[j]){
            temp[k]=arr[i];
            i++;
        }
        else{
            temp[k]=arr[j];
            j++;
           
        }
         k++;
    }
    //left part
    while(i<=mid){
        temp[k++]=arr[i++];
    }
    //right part
    while(j<=ei){
        temp[k++]=arr[j++];
    }
    //copy temparary to my originat arr
    for(k=0, i=si; k<temp.length; k++, i++){
        arr[si+i]=temp[k];
    }
}
public static void main(String args[]){
    int arr[]={6,3,9,5,2,8};
    mergeSort(arr, 0, arr.length-1);
    printArr(arr);
}*/












public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" "); 
   }
   System.out.println();
}

public static void QuickSort(int arr[], int si,int ei){
    if(si>=ei){
        return;
    }
    //last element
    int pIdx=partition(arr,si,ei );
    QuickSort(arr, si, pIdx-1);//left
    QuickSort(arr, pIdx+1, ei);//Right
}

public static int partition(int arr[], int si, int ei){
    int pivot=arr[ei];
    int i=si-1;//to make a place for els smaller than pivot

    for(int j=si; j<=ei; j++){
        if(arr[j]<pivot){
            i++;
            //Swap
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
    }
      i++;
         //Swap
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
}
public static void main(String args[]){
    int arr[]={6,3,9,8,2,5,-2,-5};
    QuickSort(arr, 0, arr.length-1);
    printArr(arr);
}

}
    

