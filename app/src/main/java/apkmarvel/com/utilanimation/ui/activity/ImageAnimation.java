package apkmarvel.com.utilanimation.ui.activity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import apkmarvel.com.utilanimation.R;
import apkmarvel.com.utilanimation.ui.fragment.MenuFragment;
import apkmarvel.com.utilanimation.ui.fragment.MenuImage;


public class ImageAnimation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.container_activity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//back button//enable back button
        setFragment();
    }

    private void setFragment() {
        getFragmentManager().beginTransaction().replace(R.id.frame_container, new MenuImage()).commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Fragment currentFragment =  getFragmentManager().findFragmentById(R.id.frame_container);
                if (currentFragment instanceof MenuImage)finish();
                else getFragmentManager().popBackStack();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
