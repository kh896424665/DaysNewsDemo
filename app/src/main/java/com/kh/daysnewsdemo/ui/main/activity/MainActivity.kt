package com.kh.daysnewsdemo.ui.main.activity

import android.util.Log
import com.kh.daysnewsdemo.R
import com.kh.daysnewsdemo.base.BaseActivity
import com.kh.daysnewsdemo.ui.main.presenter.MainPresenter
import com.kh.daysnewsdemo.ui.main.view.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainView, MainPresenter>(),MainView {

    override fun getLayoutId(): Int = R.layout.activity_main



    override fun init() {
        bt_1.setOnClickListener {
            getPresenter()!!.getTest("test")
        }
    }

    override fun initData() {
    }

    override fun createPresenter() = MainPresenter()

    override fun <T> setData(data: T) {
        Log.e("test", "success $data")
    }

    override fun setError(err: String) {
    }

}

