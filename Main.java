class Student{
    String name;
    int age;
    
    Student (String n,int a){
        name=n;
        age = a;
        
    }
    void display(){
        System.out.println("Name :"+ name  + "\n " +" age : " +age);
    }
}
class Student1{
    String address;
    int roll_no;
    
    Student1 (String a1,int r1){
        address=a1;
        roll_no=r1;
        
    }
    void display(){
        
        System.out.println("address :"+ address  + "\n " +" roll_no : " + roll_no);
    }
    
}
public class Main{ 
    public static void main(String args[]){
        Student s1 = new Student("omkar",20);
        Student1 s2 = new Student1("madh",54);
        s1.display();
        s2.display();
    }
} 