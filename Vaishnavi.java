import java.util.*;
public class Vaishnavi{
/*public static void main(String args[]){
  int Counter=1;
  while(Counter<=10){
    System.out.println(Counter);
    Counter++;
  }
}*/





/*public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int renge=sc.nextInt();
     int counter=1;

     while(counter<=renge){
        System.out.print(counter + " ");
        counter++;
     }
     System.out.println();
}*/








/*public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int sum=0;
  int i=1;

  while(i<=n){
    sum += i;
    i++;
  }
  System.out.println("Sum is : "+ sum);
}*/






/*public static void main(String args[]){
  for(int i=1; i<=10; i++){
    System.out.println("hello World");
  }
*/







  /*public static void main(String args[]){
  //for(int i=0; i<4; i++){
       //System.out.println("****");
    //}

  int i=1;
    while(i<=4){
      System.out.println("****");
      i++;
    }
  }*/
  






/*public static void main(String args[]){
  int n=123456;

  while(n>0){
    int lastdigit=n%10;
    System.out.print(lastdigit + "");
    n=n/10;
  }
}*/








/*public static void main(String args[]){
  int n=10899;
  int rev=0;

  while(n>0){
    int lastdigit=n%10;
    rev= (rev*10)+lastdigit;
    n=n/10;
  }
  System.out.print(rev);
}*/










/*public static void main(String args[]){
  Scanner sc=new Scanner (System.in);
  int n=sc.nextInt();

  
  if(n%2==0){
    System.out.println("number is not prime");
  }else{
    System.out.println("nomber is not prime");
  }
}*/











/*public static int BinarySearch(int numbers[], int key){
  int start=0, end=numbers.length-1;

  while (start<=end){
    int mid=(start+end)/2;

  if(numbers[mid]==key){
    return mid;
  }
  if(numbers[mid]<key){
    start=mid+1;
  }else{
    end=mid-1;
  }
  }
  return -1;
}
public static void main(String args[]){
  int numbers[]={2,4,6,8,10, 12, 14, 16};
  int key=12;

  System.out.println("index for key is: "+ BinarySearch(numbers, key));
}*/










/*public static void maxSubarraySum(int numbers[]){
  int currSum=0;
  int maxSum=Integer.MIN_VALUE;

  for(int i=0; i<numbers.length; i++){
    int start=i;
    for(int j=i; j<numbers.length; j++){
      int end=j;
      currSum=0;
      for(int k=start; k<=end; k++){
        currSum+=numbers[k];
      }
      System.out.println(currSum);
    if(maxSum<currSum){
      maxSum=currSum;
    }
    }
  }
  System.out.print("maxSum : " + maxSum);
}


public static void main(String[] args) {
  int numbers[]={1,-2, 6,-1,3};
  maxSubarraySum(numbers);
}*/












/*public static void maxSubarraySum(int numbers[]){
  int currSum=0;
  int maxSum=Integer.MIN_VALUE;
  int prefix[]=new int[numbers.length];

  prefix[0]=numbers[0];
  //calculate prefix sum
  for(int i=1; i<prefix.length; i++){
    prefix[i]=prefix[i-1]+ numbers[i];
  }

  for(int i=0; i<numbers.length; i++){
    int start=i;
    for(int j=i; j<numbers.length; j++){
      int end=j;

      currSum=start==0? prefix[end]: prefix[end]-prefix[start-1];

      if(maxSum<currSum){
    maxSum=currSum;
  }
    }
  }
  
  System.out.println("maxSum is = "+ maxSum);
}
public static void main(String args[]){
  int numbers[]={1,-2,6,-1,3};
  maxSubarraySum(numbers);
}*/
















/*public static void kadanes(int numbers[]){
  int ms=Integer.MIN_VALUE;
  int cs=0;

  for(int i=0; i<numbers.length; i++){
    cs=cs+numbers[i];
    if(cs<0){
      cs=0;
    }
    ms=Math.max(cs,ms);
  }
  System.out.println(" our max subarray sum is: "+ms);
}
public static void main(String args[]){
  int numbers[]={-2,-3,4,-1,-2,1,5,-3};
  kadanes(numbers);
}*/
















/*public static void kadanes(int numbers[]){
  int minSum=Integer.MAX_VALUE;
  int currSum=0;

  for(int i=0; i<numbers.length; i++){
    currSum+=numbers[i];
    if(currSum>0){
      currSum=0;
    }
    minSum=Math.min(currSum,minSum);
  }
  System.out.println("out minsubarray sum is:"+ minSum);
}
public static void main(String args[]){
  int numbers[]={-1,-2,-3,-4};
  kadanes(numbers);
}*/















/*public static int trappedRainwater(int height[]){
  int n=height.length;
  // calculate left max boundary-array
  int leftMax[]=new int[n];
  leftMax[0]=height[0];
  for(int i=1; i<n; i++){
    leftMax[i]=Math.max(height[i],leftMax[i-1]);
  }

  //calculate right max boundary- array
  int rightMax[]=new int[n];
  rightMax[n-1]= height[n-1];
  for(int i=n-2; i>=0; i--){
    rightMax[i]=Math.max(height[i], rightMax[i+1]);
  }

  int trapperdWater=0;
  //loop
  for(int i=0; i<n; i++){
    //calcuLte waterlevel
    int waterlevel=Math.min(rightMax[i], leftMax[i]);
    //calculate trapped water
    trapperdWater+= waterlevel-height[i];
  }
  return trapperdWater;
}


public static void main(String[] args) {
  int height[]={4,2,0,6,3,2,5};
  System.out.println(trappedRainwater(height));
}*/











/*public static void BubbleSort(int arr[]){
  for(int turn=0; turn<arr.length-1; turn++){
    for(int j=0; j<arr.length-1-turn; j++){
      if(arr[j]>arr[j+1]){
        //swap
      int temp=arr[j];
      arr[j]=arr[j+1];
      arr[j+1]=temp;
      }
    }
  }
}
public static void Printarr(int arr[]){
  for(int i=0; i<arr.length; i++){
    System.out.print(arr[i]);
  }
}
public static void main(String args[]){
  int arr[]={5,4,1,3,2};
  BubbleSort(arr);
  Printarr(arr);
}*/












/*public static void selectionSort(int arr[]){
  for(int i=0; i<arr.length-1; i++){
    int minPos=i;
    for(int j=i+1; j<arr.length; i++){
      if(arr[minPos]>arr[j]){
       minPos=j;
      }
    }
    //swap
    int temp=arr[minPos];
    arr[minPos]=arr[i];
    arr[i]=temp;
  }
}
public static void printArr(int arr[]){
  for(int i=0; i<arr.length; i++){
    System.out.println(arr[i]);
  }
}
public static void main(String args[]){
  int arr[]={5,4,1,3,2};
  selectionSort(arr);
  printArr(arr);
}*/














/*public static int linearSearch(int num[], int key){
  for(int i=0; i<num.length; i++){
    if(num[i]==key){
      return i;
    }
  }
  return -1;
}
public static void main(String args[]){
  int num[]={2,4,6,7,9,12,23};
  int key=9;

  int index= linearSearch(num, key);
    if(index==-1){
      System.out.println("NOT FOUND");
    }else
      System.out.println("key is at index : "+ index);
  }*/
















