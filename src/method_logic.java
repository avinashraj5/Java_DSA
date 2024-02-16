public class method_logic {
    static int logic(int x, int y){
        int z;
        if (x>y){
            z=(x*y)+5;
        }
        else {
            z=x+y+70;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=20;
        int b=10;
        int c;
        //Method invocation using Object creation
        //method_logic obj = new method_logic();
        //c = obj.logic(a, b);
        c = logic(a, b);
        int d=10;
        int e=20;
        int f;
        f = logic(d, e);
        System.out.println(c);
        System.out.println(f);
    }
}
