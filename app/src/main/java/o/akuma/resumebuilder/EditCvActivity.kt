package o.akuma.resumebuilder

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.edit
import o.akuma.resumebuilder.databinding.ActivityEditCvBinding

class EditCvActivity : AppCompatActivity() {


    private lateinit var binding: ActivityEditCvBinding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditCvBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()

        val sharedPreferences = getPreferences(Context.MODE_PRIVATE)

        binding.btViewCV.setOnClickListener {
            var name = binding.etName.text.toString()
            val slackHandle = binding.etSlackName.text.toString()
            val gitHandle = binding.etGithub.text.toString()
            val personalNote = binding.etPersonalNotes.text.toString()
            val skill1 = binding.etSkill1.text.toString()
            val skill2 = binding.etSkill2.text.toString()
            val skill3 = binding.etSkill3.text.toString()
            val school = binding.etSchoolCert1.text.toString()
            val certificate = binding.etSchoolCert2.text.toString()

            /* sharedPreferences.edit {
                 putString(PreferenceKey.name,name)
                 Log.i("TAG","$name")
             }

             */

            with(sharedPreferences.edit()){
                putString(PreferenceKey.name,name)
                Log.i("TAG", name)
                apply()
            }


            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}