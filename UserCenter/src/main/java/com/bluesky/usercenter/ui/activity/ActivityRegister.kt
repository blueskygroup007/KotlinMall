package com.bluesky.usercenter.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.bluesky.base.ui.activity.BaseMvpActivity
import com.bluesky.usercenter.R
import com.bluesky.usercenter.databinding.ActivityRegisterBinding
import com.bluesky.usercenter.presenter.RegisterPresenter
import com.bluesky.usercenter.presenter.view.RegisterView

class ActivityRegister : BaseMvpActivity<RegisterPresenter>(), RegisterView {

    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_register)

        mPresenter = RegisterPresenter()
        mPresenter.mView = this

        binding = DataBindingUtil.setContentView(this, R.layout.activity_register)
        binding.btnRegister.setOnClickListener {

            //Toast.makeText(this, "注册", Toast.LENGTH_SHORT).show()
            mPresenter.register("", "")
        }

    }

    override fun onRegisterResult(result: Boolean) {
        Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show()
    }
}