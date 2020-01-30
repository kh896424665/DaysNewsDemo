package com.kh.daysnewsdemo.ui.main.presenter

import com.kh.daysnewsdemo.mvp.presenter.BasePresenter
import com.kh.daysnewsdemo.ui.main.view.MainView

class MainPresenter : BasePresenter<MainView>() {
    fun getTest(str: String) {
        getBaseView()!!.setData(str)
    }
}

