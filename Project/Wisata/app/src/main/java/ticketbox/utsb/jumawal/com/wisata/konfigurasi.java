package ticketbox.utsb.jumawal.com.wisata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class konfigurasi {

    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD="http://192.168.43.141/wisata/tambahPgw.php";
    public static final String URL_PANTAIFINK="http://192.168.43.141/wisata/tambahratingpantaifink.php";
    public static final String URL_PANTAISENGGIGI="http://192.168.43.141/wisata/tambahratingpantaisenggigi.php";
    public static final String URL_PANTAICEMARA="http://192.168.43.141/wisata/tambahratingpantaicemara.php";
    public static final String URL_PANTAIEKAS="http://192.168.43.141/wisata/tambahratingpantaiekas.php";
    public static final String URL_PANTAILABUAN="http://192.168.43.141/wisata/tambahratingpantailabuan.php";
    public static final String URL_PANTAIRAMBANG="http://192.168.43.141/wisata/tambahratingpantairambang.php";
    public static final String URL_PANTAISURGA="http://192.168.43.141/wisata/tambahratingpantaisurga.php";
    public static final String URL_PANTAIKUTA="http://192.168.43.141/wisata/tambahratingpantaikuta.php";
    public static final String URL_GUNUNGRINJANI="http://192.168.43.141/wisata/Gunungrinjani.php";
    public static final String URL_GUNUNGBARUJARI="http://192.168.43.141/wisata/Gunungbarujari.php";
    public static final String URL_AIRTERJUNBENANGKELAMBU="http://192.168.43.141/wisata/airterjunbenangkelambu.php";
    public static final String URL_AIRTERJUNGERIPAK="http://192.168.43.141/wisata/airterjungeripak.php";
    public static final String URL_AIRTERJUNJERUKMANIS="http://192.168.43.141/wisata/airterjunjerukmanis.php";
    public static final String URL_AIRTERJUNOTAKKOKOH="http://192.168.43.141/wisata/airterjunotakkokoh.php";
    public static final String URL_AIRTERJUNTIUTEJA="http://192.168.43.141/wisata/airterjuntiuteja.php";
    public static final String URL_KOLAMRENANGAIQBUKAK="http://192.168.43.141/wisata/kolamrenangaiqbukak.php";
    public static final String URL_KOLAMRENANGPUTRIDUYUNG="http://192.168.43.141/wisata/kolamrenangputriduyung.php";
    public static final String URL_KOLAMRENANGJOBEN="http://192.168.43.141/wisata/kolamrenangjoben.php";
    public static final String URL_KOLAMRENANGLEMBAHHIJAU="http://192.168.43.141/wisata/kolamrenanglembahhijau.php";
    public static final String URL_KOLAMRENANGLEMOR="http://192.168.43.141/wisata/kolamrenanglemor.php";
    public static final String URL_KOLAMRENANGNARMADA="http://192.168.43.141/wisata/kolamrenangnarmada.php";
    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP

    public static final String KEY_EMP_jumlah = "jumlah";

    public static final String KEY_EMP_finkEmail = "Email";
    public static final String KEY_EMP_finkKomentar = "coment";
    public static final String KEY_EMP_finkRating = "rating";

    public static final String KEY_EMP_senggigiEmail = "Email1";
    public static final String KEY_EMP_senggigiKomentar = "coment1";
    public static final String KEY_EMP_senggigiRating = "rating1";

    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_cemaraEmail = "Email2";
    public static final String KEY_EMP_cemaraKomentar = "coment2"; //coment itu variabel untuk posisi
    public static final String KEY_EMP_cemaraRating = "rating2"; //salary itu variabel untuk gajih

    public static final String KEY_EMP_ekasEmail = "Email3";
    public static final String KEY_EMP_ekasKomentar = "coment3";
    public static final String KEY_EMP_ekasRating = "rating3";

    public static final String KEY_EMP_kutaEmail = "Email5";
    public static final String KEY_EMP_kutaKomentar = "coment5";
    public static final String KEY_EMP_kutaRating = "rating5";

    public static final String KEY_EMP_rambangEmail = "Email6";
    public static final String KEY_EMP_rambangKomentar = "coment6";
    public static final String KEY_EMP_rambangRating = "rating6";

    public static final String KEY_EMP_surgaEmail = "Email7";
    public static final String KEY_EMP_surgaKomentar = "coment7";
    public static final String KEY_EMP_surgaRating = "rating7";

    public static final String KEY_EMP_labuanEmail = "Email8";
    public static final String KEY_EMP_labuanKomentar = "coment8";
    public static final String KEY_EMP_labuanRating = "rating8";

    public static final String KEY_EMP_rinjaniEmail = "Email11";
    public static final String KEY_EMP_rinjaniKomentar = "coment11";
    public static final String KEY_EMP_rinjaniRating = "rating11";


    public static final String KEY_EMP_barujariEmail = "Email12";
    public static final String KEY_EMP_barujariKomentar = "coment12";
    public static final String KEY_EMP_barujariRating = "rating12";


    public static final String KEY_EMP_benangkelambuEmail = "Email13";
    public static final String KEY_EMP_benangkelambuKomentar = "coment13";
    public static final String KEY_EMP_benangkelambuRating = "rating13";

    public static final String KEY_EMP_geripakEmail = "Email15";
    public static final String KEY_EMP_geripakKomentar = "coment15";
    public static final String KEY_EMP_geripakRating = "rating15";


    public static final String KEY_EMP_jerukmanisEmail = "Email16";
    public static final String KEY_EMP_jerukmanisKomentar = "coment16";
    public static final String KEY_EMP_jerukmanisRating = "rating16";


    public static final String KEY_EMP_otakkokohEmail = "Email18";
    public static final String KEY_EMP_otakkokohKomentar = "coment18";
    public static final String KEY_EMP_otakkokohRating = "rating18";


    public static final String KEY_EMP_tiutejaEmail = "Emai20";
    public static final String KEY_EMP_tiutejaKomentar = "coment20";
    public static final String KEY_EMP_tiutejaRating = "rating20";


    public static final String KEY_EMP_aiqbukakEmail = "Email21";
    public static final String KEY_EMP_aiqbukakKomentar = "coment21";
    public static final String KEY_EMP_aiqbukaRating = "rating21";


    public static final String KEY_EMP_jobenEmail = "Email22";
    public static final String KEY_EMP_jobenKomentar = "coment22";
    public static final String KEY_EMP_jobenRating = "rating22";

    public static final String KEY_EMP_lembahhijauEmail = "Email23";
    public static final String KEY_EMP_lembahhijauKomentar = "coment23";
    public static final String KEY_EMP_lembahhijauRating = "rating23";


    public static final String KEY_EMP_lemorEmail = "Email24";
    public static final String KEY_EMP_lemorKomentar = "coment24";
    public static final String KEY_EMP_lemorRating = "rating24";


    public static final String KEY_EMP_narmadaEmail = "Email25";
    public static final String KEY_EMP_narmadaKomentar = "coment25";
    public static final String KEY_EMP_narmadaRating = "rating25";


    public static final String KEY_EMP_putriduyungEmail = "Email26";
    public static final String KEY_EMP_putriduyungKomentar = "coment26";
    public static final String KEY_EMP_putriduyungRating = "rating26";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "jumlah";
    public static final String TAG_rating = "rating";
    public static final String TAG_senggigi = "rating";

    //ID karyawan
    //emp itu singkatan dari Employee

}