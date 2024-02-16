/*public class static_variable {
    static int a=10; //static variable directly access through class
}
class emo{
    public static void main(String[] args) {
        System.out.println(static_variable.a);
    }
}*/
class static_variable{
    int emp;
    String name;
    static String company = "amazon"; // here static means constant
    static_variable(int emp,String name){
        this.emp=emp;
        this.name=name;
        //this.company=company;
    }
    void display(){
        System.out.println(emp+" "+name+" "+company);
    }

    public static void main(String[] args) {
        static_variable a = new static_variable(101,"avinash");
        a.display();
        static_variable b = new static_variable(102,"sonu");
        b.display();
    }
}
