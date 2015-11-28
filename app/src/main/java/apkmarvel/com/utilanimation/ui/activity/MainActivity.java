package apkmarvel.com.utilanimation.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import apkmarvel.com.utilanimation.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void fragment(View v){
        Intent i = new Intent(this,ContainerActivity.class);
        startActivity(i);
    }
    public void image(View v){
        Intent i = new Intent(this,ImageAnimation.class);
        startActivity(i);
    }

}
