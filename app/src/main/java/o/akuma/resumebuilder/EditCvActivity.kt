package o.akuma.resumebuilder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import o.akuma.resumebuilder.databinding.ActivityEditCvBinding

class EditCvActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditCvBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditCvBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

            val intent = Intent(this,MainActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                intent.putExtra("EXTRA_HANDLE", slackHandle)
                intent.putExtra("EXTRA_HANDLE", gitHandle)
                intent.putExtra("EXTRA_NOTE", personalNote)
                intent.putExtra("EXTRA_SKILL", skill1)
                intent.putExtra("EXTRA_SKILL", skill2)
                intent.putExtra("EXTRA_SKILL", skill3)
                intent.putExtra("EXTRA_SCHOOL", school)
                intent.putExtra("EXTRA_CERTIFICATE", certificate)
                startActivity(intent)
        }

    }
}