# FragmentViewPager
### Teori Fragment
Fragment mewakili perilaku atau bagian dari antarmuka pengguna dalam FragmentActivity. <br>
Anda bisa mengombinasikan beberapa fragmen dalam satu aktivitas untuk membangun UI multipanel dan menggunakan kembali sebuah fragmen dalam beberapa aktivitas. <br>
Anda bisa menganggap fragmen sebagai bagian modular dari aktivitas, yang memiliki daur hidup sendiri, <br>
menerima kejadian masukan sendiri, dan yang bisa Anda tambahkan atau hapus saat aktivitas berjalan (semacam "subaktivitas" yang bisa digunakan kembali dalam aktivitas berbeda).<br>

### Filosofi Desain
Android memperkenalkan fragmen di Android 3.0 (API level 11), terutama untuk mendukung desain UI yang lebih dinamis dan fleksibel pada layar besar, seperti tablet. <br>
Karena layar tablet jauh lebih besar daripada layar handset, maka lebih banyak ruang untuk mengombinasikan dan bertukar komponen UI. <br>
Fragmen memungkinkan desain seperti itu tanpa perlu mengelola perubahan kompleks pada hierarki tampilan. Dengan membagi layout aktivitas menjadi beberapa fragmen, <br>
Anda bisa mengubah penampilan aktivitas saat waktu proses dan mempertahankan perubahan itu di back-stack yang dikelola oleh aktivitas. Mode-mode tersebut kini tersedia secara luas melalui library dukungan fragmen. <br>

### Membuat Fragment
Untuk membuat fragmen, Anda harus membuat subclass Fragment (atau subclass-nya yang ada). Class Fragment memiliki kode yang mirip seperti Activity. <br>
Class ini memiliki metode callback yang serupa dengan aktivitas, seperti onCreate(), onStart(), onPause(), dan onStop(). Sebenarnya, <br>
jika Anda mengonversi aplikasi Android saat ini untuk menggunakan fragmen, Anda mungkin cukup memindahkan kode dari metode callback aktivitas ke masing-masing metode callback fragmen. <br>

### Subclass Fragment

**DialogFragment** <br>
    Menampilkan dialog mengambang. Penggunaan class ini untuk membuat dialog merupakan alternatif yang baik dari penggunaan metode helper dialog di class Activity, karena Anda bisa menyatukan dialog fragmen ke dalam back-stack fragmen yang dikelola oleh aktivitas, sehingga pengguna bisa menutup ke fragmen yang ditinggalkan. <br>
**ListFragment** <br>
    Menampilkan daftar item yang dikelola oleh adaptor (misalnya SimpleCursorAdapter), serupa dengan ListActivity. Menampilkan beberapa metode pengelolaan tampilan daftar, seperti callback onListItemClick() untuk menangani kejadian klik. 
    (Perhatikan bahwa metode yang disukai untuk menampilkan daftar adalah dengan menggunakan RecyclerView dan bukan ListView. Dalam hal ini Anda akan perlu membuat fragmen yang menyertakan RecyclerView dalam layout-nya. Lihat Buat Daftar dengan RecyclerView untuk mempelajari caranya.) <br>
**PreferenceFragmentCompat**
    Menampilkan hierarki objek Preference sebagai daftar. Proses ini digunakan untuk membuat layar setelan untuk aplikasi Anda. <br>
    
   ### Selengkapnya cek modul
   ## Result
   ![Alt Text](https://github.com/adam033/FragmentViewPager/blob/main/Screenshot%20(637).png)
   
