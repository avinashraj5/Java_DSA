class overriding {
    void same(){
        System.out.println("yes");
    }
}
class overriding1 extends overriding{
    void same(){
        super.same(); // For both class method
        System.out.println("No");
    }

    public static void main(String[] args) {
        overriding c = new overriding1();
        c.same();
    }
}
