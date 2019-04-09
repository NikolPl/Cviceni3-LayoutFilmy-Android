package com.example.nikol.ukol3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Movie> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movies = new ArrayList<>();
        movies.add(new Movie(R.drawable.veznice, "Vykoupení z věznice", "1. film v žebříčku"));
        movies.add(new Movie(R.drawable.forrest, "Forrest Gump", "2. film v žebříčku"));
        movies.add(new Movie(R.drawable.veznice, "Přelet nad kukačím hnízdem", "3. film v žebříčku"));
        movies.add(new Movie(R.drawable.veznice, "Seznam", "4. film v žebříčku"));

    }
}
