public class New {
    int x;
    String myName = "Michael";

    public New(int b, String c) {
        // System.out.println(b);
        x = b;
        myName = c;
    }
    
    public static void main(String[] args) {

        New myObj = new New(48, "Dele Adeleke");
        System.out.println("My Name is " + myObj.myName + " and i am " + myObj.x + " years old");
}
}
