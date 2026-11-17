package pyramid;

public class Ring4 extends Ring {
    @Override
    public void draw(int indent) {
        System.out.println(spaces(indent) + "OOOO|OOOO");
    }

    @Override
    public int getNumber() { return 4; }

    @Override
    public int getWidth() { return 9; } // 9 символов
}