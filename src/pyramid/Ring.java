package pyramid;

public abstract class Ring {
    // Абстрактные методы (как в учебнике с Animal)
    public abstract void draw(int indent);
    public abstract int getNumber();
    public abstract int getWidth();

    // Простая рекурсия для пробелов (без массивов и циклов)
    protected String spaces(int n) {
        if (n <= 0) {
            return "";
        }
        return " " + spaces(n - 1);
    }
}