package com.bluesky.usercenter.service

import rx.Observable


/**
 *
 * @author BlueSky
 * @date 23.8.25
 * Description:
 */
interface UserService {
    fun register(mobile: String, verfiCode: String, pwd: String): Observable<Boolean>
}