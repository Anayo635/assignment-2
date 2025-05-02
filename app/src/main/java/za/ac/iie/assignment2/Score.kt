package za.ac.iie.assignment2

    import android.os.Bundle
    import android.content.Intent
    import android.widget.Button
    import android.widget.TextView
    import androidx.appcompat.app.AppCompatActivity

    class ScoreActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_score)

            val score = intent.getIntExtra("SCORE", 0)
            val scoreText = findViewById<TextView>(R.id.textView3)
            val reviewButton = findViewById<Button>(R.id.button5)
            val exitButton = findViewById<Button>(R.id.button)

            scoreText.text = "You got $score out of 5 correct!"

            reviewButton.setOnClickListener {
                val intent = Intent(this, ReviewActivity::class.java)
                startActivity(intent)
            }

            exitButton.setOnClickListener {

                    val intent = Intent(this, MainActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
                    startActivity(intent)
                    finish()
            }
        }
    }
