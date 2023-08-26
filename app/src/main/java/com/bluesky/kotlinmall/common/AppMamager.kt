package com.bluesky.kotlinmall.common

import android.app.Activity
import android.app.ActivityManager
import android.content.Context
import java.util.Stack

/**
 *
 * @author BlueSky
 * @date 23.8.21
 * Description:
 */
class AppMamager private constructor() {

    private val activityStack: Stack<Activity> = Stack()

    companion object {
        val instance: AppMamager by lazy { AppMamager() }
    }

    fun addActivity(activity: Activity) {
        activityStack.add(activity)
    }

    fun finishActivity(activity: Activity) {
        activity.finish()
        activityStack.remove(activity)
    }

    fun currentActivity(): Activity {
        return activityStack.lastElement()
    }

    fun finishAllActivity() {
        for (activity in activityStack) {
            activity.finish()
        }
        activityStack.clear()
    }

    fun exitApp(context: Context) {
        finishAllActivity()
        val activityManager = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        activityManager.killBackgroundProcesses(context.packageName)
        System.exit(0)

    }

}