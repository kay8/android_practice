package xyz.kafeekantate.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;


public class UranaiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uranai);

        Random random = new Random();
        int n = random.nextInt(4);

        String fortune;
        if (n == 0) {
            fortune = "大吉";
        } else if (n == 1) {
            fortune = "中吉";
        } else if (n == 2) {
            fortune = "小吉";
        } else {
            fortune = "凶";
        }


        TextView text = (TextView) findViewById(R.id.uranaiText);
        text.setText(fortune);
    }
}
