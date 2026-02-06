public class RecursionBesics {

    //print numberDecresing order
    /*public static  void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
public static void main(String args[]){
    int n=10;
    printDec(n);
}*/










//Print number in increasing order
/*public static void printInc(int n){
    if(n==10){
        System.out.println(n);
        return;
    }
    System.out.print(n+" ");
    printInc(n+1);
}

public static void main(String args[]){
    int n=1;
    printInc(n);
}*/











//print Factorial of N
/*public static int fact(int n){
    if(n==0){
        return 1;
    }
    int fnm1=fact(n-1);
    int fn=n*fact(n-1);
    return fn;
}
public static void main(String args[]){
    int n=5;
    System.out.println(fact(5));
}*/








//Factorial number
/*public static int CalcSum(int n){
    if(n==1){
        return 1;
    }
    int Snm1=CalcSum(n-1);
    int Sn=n+CalcSum(n-1);
    return Sn;
}
public static void main(String args[]){
    int n=5;
    System.out.println(CalcSum(n));
}*/





//calculate fabbonacci numbers
/*public static int fib(int n){
    if(n==0 || n==1){
        return n;
    }
    int fnm1=fib(n-1);
    int fnm2=fib(n-2);
    int fibn=fnm1+fnm2;
    return fibn;
}
public static void main(String args[]){
    int n=25;
    System.out.println(fib(n));
}*/










/*public static boolean isSorted(int arr[], int i){
    if(i==arr.length-1){
        return true;
    }
    if(arr[i]>arr[i+1]){
        return false;
    }
    return isSorted(arr,i+1);
}
public static void main(String args[]){
    int arr[]={1,2,3,7,4,5};
    System.out.print(isSorted(arr,0));
}*/






//First Occurance
/*public static int firstOccurance(int arr[], int key, int i){
    if(i==arr.length){
        return -1;
    }
    if(arr[i]==key){
        return i;
    }
    return firstOccurance(arr,key, i+1);
}
public static void main(String args[]){
    int arr[]={1,3,5,7,4,5,8,9};
    int key=11;
    System.out.println(firstOccurance(arr,key,0));
}*/






//Last Occurance
/*public static int lastOccurance(int arr[], int key, int i){
    if(i==arr.length){
        return -1;
    }
    
    int isFOUND=lastOccurance(arr,key,i+1);
    if(isFOUND==-1 && arr[i]==key){
        return i;
    
    }
    return isFOUND;
}
public static void main(String args[]){
    int arr[]={9,3,2,5,6,7,8,5,1,2,3};
    int key=2;
    System.out.println(lastOccurance(arr,key,0));
}*/





// Print x to the power of n
/*public static int power(int x,int n){
    if(n==0){
        return 1;
    }
    return x*power(x,n-1);
}
public static void main(String args[]){
     System.out.println(power(2,10));
}*/










//optimized power
/*public static int optimizedPower(int a,int n){
    if(n==0){
        return 1;
    }
    int halfPower=optimizedPower(a,n/2);
    int halfPowerSq=halfPower*halfPower;

    //n is odd
    if(n % 2 !=0){
        halfPowerSq=a*halfPowerSq;
    }
    return halfPowerSq;
}
public static void main(String args[]){
    int a=2;
    int n=10;
    System.out.println(optimizedPower(a,n));
}*/










//tiling problem
/*public static int TilingProblem(int n){
    //base case
    if(n==0 || n==1){
        return 1;
    }
    //vertical choice
    /*int fnm1=TilingProblem(n-1);

    //horizantal choice
    int fnm2=TilingProblem(n-2);

    int totWays=fnm1+ fnm2;
    return totWays;//
    return TilingProblem(n-1)+ (n-1)*TilingProblem(n-2);
}
public static void main(String args[]){
    int n=4;
    System.out.println(TilingProblem(n));
}*/












/*public static void RemoveDuplicate(String str, int idx,StringBuilder newStr,boolean map[]){
    if(idx==str.length()){
        System.out.println(newStr);
       return; 
    }
    char currChar=str.charAt(idx);
    if(map[currChar-'a']==true){
        //duplicate
        RemoveDuplicate(str, idx+1, newStr, map);
    }else{
        map[currChar-'a']=true;
        RemoveDuplicate(str, idx+1, newStr.append(currChar), map);
    }
}
public static void main(String args[]){
    String str="appnnacollege";
    RemoveDuplicate(str, 0,new StringBuilder(""), new boolean[26]);
}*/







//fing the pairs of Friends
/*public static int FriendsPairing(int n){
    if(n==1 || n==2){
        return n;
    }
    //choice
    //single
    /*int fnm1=FriendsPairing(n-1);

    //pairs
    int fnm2=FriendsPairing(n-2);
    int pairways=(n-1)*fnm2;

    //totWays
    int totWays=fnm1+pairways;
    return totWays;//

    return FriendsPairing(n-1)+(n-1)*FriendsPairing(n-2);
}
public static void main(String args[]){
    System.out.println(FriendsPairing(3));
}*/









//Print Binary String
/*public static void printBinString(int n, int lastPlace, String str){
    if(n==0){
        System.out.println(str);
        return;
    }
    //last place(n)
    printBinString(n-1, 0,str+"0");

    //last ke pahila place (n-1)
    if(lastPlace==0){
        printBinString(n-1, 1, str+"1");
    }
}
public static void main(String args[]){
    printBinString(3,0," ");
}*/










// FIND ALL OCCURANCES IN GIVEN KEY
/*public static void AllOccurances(int i, int arr[], int key){
    if(i==arr.length){
        return;
    }
    if(arr[i]==key){
        System.out.print(i+" ");
    }
    AllOccurances(i+1, arr, key);
}
public static void main(String args[]){
    int arr[]={3,2,4,5,6,2,7,2,2};
    int key=2;
    AllOccurances(0,arr,key);
}*/










//convert Digit no. into String (1-one, 2-two)
/*static String Digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

public static void  printDigit(int n){
    if(n==0){
        return;
    }
    int lastDigit=n%10;
    printDigit(n/10);
    System.out.print(Digits[lastDigit]+" ");
}
public static void main(String args[]){
    printDigit(10340);
}*/








//WAP to find length of the string
/*public static void length(String str){
    if(str.length()==0){
        return;
    }
    System.out.println(str.length());
}
public static void main(String args[]){
    String str="vaishu";
    length(str);
}*/
}