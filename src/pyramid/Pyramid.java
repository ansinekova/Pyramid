package pyramid;

public class Pyramid {
    private Ring[] rings;

    public Pyramid(Ring r1, Ring r2, Ring r3, Ring r4) {
        this.rings = new Ring[]{r1, r2, r3, r4};
    }

    public void draw() {
        drawLevel(0);
    }

    private void drawLevel(int level) {
        if (level < 4) {
            Ring current = rings[level];

            if (current != null) {
                int indent = (9 - current.getWidth()) / 2;
                current.draw(indent);
            }

            drawLevel(level + 1);
        }
    }

    public void check() {
        boolean ok =
                rings[0] != null && rings[0].getNumber() == 1 &&
                        rings[1] != null && rings[1].getNumber() == 2 &&
                        rings[2] != null && rings[2].getNumber() == 3 &&
                        rings[3] != null && rings[3].getNumber() == 4;

        if (!ok) {
            System.out.println("Неправильная пирамида");
        } else {
            System.out.println("Правильная пирамида");
        }
    }
}