class Person {
    private int id;
    private String name;
    private String gender;

    // Accessor
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }

    public void showInformation() {
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Hello world";
    }
}


public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Chea Sammang");
        System.out.println(p1.getName());
        System.out.println(p1);

    }
}
