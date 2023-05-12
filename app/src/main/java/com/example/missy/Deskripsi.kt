package com.example.missy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Deskripsi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deskripsi)

        val tampil_judul = intent.getStringExtra("judul")
        val tampil_deskripsi = intent.getStringExtra("deskripsi")
        val tampil_foto = intent.getIntExtra("foto", 0)

        val artikelj = findViewById<TextView>(R.id.nama_mahasiswa)
        val artijelde = findViewById<TextView>(R.id.nim_mahasiswa)
        val artikelf = findViewById<ImageView>(R.id.imageView)

        artikelf.setImageResource(tampil_foto)
        artikelj.text = tampil_judul
        artijelde.text = tampil_deskripsi
    }
}
