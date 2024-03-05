package com.example.basicsetup.helper.interfaces

import android.view.View

interface AlertDialogInterface {
    fun onYesClick() {}
    fun onNoClick() {}
    fun onCloseDialog() {}
    fun onSubmitPasswordClick(emailID: String, view: View) {}
}