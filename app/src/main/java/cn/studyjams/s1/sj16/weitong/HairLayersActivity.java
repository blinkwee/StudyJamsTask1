package cn.studyjams.s1.sj16.weitong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HairLayersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair_layers);
    }
    public void back(View view) {
        finish();
    }

    public void forward(View view) {
        Intent intent = new Intent(HairLayersActivity.this, ThinActivity.class);
        startActivity(intent);

    }
}
