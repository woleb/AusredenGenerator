package com.example.it_wog.ausredengenerator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val eins = listOf("Harmonische", "Solaren","Termalen","Linearen","Heisenbergschen","Kollidierten","Magnetischen","Konstanten","Subharmonischen")
    val zwei = listOf("Störungen","Interferenzen", "Kollisionen","Interups", "Determinierungen","Kompilierungen")
    val drei = listOf("RAM", "CD", "LAN","WAN","CPU","HDD", "IOT")
    val vier = listOf("Bus", "Controller","Stack","Array","Communications Interfaces","Treiber")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        errorView.setOnClickListener {

            //Generating a random number with the size -1 of the list
            val randomIntegerEins = (0..eins.size-1).shuffled().first()
            val randomIntegerZwei = (0..zwei.size-1).shuffled().first()
            val randomIntegerDrei = (0..drei.size-1).shuffled().first()
            val randomIntegerVier = (0..vier.size-1).shuffled().first()

            //Bringing the random text on the screen
            /*textView.text = eins[randomIntegerEins].toString() + " " + zwei[randomIntegerZwei].toString() +
                    " " + drei[randomIntegerDrei].toString() + " " + vier[randomIntegerVier].toString()
            */
            /*textView.setText(eins[randomIntegerEins].toString() + " " + zwei[randomIntegerZwei].toString() +
                    " " + drei[randomIntegerDrei].toString() + " " + vier[randomIntegerVier].toString())
            */
            //Best solution 
            textView.setText("Es liegt an ${eins[randomIntegerEins]} ${zwei[randomIntegerZwei]}" +
                    " im ${drei[randomIntegerDrei]} ${vier[randomIntegerVier]}")
        }

    }
}
