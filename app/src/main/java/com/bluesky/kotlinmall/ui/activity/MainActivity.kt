package com.bluesky.kotlinmall.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bluesky.kotlinmall.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


}

fun isValidPhoneNumber(phoneNumber: String): Boolean {
    // Check if the phone number is empty.
    if (phoneNumber.isEmpty()) {
        return false
    }

    // Check if the phone number is too long.
    if (phoneNumber.length > 15) {
        return false
    }

    // Check if the phone number is too short.
    if (phoneNumber.length < 10) {
        return false
    }

    // Check if the phone number contains a valid country code.
    val countryCode = phoneNumber.substring(0, 1)
    val validCountryCodes = listOf("+1", "+2", "+3", "+4", "+5")
    if (!validCountryCodes.contains(countryCode)) {
        return false
    }

    // Check if the phone number contains a valid area code.
    val areaCode = phoneNumber.substring(1, 3)
    val validAreaCodes = listOf("123", "456", "789")
    if (!validAreaCodes.contains(areaCode)) {
        return false
    }

    // Check if the phone number contains a valid phone number.
    val phoneNumberWithoutCountryCode = phoneNumber.substring(4)
    val validPhoneNumbers = listOf("1234567890", "9876543210")
    if (!validPhoneNumbers.contains(phoneNumberWithoutCountryCode)) {
        return false
    }

    // The phone number is valid.
    return true
}

