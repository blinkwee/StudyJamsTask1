package cn.studyjams.s1.sj16.weitong;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class SurveyNCaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_n_case);
    }

    public void submitSurvey(View view){
        String subject = "";
        subject = makeText(subject);
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        String address = getResources().getString(R.string.emailAddress);
        intent.putExtra(Intent.EXTRA_EMAIL, address);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
        }
    }

    private String makeText(String subject){
        CheckBox cbImGeek = (CheckBox)findViewById(R.id.cbImGeek);
        CheckBox cbBarberSpoil = (CheckBox)findViewById(R.id.cbBarberSpoil);
        EditText etOther = (EditText)findViewById(R.id.etOther);

        if(cbImGeek.isChecked())
            subject = "是的，我当然可以自己剪头发！\n";
        else
            subject = "我还不那么确定自己能剪头发。\n";

        if(cbBarberSpoil.isChecked())
            subject += "理发店把我剪丑了，要自强!\n";
        else
            subject += "我有其他原因想要自己剪头发。\n";

        subject += etOther.getText();
        return subject;
    }

    public void back(View view) {
        finish();
    }

    public void forward(View view) {
        Intent intent = new Intent(SurveyNCaseActivity.this, PsychologyActivity.class);
        startActivity(intent);

    }
}
