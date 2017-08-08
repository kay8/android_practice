package xyz.kafeekantate.helloandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button uranaiButton = (Button) findViewById(R.id.uranaiButton);
        uranaiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUranaiScreen();
            }
        });
    }

    private void openUranaiScreen() {
        Intent intent = new Intent(this, UranaiActivity.class);
        startActivity(intent);
    }
}
