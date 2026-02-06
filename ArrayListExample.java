import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    /*public static void main(String args[]){
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(2);
        System.out.println(list);

        //reverse
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) +" ");
        }
        System.out.println();

        int max=Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        System.out.println("max element : " + max);
    }*/










    //Swap index
    /*public static void swap(ArrayList<Integer>list, int idx1, int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2, temp);


    }
    public static void main(String args[]){
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(2);


    int idx1=1, idx2=4;
        System.out.println(list);
        swap(list, idx1,idx2);
        System.out.println(list);
}*/








 /*public static void main(String args[]){
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(2);

        System.out.println(list);
        
        //sorting => using Collection sort
        Collections.sort(list);//Assending oder
        System.out.println(list);

        //Dissending Order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }*/










//Time Complecity=>0(n*2)    it will also find with TC=>0(n)
    //Container with most water
    public static int storeWater(ArrayList<Integer> height){
       int maxWater=0;

       //bruth force
       for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int ht=Math.min(height.get(i), height.get(j));
                int width=j-1;
                int currWater=ht*width;
                maxWater= Math.max(maxWater,currWater);
        }
       }
       return maxWater;
    }
       
       
    public static void main(String args[]){
        ArrayList<Integer> height=new ArrayList<>();
        //1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }   
}