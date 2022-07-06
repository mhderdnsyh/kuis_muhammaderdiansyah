package com.example.kuis_muhammaderdiansyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText etnamapelanggan,etalamat,etjumlahbarang;
    Button btnproses;
    RadioGroup rgjeniskelamin1, rgtipepelanggan1, rgnamabarang1;
    RadioButton pilihjenisK, pilihtipeP,pilihNamab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transaksi1);

        rgtipepelanggan1 = findViewById(R.id.rgtipepelanggan);
        rgnamabarang1 = findViewById(R.id.rgnamabarang);
        etnamapelanggan = findViewById(R.id.etnamapelanggan);
        rgjeniskelamin1 = findViewById(R.id.rgjeniskelamin);
        etalamat = findViewById(R.id.etalamat);
        etjumlahbarang = findViewById(R.id.etjumlahbarang);
        btnproses = findViewById(R.id.btnproses);

        btnproses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mendapatkan nilai dari RadioGroup

                int vjenisK = rgjeniskelamin1.getCheckedRadioButtonId();
                pilihjenisK = findViewById(vjenisK);

                int vtipeP = rgtipepelanggan1.getCheckedRadioButtonId();
                pilihtipeP = findViewById(vtipeP);

                int vnamaB = rgnamabarang1.getCheckedRadioButtonId();
                pilihNamab = findViewById(vnamaB);


                String namaPelanggan = etnamapelanggan.getText().toString();
                String alamatpelanggan = etalamat.getText().toString();
                String jumlahbarang = etjumlahbarang.getText().toString();

                String jenisKelamin = pilihjenisK.getText().toString();
                String tipePelanggan =pilihtipeP.getText().toString();
                String namaBarang = pilihNamab.getText().toString().toUpperCase(Locale.ROOT);


                Intent i = new Intent(MainActivity.this,java_transaksi2.class);
                i.putExtra("nama",namaPelanggan);
                i.putExtra("tipe",tipePelanggan);
                i.putExtra("kelamin",jenisKelamin);
                i.putExtra("alamat",alamatpelanggan);
                i.putExtra("barang",namaBarang);
                i.putExtra("jumlah",jumlahbarang);
                startActivity(i);
            }
        });
    }
}