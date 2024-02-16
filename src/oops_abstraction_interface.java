import java.util.Scanner;

interface client {
    void input(); // public+abstract
    void output();  // public+abstract
}
class Raju implements client{
    String name;
    double salary;
    public void input(){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter username: ");
        name = r.nextLine();

        System.out.println("Enter salary: ");
        salary = r.nextDouble();
    }
    public void output() {
        System.out.println(name + " " + salary);
    }
    public static void main(String[] args) {
        client c = new Raju();
        c.input();
        c.output();
    }
}

