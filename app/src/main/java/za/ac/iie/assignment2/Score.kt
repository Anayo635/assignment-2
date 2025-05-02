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
            val scoreText = findViewById<TextView>(R.id.textView)
            val reviewButton = findViewById<Button>(R.id.button5)
            val exitButton = findViewById<Button>(R.id.button)

            scoreText.text = "You got $score out of 5 correct!"

            reviewButton.setOnClickListener {
                // Optional: show correct answers
                val intent = Intent(this , scoreText::class.java)
                startActivity(intent)
            }

            exitButton.setOnClickListener {
                finishAffinity() // closes