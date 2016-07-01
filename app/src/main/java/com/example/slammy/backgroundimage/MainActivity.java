package com.example.slammy.backgroundimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ViewFlipper;
import android.view.View.OnClickListener;






public class MainActivity extends AppCompatActivity {

    Button btnOkWelcome,btnNext02, btnBack02, btnNext03, btnBack03, btnBack04;
    RelativeLayout relativeLayout;
    ImageView imageView;



    private ViewFlipper viewFlipper;
    static int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = (ViewFlipper) findViewById(R.id.viewflipper);

        btnOkWelcome = (Button) (findViewById(R.id.btnOkWelcome));
        btnNext02 = (Button) (findViewById(R.id.btnNext02));
        btnBack02 = (Button) (findViewById(R.id.btnBack02));
        btnNext03 = (Button) (findViewById(R.id.btnNext03));
        btnBack03 = (Button) (findViewById(R.id.btnBack03));
        btnBack04 = (Button) (findViewById(R.id.btnBack04));
        relativeLayout = (RelativeLayout) (findViewById(R.id.background));
        imageView = (ImageView) (findViewById(R.id.imageView01));
        x = 0;

        relativeLayout.setOnTouchListener(new OnSwipeTouchListener(getApplicationContext()) {
            @Override
            public void onSwipeLeft() {
                if(x<3) {
                    viewFlipper.setInAnimation(getApplicationContext(), R.anim.slide_in_from_right);
                    viewFlipper.setOutAnimation(getApplicationContext(), R.anim.slide_out_to_left);
                    viewFlipper.showNext();
                    x++;
                }
            }

            public void onSwipeRight() {
                if (x > 0) {
                    viewFlipper.setInAnimation(getApplicationContext(), R.anim.slide_in_from_left);
                    viewFlipper.setOutAnimation(getApplicationContext(), R.anim.slide_out_to_right);
                    viewFlipper.showPrevious();
                    x--;
                }
            }
        });



        btnOkWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.setInAnimation(getApplicationContext(), R.anim.slide_in_from_right);
                viewFlipper.setOutAnimation(getApplicationContext(), R.anim.slide_out_to_left);
                viewFlipper.showNext();
            }
        });

        btnNext02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.setInAnimation(getApplicationContext(), R.anim.slide_in_from_right);
                viewFlipper.setOutAnimation(getApplicationContext(), R.anim.slide_out_to_left);
                viewFlipper.showNext();
            }
        });


        btnBack02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.setInAnimation(getApplicationContext(), R.anim.slide_in_from_left);
                viewFlipper.setOutAnimation(getApplicationContext(), R.anim.slide_out_to_right);

                viewFlipper.showPrevious();
            }
        });

        btnNext03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.setInAnimation(getApplicationContext(), R.anim.slide_in_from_right);
                viewFlipper.setOutAnimation(getApplicationContext(), R.anim.slide_out_to_left);
                viewFlipper.showNext();
            }
        });


        btnBack03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.setInAnimation(getApplicationContext(), R.anim.slide_in_from_left);
                viewFlipper.setOutAnimation(getApplicationContext(), R.anim.slide_out_to_right);
                viewFlipper.showPrevious();
            }
        });

        btnBack04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.setInAnimation(getApplicationContext(), R.anim.slide_in_from_left);
                viewFlipper.setOutAnimation(getApplicationContext(), R.anim.slide_out_to_right);
                viewFlipper.showPrevious();
            }
        });



    }
}

