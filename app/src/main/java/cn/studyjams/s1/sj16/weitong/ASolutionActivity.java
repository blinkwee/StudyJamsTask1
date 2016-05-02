package cn.studyjams.s1.sj16.weitong;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ASolutionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asolution);
    }
    public void url(View view) {
        Uri webpage = Uri.parse(getResources().getString(R.string.urlSolution1));
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void back(View view) {
        finish();
    }

    public void forward(View view) {
        Intent intent = new Intent(ASolutionActivity.this, BSolutionActivity.class);
        startActivity(intent);

    }
}
