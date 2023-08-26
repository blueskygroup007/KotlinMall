package com.bluesky.usercenter.presenter

import com.bluesky.base.presenter.BasePresenter
import com.bluesky.usercenter.presenter.view.RegisterView
import com.bluesky.usercenter.service.impl.UserServiceImpl
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 *
 * @author BlueSky
 * @date 23.8.25
 * Description:
 */
class RegisterPresenter : BasePresenter<RegisterView>() {

    fun register(mobile: String, verifyCode: String, pwd: String) {

        //todo 业务逻辑
        val userService = UserServiceImpl()
        userService.register(mobile, verifyCode, pwd)
            .observeOn(Schedulers.io())
            .subscribeOn(AndroidSchedulers.mainThread())
        //回调
        mView.onRegisterResult(true)
    }
}