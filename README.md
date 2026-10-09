# Latihan & Eksplorasi Materi Inheritance dan Polymorphism

Repositori ini berisi penyelesaian tugas Latihan 1, 2, dan 3 untuk topik Pemrograman Berorientasi Objek (PBO/OOP) menggunakan bahasa pemrograman Java.

## Konsep PBO yang Diterapkan

1. **Encapsulation (Enkapsulasi)**
   - Semua variabel/atribut kelas dibatasi aksesnya menggunakan modifier `private` atau `protected`.
   - Pengaksesan dan pengubahan nilai atribut dilakukan secara tertutup melalui method `getter` dan `setter` (misalnya `getSisi()`, `setWarna()`, dll).

2. **Inheritance (Pewarisan)**
   - Class `BujurSangkar` dan `Lingkaran` mewarisi sifat dan atribut dari superclass `Bentuk` menggunakan kata kunci `extends`.
   - Class `Silinder` mewarisi sifat dari class `Lingkaran`.

3. **Polymorphism (Polimorfisme)**
   - **Method Overriding**: Method `printInfo()` di-override pada class `BujurSangkar`, `Lingkaran`, dan `Silinder` untuk menampilkan format informasi khas masing-masing bangun/bentuk.
   - **Dynamic Method Dispatch**: Objek subclass dapat disimpan ke dalam array bertipe superclass (`Bentuk[]`) dan method `printInfo()` dipanggil secara dinamis saat runtime.

##  Output Program
![Screenshot Hasil Run](screenshot.png.png)