abstract class Second {
    public int age = 34;
    public String fullName = "Dele Adebobowale";

    public abstract void myFullDetails();
}

class StudentProfile extends Second {
    // public String[] myLikes = { "Reading", "Eating", "Sleeping" };

    public void myFullDetails() {
        System.out.println("This is mu full details");
    }

    public static void main(String[] args) {
        
        Third third1 = new Third();
        third1.setName("Josaih");
        System.out.println(third1.getName());
    }


}
