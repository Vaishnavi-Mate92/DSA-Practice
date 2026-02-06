import java.util.*;
public class MyString {
    /*public static void printletters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String firstName ="Vaishnavi";
        String lastName= "Mate";
        String fullname= firstName + " " + lastName;
        //System.out.println("Fullname is: "+ fullname.charAt(0));

        printletters(fullname);
    }*/






    /*public static void main(String args[]){
        String str="Vaishnavi auto";

        System.out.print("Vowels in the String : ");

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                System.out.print(ch+" ");
            }
        }
    }*/






    /*public static boolean isPalindrome(String str){
        for(int i=0; i<str.length(); i++){
            int n=str.length();
            if(str.charAt(i)!= str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str="MADAM";
        System.out.println(isPalindrome(str));
    }*/







    //shortest path

    /*public static float getShortestpath(String path){
        int x=0,y=0;

        for(int i=0; i<path.length(); i++){
            char dir=path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }else if(dir=='N'){
                y++;
           }else if(dir=='W'){
                x--;
           }else{
            x++;
           }
        }
        int  x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        String path="WNEENESENNN";
        System.out.println(getShortestpath(path));
    }*/







    //comparision

    /*public static void main(String args[]){
        String s1="vaishuu";
        String s2="vaishuu";
        String s3=new String("vaishuu");

        //if(s1==s2){
        //   System.out.println("String are equal");
        //}else{
        //    System.out.println("String are not equal");
        //}
        //if(s1==s3){
        //    System.out.println("String are equal");
        //}else{
        //    System.out.println("String are not equal");
        //}

        if(s1.equals(s3)){
            System.out.println("String is equal");
        }else{
           System.out.println("String is not equal"); 
        }
    }*/






    //Substring
    /*public static String substring(String str, int si,int ei){
        String Substr="";
        for(int i=si; i<ei; i++){
            Substr+=str.charAt(i);
        }
        return Substr;
    }

    public static void main(String args[]){
        String str="HelloWorld";
        //System.out.println(Substring(str,5,10));
        System.out.println(str.substring(5,10));
    }*/








    /*public static void main(String args[]){
        String fruits[]={"apple", "vaishnavi","pratiksha", "orenge"};
        String largest=fruits[0];
        String smallest=fruits[0];

        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest=fruits[i];
            }
        }
        for(int j=1; j<fruits.length; j++){
            if(smallest.compareTo(fruits[0])>0){
                smallest=fruits[j];
            }
        }
        System.out.println("The largest string is : "+largest);
        System.out.println("The smallest String is : "+smallest);
    }*/













    //String Builder
    /*public static void main(String args[]){
        StringBuilder sb=new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb + " ");
        System.out.println("number of charector: "+sb.length());
    }*/












    /*public static String toUpperCase(String str){
        StringBuilder sb= new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str= "hi, i am vaishnavi";
        System.out.println(toUpperCase(str));
    }*/












    /*public static String Compress(String str){
        String newStr="";

        for(int i=0; i<str.length(); i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return newStr;
    }
    public static void main(String args[]){
        String str=" aaabbcccdd";
        System.out.println(Compress(str));
    }*/









    /*public static void main(String args[]){
        String str="VaishnaviDidi";
        String str1="ApnaCollege";
        String str2="VaishnaviDidi";

        System.out.println(str.equals(str1) +" "+ str.equals(str2));//yaha pe equals keyword str ko compair krta hai
    }*/





//String ko replece kr skte haii
    /*public static void main(String args[]){
        String str="ApnaCollege".replace("Apna", "Aapka");
        System.out.println(str);
    }*/

}