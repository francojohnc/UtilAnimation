package apkmarvel.com.utilanimation.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import apkmarvel.com.utilanimation.R;

/**
 * Created by c_jvfranco on 11/27/2015.
 */
public class MenuFragment extends Fragment {
    private Button fadeIn;
    private Button fadeOut;
    private Button bounceX;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_menu, container, false);
        cast(v);
        event();
        return v;
    }

    private void event() {
        fadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.frame_container, new FadeInFragment()).addToBackStack("").commit();
            }
        });
        fadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.frame_container, new FadeOutFragment()).addToBackStack("").commit();
            }
        });
        bounceX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.frame_container, new BounceXFragment()).addToBackStack("").commit();
            }
        });
    }

    private void cast(View v) {
        fadeIn = (Button)v.findViewById(R.id.fade_in);
        fadeOut= (Button)v.findViewById(R.id.fade_out);
        bounceX= (Button)v.findViewById(R.id.bounce_x);
    }
}
