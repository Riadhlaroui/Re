package Association;

public class A11 {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassB b2 = new ClassB();

        a.setClassB(b);
        b.setClassA(a);
        //a.setClassB(b2);

        System.out.println("Number of class A: "+ a.numberB);
        System.out.println("Number of class B: "+ b.numberA);

    }
}
