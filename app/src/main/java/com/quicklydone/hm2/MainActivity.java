package com.quicklydone.hm2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.quicklydone.hm2.fragment.FragmentEntertainment;
import com.quicklydone.hm2.fragment.FragmentHealth;
import com.quicklydone.hm2.fragment.FragmentScience;
import com.quicklydone.hm2.fragment.FragmentNews;
import com.quicklydone.hm2.fragment.FragmentGames;
import com.quicklydone.hm2.fragment.FragmentOneclick;


//import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button news, games, science, health, entertainment, oneclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize CircleImageView
        news = (Button) findViewById(R.id.News);
        science = (Button) findViewById(R.id.Science);
        health = (Button) findViewById(R.id.Health);
        games = (Button) findViewById(R.id.Games);
        entertainment = (Button) findViewById(R.id.Entertainment);
        oneclick = (Button) findViewById(R.id.Oneclick);

        //set listener for each image
        news.setOnClickListener(this);
        games.setOnClickListener(this);
        science.setOnClickListener(this);
        health.setOnClickListener(this);
        entertainment.setOnClickListener(this);
        oneclick.setOnClickListener(this);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


            FragmentNews fn = new FragmentNews();
            fragmentTransaction.replace(R.id.fragment_below_id, fn);
            fragmentTransaction.commit();
    }

    @Override
    public void onClick(View view) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (view.equals(news)) {
            FragmentNews fn = new FragmentNews();
            fragmentTransaction.replace(R.id.fragment_below_id, fn);
            fragmentTransaction.commit();
        } else if (view.equals(games)) {
            FragmentGames fg = new FragmentGames();
            fragmentTransaction.replace(R.id.fragment_below_id, fg);
            fragmentTransaction.commit();

        } else if (view.equals(science)) {
            FragmentScience fragmentScience = new FragmentScience();
            fragmentTransaction.replace(R.id.fragment_below_id, fragmentScience);
            fragmentTransaction.commit();

        } else if (view.equals(health)) {
            FragmentHealth fragmentHealth = new FragmentHealth();
            fragmentTransaction.replace(R.id.fragment_below_id, fragmentHealth);
            fragmentTransaction.commit();
        } else if (view.equals(entertainment)) {
            FragmentEntertainment fragmentEntertainment = new FragmentEntertainment();
            fragmentTransaction.replace(R.id.fragment_below_id, fragmentEntertainment);
            fragmentTransaction.commit();
        }
        else if (view.equals(oneclick)) {
            FragmentOneclick fragmentOneclick = new FragmentOneclick();
            fragmentTransaction.replace(R.id.fragment_below_id, fragmentOneclick);
            fragmentTransaction.commit();
        }
    }
}
