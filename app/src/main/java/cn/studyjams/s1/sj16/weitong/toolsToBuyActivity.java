package cn.studyjams.s1.sj16.weitong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class toolsToBuyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools_to_buy);
    }
    public void back(View view) {
        finish();
    }

    public void forward(View view) {
        Intent intent = new Intent(toolsToBuyActivity.this, toolsToFindActivity.class);
        startActivity(intent);

    }
}
