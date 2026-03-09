public class HotWheels {
    String namaMobil;
    String seri;
    int harga;
    int stok;

    HotWheels(String namaMobil, String seri, int harga, int stok) {
        this.namaMobil = namaMobil;
        this.seri = seri;
        this.harga = harga;
        this.stok = stok;
    }

    void tampilData() {
        System.out.println("Nama Mobil: " + namaMobil);
        System.out.println("Seri      : " + seri);
        System.out.println("Harga     : " + harga);
        System.out.println("Stok      : " + stok);
        System.out.println("---------------------------");
    }
}