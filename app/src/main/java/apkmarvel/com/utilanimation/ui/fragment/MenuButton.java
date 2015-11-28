package apkmarvel.com.utilanimation.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import apkmarvel.com.utilanimation.R;
import apkmarvel.com.utilanimation.util.UtilAnim;


public class MenuButton extends Fragment {
    private Button fadeIn;
    private Button fadeOut;
    private Button bounceX;
    private Button bounceY;
    private Button moveX;
    private Button moveY;
    private Button rotate;
    private Button rotateX;
    private Button rotateY;
    private Button zoomIN;
    private Button zoomOut;
    private ImageView imgProgdev;

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
                UtilAnim.fideIn(v, 1000, null);
            }
        });
        fadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UtilAnim.fideOut(v, 1000, null);
            }
        });
        bounceX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UtilAnim.moveXBounce(v, UtilAnim.dip2px(getActivity(), 90), 0, 500, null);
            }
        });
        bounceY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UtilAnim.moveYBounce(v, UtilAnim.dip2px(getActivity(), 200), 0, 500, null);
            }
        });
        moveX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UtilAnim.moveX(v, UtilAnim.dip2px(getActivity(), 500), 0, 500, null);
            }
        });
        moveY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UtilAnim.moveY(v, UtilAnim.dip2px(getActivity(), 500), 0, 500, null);
            }
        });
        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UtilAnim.rotate(v, 360, 1000, null);
            }
        });
        rotateX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UtilAnim.rotateX(v, 360, 1000, null);
            }
        });
        rotateY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UtilAnim.rotateY(v, 360, 1000, null);
            }
        });
        zoomIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UtilAnim.scaleWidth(v,0,1.0f,1000,null);
                UtilAnim.scaleHeight(v, 0,1.0f, 1000, null);
            }
        });
        zoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UtilAnim.scaleWidth(v,5.0f,1.0f,1000,null);
                UtilAnim.scaleHeight(v,5.0f,1.0f, 1000, null);
            }
        });

    }

    private void cast(View v) {
        fadeIn = (Button) v.findViewById(R.id.fade_in);
        fadeOut = (Button) v.findViewById(R.id.fade_out);
        bounceX = (Button) v.findViewById(R.id.bounce_x);
        bounceY = (Button) v.findViewById(R.id.bounce_y);
        rotate = (Button) v.findViewById(R.id.rotate);
        rotateX = (Button) v.findViewById(R.id.rotate_x);
        rotateY = (Button) v.findViewById(R.id.rotate_y);
        moveX = (Button) v.findViewById(R.id.move_x);
        moveY = (Button) v.findViewById(R.id.move_y);
        zoomIN = (Button) v.findViewById(R.id.zoom_in);
        zoomOut = (Button) v.findViewById(R.id.zoom_out);
        imgProgdev = (ImageView)v.findViewById(R.id.progdev);
        imgProgdev.setVisibility(View.GONE);
    }
}