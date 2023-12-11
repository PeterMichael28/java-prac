public class Third {
    
    private String name;


    // getter 
    public String getName() {
        return this.name;
    }
    
    // setter
    public void setName(String newName) {
        this.name = newName;
    }


    public static void main(String[] args) {
        Third third1 = new Third();

        System.out.println(third1.name);
    }
}
