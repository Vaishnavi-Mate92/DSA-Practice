public class BitManupulation {
    //Binary AND
/*public static void main(String args[]){

    System.out.println(5&6);
}*/







//Binary OR
/*public static void main(String args[]){
    System.out.println(5|6);
}*/








//Binary XOR
/*public static void main(String args[]){
    System.out.println(5^6);
}*/





//Binary One's Complement
/*public static void main(String args[]){
    System.out.println(~5);
}*/









//Binary left shift
/*public static void main(String args[]){
    System.out.println(6<<4);
}*/






//Binary Right shift
/*public static void main(String args[]){
    System.out.println(6>>1);
}*/













//Check if number is Even or Odd
/*public static void oddOrEven(int n){
    int BitMask=1;

    if((n & BitMask) == 0){
        //Even Number
        System.out.println("Even Number");
    }else{
        System.out.println("odd Number");
    }
}
public static void main(String args[]){
    oddOrEven(3);
    oddOrEven(7);
    oddOrEven(14);
}*/







/*public static int GetIthNumber(int n, int i){
    int bitMask=1<<i;

    if((n & bitMask)==0){
        return 0;
    }else{
        return 1;
    }
}
public static void main(String args[]){
    System.out.println(GetIthNumber(7,2));
}*/








/*public static int SetIthnumber(int n, int i){
    int bitMask=1<<i;

    return n | bitMask;
}
public static void main(String args[]){
    System.out.println(SetIthnumber(9,1));
}*/









/*public static int ClearIthbit(int n, int i){
    int bitMask=~(i<<i);
    return n& bitMask;
}
public static void main(String args[]){
    System.out.println(ClearIthbit(10,1));
}*/












/*public static int ClearIthbit(int n, int i){
    int bitMask=~(i<<i);
    return n& bitMask;
}

public static int Update(int n, int i, int newBit){
    n=ClearIthbit(n,i);
    int bitMask = newBit<<i;
    return n | bitMask;
}
public static void main(String args[]){
    System.out.println(Update(10,2,1));
}*/









public static int ClearIthbit(int n, int i){
    int bitMask=(~0<<i);
    return n& bitMask;
}
public static void main(String args[]){
    System.out.println(ClearIthbit(15, 2));
}
}

    

