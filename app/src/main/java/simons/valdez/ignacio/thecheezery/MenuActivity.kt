package simons.valdez.ignacio.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var button_coldDrinks:Button = findViewById(R.id.button_coldDrinks) as Button
        var button_hotDrinks:Button = findViewById(R.id.button_hotDrinks) as Button
        var button_sweets:Button = findViewById(R.id.button_sweets) as Button
        var button_salties:Button = findViewById(R.id.button_salties) as Button
        var button_combos:Button = findViewById(R.id.combos) as Button
        var button_custom:Button = findViewById(R.id.customizable) as Button

        button_coldDrinks.setOnClickListener{
            var intent:Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","coldDrinks")
            startActivity(intent)
        }

        button_hotDrinks.setOnClickListener{
            var intent:Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","hotDrinks")
            startActivity(intent)
        }

        button_sweets.setOnClickListener{
            var intent:Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","sweets")
            startActivity(intent)
        }

        button_salties.setOnClickListener{
            var intent:Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","salties")
            startActivity(intent)
        }

        button_combos.setOnClickListener{
            var intent:Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","combos")
            startActivity(intent)
        }

        button_custom.setOnClickListener{
            var intent:Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","custom")
            startActivity(intent)
        }


    }
}