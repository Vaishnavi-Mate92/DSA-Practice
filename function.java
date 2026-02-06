import java.util.*;
 public class function {
    /*public static void PrintHelloworld(){
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }
    public static void main(String args[]){
        PrintHelloworld();//function call
    }



 public static int calculateSum(int a, int b){ // parameter or formal parameter
    int sum=a+b;
    return sum;
 }   
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter first number : ");
    int a= sc.nextInt();
    System.out.print("enter first number : ");
    int b=sc.nextInt();
    int sum= calculatesum(a,b); // aargument or actual parameter
    System.out.println("sum is : "+ sum);

 }  
    
 }*/ 
 


/*public static void Swap(int a, int b){
   //swap
   int temp=a;
   a=b;
   b=temp;

   System.out.println("a :"+ a);
   System.out.println("b :"+ b);
}

public static void main(String args[]){
   int a=5;
   int b=10;
   Swap(a,b);
}
 
}*/







/*public static int multiply(int a, int b){
   int prod=a*b;
   System.out.println("multiplication is ="+ prod);
   return prod;

}
public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("enter first number :");
   int a=sc.nextInt();
   System.out.print("enter first number :");
   int b= sc.nextInt();
   multiply(a,b);
}*/








/*public static int factorial(int n){
   int f=1;
   for(int i=1; i<=n; i++){
      f=f*i;
   }
   return f;//factorial of n

}


public static int bincoff(int n, int r){
   int fact_n= factorial(n);
   int fact_r= factorial(r);
   int fact_nmr=factorial(n-r);

   int bincoff=fact_n/(fact_r*fact_nmr);
   return bincoff;
}
public static void main(String args[]){
   System.out.println(bincoff(5,2));
}*/







/*//function to calculate sum of two numbers
public static int sum(int a, int b){
   return a+b;
}
//fuction to calculate the sum of 3 numbers
public static float sum(float a, float b){
   return a+b;
}

public static void main(String args[]){
   System.out.println(sum(4,5));
   System.out.println(sum(4.0f,4.3f));
}*/







/*public static boolean isPrime(int n){
   boolean isPrime=true;

   if(n==2){
      isPrime=true;
   }

   for(int i=2; i<=n-1; i++){
      if(n%2==0){
         isPrime=false;
      }
   }
   return isPrime;
}

public static void main(String args[]){
   System.out.println(isPrime(7));
}*/







/*public static boolean isPrime(int n){
      boolean isPrime=true;

   if(n==2){
      isPrime= true;
   }
   for(int i=2; i<=Math.sqrt(n); i++){
      if(n%i==0){
         isPrime= false;
         break;
      }
      
   }
   return isPrime;
}
public static void main(String args[]){
   System.out.println(isPrime(16));
}*/








/*public static boolean isPrime(int n){
   for(int i=2; i<=n-1; i++){
      if(n%i==0){
         return false;
      }
   }
   return true;
}
public static void primeInRange(int n){
   for(int i=1; i<=n; i++){
      if(isPrime(i)){
         System.out.print(i+" ");
      }
   }
   System.out.println();
}
public static void main(String args[]){
   primeInRange(20);
}*/








/*public static void BinToDec(int binNum){
   int myNum=binNum;
   int pow=0; 
   int decNum=0;
    
   while(binNum>0){
      int lastDigit= binNum % 10;
      decNum=decNum+(lastDigit * (int)Math.pow(2,pow));

      pow++;
      binNum=binNum/10;
   }

   System.out.println("decimal of "+ myNum + " = " + decNum);
   }
   public static void main(String args[]){
      BinToDec(1111);
   }*/






   /*public static void DecToBin(int n){
      int myNum=n;
      int pow=0;
      int binNum=0;

      while(n>0){
         int rem=n%2;
         binNum = binNum+(int)(rem*Math.pow(10,pow));
         
         pow++;
         n=n/2;
      }
      System.out.println("binary of "+ myNum +"="+binNum);
   }
   public static void main(String args[]){
      DecToBin(15);
   }*/







      
//Remove duplicates string
   /*public static String removeduplicates(String str){
        String result="";

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);

            if(result.indexOf(ch)==-1){
               result+=ch;
            }
    }
    return result;
}
public static void main(String args[]){
    String str="appnnacollege";
    System.out.println( removeduplicates(str));
}*/




}


