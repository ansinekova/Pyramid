package pyramid;

public class Main {
    public static void main(String[] args) {
        Pyramid p1 = new Pyramid(new Ring1(), new Ring2(), new Ring3(), new Ring4());

        Pyramid p2 = new Pyramid(new Ring1(), null, new Ring3(), new Ring4());

        Pyramid p3 = new Pyramid(new Ring2(), null, new Ring4(), null);

        Pyramid p4 = new Pyramid(new Ring1(), null, new Ring3(), new Ring4());

        p1.draw(); p1.check(); System.out.println();
        p2.draw(); p2.check(); System.out.println();
        p3.draw(); p3.check(); System.out.println();
        p4.draw(); p4.check();
    }
}