      /*public static int linearSearch(String menu[],String key){
        for(int i=0; i<menu.length; i++){
          if(menu[i].equals(key)){
              return i;
          }
        }
        return -1;
      }
      public static void main(String args[]){
        String menu[]= {"dosa", "samosa","chhole bhature"};
        String key="samosa";
        int index=(linearSearch(menu, key));
        if(index==-1){
          System.out.println("NOT FOUND");
        }else
          System.out.println("key is at index :"+  index);
      }*/
















    /*public static int getlargest(int number[]){
      int largest=Integer.MIN_VALUE;
      for(int i=0; i<number.length; i++){
        if(largest < number[i]){
          largest=number[i];
        }
      }
      return largest;
     
      }
      public static void main(String args[]){
        int number[]={2,4,6,23,10,12};
        System.out.println("largest value is : "+ getlargest(number));
      }*/











        /*public static int BinarySearch(int numbers[], int key){
          int start=0, end=numbers.length-1;

          while(start<=end){
            int mid=(start+end)/2;
         

          if(numbers[mid]==key){
            return mid;
          }if(numbers[mid]<key){
            start=mid +1;
          }else{
            end=mid-1;
          }
        }
        return -1;
        }
        public static void main(String args[]){
          int numbers[]={2,4,6,8,10,12,14};
          int key=12;
          System.out.println(BinarySearch(numbers, key));
        }*/


















/*public static void reverse(int numbers[]){
  int first=0, last=numbers.length-1;

  while(first<last){
    //swap
    int temp=numbers[first];
    numbers[first]=numbers[last];
    numbers[last]=temp;

    first++;
    last--;
  }
}
public static void main(String args[]){
  int numbers[]={2,4,6,8,10,12,14};
  reverse(numbers);    
  for(int i=0; i<numbers.length; i++){
    System.out.println(numbers[i]+" ");
  }  
  System.out.println(); 
  }*/















