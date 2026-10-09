public class Lingkaran extends Bentuk {
    private double radius;
    public static final double PHI = 3.14159; // Konstanta kelas PHI

    // Constructor
    public Lingkaran(double radius, String warna) {
        super(warna);
        this.radius = radius;
    }

    // Getter & Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method hitungLuas
    public double hitungLuas() {
        return PHI * radius * radius;
    }

    // Override printInfo
    @Override
    public void printInfo() {
        System.out.println("Lingkaran " + getWarna() + ", luas = " + hitungLuas());
    }
}