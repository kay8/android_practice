package xyz.kafeekantate.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UranaiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uranai);

        TextView text = (TextView) findViewById(R.id.uranaiText);
        text.setText("中吉");
    }
}
