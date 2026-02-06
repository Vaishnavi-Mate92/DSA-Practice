import java.util.*;

public class Array {
    /*public static void main(String args[]){
        int marks[]=new int[100];
        Scanner sc= new Scanner(System.in);
        marks[0]=sc.nextInt();//phy
        marks[1]=sc.nextInt();//chem
        marks[2]=sc.nextInt();//math

        System.out.println("phy : "+ marks[0]);
        System.out.println("chem : "+ marks[1]);
        System.out.println("math : "+ marks[2]);

        marks[2]=marks[2]+2;
        System.out.println("updated Maths marks : "+ marks[2]);
    
    


    /*public static void Update(int marks[]){
       //for(int i=0; i<marks.length; i++){
       //     marks[i]=marks[i]+1;
       // }
      
    }
    public static void main(String args[]){
        int marks[]={97,98,99};
        Update(marks);

        //print our marks
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();

        marks[1] = marks[1] +  2;
        System.out.print("updated marks : " + marks[1]);
        
    }*/



    /*public static int LinearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,5,3,7,9,10,4,6,1};
        int key=9;
        int index=(LinearSearch(numbers,key));
        if(index==-1){
            System.out.print("NOT found");
        }else{
            System.out.println("Key is at index : "+ index);
        }
    }*/






    



    /*public static void main(String[] args) {
        // Array of menu items
        String menu[] = {"dosa", "chole bhature", "Samosa"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the item to search: ");
        String item = sc.nextLine();

        boolean found = false;
        int index = -1;

        // Linear search using String equalsIgnoreCase()
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(item)) { // Case-insensitive match
                found = true;
                index = i;
                break;
            }
        }

        // Output result
        if (found) {
            System.out.println(item + " found at position " + index);
        } else {
            System.out.println(item + " not found in the menu.");
        }
    }*/













