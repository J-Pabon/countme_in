package jpabon.com.countmein.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import jpabon.com.countmein.databinding.ActivityCountMeInBinding

@AndroidEntryPoint
class CountMeInActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCountMeInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCountMeInBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}
