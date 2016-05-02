package cn.studyjams.s1.sj16.weitong;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PsychologyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psychology);
    }

    public void url(View view) {

        String url = "";
        int id = view.getId();
        switch (id) {
            case R.id.btnPsyUrl1:
                url = getResources().getString(R.string.psyUrl1);
                break;
            case R.id.btnPsyUrl2:
                url = getResources().getString(R.string.psyUrl2);
                break;
            case R.id.btnPsyUrl3:
                url = getResources().getString(R.string.psyUrl3);

        }

        if (url == "") return;

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void back(View view) {
        finish();
    }

}
