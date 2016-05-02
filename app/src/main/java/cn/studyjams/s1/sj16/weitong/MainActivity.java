package cn.studyjams.s1.sj16.weitong;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends Activity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    //
    //   showICan() shows the buttons in 1st way "这件事到底靠不靠谱",and make background light
    //   reset other channels as titled
    //   the other 4 ways for short
    //
    public void showICan(View view) {
        TextView tv = (TextView) findViewById(R.id.tvICan);
        LinearLayout ll = (LinearLayout) findViewById(R.id.llICan);
        ImageView iv = (ImageView) findViewById(R.id.ivICan);

        tv.setVisibility(view.GONE);
        ll.setVisibility(view.VISIBLE);
        iv.setImageAlpha(125);

        resetKnowledge();
        resetTools();
        resetSolution();
        resetExtension();
    }

    public void showKnowledge(View view) {
        TextView tv = (TextView) findViewById(R.id.tvKnowledge);
        LinearLayout ll = (LinearLayout) findViewById(R.id.llKnowledge);
        ImageView iv = (ImageView) findViewById(R.id.ivKnowledge);

        tv.setVisibility(view.GONE);
        ll.setVisibility(view.VISIBLE);
        iv.setImageAlpha(125);

        resetICan();
        resetTools();
        resetSolution();
        resetExtension();
    }

    public void showTools(View view) {
        TextView tv = (TextView) findViewById(R.id.tvTools);
        LinearLayout ll = (LinearLayout) findViewById(R.id.llTools);
        ImageView iv = (ImageView) findViewById(R.id.ivTools);

        tv.setVisibility(view.GONE);
        ll.setVisibility(view.VISIBLE);
        iv.setImageAlpha(125);

        resetICan();
        resetKnowledge();
        resetSolution();
        resetExtension();
    }

    public void showSolution(View view) {
        TextView tv = (TextView) findViewById(R.id.tvSolution);
        LinearLayout ll = (LinearLayout) findViewById(R.id.llSolution);
        ImageView iv = (ImageView) findViewById(R.id.ivSolution);

        tv.setVisibility(view.GONE);
        ll.setVisibility(view.VISIBLE);
        iv.setImageAlpha(125);

        resetICan();
        resetKnowledge();
        resetTools();
        resetExtension();
    }

    public void showExtension(View view) {
        TextView tv = (TextView) findViewById(R.id.tvExtension);
        LinearLayout ll = (LinearLayout) findViewById(R.id.llExtension);
        ImageView iv = (ImageView) findViewById(R.id.ivExtension);

        tv.setVisibility(view.GONE);
        ll.setVisibility(view.VISIBLE);
        iv.setImageAlpha(125);

        resetICan();
        resetKnowledge();
        resetTools();
        resetSolution();
    }

    private void resetICan() {
        TextView tv = (TextView) findViewById(R.id.tvICan);
        LinearLayout ll = (LinearLayout) findViewById(R.id.llICan);
        ImageView iv = (ImageView) findViewById(R.id.ivICan);

        iv.setImageAlpha(255);
        ll.setVisibility(View.GONE);
        tv.setVisibility(View.VISIBLE);

    }

    private void resetKnowledge() {
        TextView tv = (TextView) findViewById(R.id.tvKnowledge);
        LinearLayout ll = (LinearLayout) findViewById(R.id.llKnowledge);
        ImageView iv = (ImageView) findViewById(R.id.ivKnowledge);

        iv.setImageAlpha(255);
        ll.setVisibility(View.GONE);
        tv.setVisibility(View.VISIBLE);
    }

    private void resetTools() {
        TextView tv = (TextView) findViewById(R.id.tvTools);
        LinearLayout ll = (LinearLayout) findViewById(R.id.llTools);
        ImageView iv = (ImageView) findViewById(R.id.ivTools);

        iv.setImageAlpha(255);
        ll.setVisibility(View.GONE);
        tv.setVisibility(View.VISIBLE);
    }

    private void resetSolution() {
        TextView tv = (TextView) findViewById(R.id.tvSolution);
        LinearLayout ll = (LinearLayout) findViewById(R.id.llSolution);
        ImageView iv = (ImageView) findViewById(R.id.ivSolution);

        iv.setImageAlpha(255);
        ll.setVisibility(View.GONE);
        tv.setVisibility(View.VISIBLE);
    }

    private void resetExtension() {
        TextView tv = (TextView) findViewById(R.id.tvExtension);
        LinearLayout ll = (LinearLayout) findViewById(R.id.llExtension);
        ImageView iv = (ImageView) findViewById(R.id.ivExtension);

        iv.setImageAlpha(255);
        ll.setVisibility(View.GONE);
        tv.setVisibility(View.VISIBLE);
    }

    //  跳转至各界面
    public void newActivity(View view) {
        int id = view.getId();
        Class cl = null;

        switch (id){
            case R.id.btnSurvayNCase:cl = SurveyNCaseActivity.class;break;
            case R.id.btnPsychology:cl = PsychologyActivity.class;break;
            case R.id.btnHairLayers:cl = HairLayersActivity.class;break;
            case R.id.btnThin:cl = ThinActivity.class;break;
            case R.id.btnToolsToBuy:cl = toolsToBuyActivity.class;break;
            case R.id.btnToolsToFind:cl = toolsToFindActivity.class;break;
            case R.id.btnTips:cl = TipsActivity.class;break;
            case R.id.btnASolution:cl = ASolutionActivity.class;break;
            case R.id.btnBSolution:cl = BSolutionActivity.class;break;
            case R.id.btnLearnMore:cl = ExtentionActivity.class;

        }

        Intent intent = new Intent(MainActivity.this, cl);
        startActivity(intent);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://cn.studyjams.s1.sj16.weitong/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://cn.studyjams.s1.sj16.weitong/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
