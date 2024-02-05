package classEight.inherit;

public class InterfaceInheritSample {
    public static void main(String[] args) {
        ImplementsC implC = new ImplementsC();

        InterfaceA interA = implC;
        interA.methodA();
        System.out.println("-------------");

        InterfaceB interB = implC;
        interB.methodB();
        System.out.println("-------------");

        InterfaceC interC = implC;
        interC.methodA();
        interC.methodB();
        interC.methodC();
    }
}
