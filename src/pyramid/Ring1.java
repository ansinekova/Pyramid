package pyramid;

public class Ring1 extends Ring {
    @Override
    public void draw(int indent) {
        System.out.println(spaces(indent) + "O|O");
    }

    @Override
    public int getNumber() { return 1; }

    @Override
    public int getWidth() { return 3; }
}