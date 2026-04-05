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
                    System.out.println("Pilih Tipe:");
                    System.out.println("1. Reguler");
                    System.out.println("2. Premium");
                    System.out.print("Pilih: ");
                    int tipe = input.nextInt();
                    input.nextLine();

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

                    int harga;
                    while (true) {
                        System.out.print("Harga (15000 - 35000 untuk reguler,40000++ untuk premium): ");
                        harga = input.nextInt();
                        if (tipe == 1 && (harga >= 15000 && harga <= 35000)) {
                            break;
                        } else if (tipe == 2 && harga >= 40000) {
                            break;
                        } else {
                            System.out.println("Harga tidak sesuai dengan tipe!");
                        }
                    }

                    System.out.print("Stok: ");
                    int stok = input.nextInt();
                    input.nextLine();
                    HotWheels mobil;

                    if (tipe == 1) {
                        mobil = new HotWheelsReguler(nama, seri, harga, stok);
                    } else {
                        mobil = new HotWheelsPremium(nama, seri, harga, stok);
                    }
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

                        int hargaBaru;
                        while (true) {
                            System.out.print("Harga Baru: ");
                            hargaBaru = input.nextInt();

                            if (mobilUpdate instanceof HotWheelsReguler) {
                                if (hargaBaru >= 15000 && hargaBaru <= 35000) {
                                    break;
                                } else {
                                    System.out.println("Harga Reguler harus 15000 - 35000!");
                                }
                            } else if (mobilUpdate instanceof HotWheelsPremium) {
                                if (hargaBaru >= 40000) {
                                    break;
                                } else {
                                    System.out.println("Harga Premium minimal 40000!");
                                }
                            }
                        }

                        System.out.print("Stok Baru: ");
                        int stokBaru = input.nextInt();
                        input.nextLine();

                        mobilUpdate.setHarga(hargaBaru);
                        mobilUpdate.setStok(stokBaru);

                        System.out.println("\nData berhasil diupdate!");

                    } else {
                        System.out.println("\nData HotWheels Tidak Ditemukan.");
                    }
                    break;

                case 4:
                    System.out.print("\nNama Mobil: ");
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