import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.changepass.R
import com.example.project.R

class PasswordChangeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linkpage)

        // Get references to the views
        val etNewPassword = findViewById<EditText>(R.id.etNewPassword)
        val etConfirmNewPassword = findViewById<EditText>(R.id.etConfirmNewPassword)
        val btnChangePassword = findViewById<Button>(R.id.btnChangePassword)

        // Set up click listener for the "Change Password" button
        btnChangePassword.setOnClickListener {
            val newPassword = etNewPassword.text.toString()
            val confirmNewPassword = etConfirmNewPassword.text.toString()

            // Validate the input

            if (newPassword.isEmpty()) {
                etNewPassword.error = "Please enter a new password"
                return@setOnClickListener
            }

            if (confirmNewPassword.isEmpty()) {
                etConfirmNewPassword.error = "Please confirm your new password"
                return@setOnClickListener
            }

            if (newPassword != confirmNewPassword) {
                etConfirmNewPassword.error = "Passwords do not match"
                return@setOnClickListener
            }

            // TODO: Call the API to change the password
            // If the API call is successful, display a success message
            Toast.makeText(this, "Password changed successfully", Toast.LENGTH_SHORT).show()

            // If the API call fails, display an error message
            // Toast.makeText(this, "Failed to change password", Toast.LENGTH_SHORT).show()
        }
    }
}
