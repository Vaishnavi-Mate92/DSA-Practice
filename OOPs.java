public class OOPs {
    /*public static void main(String args[]){
        Pen p1=new Pen();//created a pen object name as p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color="black";
        System.out.println(p1.color);

        Student s1=new Student();
        s1.calculateParcentage(90,89,699);
        System.out.println(s1.parcentage);


        Bankacount myAcc=new Bankacount();
        myAcc.Username="vaishnavimate";
        System.out.println(myAcc.Username);
        myAcc.setPassword("abcde21");
    }
}

class Bankacount{
    public String Username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String name;
    int age;
    float parcentage;

    void calculateParcentage(int phy, int chem, int math){
        parcentage=((math+ phy+math)/3);
    }
    
}*/











//getter and setter
/*public static void main(String args[]){
    Pen p1=new Pen();//created a pen object name as p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("black");
        System.out.println(p1.getColor());
}

}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color=newColor;
    }
    void setTip(int tip){
        this.tip= tip;
    }*/










//Constructor
    /*public static void main(String args[]){
    Student s1=new Student("Vaishnavi");
    
}

}

class Student{
    String name;
    int roll_no;

    Student(String name){
        this.name=name;
        System.out.println("vaishnavi");
    }*/












    //type of Constructor
    /*public static void main(String args[]){
        Student s1=new Student("vaishnavi");
        System.out.println(s1.name);
        Student s2=new Student(3077);
         System.out.println(s2.roll);
    }
}

    class Student{
        String name;
        int roll;

        //Non-parametrrise constructor
        Student(){
            System.out.println("this is a constructor");
        }

        //parameterise constructor
        Student(String name){
            this.name=name;
        }
        Student(int roll){
            this.roll=roll;
        }
}*/











    
//COPY CONSTRUCTOR
    /*public static void main(String args[]){
        Student s1=new Student();
        s1.name="vaishnavi";
        s1.roll=3077;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=99;
        s1.marks[2]=89;

        System.out.println("This contain in s1 object :");
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.password);

        Student s2=new Student(s1);
            s2.password="xyz";
            s2.marks[2]=95;
        System.out.println("This contain in s2 object :");
            for(int i=0; i<3; i++){
                System.out.println(s2.marks[i]);
            }
}
}

    class Student{
        String name;
        int roll;
        String password;
        int marks[];

        //copy constructor

        Student(){
            marks=new int[3];
            System.out.println("This is copy constructor");
        }

        Student(Student s1){
            marks=new int[3];
            this.name=s1.name;
            this.marks=s1.marks;
            this.password=s1.password;
        }
        Student(int roll){
            marks=new int[3];
            this.roll=roll;
            
        }
    }*/










//INHERITANCE class

    /*public static void main(String args[]){
        Fish shark=new Fish();
        shark.eat();
        shark.swim();
        shark.drink();
    }
}

//Base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
    void drink(){
        System.out.println("Drinking water");
    }
}

//derived class/sub class 
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims");
    }
}*/












/*public static void main(String args[]){
    Horse h= new Horse();
    h.eat();
    h.walk();

    Chicken c=new Chicken();
    c.eat();
    c.walk();
}
}
abstract class Animal{
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("horse walk 4 legs");
    } 
}
class Chicken extends Animal{
    void walk(){
        System.out.println("chicken walks 2 legs");
    }
}*/













/*public static void main(String args[]){
    Queen q=new Queen();
    q.moves();
    pown p=new pown();
    p.moves();
}
}

interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(in all four directions)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){//public keyword nahi likha to ye move function default ho jayega.
        System.out.println("up, down, left, right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(by 1 step)");
    }
}
class pown implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}*/
    











/*public static void main(String args[]){
    Student s1= new Student();
    s1.SchoolName=" MSS";
}
}

class Student{
    String name;
    int roll;
}
static String SchoolName;

void setName(String name){
    this.name=name;
}
String getName(){
    return this.name;
}*/








