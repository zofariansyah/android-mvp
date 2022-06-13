package com.example.fintechafteruts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), MainView {
    private lateinit var panjang:EditText
    private lateinit var lebar:EditText
    private lateinit var hasil:TextView
    private lateinit var btnLuas:Button
    private lateinit var btnKeliling:Button

    private lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        panjang = findViewById(R.id.editTextPanjang)
        lebar = findViewById(R.id.editTextLebar)
        btnLuas = findViewById(R.id.btnHitungLuas)
        btnKeliling = findViewById(R.id.btnHitungKeliling)
        hasil = findViewById(R.id.hasil)
        mainPresenter = MainPresenter(this)

        btnLuas.setOnClickListener {
            val spanjang = panjang.text.toString().toFloat()
            val slebar = panjang.text.toString().toFloat()
            mainPresenter.hitungLuasPersegiPjg(spanjang,slebar)
        }

        btnKeliling.setOnClickListener {
            val spanjang = panjang.text.toString().toFloat()
            val slebar = panjang.text.toString().toFloat()
            mainPresenter.hitungLuasPersegiPjg(spanjang,slebar)
        }

    }

    override fun updateLuas(luas: Float) {
       hasil.text = luas.toString()
    }

    override fun updateKeliling(keliling: Float) {
        hasil.text = keliling.toString()
    }

    override fun showError(errorMsg: String) {
        TODO("Not yet implemented")
    }
}