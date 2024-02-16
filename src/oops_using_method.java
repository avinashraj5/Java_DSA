public class oops_using_method {
    String color;
    int age;
    void initObj(String c, int a) { //create method with passing two parameter
        color = c;
        age = a;
    }
    void display(){ //simple method to display
        System.out.println(color+" "+age);
    }

    public static void main(String[] args) {
        oops_using_method dog = new oops_using_method();
        dog.initObj("black",10);
        dog.display();
    }
}
