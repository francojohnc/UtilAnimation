package apkmarvel.com.utilanimation.ui.activity;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import apkmarvel.com.utilanimation.R;
import apkmarvel.com.utilanimation.util.UtilAnim;

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
    public void button(View v){
        Intent i = new Intent(this,ButtonAnimation.class);
        startActivity(i);
    }
    public void listener(View v){
        UtilAnim.rotateY(v, 360, 3000, new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                Toast.makeText(MainActivity.this, "onAnimationStart", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onAnimationEnd(Animator animator) {
                Toast.makeText(MainActivity.this, "onAnimationEnd", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onAnimationCancel(Animator animator) {

            }
            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
    }

}
