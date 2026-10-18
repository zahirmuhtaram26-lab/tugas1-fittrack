
# Sistem Keanggotaan Gym FitTrack

## Identitas
- Nama: Zahir Muhtaram Gayoni
- NPM: 250810701100116
- Kelas Praktikum: PBO A

## Deskripsi
FitTrack merupakan program Java sederhana untuk mengelola data keanggotaan gym. Program ini menyimpan nama, nomor telepon, tanggal pendaftaran, dan jenis paket member serta melakukan validasi data sebelum disimpan.

## Fitur Utama
- Menyimpan data member gym.
- Memvalidasi nama dan nomor telepon.
- Memvalidasi jenis paket Basic, Premium, dan VIP.
- Membuat member dengan paket Basic secara default.
- Menampilkan seluruh data member.

## Konsep OOP yang Diterapkan

| Konsep | Penerapan | Alasan |
|---|---|---|
| Class | Member dan TesFitTrack | Mengelompokkan data dan pengujian program |
| Object | Objek Member | Merepresentasikan setiap member gym |
| Encapsulation | Atribut private | Melindungi data agar diakses melalui getter dan setter |
| Constructor | Constructor Member | Menginisialisasi data member |
| Overloading | Dua constructor Member | Member dapat dibuat dengan atau tanpa paket |
| Method Overriding | toString() | Menampilkan data member dengan format jelas |

## Struktur Project

```text
tugas1-fittrack/
├── src/
│   ├── Member.java
│   └── TesFitTrack.java
├── .gitignore
└── README.md
```

## Prasyarat
- JDK 17 atau versi yang sesuai dengan lingkungan praktikum.
- IntelliJ IDEA atau terminal yang mendukung Java.

## Cara Menjalankan

Kompilasi melalui terminal dari folder utama project:

```bash
javac -d out src/Member.java src/TesFitTrack.java
java -cp out TesFitTrack
```

## Contoh Output

Screenshot hasil pengujian program akan ditambahkan setelah program berhasil dijalankan, termasuk pengujian data valid dan data yang ditolak oleh validasi.

## Nilai Default
- Nama: Belum diisi.
- Nomor telepon: 0000000000.
- Tanggal daftar: 01-01-2026.
- Jenis paket: Basic.

Nilai default digunakan agar objek tetap terbentuk ketika data yang diberikan tidak valid.

## Batasan dan Pengembangan Lanjutan
Program belum menggunakan database dan data hanya tersedia selama program berjalan. Pengembangan selanjutnya dapat mencakup penyimpanan permanen, pencarian member, dan antarmuka pengguna.
