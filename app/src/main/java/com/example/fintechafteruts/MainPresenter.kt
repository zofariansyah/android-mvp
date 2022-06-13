package com.example.fintechafteruts

class MainPresenter (private val mainView: MainView){
    fun hitungLuasPersegiPjg(panjang: Float, lebar: Float){
        if(panjang == 0f || lebar == 0f){
            mainView.showError("Panjang/Lebar tidak boleh 0")
            return
        }

        val luas = panjang * lebar
        mainView.updateLuas(luas)
    }

    fun hitungKelilingPersegiPanjang(panjang: Float, lebar: Float){
        if(panjang == 0f || lebar == 0f){
            mainView.showError("Panjang/Lebar tidak boleh 0")
            return
        }

        val keliling = 2 * panjang + 2 * lebar
        mainView.updateKeliling(keliling)
    }
}