  /*public static void printpairs(int numbers[]){
    int tp=0;
    for(int i=0; i<numbers.length; i++){
      int curr=numbers[i];
      for(int j=i+1; j<numbers.length; j++){
        System.out.print("(" + curr + "," + numbers[j]+ ")");
        tp++;
      }
      System.out.println();
    }
    System.out.println("total pairs is : "+ tp);
  }
  public static void main(String args[]){
    int numbers[]={2,4,6,8,10};
    printpairs(numbers);
  }*/
















    /*public static void printSubarray(int numbers[]){
      int ts=0;
      for(int i=0; i<numbers.length; i++){
        int start=i;
        for(int j=i; j<numbers.length; j++){
          int end=j;
          for(int k=start; k<=end; k++){
            System.out.print(numbers[k]+ " ");
            ts++;
          }
           System.out.println();
        }
        System.out.println();
      }
       System.out.println("total pairs is : " + ts);
    }
    public static void main(String args[]){
      int numbers[]={2,3,4,5,6,7};
      printSubarray(numbers);
    }*/









/*public static void maxSubarraySum(int numbers[]){
int maxSum=Integer.MIN_VALUE;
int minSum=Integer.MAX_VALUE;
int currSum=0;

for(int i=0; i<numbers.length; i++){
  int start=i;
  for(int j=i; j<numbers.length; j++){
    int end=j;
    currSum=0;
    for(int k=start; k<=end; k++){
      currSum+=numbers[k];
    }
   System.out.println(currSum);
   if(maxSum<currSum){
      maxSum=currSum;
    }if(minSum>currSum){
      minSum=currSum;
    }
  }
}

System.out.println("maximum sum  is : "+ maxSum);
System.out.println("minimun sum  is : "+ minSum);

}
public static void main(String args[]){
  int numbers[]={1,-2,6,-1,3};
  maxSubarraySum(numbers);
}*/

















/*public static void prefixSum(int numbers[]){
  int maxSum=Integer.MIN_VALUE;
  int currSum=0;
  int prefix[]=new int[numbers.length];

  prefix[0]=numbers[0];
  //calculate prefix array
  for(int i=1; i<prefix.length; i++){
    prefix[i]= prefix[i-1]+ numbers[i];
  }

  for(int i=0; i<numbers.length; i++){
    int start=i;
    for(int j=i; j<numbers.length; j++){
      int end =j;


      currSum= start==0? prefix[end]:prefix[end]-prefix[start -1];

      if(maxSum<currSum){
        maxSum=currSum;
      }
    }
  }
  System.out.println("maxmum sum is : " + maxSum);
}
public static void main(String args[]){
   int numbers[]={1,-2,6,-1,3};
  prefixSum(numbers);
}*/
















/*public static void SpiralMatrix(int matrix[][]){
  int startRow=0;
  int startCol=0;
  int endRow=matrix.length-1;
  int endCol=matrix[0].length-1;


  while(startRow<=endRow && startCol<=endCol){
  //top
  for(int j=startCol; j<=endCol; j++){
    System.out.print(matrix[startRow][j] +" ");
  }

  //right
  for(int i=startRow+1; i<=endRow; i++){
    System.out.print(matrix[i][endCol]+" ");
  }

  //bottom
  for(int j=endCol-1; j>=startCol; j--){
    if(startRow==endRow){
      break;
    }
    System.out.print(matrix[endRow][j]+" ");
  }

  //left
  for(int i=endRow-1; i>=startRow+1; i--){
    if(startCol==endCol){
      break;
    }
    System.out.print(matrix[i][startCol]+" ");
  }
  startCol++;
  startRow++;
  endCol--;
  endRow--;
}
System.out.println();
}
public static void main(String args[]){
  int matrix[][]={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

  SpiralMatrix(matrix);
}*/

















/*public static int diagonalSum(int matrix[][]){
  int sum=0;

//  for(int i=0; i<matrix.length; i++){
//    for(int j=0; j<matrix[0].length; j++){
//      if(i==j){
//        sum+=matrix[i][j];
//      }else if(i+j==matrix.length-1){
//        sum+=matrix[i][matrix.length-1-i];
 //     }
//    }
//  }
//  return sum;
//}

//optimise code
for(int i=0; i<matrix.length; i++){
  //pd
  sum+=matrix[i][i];

  //sd
  if(i!=matrix.length-1-i){
     sum+=matrix[i][matrix.length-1-i];
  }
}
return sum;
}
public static void main(String args[]){
  int matrix[][]={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
System.out.println(diagonalSum(matrix));
}*/














 
/*public static boolean staircaseSearch(int matrix[][], int key){
int row=0, col=matrix[0].length-1;

while(row < matrix.length && col>=0){
  if(matrix[row][col]==key){
    System.out.println("found key at (" + row +"," + col +")");
    return true;
  }
  else if(key<matrix[row][col]){
    col--;
  }
  else{
    row++;
  }
}
System.out.println("key not found");
return false;
}

public static void main(String args[]){
  int matrix[][]={{10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};
 int key=37;   
 staircaseSearch(matrix, key)  ;          
}*/
















/*public static int  countKey(int matrix[][], int key){
 int count=0;
 
 for(int i=0; i<matrix.length; i++){
  for(int j=0; j<matrix[i].length; j++){
    if(matrix[i][j]==key){
      count++;
    }
  }
 }
 return count;
}
public static void main(String args[]){
int matrix[][]={{4,7,8},
             {8,8,7}};
int key=7;   
System.out.println(" 7 total time : "+ countKey(matrix, key));       
}*/

















/*public static int secondRowSum(int matrix[][]){
int sum=0;


  for(int j=0; j<matrix[1].length; j++){
      sum+=matrix[1][j];
    }
return sum;
}
public static void main(String args[]){
  int matrix[][]={{1,4,9},
                  {11,4,3},
                {2,2,3}};
  System.out.println(secondRowSum(matrix));
}*/

















/*public static void Transpose(int matrix[][]){
  for(int i=0; i<matrix.length; i++){
    for(int j=i+1; j<matrix.length; j++){
    //swamp
    int temp=matrix[i][j];
    matrix[i][j]=matrix[j][i];
    matrix[j][i]=temp;
  }
}
}
public static void main(String args[]){
  int matrix[][]={{1,2,3},
                {4,5,6},
              {7,8,9}};
  Transpose(matrix); 
  
  //print transpose
  for(int i=0; i<matrix.length; i++){
    for(int j=0; j<matrix[i].length; j++){
      System.out.print(matrix[i][j]+" ");
    }
    System.out.println();
  }
}*/













/*public static void Transpose(int matrix[][]){
 int rows= matrix.length;
 int cols= matrix[0].length;

 int Transpose[][]=new int[cols][rows];

 for(int i=0; i<matrix.length; i++){
  for(int j=0; j<matrix[0].length; j++){
    Transpose[j][i]=matrix[i][j];
  }
 }
 System.out.println("Transpose matrix :");
  for(int i=0; i<Transpose.length; i++){
    for(int j=0; j<Transpose[i].length; j++){
      System.out.print(Transpose[i][j]+" ");
    }
    System.out.println();
}
}

public static void main(String args[]){
  int matrix[][]={{1,2,3},
                {4,5,6}};
  Transpose(matrix); 
  
  
}*/




















