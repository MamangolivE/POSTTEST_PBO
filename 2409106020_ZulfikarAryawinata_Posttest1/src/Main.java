import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<HotWheels> daftarMobil = new ArrayList<>();

        int pilihan;

        do {

            System.out.println("\n=== SISTEM MANAJEMEN TOKO HOTWHEELS ===");
            System.out.println("1. Tambah Data HotWheels");
            System.out.println("2. Tampilkan Data HotWheels");
            System.out.println("3. Update Data HotWheels");
            System.out.println("4. Hapus Data HotWheels");
            System.out.println("5. Keluar Program");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.println("\n=== Tambah Data HotWheels ===");

                    input.nextLine();
                    System.out.print("Nama Mobil (input 0 untuk keluar): ");
                    String nama = input.nextLine();
                    if (nama.equals("0")) {
                        break;
                    }

                    System.out.print("Seri (input 0 untuk keluar): ");
                    String seri = input.nextLine();
                    if (seri.equals("0")) {
                        break;
                    }

                    System.out.print("Harga: ");
                    int harga = input.nextInt();

                    System.out.print("Stok: ");
                    int stok = input.nextInt();

                    HotWheels mobil = new HotWheels(nama, seri, harga, stok);
                    daftarMobil.add(mobil);

                    System.out.println("\nData Berhasil Ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n=== Data HotWheels ===");

                    if (daftarMobil.isEmpty()) {
                        System.out.println("\nData Masih Kosong.");
                    } else {
                        for (HotWheels m : daftarMobil) {
                            m.tampilData();
                        }
                    }
                    break;

                case 3:
                    input.nextLine();
                    System.out.print("\nMasukkan Nama Mobil yang Ingin Diupdate: ");
                    String namaUpdate = input.nextLine();
                    System.out.print("Masukkan Seri Mobil: ");
                    String seriUpdate = input.nextLine();

                    boolean dataUpdate = false;

                    for (HotWheels m : daftarMobil) {

                        if (m.namaMobil.equalsIgnoreCase(namaUpdate) &&
                                m.seri.equalsIgnoreCase(seriUpdate)) {

                            System.out.println("\nData Ditemukan, Masukkan Data Baru");

                            System.out.print("Harga Baru: ");
                            m.harga = input.nextInt();

                            System.out.print("Stok Baru: ");
                            m.stok = input.nextInt();

                            System.out.println("Data berhasil diupdate!");
                            dataUpdate = true;
                            break;
                        }
                    }

                    if (!dataUpdate) {
                        System.out.println("Data HotWheels Tidak Ditemukan.");
                    }
                    break;

                case 4:
                    input.nextLine();
                    System.out.print("\nMasukkan Nama Mobil yang Ingin Dihapus: ");
                    String namaHapus = input.nextLine();
                    System.out.print("Masukkan Seri Mobil: ");
                    String seriHapus = input.nextLine();

                    boolean dataHapus = false;

                    for (int i = 0; i < daftarMobil.size(); i++) {

                        if (daftarMobil.get(i).namaMobil.equalsIgnoreCase(namaHapus) &&
                                daftarMobil.get(i).seri.equalsIgnoreCase(seriHapus)) {

                            daftarMobil.remove(i);
                            System.out.println("\nData Berhasil Dihapus!");
                            dataHapus = true;
                            break;
                        }
                    }

                    if (!dataHapus) {
                        System.out.println("Mobil Tidak Ditemukan.");
                    }

                    break;
            }

        } while (pilihan != 5);
    }
}