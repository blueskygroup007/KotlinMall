package com.bluesky.base.presenter

import com.bluesky.base.presenter.view.BaseView

/**
 *
 * @author BlueSky
 * @date 23.8.25
 * Description:
 */
open class BasePresenter<T : BaseView> {
    lateinit var mView: T
}