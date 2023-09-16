package o.akuma.resumebuilder

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import o.akuma.resumebuilder.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Declare preloaded strings

        binding.tvName.text = getString(R.string.obinna_akuma)
        binding.tvSlackName.text = getString(R.string.obinna_a)
        binding.tvGitHubHandle.text = getString(R.string.github_handle)
        binding.tvBio.text = getString(R.string.personal_bio)
        binding.tvPersonalNotes.text = getString(R.string.personal_bio_note)
        binding.tvSkills.text = getString(R.string.skills)
        binding.tvSkill1.text = getString(R.string.android)
        binding.tvSkill2.text = getString(R.string.navigation)
        binding.tvSkill3.text = getString(R.string.version_control)
        binding.tvEducation.text = getString(R.string.education_certificate)
        binding.tvSchool.text = getString(R.string.covenant_university)
        binding.tvCertification.text = getString(R.string.gads_2023)





        binding.btnFab.setOnClickListener {
            intent = Intent(this, EditCvActivity::class.java)
            startActivity(intent)
        }

        /*  binding.tvName.text = intent.getStringExtra("EXTRA_NAME")
       binding.tvSlackName.text = intent.getStringExtra("EXTRA_HANDLE")
       binding.tvGitHubHandle.text = intent.getStringExtra("EXTRA_HANDLE")
       binding.tvPersonalNotes.text = intent.getStringExtra("EXTRA_NOTE")
       binding.tvSkill1.text = intent.getStringExtra("EXTRA_SKILL")
       binding.tvSkill2.text = intent.getStringExtra("EXTRA_SKILL")
       binding.tvSkill3.text = intent.getStringExtra("EXTRA_SKILL")
       binding.tvSchool.text = intent.getStringExtra("EXTRA_SCHOOL")
       binding.tvCertification.text = intent.getStringExtra("EXTRA_CERTIFICATE")

      */

    }
}