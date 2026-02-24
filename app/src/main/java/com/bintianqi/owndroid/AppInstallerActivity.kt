package com.bintianqi.owndroid

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.fragment.app.FragmentActivity
import com.bintianqi.owndroid.feature.applications.AppInstaller
import com.bintianqi.owndroid.feature.applications.AppInstallerViewModel
import com.bintianqi.owndroid.ui.theme.OwnDroidTheme

class AppInstallerActivity:FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        val vm by viewModels<AppInstallerViewModel>()
        vm.initialize(intent)
        val themeState = (application as MyApplication).container.themeState
        setContent {
            val theme by themeState.collectAsState()
            OwnDroidTheme(theme) {
                AppInstaller(vm)
            }
        }
    }
}
