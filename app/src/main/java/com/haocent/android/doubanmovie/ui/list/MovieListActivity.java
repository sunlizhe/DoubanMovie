package com.haocent.android.doubanmovie.ui.list;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.haocent.android.doubanmovie.R;

/**
 * 榜单
 *
 * Created by Tnno Wu on 2018/01/31.
 */

public class MovieListActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MovieListActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);

        initView();
    }

    private void initView() {
        setTitle("榜单");

        Button btnListInTheaters = findViewById(R.id.btn_list_in_theaters);
        Button btnListComingSoon = findViewById(R.id.btn_list_coming_soon);
        Button btnListTop250 = findViewById(R.id.btn_list_top250);
        Button btnListWeekly = findViewById(R.id.btn_list_weekly);
        Button btnListUsBox = findViewById(R.id.btn_list_us_box);
        Button btnListNew = findViewById(R.id.btn_list_new);

        btnListInTheaters.setOnClickListener(this);
        btnListComingSoon.setOnClickListener(this);
        btnListTop250.setOnClickListener(this);
        btnListWeekly.setOnClickListener(this);
        btnListUsBox.setOnClickListener(this);
        btnListNew.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_list_in_theaters:
                Intent intentInTheaters = new Intent(this, MovieListInTheatersActivity.class);
                startActivity(intentInTheaters);
                break;
            case R.id.btn_list_coming_soon:
                Intent intentComingSoon = new Intent(this, MovieListComingSoonActivity.class);
                startActivity(intentComingSoon);
                break;
            case R.id.btn_list_top250:
                Intent intentTop250 = new Intent(this, MovieListTop250Activity.class);
                startActivity(intentTop250);
                break;
            case R.id.btn_list_weekly:
                Intent intentWeekly = new Intent(this, MovieListWeeklyActivity.class);
                startActivity(intentWeekly);
                break;
            case R.id.btn_list_us_box:
                Intent intentUsBox = new Intent(this, MovieListUsBoxActivity.class);
                startActivity(intentUsBox);
                break;
            case R.id.btn_list_new:
                Intent intentNew = new Intent(this, MovieListNewActivity.class);
                startActivity(intentNew);
                break;
            default:
                break;
        }
    }
}
