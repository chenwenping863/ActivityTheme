package chen.com.activitytheme;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

/**
 * Created by chenwenping on 17/4/21.
 */

public class TestActivity extends AppCompatActivity {
    private  ViewFlipper mViewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_act_ly);
        mViewFlipper = (ViewFlipper) findViewById(R.id.mini_cashier_desk_viewFlipper);
        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable(){
                    public void run() {
                        mViewFlipper.setVisibility(View.VISIBLE);
                        mViewFlipper.setAnimation(AnimationUtils.loadAnimation(TestActivity.this, R.anim.view_in_left_to_right));
                        //showFloatingFragment(new MiniPaysdkFragment());
                    }
                }, 4000);
            }
        });



    }
}
