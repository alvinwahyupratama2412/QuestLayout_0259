package com.au.pertemuan4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import com.au.pertemuan4.ui.theme.Pertemuan4Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Pertemuan4Theme {
                ActivitasPertama(modifier = Modifier)
            }
        }
    }
}