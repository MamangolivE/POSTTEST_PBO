import java.util.ArrayList;

public class Toko {
    private ArrayList<HotWheels> daftarMobil = new ArrayList<>();

    public void tambahMobil(HotWheels mobil) {
        daftarMobil.add(mobil);
    }

    public void tampilMobil() {
        if (daftarMobil.isEmpty()) {
            System.out.println("\nData masih kosong.");
            return;
        }
        System.out.println("\n===== DATA HOTWHEELS =====");
        int no = 1;
        for (HotWheels m : daftarMobil) {
            System.out.println("Data ke-" + no++);
            m.tampilData();
        }
    }

    public HotWheels cariMobil(String nama, String seri) {

        for (HotWheels m : daftarMobil) {

            if (m.getNamaMobil().trim().equalsIgnoreCase(nama.trim())
                    && m.getSeri().trim().equalsIgnoreCase(seri.trim())) {

                return m;
            }
        }

        return null;
    }

    public void updateMobil(String nama, String seri,
                            int hargaBaru, int stokBaru) {
        boolean ditemukan = false;

        for (HotWheels m : daftarMobil) {
            if (m.getNamaMobil().trim().equalsIgnoreCase(nama.trim())
                    && m.getSeri().trim().equalsIgnoreCase(seri.trim())) {
                System.out.println("\nData Ditemukan, Masukkan Data Baru");

                m.setHarga(hargaBaru);
                m.setStok(stokBaru);

                System.out.println("Data berhasil diupdate!");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Data HotWheels Tidak Ditemukan.");
        }
    }

    public void hapusMobil(String nama, String seri) {
        boolean ditemukan = false;

        for (int i = 0; i < daftarMobil.size(); i++) {

            if (daftarMobil.get(i).getNamaMobil().trim().equalsIgnoreCase(nama.trim())
                    && daftarMobil.get(i).getSeri().trim().equalsIgnoreCase(seri.trim())) {
                daftarMobil.remove(i);
                System.out.println("Data berhasil dihapus!");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mobil tidak ditemukan.");
        }
    }
}