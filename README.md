# Praktikum 4 - Pemrograman Perangkat Bergerak

## Author Information
Nama        : Ridho Drajat

NIM         : C030324104

Kelas       : 4D

Mata Kuliah : Pemrograman Perangkat Bergerak

## Pernyataan 
Apabila melakukan copy paste dari praktikum milik teman. Saya bersedia nilai praktikum dikurangi atau dianulir. Saya juga bersedia dosen tidak perlu menjelaskan alasannya dikarenakan dapat dicek hasil pekerjaan saya dari github sendiri.

## Additional Information

Repository ini berisi seluruh dokumentasi kode hasil pengerjaan Praktikum 4 pada mata kuliah Pemrograman Perangkat Bergerak. Seluruh materi dan proyek di dalam repository ini dikembangkan menggunakan bahasa pemrograman Kotlin dengan Android Studio sebagai lingkungan pengembangan aplikasi Android.

Praktikum ini berfokus pada implementasi navigasi antar halaman aplikasi Android menggunakan **Intent**, pengelolaan tampilan menggunakan **Fragment**, serta pembuatan antarmuka yang lebih dinamis melalui **Bottom Navigation** dan **RecyclerView**. Materi diawali dengan pembuatan **Splash Screen** menggunakan *Explicit Intent*, di mana aplikasi menampilkan halaman pembuka selama beberapa detik sebelum berpindah ke halaman login secara otomatis.

Selanjutnya, repository ini memuat implementasi halaman **Login** yang memanfaatkan komponen `EditText`, `Button`, dan validasi data input pengguna. Setelah proses autentikasi berhasil, pengguna akan diarahkan ke halaman utama yang menerapkan konsep **Fragment**. Pada bagian ini dibuat dua fragment, yaitu **BerandaFragment** dan **TentangFragment**, yang ditampilkan secara dinamis melalui `FragmentManager` untuk memberikan pengalaman navigasi yang lebih fleksibel.

Pada tahap berikutnya, praktikum mengenalkan penggunaan **BottomNavigationView** sebagai media navigasi utama aplikasi. Melalui komponen ini, pengguna dapat berpindah antara halaman **Home**, **Profile**, dan **Logout** tanpa harus berpindah activity. Halaman Home mengimplementasikan **RecyclerView** untuk menampilkan daftar mata kuliah secara efisien menggunakan pola **Adapter** dan **ViewHolder**. Data yang ditampilkan berasal dari objek model `Matakuliah` yang berisi informasi kode mata kuliah, nama mata kuliah, jumlah SKS, dosen pengampu, jadwal perkuliahan, dan ruangan.

Selain itu, praktikum ini juga membahas pembuatan **Custom Adapter** melalui kelas `MatakuliahAdapter`, penggunaan **LinearLayoutManager** untuk mengatur tata letak data pada RecyclerView, serta penerapan **Toast** sebagai umpan balik ketika pengguna memilih salah satu item mata kuliah. Pada halaman Profile, data pengguna ditampilkan menggunakan Fragment dengan mekanisme pengiriman data antar komponen aplikasi melalui **Bundle** dan **Intent Extra**.

Sebagai penutup, aplikasi menerapkan fitur **Logout** yang memanfaatkan komponen **AlertDialog** untuk menampilkan konfirmasi sebelum pengguna keluar dari aplikasi. Seluruh rangkaian praktikum ini dirancang untuk memperkuat pemahaman mahasiswa mengenai navigasi Android, pengelolaan fragment, pengiriman data antar activity dan fragment, serta pengembangan antarmuka modern menggunakan RecyclerView dan Bottom Navigation pada platform Android berbasis Kotlin.