  /*public static int[] twoSum(int nums[], int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }  
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        int nums[]={2,7,11,15};
        int target=9;

        int[] result = twoSum(nums, target);
        System.out.println(result[0]+ " "+ result[1]);
    }*/
















        /*public static boolean Palendrom(String str){
          for(int i=0; i<str.length()/2; i++){
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
               return false;
            }
          }
          return true;
        }
        public static void main(String args[]){
          String str="racecar";
          System.out.println(Palendrom(str));
        }*/














  /*public static float getShortestpath(String path){
  int x=0,y=0;

  for(int i=0; i<path.length(); i++){
     char dir= path.charAt(i);
    
    //south
     if(dir=='S'){
      y--;
    }
    //north
    else if(dir=='N'){
      y++;
    }
    //west
    else if(dir=='W'){
      x--;
    }
    //east
    else {
      x++;
    }
  }
int x2=x*x;
int y2=y*y;
return (float)Math.sqrt(x2 + y2);
}
public static void main(String args[]){
  String path="WNEENESENNN";
  System.out.println(getShortestpath(path));
}*/











/*public static void main(String args[]){
  int[] a={1,2,3};
  int[] b={4,5,6};

  int[] c=new int[a.length+b.length];
  int i=0;

  //print first array
  for(int x=0; x<a.length; x++){
    c[i]=a[x];
    i++;
  }

  //print second array
  for(int x=0; x<b.length;x++){
    c[i]=b[x];
    i++;
}

for(int x:c){
  System.out.print(x + " ");
}

}
*/





/*public static void findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m=nums1.length, n=nums2.length;
       int arr[]=new int[m+n];

       Array.merge(nums1, nums2);
    }
    public static void main(String args[]){
        int nums1[]={1,3};
        int nums2[]={2};

    }*/












/*public static void main(String args[]){
  String fruits[]={"apple"," mango", "banana",};

  String largest=fruits[0];
  for(int i=1; i<fruits.length; i++){
    if(largest.compareTo(fruits[i])<0){
      largest = fruits[i];
    }
  }
  System.out.println(largest);
}    */ 

  















  
/*public static void main(String args[]){
  //binary AND
  System.out.println(5&6);
}*/








/*public static void main(String args[]){
  //binary OR
  System.out.println(5|6);
}*/












/*public static void main(String args[]){
  //binary XOR
  System.out.println(5^6);
}*/
















/*public static void main(String args[]){
  //binary one's compliment
  System.out.println(~5);
}*/







/*public static void main(String args[]){
  //binary left shift
  System.out.println(5<<2);
}*/


















/*public static void main(String args[]){
  //binary right shift
  System.out.println(6>>1);
}*/











/*public static void oddorEven(int n){
  int bitMask=1;
  if((n & bitMask)==0){
    System.out.println("num is even");
  }else{
    System.out.println("num is odd");
  }}
public static void main(String args[]){
  oddorEven(3);
   oddorEven(12);
    oddorEven(22);
  }*/
















