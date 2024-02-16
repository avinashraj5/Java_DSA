interface Sample{
    void meth1();
    void meth2();
}
interface childSample extends Sample{
    void meth3();
    void meth4();
}
class SampleClass implements childSample{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class Inheritance_Interfaces {
    public static void main(String[] args) {
        SampleClass sc = new SampleClass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();
    }
}
