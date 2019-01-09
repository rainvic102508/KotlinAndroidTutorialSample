package com.youdude.kotlinandroidtutorialsample

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.youdude.kotlinandroidtutorialsample.dummy.DummyContent

class LandingPage : AppCompatActivity(), FeedFragment.OnListFragmentInteractionListener, DetailFragment.OnFragmentInteractionListener {

    override fun onListFragmentInteraction(item: DummyContent.DummyItem?) {
    }

    override fun onFragmentInteraction(uri: Uri) {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)
    }
}
