package o.akuma.resumebuilder

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.edit
import androidx.preference.PreferenceManager
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

        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)

        binding.btViewCV.setOnClickListener {
            val name = binding.etName.text.toString()
            val slackHandle = binding.etSlackName.text.toString()
            val gitHandle = binding.etGithub.text.toString()
            val personalNote = binding.etPersonalNotes.text.toString()
            val skill1 = binding.etSkill1.text.toString()
            val skill2 = binding.etSkill2.text.toString()
            val skill3 = binding.etSkill3.text.toString()
            val school = binding.etSchoolCert1.text.toString()
            val certificate = binding.etSchoolCert2.text.toString()

            sharedPreferences.edit {
                putString(PreferenceKey.name,name)
                putString(PreferenceKey.slackHandle,slackHandle)
                putString(PreferenceKey.gitHub,gitHandle)
                putString(PreferenceKey.personalBioNotes,personalNote)
                putString(PreferenceKey.skill1,skill1)
                putString(PreferenceKey.skill2,skill2)
                putString(PreferenceKey.skill3,skill3)
                putString(PreferenceKey.certification,certificate)
                putString(PreferenceKey.school,school)
             }

            //val intent = Intent(this,MainActivity::class.java)
            //startActivity(intent)
            finish()
        }
    }
}