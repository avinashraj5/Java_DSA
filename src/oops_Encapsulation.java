public class oops_Encapsulation {
    private int empid;
    public void setEmpid(int eid){
        empid = eid;
    }
    public int gerEmpid(){
        return empid;
    }
}
class Employee{
    public static void main(String[] args) {
        oops_Encapsulation e = new oops_Encapsulation();
        e.setEmpid(101); // Data is safe, we achieved the security,,,,secure the data
        System.out.println(e.gerEmpid()); // view the data
    }

}
