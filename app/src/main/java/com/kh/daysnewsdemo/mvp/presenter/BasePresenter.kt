package com.kh.daysnewsdemo.mvp.presenter

open class BasePresenter<V> {
    private var mBaseView: V? = null

    fun bindView(v: V) {
        this.mBaseView = v
    }

    fun unBindView() {
        this.mBaseView = null
    }

    fun getBaseView() = mBaseView

}