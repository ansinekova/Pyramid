package pyramid;

public class Main {
    public static void main(String[] args) {
        // 1. Правильная (4 ряда)
        Pyramid p1 = new Pyramid(new Ring1(), new Ring2(), new Ring3(), new Ring4());

        // 2. Неправильная (3 ряда, нет 2-го кольца, сразу 1 -> 3 -> 4)
        Pyramid p2 = new Pyramid(new Ring1(), null, new Ring3(), new Ring4());

        // 3. Неправильная (2 ряда, только 2 и 4 кольца)
        Pyramid p3 = new Pyramid(new Ring2(), null, new Ring4(), null);

        // 4. Неправильная (3 ряда, нет 2-го кольца, 1 -> 3 -> 4)
        Pyramid p4 = new Pyramid(new Ring1(), null, new Ring3(), new Ring4());

        p1.draw(); p1.check(); System.out.println();
        p2.draw(); p2.check(); System.out.println();
        p3.draw(); p3.check(); System.out.println();
        p4.draw(); p4.check();
    }
}