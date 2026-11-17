package pyramid;

public abstract class Ring {
    public abstract void draw(int indent);
    public abstract int getNumber();
    public abstract int getWidth();

    protected String spaces(int n) {
        if (n <= 0) {
            return "";
        }
        return " " + spaces(n - 1);
    }
}