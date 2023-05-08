import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.project.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentPasswordEditText = findViewById<EditText>(R.id.etCurrentPassword)
        val changePasswordButton = findViewById<Button>(R.id.btnChangePassword)

        changePasswordButton.setOnClickListener {
            val currentPassword = currentPasswordEditText.text.toString()

            if (currentPassword == "password123") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Current password is incorrect", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

