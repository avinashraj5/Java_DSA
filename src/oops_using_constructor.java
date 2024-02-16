public class oops_using_constructor {
    String name;
    int Emp_id;
    oops_using_constructor(String name, int Emp_id){ //Parametrized constructor
        this.name = name;
        this.Emp_id = Emp_id;
    }

    public static void main(String[] args) {
        oops_using_constructor e1 = new oops_using_constructor("Avinash",100);
        oops_using_constructor e2 = new oops_using_constructor("Pallavi",101);
        System.out.println("Employee 1 :"+e1.name+" "+e1.Emp_id);
        System.out.println("Employee 2 :"+e2.name+" "+e2.Emp_id);
    }
}
