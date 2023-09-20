package com.example.splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.widget.PopupMenu
import android.widget.Toast
import com.example.splashscreen.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        this.setTitle("Mantasha")

        binding.popup.setOnClickListener {
            var popupMenu = PopupMenu(this@HomeActivity, binding.popup)
            popupMenu.menuInflater.inflate(R.menu.menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener {
                Toast.makeText(this@HomeActivity, "You Clicked :" + it.title, Toast.LENGTH_SHORT)
                    .show()
                true
            }
            popupMenu.show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.kotlin -> {
                Toast.makeText(this, "kotlin :" + item.title, Toast.LENGTH_SHORT).show()

            }

            R.id.kotlin -> {
                Toast.makeText(this, "Java", Toast.LENGTH_SHORT).show()

            }

            R.id.kotlin -> {
                Toast.makeText(this, "Python", Toast.LENGTH_SHORT).show()

            }

            R.id.kotlin -> {
                Toast.makeText(this, "Dart", Toast.LENGTH_SHORT).show()

            }
        }
        return super.onOptionsItemSelected(item)
    }
}
