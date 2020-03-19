package initialization;

public class Main {
    public static void main(String[] args) {
       // BaseClass base = new BaseClass();

        ChildClass child = new ChildClass(100);
        child.displaySomeInitData();
    }
}
