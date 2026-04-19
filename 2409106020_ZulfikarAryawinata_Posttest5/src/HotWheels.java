public abstract class HotWheels implements BisaDiskon {
    private String namaMobil;
    private String seri;
    private int harga;
    private int stok;
    protected int diskon;

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
    // harga biasa
    public void setHarga(int harga) {
        this.harga = harga;
        this.diskon = 0;
    }
    // harga diskon
    public void setHarga(int harga, int diskon) {
        this.diskon = diskon;
        this.harga = harga - (harga * diskon / 100);
    }
    public void setStok(int stok) {
        this.stok = stok;
    }

    // abstract method
    public abstract void infoTipe();

    // interface method
    @Override
    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }
    // interface method
    @Override
    public int getDiskon() {
        return diskon;
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
    public void infoTipe() {
        System.out.println("Tipe      : Reguler");
    }

    @Override
    public void tampilData() {
        super.tampilData();
        infoTipe();
        infoDiskon();
        System.out.println("---------------------------");
    }

    public void infoDiskon() {
        System.out.println("Diskon    : " + diskon + "%");
    }
}

//Child Class 2
class HotWheelsPremium extends HotWheels {
    public HotWheelsPremium(String namaMobil, String seri, int harga, int stok) {
        super(namaMobil, seri, harga, stok);
    }

    @Override
    public void infoTipe() {
        System.out.println("Tipe      : Premium");
    }

    @Override
    public void tampilData() {
        super.tampilData();
        infoTipe();
        infoDiskon();
        System.out.println("---------------------------");
    }

    public void infoDiskon() {
        System.out.println("Diskon    : " + diskon + "%");
    }
}

interface BisaDiskon {
    public void setDiskon(int diskon);
    public int getDiskon();
}