package com.example.ujiansim;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "soalUjian.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        // TODO Auto-generated method stub
        String sql = "create table soalUjian(no integer primary key, jenis_ujian text null,soal text null, jawabanA text null, jawabanB text null, jawabanC text null,kj text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO soalUjian (no, jenis_ujian, soal, jawabanA, jawabanB,jawabanC,kj) VALUES " +
                "('1', 'Ujian SIM C', '1. Manakah yang tidak termasuk dalam peralatan pendukung kendaraan beroda dua?', 'Helm yang berstandar SNI','Rompi pemantul cahaya','Kacamata hitam','Kacamata hitam')," +
                "('2', 'Ujian SIM C', '2. Isyarat peringatan dengan bunyi yang berupa klakson dapat digunakan apabila:', 'Diperlukan untuk keselamatan lalu lintas','Melewati kendaraan bermotor lainnya','Butir a dan b benar','Butir a dan b benar')," +
                "('3', 'Ujian SIM C', '3. Di antara persyaratan berikut, manakah yang harus dipenuhi untuk mendapatkan SIM?', 'Usia','Persyaratan kesehatan','Semua jawaban benar','Semua jawaban benar')," +
                "('4', 'Ujian SIM C', '4. Lampu rem pada kendaraan bermotor sesuai ketentuan adalah?', 'Hijau dan menyala tidak berkelip','Merah dan menyala tidak berkelip','Merah dan menyala berkelip - kelip','Merah dan menyala tidak berkelip')," +
                "('5', 'Ujian SIM C', '5. Sebagai pengguna jalan hal yang paling utama buat saya adalah:', 'Keselamatan saya dan orang lain','Keselamatan saya','kecepatan','Keselamatan saya dan orang lain')," +
                "('6', 'Ujian SIM C', '6. Surat Izin Mengemudi digolongkan berdasarkan', 'Jenis kendaraan bermotor','Tingkat sosial ekonomi pemegangnya','Tingkat sosial ekonomi pemegangnya','Jenis kendaraan bermotor')," +
                "('7', 'Ujian SIM C', '7. Isyarat peringatan dengan bunyi yang berupa klakson dapat digunakan apabila', 'Melewati kendaraan bermotor lainnya','Butir a dan c benar semua','Diperlukan untuk keselamatan lalu lintas','Butir a dan c benar semua')," +
                "('8', 'Ujian SIM C', '8. Menurut sifatnya, rambu lalu lintas terdiri dari:', 'Peringatan, Larangan, Perintah, Petunjuk','Peringatan, Larangan, Perintah','Larangan, Perintah, Petunjuk','Peringatan, Larangan, Perintah, Petunjuk')," +
                "('9', 'Ujian SIM C', '9. Alat pengukur kecepatan di kendaraan, secara umum menunjukkan…', 'Kecepatan rata-rata kendaraan kita','Semuanya benar','Kecepatan aktual,saat melintasi alat','Kecepatan aktual,saat melintasi alat')," +
                "('10', 'Ujian SIM C', '10. Marka membujur berupa:', 'Garis utuh dan garis putus-putus','Semuanya benar','Garis ganda yang terdiri dari dua garis utuh','Semuanya benar')," +
                "('11', 'Ujian SIM C', '11. Fungsi dari rem adalah…', 'Untuk memperlambat atau menghentikan putaran roda','Untuk menurunkan putaran mesin','Untuk mengganti gigi transmisi kendaraan','Untuk memperlambat atau menghentikan putaran roda')," +
                "('12', 'Ujian SIM C', '12. Yang bukan merupakan jenis surat ijin mengemudi adalah ', 'SIM Kendaraan Bermotor ganda, Perintah, Petunjuk','Semua jawaban salah','SIM Kendaraan Bermotor umum','SIM Kendaraan Bermotor ganda')," +
                "('13', 'Ujian SIM C', '13. Pemilik SIM golongan C dapat digunakan untuk mengemudi kendaraan?', 'Untuk mengemudikan seluruh jenis kendaraan','Hanya untuk mengendarai jenis sepeda motor di bawah 250 cc','Untuk mengendarai seluruh jenis sepeda motor kecuali diatas 500 cc','Hanya untuk mengendarai jenis sepeda motor di bawah 250 cc')," +
                "('14', 'Ujian SIM C', '14. Jika Anda mengendari Motor Gede (Moge) diatas 1000 cylinder capacity (cc), jenis SIM apakah yang harus dimiliki? ', 'SIM C I','SIM C','SIM C II','SIM C II')," +
                "('15', 'Ujian SIM C', '15. Golongan SIM apakah yang diperlukan jika anda hendak mengendarai motor 250 cc?', 'Golongan SIM C I & II','Golongan SIM C II','Golongan SIM C I','Golongan SIM C I & II');";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub

    }

}