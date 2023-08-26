package com.bluesky.usercenter.service.impl

import com.bluesky.usercenter.service.UserService
import rx.Observable

/**
 *
 * @author BlueSky
 * @date 23.8.25
 * Description:
 */
class UserServiceImpl : UserService {
    override fun register(mobile: String, verfiCode: String, pwd: String): Observable<Boolean> {
        return Observable.just(true)
    }

}
