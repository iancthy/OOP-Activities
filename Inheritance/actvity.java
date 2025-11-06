class Person {
    protected String name;

    void showName() {
        System.out.println("Hello!");
    }
}

class Student extends Person {
    void setName(String name) {
        this.name = name;
        String formatted = String.format("I am %s, a student.", name);
        System.out.println(formatted);
    }

    void showMessage() {
        System.out.println("Hello! Welcome!");
    }
}

class Teacher extends Person {
    void setName(String name) {
        this.name = name;
        String formatted = String.format("I am %s, a teacher.", name);
        System.out.println(formatted);
    }

    void showMessage() {
        System.out.println("Hello! Welcome!");
    }
}

public class activity {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Gian");
        s.showMessage();
        s.setName("Mia");
        s.showMessage();

        Teacher t = new Teacher();
        t.setName("Jazmin");
        t.showMessage();
        t.setName("CK");
        t.showMessage();
    }
}
 