    /*public static int getIthBit(int n, int i){
      int bitMask=1<<i;
      if((n&bitMask)==0){
        return 0;
      }else{
        return 1;
      }
    }
    public static void main(String args[]){
      System.out.println(getIthBit(10, 3 ));
    }*/
















/*public static int setIthBit(int n, int i){
  int bitMask=i<<1;
  return n|bitMask;
}
public static void main(String args[]){
  System.out.println(setIthBit(10, 2));
}*/















// * RECURSION

//DECREASING RICURSIVE ORDER
/*public static void printDec(int n){
//base case
  if(n==1){
    System.out.print(n);
    return;
  }
    //first print hoga
  System.out.print(n +" ");
  //then recursion hoga 
    printDec(n-1);
}

public static void main(String args[]){
  int n=10;
  printDec(n);
}*/










//INCREASING RECURSIVE ORDER 
/*public static void printInc(int n){
//base case
  if(n==1){
    System.out.print(n+" ");
    return;
  }
    //first recursive hoga
   printInc(n-1);
   //then print hoga
  System.out.print(n +" ");
}

public static void main(String args[]){
  int n=10;
  printInc(n);
}*/















//FACTORIAL OF N
/*public static int fact(int n){
  //base case
  if(n==0){
    return 1;
  }
  int fnm1=fact(n-1);
  int fn=n*fnm1;
  return fn;
}
public static void main(String args[]){
  int n=5;
  System.out.println(fact(n));
}*/














//sum of n
/*public static int calcSum(int n){
  if(n==1){
    return 1;
  }
   int Snm1=calcSum(n-1);
  int Sn= n+ Snm1;
  return Sn;
}
public static void main(String[] args) {
  int n=5;
  System.out.print(calcSum(n));
}*/















//calculate the Nth no. of fabonacci
/*public static int feb(int n){
  if(n==0 || n==1){
    return n;
  }
  int fnm1=feb(n-1);
  int fnm2=feb(n-2);
  int fn=fnm1+fnm2;
  return fn;
}
public static void main(String args[]){
  int n=26;
  System.out.println(feb(n));
}*/














//Check if array is sorted or not
/*public static boolean isSorted(int arr[], int i){
  //base case
  if(i==arr.length-1){
    return true;
  }
  if(arr[i]> arr[i+1]){
    return false;
  }
   return isSorted(arr, i+1);
}
public static void main(String args[]){
  int arr[]={1,5,3,4};
  System.out.println(isSorted(arr, 0));
}*/
















/*public static int firstOccurance(int arr[], int key, int i){
  if(i==arr.length-1){
    return -1;
  }
  if(arr[i]==key){
    return i;
  } 
  return firstOccurance(arr, key, i+1);

}
public static void main(String args[]){
  int arr[]={1,3,5,7,9,4,9,2};
  System.out.println(firstOccurance(arr, 9, 0));
}*/

















/*public static int lastOccurance(int arr[], int key, int i){
  if(i==arr.length-1){
    return -1;
  }
  int isFound=lastOccurance(arr, key,i+1);
  if(isFound==-1 && arr[i]==key){
    return i;
  }
  return isFound;
}
public static void main(String args[]){
  int arr[]={1,3,5,7,9,4,9,2};
  System.out.println(lastOccurance(arr, 9, 0));
}*/

















/*public static int power(int x, int n){
  if(n==0)return 1;
  //int xnm1 = power(x, n-1);
  //int xn=x*xnm1;
  //return xn;

  return x*power(x, n-1);
}
public static void main(String args[]){
  System.out.println(power(2, 10));
}*/












//TILING PROBLEM
/*public static int tilingProblem(int n){
  if(n==0 || n==1){
    return 1;
  }
  //vertically
  int tnm1= tilingProblem(n-1);
  //horizantally
  int tnm2= tilingProblem(n-2);

   int totWays=tnm1+ tnm2;
   return totWays;
}
public static void main(String args[]){
System.out.println(tilingProblem(6));
}*/












//Remove duplicates in a string
/*public static void RemoveDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
  //base case
  if(idx==str.length()){
    System.out.println(newStr);
    return;
  }
  //work
  char currChar=str.charAt(idx);
  if(map[currChar-'a']==true){
    //remove duplicates
    RemoveDuplicate(str, idx+1, newStr, map);
  }else{
    map[currChar-'a']=true;
    RemoveDuplicate(str, idx+1, newStr.append(currChar), map);
  }

  }
  public static void main(String args[]){
    String str="vaishnavi";
    RemoveDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
  }*/















/*public static int friendsPairing(int n){
  //base
      if(n==1 || n==2){
        return n;
      }
     /* //choice
      //single
      int fnm1=friendsPairing(n-1);

      //pair
      int fnm2=friendsPairing(n-2);
      int pairWays=(n-1)* fnm2;

      //totWays
      int totWays=fnm1+pairWays;
      return totWays;

      return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    }
    public static void main(String args[]){
      System.out.println(friendsPairing(7));
    }*/



















/*public static void printArr(int arr[]){
   for(int i=0; i<=arr.length; i++){
     System.out.print(arr[i]+" ");
     }
    System.out.println();
      }

public static void mergeSort(int arr[], int si, int ei){
          if(si>=ei){
            return;
          }
          int mid=si+(ei-si)/2; //(si+ei)/2
          mergeSort(arr, si, mid);//left
          mergeSort(arr,mid+1,ei);//right
          merge(arr, si,mid, ei);
        }
public static void merge(int arr[], int si,int mid, int ei){
 //left(0,3)=4 idxs, right(4,6)=3 idxs =>6-0+1=7
    int temp[]= new int[ei-si+1];
     i=si;//iterator for left part
 j=mid+1; //iterator for right part
  int k= 0; //iteratir for temporaty arr

          while(i<=mid && j<=ei){
   if(arr[i]<arr[j]){
              temp[k]=arr[i];
              i++;
            }else{
              temp[k]=arr[j];
              j++; 
  }
              k++;
          }
          
//left part:-remaining element in left part after sort a right part arr
          while(i<= mid){
            temp[k++]=arr[i++];
          }

          //right parth:- remining element in right part after sort a left part arr
          while(j<=ei){
            temp[k++]=arr[j++];
          }

          //copy temp to my original arr
          for(k=0, i=si; k<temp.length; k++, i++){
            arr[i]=temp[k];
          }
        
      }
      public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
      }*/











/*public static void main(String args[]){
  ArrayList<Integer> list=new ArrayList<>();
          list.add(2);
          list.add(5);
          list.add(9);
          list.add(6);
          list.add(8);

            Collections.sort(list);
            System.out.println(list);

            Collections.sort(list,Collections.reverseOrder());
            System.out.println(list);
        }*/


/*public static void main(String args[]){
          ArrayList<ArrayList <Integer> > mainList=new ArrayList<>();
          ArrayList<Integer> list1= new ArrayList<>();
          list1.add(1);
          list1.add(2);
          mainList.add(list1)

ArrayList<Integer> list2=new ArrayList<>();
          list2.add(3);
          list2.add(4);
          mainList.add(list2);

          //mainlist
  for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList= mainList.get(i);
            for(int j=0; j<currList.size(); j++){
              System.out.print(currList.get(j)+ " ");
          }
          System.out.println();
}
}*/

















