package com.example.beducompras.utils

import android.view.View
import com.example.beducompras.R
import com.google.android.material.snackbar.Snackbar

object UiUtils {

    fun showSnackbar(view: View, textId: Int, actionTextId: Int ){
        Snackbar.make(
            view,
            textId,
            Snackbar.LENGTH_LONG
        )
            .setAction(
                actionTextId
            ) { }
            .show()
    }

}