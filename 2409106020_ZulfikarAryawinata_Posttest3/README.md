# Sistem Manajemen Toko HotWheels

## Deskripsi Program
Program ini merupakan aplikasi sederhana berbasis Java yang digunakan untuk mengelola data mobil HotWheels pada sebuah toko. Program ini menerapkan konsep dasar Pemrograman Berorientasi Objek (PBO) dengan menggunakan class dan object.

## Fitur Program
Program memiliki fitur CRUD (Create, Read, Update, Delete) menggunakan struktur data ArrayList.
### Menu Utama
![Tampilan Menu Utama](assets/menuUtama.png)
Menu utama merupakan tampilan awal program yang berisi daftar pilihan fitur 
yang tersedia dalam sistem manajemen Toko HotWheels.
### Tambah Data HotWheels
![Tambah HotWheels](assets/tambahMobil.png)

Menu ini digunakan untuk menambahkan data mobil HotWheels ke dalam sistem. 
Pengguna akan diminta memasukkan informasi seperti tipe mobil (Reguler atau Premium), 
nama mobil, seri, harga, dan stok. Data yang berhasil dimasukkan akan disimpan ke dalam daftar mobil.
### Tampilkan Data
![Tampilkan Daftar HotWheels](assets/tampilkanData.png)

Menu ini berfungsi untuk menampilkan seluruh data mobil HotWheels yang telah tersimpan. 
Informasi yang ditampilkan meliputi nama mobil, seri, harga, stok, serta tipe mobil.
### Update Data HotWheels
![Ubah Data HotWheels](assets/ubahData.png)

Menu ini digunakan untuk memperbarui data mobil yang sudah ada. Pengguna diminta memasukkan 
nama mobil dan seri sebagai kunci pencarian. Jika data ditemukan, pengguna dapat mengubah harga dan stok mobil.
### Hapus Data HotWheels
![Hapus Data HotWheels](assets/hapusData.png)

Menu ini berfungsi untuk menghapus data mobil dari sistem. Pengguna perlu memasukkan nama mobil dan seri. 
Jika data ditemukan, maka data tersebut akan dihapus dari daftar.
### Keluar Program
![Keluar Program](assets/keluarProgram.png)

Menu ini digunakan untuk mengakhiri program. Ketika pengguna memilih menu ini, sistem akan berhenti berjalan 
dan keluar dari aplikasi.

## Konsep PBO yang Digunakan
- Class
- Object
- Method
- ArrayList
- Perulangan Menu

## Struktur Program
- HotWheels.java → Class untuk menyimpan data mobil
- Main.java → Program utama untuk menjalankan menu CRUD
- Toko → Class untuk menyimpan fungsi dari fitur program

## Cara Menjalankan Program
1. Compile file Java
2. Jalankan class Main
3. Pilih menu sesuai kebutuhan