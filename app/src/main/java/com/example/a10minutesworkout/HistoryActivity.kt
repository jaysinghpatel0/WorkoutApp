package com.example.a10minutesworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.example.a10minutesworkout.databinding.ActivityHistoryBinding
import kotlinx.coroutines.launch

class HistoryActivity : AppCompatActivity() {

    private var binding: ActivityHistoryBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistoryBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarHistoryActivity)
        if (supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "HISTORY"
        }
        binding?.toolbarHistoryActivity?.setNavigationOnClickListener {
            onBackPressed()
        }

        val dao = (application as WorkOutApp).db.historyDao()
        getAllCompletedDates(dao)
    }

    private fun getAllCompletedDates(historyDao: HistoryDao){
        lifecycleScope.launch {
            historyDao.fetchAllDates().collect { allCompletedDatesList ->
                for (i in allCompletedDatesList){
                    Log.e("Date: ", ""+i.date)
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}