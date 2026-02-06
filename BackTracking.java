public class BackTracking {
    /*public static void ChangeArr(int arr[], int i, int val){
        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }

        //recursion
        arr[i]=val;
        ChangeArr(arr, i+1, val+1);//final call step
        arr[i]=arr[i]-2;
    }
    public static void printArr(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        ChangeArr(arr, 0, 1);
        printArr(arr);

    }*/










    /*public static void findSubset(String str, String ans, int i){
        //Base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
             return;
        }

        //recursion
        //yes choice
        findSubset(str, ans+str.charAt(i), i+1);
        //No choice
        findSubset(str, ans, i+1);
    }
    public static void main(String args[]){
       String str="abc";
        findSubset(str," ", 0);
    }*/








public static void findPermutation(String str, String ans){
    //Base case
    if(str.length()==0){
        System.out.println(ans);
        return;
    }
    //recursion
    for(int i=0; i<str.length(); i++){
        char curr=str.charAt(i);
        //"abcde"=>"ab"+"de="abde"
        String Newstr=str.substring(0,i)+str.substring(i+1);
        findPermutation(Newstr,ans+curr);
    }
}
public static void main(String args[]){
    String str="abc";
    findPermutation(str, " ");
}

}
