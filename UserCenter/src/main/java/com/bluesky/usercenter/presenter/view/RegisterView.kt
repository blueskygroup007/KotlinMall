package com.bluesky.usercenter.presenter.view

import com.bluesky.base.presenter.view.BaseView

/**
 *
 * @author BlueSky
 * @date 23.8.25
 * Description:
 */
interface RegisterView : BaseView {

    fun onRegisterResult(result: Boolean)
}