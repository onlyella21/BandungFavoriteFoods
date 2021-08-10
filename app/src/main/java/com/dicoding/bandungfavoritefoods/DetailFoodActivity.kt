package com.dicoding.bandungfavoritefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class DetailFoodActivity : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_LOCATION = "extra_location"
        const val EXTRA_PRICE = "extra_price"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_food)
        val titleDetail = supportActionBar
        titleDetail!!.title = "Detail Makanan"
        titleDetail.setDisplayHomeAsUpEnabled(true)

        val tvNamaReceived: TextView = findViewById(R.id.tv_d_name)
        val tvDetailReceived: TextView = findViewById(R.id.tv_d_detail)
        val imgViewReceived: ImageView = findViewById(R.id.img_d_photo)
        val tvLokasiReceived: TextView = findViewById(R.id.tv_d_lokasi)
        val tvHargaReceived: TextView = findViewById(R.id.tv_d_harga)


        val getName = intent.getStringExtra(EXTRA_NAME)
        val getDetail = intent.getStringExtra(EXTRA_DETAIL)
        val getLokasi = intent.getStringExtra(EXTRA_LOCATION)
        val getHarga = intent.getStringExtra(EXTRA_PRICE)

        tvNamaReceived.text = getName
        tvDetailReceived.text = getDetail
        tvLokasiReceived.text = getLokasi
        tvHargaReceived.text = getHarga

        val forImg = intent.extras
        when {
            forImg != null -> {
                val receiveImg = forImg.getInt(EXTRA_IMG, 0)
                imgViewReceived.setImageResource(receiveImg)
            }
        }

        val btnShare: Button = findViewById(R.id.btn_share)
        btnShare.setOnClickListener(this)

        val btnFavorite: Button = findViewById(R.id.btn_fav)
        btnFavorite.setOnClickListener {
            Toast.makeText(this, "Makanan ini menjadi Favorite mu", Toast.LENGTH_SHORT).show()
        }
    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_share -> {
                val shareIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, intent.getStringExtra(EXTRA_DETAIL))
                    type = "text/plan"
                }
                val openShare = Intent.createChooser(shareIntent, intent.getStringExtra(EXTRA_NAME))
                startActivity(openShare)
            }


        }
    }


}