public class Student {
    int marks;
    int age;
    String name;

    public Student(int marks, int age, String name) {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [marks=" + marks + ", age=" + age + ", name=" + name + "]";
    }
    
}
