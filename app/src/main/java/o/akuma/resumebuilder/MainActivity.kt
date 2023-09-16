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


        binding.tvName.text = name?: getString(R.string.name)
        binding.tvSlackName.text = slackName?: getString(R.string.obinna_a)
        binding.tvGitHubHandle.text = gitHub?: getString(R.string.github_username)
        binding.tvPersonalNotes.text = personal?: getString(R.string.personal_bio_note)
        binding.tvSkill1.text = skill1?: getString(R.string.xml)
        binding.tvSkill2.text = skill2?: getString(R.string.navigation)
        binding.tvSkill3.text = skill3?: getString(R.string.android)
        binding.tvCertification.text = certificate?: getString(R.string.gads_2023)
        binding.tvSchool.text = education?: getString(R.string.covenant_university)



    }
}