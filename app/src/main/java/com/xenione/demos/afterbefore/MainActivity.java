package com.xenione.demos.afterbefore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xenione.demos.R;
import com.xenione.library.BeforeAfterCoordinatorLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BeforeAfterCoordinatorLayout beforeAfterCoordinatorLayout = (BeforeAfterCoordinatorLayout) findViewById(R.id.beforeAfterView);
        assert beforeAfterCoordinatorLayout != null;

        beforeAfterCoordinatorLayout.setForegroundImage(R.drawable.before);
        beforeAfterCoordinatorLayout.setBackgroundImage(R.drawable.after);
    }
}
