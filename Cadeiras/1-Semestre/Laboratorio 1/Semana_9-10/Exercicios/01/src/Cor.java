public class Cor {
    private int r;
    private int g;
    private int b;

    public Cor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return this.r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return this.g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Cor R: " + this.r + ", cor G: " + this.g + ", cor B: " + this.b + " ";
    }

}
