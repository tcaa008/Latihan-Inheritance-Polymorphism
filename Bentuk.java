public class Bentuk {
    protected String warna;

    // Constructor
    public Bentuk(String warna) {
        this.warna = warna;
    }

    // Getter & Setter
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Method printInfo
    public void printInfo() {
        System.out.println("Bentuk berwarna " + warna);
    }
}