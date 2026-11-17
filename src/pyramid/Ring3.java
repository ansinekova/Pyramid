package pyramid;

public class Ring3 extends Ring {
    @Override
    public void draw(int indent) {
        System.out.println(spaces(indent) + "OOO|OOO");
    }

    @Override
    public int getNumber() { return 3; }

    @Override
    public int getWidth() { return 7; } // 7 символов
}