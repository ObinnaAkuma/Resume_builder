package o.akuma.resumebuilder

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.preference.PreferenceManager
import o.akuma.resumebuilder.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFab.setOnClickListener {
            intent = Intent(this, EditCvActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onResume() {
        super.onResume()

        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        val name = sharedPreferences.getString(PreferenceKey.name,null)
        val slackName = sharedPreferences.getString(PreferenceKey.slackHandle,null)
        val gitHub = sharedPreferences.getString(PreferenceKey.gitHub,null)
        val personal = sharedPreferences.getString(PreferenceKey.personalBioNotes,null)
        val skill1 = sharedPreferences.getString(PreferenceKey.skill1,null)
        val skill2 = sharedPreferences.getString(PreferenceKey.skill2,null)
        val skill3 = sharedPreferences.getString(PreferenceKey.skill3,null)
        val certificate = sharedPreferences.getString(PreferenceKey.certification,null)
        val education = sharedPreferences.getString(PreferenceKey.school,null)


        binding.tvName.text = name?: R.string.name.toString()
        binding.tvSlackName.text = slackName?: R.string.obinna_a.toString()
        binding.tvGitHubHandle.text = gitHub?: R.string.github_username.toString()
        binding.tvPersonalNotes.text = personal?: R.string.personal_bio_note.toString()
        binding.tvSkill1.text = skill1?: R.string.skills.toString()
        binding.tvSkill2.text = skill2?: R.string.skills.toString()
        binding.tvSkill3.text = skill3?: R.string.skills.toString()
        binding.tvCertification.text = certificate?: R.string.gads_2023.toString()
        binding.tvSchool.text = education?: R.string.covenant_university.toString()



    }
}