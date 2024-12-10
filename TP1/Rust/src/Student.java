public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public Student(String n, int a){
        this.name = n;
        this.age = a;

    }


    public static void main(String[] args) {
        Student st1 = new Student("name", 100);
        System.out.println("Name: " + st1.getName());
        System.out.println("Age: " + st1.getAge());
    }


}