package com.example.kuis_muhammaderdiansyah;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class transaksi2 extends AppCompatActivity {
    private TextView tvtipemember, tvnamapel02, tvjeniskel02, tvalamatpel02, tvnamabrg02, tvjumlahbrg02, tvharga, tvtotalharga, tvdischarga, tvdiscmember, tvjumlahbayar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transaksi2);

        tvtipemember = findViewById(R.id.tvtipemember);
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
        Bundle bundle = y.getExtras();

        if (bundle!=null) {
            String gettipemember02 = (String) bundle.get("tipe");
            String getnamapel02 = (String) bundle.get("nama");
            String getjeniskel02 = (String) bundle.get("kelamin");
            String getalamatpel02 = (String) bundle.get("alamat");
            String getnamabrg02 = (String) bundle.get("barang");
            String getjumlahbrg02 = (String) bundle.get("jumlah");
            String getharga = (String) bundle.get("harga");
            String gettotalharga = (String) bundle.get("total");
            String getdischarga = (String) bundle.get("discon_harga");
            String getdiscmember = (String) bundle.get("discon_member");
            String getjumlahbayar = (String) bundle.get("jumlah_bayar");

            tvtipemember.setText("Tipe Member " + gettipemember02);
            tvnamapel02.setText("Nama " + getnamapel02);
            tvjeniskel02.setText("Jenis Kelamin " + getjeniskel02);
            tvalamatpel02.setText("Alamat Pelanggan " + getalamatpel02);
            tvnamabrg02.setText("Nama Barang " + getnamabrg02);
            tvjumlahbrg02.setText("Jumlah Barang " + getjumlahbrg02);
            tvharga.setText("Harga " + getharga);
            tvtotalharga.setText("Total Harga " + gettotalharga);
            tvdischarga.setText("Disc.Harga " + getdischarga);
            tvdiscmember.setText("Disc.Member " + getdiscmember);
            tvjumlahbayar.setText("Jumlah Bayar " + getjumlahbayar);

        }

    }

}
