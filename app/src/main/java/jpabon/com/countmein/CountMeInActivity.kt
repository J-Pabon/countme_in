package jpabon.com.countmein

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import jpabon.com.countmein.databinding.ActivityCountMeInBinding

class CountMeInActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCountMeInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCountMeInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSearchEvent.setOnClickListener {
            binding.tvSearchResultMessage.text = "No events found"
        }
    }
}
