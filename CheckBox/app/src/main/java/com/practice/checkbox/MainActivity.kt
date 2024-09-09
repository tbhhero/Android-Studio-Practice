package com.practice.checkbox
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var chkPizza: CheckBox
    lateinit var chkBurger: CheckBox
    lateinit var chkPasta: CheckBox
    lateinit var btnTotalPrice: Button
    lateinit var tvTotalPrice: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chkPizza = findViewById(R.id.chk_pizza)
        chkBurger = findViewById(R.id.chk_burger)
        chkPasta = findViewById(R.id.chk_pasta)

        btnTotalPrice = findViewById(R.id.btn_total_price)
        tvTotalPrice = findViewById(R.id.tv_total_price)

        btnTotalPrice.setOnClickListener {
            calculateTotal()
        }
    }

    private fun calculateTotal() {
        var totalPrice = 0

        if (chkPizza.isChecked) {
            totalPrice += 250

        }
        if (chkBurger.isChecked) {
            totalPrice += 80
        }
        if (chkPasta.isChecked) {
            totalPrice += 90
        }

        tvTotalPrice.text = "Total: \u20B9"+"$totalPrice"

        Toast.makeText(this, "Total Price: \u20B9"+"$totalPrice", Toast.LENGTH_SHORT).show()
    }
}
