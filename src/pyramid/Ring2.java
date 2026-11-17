package pyramid;

public class Ring2 extends Ring {
    @Override
    public void draw(int indent) {
        System.out.println(spaces(indent) + "OO|OO");
    }

    @Override
    public int getNumber() { return 2; }

    @Override
    public int getWidth() { return 5; }
}