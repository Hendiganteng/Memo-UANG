Judul Aplikasi
Memo Uang – Aplikasi Android Pencatat Keuangan Harian

Deskripsi Singkat
Memo Uang adalah aplikasi Android yang membantu pengguna mencatat pemasukan dan pengeluaran secara sederhana dan efisien. Aplikasi ini sangat cocok untuk pengguna yang ingin mengelola keuangan pribadi dengan cara yang cepat dan praktis.

Fitur Utama
Dashboard Utama
Menampilkan ringkasan pemasukan dan pengeluaran pengguna.

Pemasukan

Menambahkan data pemasukan

Menampilkan list pemasukan

Menghapus data pemasukan

Pengeluaran

Menambahkan data pengeluaran

Menampilkan list pengeluaran

Menghapus data pengeluaran

Database Lokal (Room)

Penyimpanan data offline menggunakan SQLite (via Room Persistence Library)

Desain UI

Menggunakan ViewPager + Fragment untuk navigasi antar bagian (Input, Pemasukan, Pengeluaran)

👥 Pembagian Tugas Pembuatan Aplikasi
Berikut contoh pembagian tugas untuk tim pengembang 3 orang:

1. Hendi (Front-End Developer / UI Designer)
Mendesain tampilan aplikasi menggunakan XML (layout)

Membuat struktur navigasi antar fragment

Menambahkan elemen visual: ikon, tombol, warna

File terkait:

activity_main.xml, fragment_pemasukan.xml, activity_add_data.xml, dll

Semua file di /res/layout dan /res/drawable

2. Aldi (Back-End Developer / Logic & Database)
Membuat struktur database dengan Room

Mengelola insert, update, delete data pemasukan & pengeluaran

Menghubungkan UI dengan ViewModel

File terkait:

AppDatabase.java, DatabaseDao.java, ModelDatabase.java

ViewModel untuk pemasukan & pengeluaran

AddPemasukanViewModel.java, PengeluaranViewModel.java, dll

3. Revi  ( bagian integrasi atau dokumentasi)
Mengintegrasikan seluruh bagian (UI + Logic)


Testing fitur dan fixing bug

Menulis dokumentasi (README, komentar di kode)

Setup GitHub & CI/CD (jika ada)

✅ Teknologi yang Digunakan
Java: Bahasa pemrograman utama

Android SDK

Room Database (SQLite)

MVVM Architecture

ViewPager + Fragment

Git & GitHub untuk version control

link jira = https://wahyualdi2904-1746078457818.atlassian.net/jira/software/projects/SCRUM/boards/1?jql=assignee+%3D+712020%3Af06a79a3-c648-4348-b353-2d3dbd47e7f9&atlOrigin=eyJpIjoiZWI1NDk3OWI3OGI3NDgyNWFjOGQyZGRkZTkxMDliMzEiLCJwIjoiaiJ9