  /*public static void main(String args[]){
   ArrayList<ArrayList <Integer>> mainList=new ArrayList<>();
          ArrayList<Integer> list=new ArrayList<>();
    ArrayList<Integer> list1=new ArrayList<>();
    ArrayList<Integer> list2=new ArrayList<>();

    for( int i=1; i<=5; i++){
      list.add(i*1);
      list1.add(i*2);
    list2.add(i*3);
          }
    mainList.add(list);
          mainList.add(list1);
  mainList.add(list2);
          list2.remove(2);
  list2.remove(3);

  System.out.println(mainList+" ");
//nasted loops
          for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList=mainList.get(i);
  for(int j=0; j<currList.size(); j++){
              System.out.print(currList.get(j)+ " ");
  }
            System.out.println()
            }
        }*/


















/*public static int StoreWater(ArrayList<Integer> height){
            int maxWater=0;

            //brute force
            for(int i=0; i<height.size(); i++){
              for(int j=i+1; j<height.size(); j++){
                int ht=Math.min(height.get(i), height.get(j));
                int width=j-i;
                int currWater=ht*width;
                maxWater=Math.max(maxWater,currWater);
              }
            }
 return maxWater;
          }
          public static void main(String args[]){
            ArrayList<Integer> height=new ArrayList<>();
            height.add(1);
            height.add(8);
            height.add(6);
            height.add(2);
            height.add(5);
            height.add(4);
            height.add(8);
            height.add(3);
            height.add(7);

 System.out.println(StoreWater(height));
 }*/


}


