package com.example.jarvis.animationzrf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    ImageView imgView;
    Animation zIn,zOut,rot,fIn,fOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgView = (ImageView)findViewById(R.id.buildImg);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        menu.add("Zoom In").setIcon(android.R.drawable.ic_menu_call);
        menu.add("Zoom Out");
        menu.add("Rotate");
        menu.add("Fade Out");
        menu.add("Fade In");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        LinearLayout ln=(LinearLayout)findViewById(R.id.mainlayer);
        if(item.getTitle().toString().equals("Zoom In"))
        {
            imgView.setVisibility(View.VISIBLE);
            zIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zin);
            imgView.startAnimation(zIn);
        }
        if(item.getTitle().toString().equals("Zoom Out"))
        {
            imgView.setVisibility(View.VISIBLE);
            zOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zout);
            imgView.startAnimation(zOut);
        }
        if(item.getTitle().toString().equals("Rotate"))
        {
            imgView.setVisibility(View.VISIBLE);
            rot = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
            imgView.startAnimation(rot);
        }
        if(item.getTitle().toString().equals("Fade Out"))
        {
            imgView.setVisibility(View.VISIBLE);
            fOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fout);
            imgView.startAnimation(fOut);
        }
        if(item.getTitle().toString().equals("Fade In"))
        {
            imgView.setVisibility(View.INVISIBLE);
            fIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fin);
            imgView.startAnimation(fIn);
        }
        return true;
    }
}
