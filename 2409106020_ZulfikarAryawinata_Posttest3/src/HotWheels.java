public class HotWheels {
    private String namaMobil;
    private String seri;
    private int harga;
    private int stok;

    public HotWheels(String namaMobil, String seri, int harga, int stok) {
        this.namaMobil = namaMobil;
        this.seri = seri;
        this.harga = harga;
        this.stok = stok;
    }

    //getter
    public String getNamaMobil() {
        return namaMobil;
    }
    public String getSeri() {
        return seri;
    }
    public int getHarga() {
        return harga;
    }
    public int getStok() {
        return stok;
    }

    //setter
    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }
    public void setSeri(String seri) {
        this.seri = seri;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }

    public void tampilData() {
        System.out.println("Nama Mobil: " + namaMobil);
        System.out.println("Seri      : " + seri);
        System.out.println("Harga     : " + harga);
        System.out.println("Stok      : " + stok);
    }
}

//Child Class 1
class HotWheelsReguler extends HotWheels {
    public HotWheelsReguler(String namaMobil, String seri, int harga, int stok) {
        super(namaMobil, seri, harga, stok);
    }
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tipe      : Reguler");
        System.out.println("---------------------------");
    }
}

//Child Class 2
class HotWheelsPremium extends HotWheels {
    public HotWheelsPremium(String namaMobil, String seri, int harga, int stok) {
        super(namaMobil, seri, harga, stok);
    }
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tipe      : Premium");
        System.out.println("---------------------------");
    }
}