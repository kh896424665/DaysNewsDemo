package com.kh.daysnewsdemo.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kh.daysnewsdemo.mvp.presenter.BasePresenter
import com.kh.daysnewsdemo.mvp.view.BaseView

abstract class BaseActivity<V, P : BasePresenter<V>> : AppCompatActivity(), BaseView {

    private var mPresenter: P? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        if (mPresenter == null) {
            mPresenter = createPresenter()
        }
        mPresenter!!.bindView(this as V)
        init()
        initData()

    }

    protected abstract fun getLayoutId():Int

    abstract fun initData()

    abstract fun init()

    protected abstract fun createPresenter() : P

    fun getPresenter() = mPresenter

    override fun onDestroy() {
        super.onDestroy()
        mPresenter!!.unBindView()
    }
}