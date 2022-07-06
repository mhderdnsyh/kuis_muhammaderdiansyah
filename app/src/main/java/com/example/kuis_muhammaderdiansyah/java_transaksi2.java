package com.example.kuis_muhammaderdiansyah;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class java_transaksi2 extends AppCompatActivity {
     TextView tipeMember, tvnamapel02, tvjeniskel02, tvalamatpel02, tvnamabrg02, tvjumlahbrg02, tvharga, tvtotalharga, tvdischarga, tvdiscmember, tvjumlahbayar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transaksi2);

        tipeMember = findViewById(R.id.tvtipemember);
        tvnamapel02 = findViewById(R.id.tvnamapel02);
        tvjeniskel02 = findViewById(R.id.tvjeniskel02);
        tvalamatpel02 = findViewById(R.id.tvalamatpel02);
        tvnamabrg02 = findViewById(R.id.tvnamabrg02);
        tvjumlahbrg02 = findViewById(R.id.tvjumlahbrg02);
        tvharga = findViewById(R.id.tvharga);
        tvtotalharga = findViewById(R.id.tvtotalharga);
        tvdischarga = findViewById(R.id.tvdischarga);
        tvdiscmember = findViewById(R.id.tvdiscmember);
        tvjumlahbayar = findViewById(R.id.tvjumlahbayar);

        Intent y = getIntent();

        String namaPelanggan = y.getStringExtra("nama");
        String TipeMember = y.getStringExtra("tipe");
        String jumlahBarang = y.getStringExtra("jumlah");
        String jenisKelamin = y.getStringExtra("kelamin");
        String namaBarang = y.getStringExtra("barang");
        String alamatPelanggan =y.getStringExtra("alamat");


            DecimalFormat berkoma = new DecimalFormat("#,###,###");
            int jb = Integer.parseInt(jumlahBarang);
            int disc = 20;
            int diskonmember = 0;

            if(TipeMember.equalsIgnoreCase("gold")) {
                tipeMember.setText("Tipe Member : Gold");
                diskonmember = 400000;
            }else if(TipeMember.equalsIgnoreCase("silver")) {
                tipeMember.setText("Tipe Member : Silver");
                diskonmember = 300000;
            }else if(TipeMember.equalsIgnoreCase("biasa")) {
                tipeMember.setText("Tipe Member : Biasa");
                diskonmember = 200000;
            }

            Long hargaAndroid = 1000000L, hargaIOS = 2000000L,hargaWindowsp = 2500000L;
            String hargaAndroidf = berkoma.format(hargaAndroid),hargaIOSf = berkoma.format(hargaIOS),hargaWindowspf = berkoma.format(hargaWindowsp);
            String diskonmemberf = berkoma.format(diskonmember);

            Long totalhargaAndroid = jb * hargaAndroid, totalHargaIphone = jb * hargaIOS,totalHargaWindowsP = jb * hargaWindowsp;
            String hargaA = berkoma.format(totalhargaAndroid), hargaI = berkoma.format(totalHargaIphone), hargaW = berkoma.format(totalHargaWindowsP);

            Long diskonAndroid = totalhargaAndroid * disc / 100, diskonIphone = totalHargaIphone * disc / 100, diskonWindows = totalHargaWindowsP * disc / 100;
            String diskonA = berkoma.format(diskonAndroid), diskonI = berkoma.format(diskonIphone), diskonW = berkoma.format(diskonWindows);

            Long jumlahBAndroid = totalhargaAndroid-diskonAndroid-diskonmember;
            Long jumlahBIphone = totalHargaIphone-diskonIphone-diskonmember;
            Long jumlahBAWindowsP = totalHargaWindowsP-diskonWindows-diskonmember;

            String jumlahBayarAndroid = berkoma.format(jumlahBAndroid);
            String jumlahBayarIphone = berkoma.format(jumlahBIphone);
            String JumlahBayarWindowsP = berkoma.format(jumlahBAWindowsP);

            switch (namaBarang) {
                case "ANDROID":
                    tvnamapel02.setText("Nama Pelanggan "+namaPelanggan);
                    tvjeniskel02.setText("Jenis Kelamin : "+jenisKelamin);
                    tvalamatpel02.setText("Alamat Pelanggan : "+alamatPelanggan);
                    tvnamabrg02.setText("Nama Barang : " + namaBarang);
                    tvjumlahbrg02.setText("Jumlah Barang : "+jumlahBarang);
                    tvharga.setText("Harga : Rp."+hargaAndroidf);
                    tvtotalharga.setText("Total Harga : Rp."+hargaA);
                    tvdischarga.setText("Disc. Harga : Rp."+diskonA);
                    tvdiscmember.setText("Disc. Member : Rp."+diskonmemberf );
                    tvjumlahbayar.setText("Jumlah Bayar : Rp."+jumlahBayarAndroid);
                    break;

                case "IPHONE" :
                    tvnamapel02.setText("Nama Pelanggan "+namaPelanggan);
                    tvjeniskel02.setText("Jenis Kelamin : "+jenisKelamin);
                    tvalamatpel02.setText("Alamat Pelanggan : "+alamatPelanggan);
                    tvnamabrg02.setText("Nama Barang : " + namaBarang);
                    tvjumlahbrg02.setText("Jumlah Barang : "+jumlahBarang);
                    tvharga.setText("Harga : Rp."+hargaIOSf);
                    tvtotalharga.setText("Total Harga : Rp."+hargaI);
                    tvdischarga.setText("Disc. Harga : Rp."+diskonI);
                    tvdiscmember.setText("Disc. Member : Rp."+diskonmemberf );
                    tvjumlahbayar.setText("Jumlah Bayar : Rp."+jumlahBayarIphone);
                    break;

                case "WINDOWS PHONE" :
                    tvnamapel02.setText("Nama Pelanggan "+namaPelanggan);
                    tvjeniskel02.setText("Jenis Kelamin : "+jenisKelamin);
                    tvalamatpel02.setText("Alamat Pelanggan : "+alamatPelanggan);
                    tvnamabrg02.setText("Nama Barang : " + namaBarang);
                    tvjumlahbrg02.setText("Jumlah Barang : "+jumlahBarang);
                    tvharga.setText("Harga : Rp."+hargaWindowspf);
                    tvtotalharga.setText("Total Harga : Rp."+hargaW);
                    tvdischarga.setText("Disc. Harga : Rp."+diskonW);
                    tvdiscmember.setText("Disc. Member : Rp."+diskonmemberf );
                    tvjumlahbayar.setText("Jumlah Bayar : Rp."+JumlahBayarWindowsP);
                    break;

            }

    }

}
