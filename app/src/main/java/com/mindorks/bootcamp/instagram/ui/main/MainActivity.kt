package com.mindorks.bootcamp.instagram.ui.main

import android.os.Bundle
import com.mindorks.bootcamp.instagram.R
import com.mindorks.bootcamp.instagram.di.component.ActivityComponent
import com.mindorks.bootcamp.instagram.ui.base.BaseActivity

class MainActivity: BaseActivity<MainViewModel>() {
    override fun provideLayoutId(): Int = R.layout.activity_main

    override fun injectDependencies(activityComponent: ActivityComponent) {

    }

    override fun setupView(savedInstanceState: Bundle?) {

    }
}