    /*public static int getLargest(int number[]){
        int Largest=Integer.MIN_VALUE;//-infinity
        int smallest=Integer.MAX_VALUE;//+infinity

        for(int i=0; i<number.length; i++){
            if(Largest<number[i]){
                Largest=number[i];
            }
            if(smallest>number[i]){
                smallest=number[i];
            }
        }
        System.out.println("smallest value is : "+ smallest);
        return Largest;
    }
    public static void main(String args[]){
        int number[]={3,5,7,2,4,17,9};
        System.out.println(("largest value is : "+ getLargest(number)));   
    }*/



    
    
    
    
    
    /*public static void reverce(int number[]){
        int first=0,last=number.length-1;

        while(first<last){
            //swap
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
    int number[]={1,2,3,4,5,6,7,8,10,12,13,15,16,18,19,21};
    reverce(number);

    //print array
    for(int i=0; i<number.length; i++){
        System.out.print(number[i]+" ");
    }
    System.out.println();
}*/





/*public static int binarySearch(int number[], int key){
    int start=0, end=number.length-1;
    
    while(start<=end){
        int mid=(start+end)/2;
        //comparision
        if(number[mid]==key){
            return mid;
        }
        if(number[mid]<key){//right
            start=mid+1;
        }
        else{//left
            start=mid-1;
        }
    }
    return -1;
    
}
public static void main(String args[]){
    int number[]={2,3,4,5,6,7,8 , 10,12};
    int key=9;
    System.out.println("index for key is : "+ binarySearch(number,key));
}*/




/*public static void printPair(int number[]){
    int tp=0;
    for(int i=0; i<number.length; i++){
        int curr=number[i]; //2,4,6,8,10
        for(int j=i+1; j<number.length; j++){
            System.out.print("(" + curr + "," + number[j]+ ") ");
            tp++;
        }
        System.out.println();
    }
     System.out.println("Total pairs : "+tp);
}

public static void main(String args[]){
    int number[]={2,4,6,8,10,12,14};
    printPair(number);
}*/





/*public static void printSubarray(int numbers[]){
    int ts=0;
    for(int i=0; i<numbers.length; i++){
        int start=i;
        for(int j=i; j<numbers.length; j++){
            int end=j;
            for(int k=start; k<=end; k++){//print
                System.out.print(numbers[k]+ " ");
            }
            ts++;
            System.out.println();
        }
        System.out.println();
    }
    System.out.println("Total subarray: "+ts);
    
}

public static void main(String args[]){
    int numbers[]={2,4,6,8,10};
    printSubarray(numbers);
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
    System.out.println("max Sum: "+ maxSum);
}
public static void main(String args[]){
    int numbers[]={1,2,3,4,5};
    maxSubarraySum(numbers);
}*/






/*public static void maxSubarraySumbyPrifixMethod(int numbers[]){
int currSum=0;
int maxSum=Integer.MIN_VALUE;
int prefix[]=new int [numbers.length];

prefix[0]=numbers[0];
//calculate prefix array
for(int i=1; i<prefix.length;i++){
    prefix[i]=prefix[i-1]+numbers[i];
}
for(int i=0; i<numbers.length; i++){
    int start=i;
    for(int j=i; j<numbers.length; j++){
        int end=j;

        currSum= start==0? prefix[end]: prefix[end]-prefix[start-1];
        if(maxSum<currSum){
            maxSum=currSum;
        }

    }
}
System.out.println("max Sum = " +maxSum);
}

public static void main(String args[]){
    int numbers[]={1,-2,6,-1,3};
    maxSubarraySumbyPrifixMethod(numbers);
}*/




/*public static void kadanes(int numbers[]){
    int cs=0;
    int ms=Integer.MIN_VALUE;
     
    for(int i=0; i<numbers.length; i++){
        cs=cs+numbers[i];
        if(cs<0){
            cs=0;
        }
        ms=Math.max(cs,ms);

    }
    System.out.println("our max subarray sum is= " +ms);

}
public static void main(String args[]){
    int numbers[]={-2,-3,4,-1,-2,1,5,-3};
    kadanes(numbers);
}*/






/*public static int trappedRainwater(int height[]){
    int n=height.length;
    //calculate left max boundary-array
    int leftmax[]=new int[n];
    leftmax[0]=height[0];
    for(int i=1; i<n; i++){
        leftmax[i]=Math.max(height[i],leftmax[i-1]);
    }

    //calculate right max boundary-array
    int rightmax[]=new int[n];
    rightmax[n-1]=height[n-1];
    for(int i=n-2; i>=0; i--){
        rightmax[i]=Math.max(height[i],rightmax[i+1]);
    }

    int trappedwater=0;
    //loop
    for(int i=0; i<n; i++){
        //waterlevel=max(leftmax boundary,rightmax boundary)
        int waterlevel=Math.min(leftmax[i], rightmax[i]);

        //trapped water= (waterlevel-height[i])*width
        trappedwater+=waterlevel-height[i];
    }
    return trappedwater;

}
public static void main(String args[]){
    int height[]={4,2,0,6,3,2,5};
    System.out.println(trappedRainwater(height));
}*/







/*public static int buyAndSellStock(int prices[]){
    int buyPrice=Integer.MAX_VALUE;
    int maxProfit=0;
    for(int i=0; i<prices.length; i++){
        if(buyPrice < prices[i]){//profit
            int profit=prices[i]-buyPrice;//todays profits
            maxProfit= Math.max(maxProfit,profit);
        }else{
            buyPrice=prices[i];
        }
    }
    return maxProfit;
}
public static void main(String args[]){
    int prices[]={7,1,5,3,6,4};
    System.out.println(buyAndSellStock(prices));
}*/

     





//2D Array
/*public static void findMinMaxNum(int matrix[][]){
    int maxNum=Integer.MIN_VALUE;
    int minNum=Integer.MAX_VALUE;

    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[i].length; j++){
            if(matrix[i][j]<minNum){
                minNum=matrix[i][j];
            }
            if(matrix[i][j]>maxNum){
                maxNum=matrix[i][j];
            }
        }
    }
    System.out.println("Smallest element is: "+maxNum);
    System.out.println("Largest element is: "+maxNum);
}
public static void main(String args[]){
    int matrix[][]=new int [3][3];
    int m=3, n=3;

    Scanner sc=new Scanner(System.in);
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
    findMinMaxNum(matrix);
}*/








public static void Spiral_Matrix(int matrix[][]){
    int startRow=0;
    int startCol=0;
    int endRow=matrix.length-1;
    int endCol=matrix[0].length-1;

    while(startRow<=endRow && startCol<=endCol){
    //Top
        for(int j=startCol; j<=endCol; j++){
            System.out.print(matrix[startRow][j]+" ");
        }
        startRow++;

        //Right
        for(int i=startRow; i<=endRow; i++){
            System.out.print(matrix[i][endCol]+" ");
        }
        endCol--;

        //Bottom
        for(int j=endCol; j>=startCol; j--){
            System.out.print(matrix[endRow][j]+" ");
        }
        endRow--;

        //Left
        for(int i=endRow; i>=startRow; i--){
            System.out.print(matrix[i][startCol]+" ");
        }
        startCol++;
    }


}

public static void main(String srgs[]){
    int matrix[][]={{1,2,3,4},
                    {4,5,6,2},
                    {6,3,7,8},
                    {9,4,7,2}};
    Spiral_Matrix(matrix);                
}
} 



