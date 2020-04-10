package com.example.dinamicfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fr;
    private FragmentTransaction ft;
    private FragmentOne fragmentOne;
    private FragmentTwo fragmentTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        fragmentOne = new FragmentOne();
        fragmentTwo = new FragmentTwo();

        fr = getSupportFragmentManager();
        ft = fr.beginTransaction();
        ft.add( R.id.fragmentTop, fragmentOne, "one" );
        ft.add( R.id.fragmentBottom, fragmentTwo, "two" );
        ft.commit();
    }

    public void remover(View view) {
        ft = fr.beginTransaction();
        ft.remove( fragmentOne );
        ft.commit();


    }
}
