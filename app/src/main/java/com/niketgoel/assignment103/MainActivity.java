package com.niketgoel.assignment103;


import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListFragment customListFragment = null;
        FrameLayout frameLayout =
                (FrameLayout)findViewById(R.id.frameLayout);
        if(frameLayout != null){
            FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            customListFragment = (CustomListFragment)getSupportFragmentManager()
                    .findFragmentByTag("MASTER");
            if(customListFragment == null){
                customListFragment = new CustomListFragment();
                fragmentTransaction.add(R.id.frameLayout,customListFragment,
                        "MASTER");
            }
            fragmentTransaction.commit();
        }
    }
}
