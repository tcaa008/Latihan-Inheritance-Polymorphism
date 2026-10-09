# Latihan & Eksplorasi Materi Inheritance dan Polymorphism

Repositori ini mengandungp enyelesaian untuk Latihan 1, 2, dan 3 mengenai konsep Pemrograman Berorientasi Objek (OOP) Java.

## Konsep OOP yang Digunakan

1. **Encapsulation (Pengkapsulan)**
   - Semua atribut kelas menggunakan pemodifikasi capaian `private` atau `protected` untuk menyembunyikan data secara langsung.
   - Akses data dilakukan melalui kaedah `getter` dan `setter` (seperti `getSisi()`, `setWarna()`, dll).

2. **Inheritance (Pewarisan)**
   - `BujurSangkar` dan `Lingkaran` mewarisi ciri/sifat daripada superclass `Bentuk` menggunakan kata kunci `extends`.
   - `Silinder` mewarisi ciri/sifat daripada superclass `Lingkaran`.

3. **Polymorphism (Polimorfisme)**
   - **Method Overriding**: Method `printInfo()` di-override pada kelas `BujurSangkar`, `Lingkaran`, dan `Silinder` untuk memberikan output khusus mengikut jenis bentuk.
   - **Dynamic Method Dispatch**: Objek `BujurSangkar`, `Lingkaran`, dan `Silinder` boleh disimpan ke dalam tatasusunan berjenis `Bentuk[]` dan dipanggil fungsi `printInfo()` secara dinamik.

## Hasil Tangkapan Skrin (Screenshot)

![Screenshot Hasil Run](screenshot.png.png)