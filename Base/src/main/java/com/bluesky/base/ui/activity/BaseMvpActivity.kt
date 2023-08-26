package com.bluesky.base.ui.activity

import com.bluesky.base.presenter.BasePresenter
import com.bluesky.base.presenter.view.BaseView

/**
 *
 * @author BlueSky
 * @date 23.8.25
 * Description:
 */
open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    override fun showLoading() {
        TODO("Not yet implemented")
    }

    override fun hideLoading() {
        TODO("Not yet implemented")
    }

    override fun onError() {
        TODO("Not yet implemented")
    }

    lateinit var mPresenter:T
}