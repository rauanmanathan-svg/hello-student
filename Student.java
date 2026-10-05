public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "Hello, Student!";
    }

    public static void main(String[] args) {
        Student student = new Student("Rauan");
        System.out.println(student.sayHello());
    }
}
