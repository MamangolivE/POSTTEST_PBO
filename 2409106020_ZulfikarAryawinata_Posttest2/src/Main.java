import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Toko toko = new Toko();
        int pilih;
        do {
            System.out.println("\n=== SISTEM TOKO HOTWHEELS ===");
            System.out.println("1. Tambah Data HotWheels");
            System.out.println("2. Tampilkan Data HotWheels");
            System.out.println("3. Update Data HotWheels");
            System.out.println("4. Hapus Data HotWheels");
            System.out.println("5. Keluar Program");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("\nNama Mobil (input 0 untuk keluar): ");
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
                    input.nextLine();

                    HotWheels mobil = new HotWheels(nama, seri, harga, stok);
                    toko.tambahMobil(mobil);

                    System.out.println("\nData Berhasil Ditambahkan!");
                    break;

                case 2:
                    toko.tampilMobil();
                    break;

                case 3:
                    System.out.print("\nMasukkan Nama Mobil yang Ingin Diupdate: ");
                    String namaUpdate = input.nextLine();

                    System.out.print("Masukkan Seri Mobil: ");
                    String seriUpdate = input.nextLine();

                    HotWheels mobilUpdate = toko.cariMobil(namaUpdate, seriUpdate);
                    if (mobilUpdate != null) {
                        System.out.println("\nData Ditemukan, Masukkan Data Baru");

                        System.out.print("Harga Baru: ");
                        int hargaBaru = input.nextInt();

                        System.out.print("Stok Baru: ");
                        int stokBaru = input.nextInt();
                        input.nextLine();

                        mobilUpdate.setHarga(hargaBaru);
                        mobilUpdate.setStok(stokBaru);

                        System.out.println("Data berhasil diupdate!");

                    } else {
                        System.out.println("\nData HotWheels Tidak Ditemukan.");
                    }
                    break;

                case 4:
                    System.out.print("Nama Mobil: ");
                    String namaHapus = input.nextLine();
                    System.out.print("Seri: ");
                    String seriHapus = input.nextLine();
                    toko.hapusMobil(namaHapus, seriHapus);
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak ada.");
            }
        } while (pilih != 5);
    }
}