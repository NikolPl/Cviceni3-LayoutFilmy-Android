package com.example.nikol.ukol3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NovyAdapter extends ArrayAdapter {

    private final ArrayList<Movie> movies;
    private final Activity activity;

    public NovyAdapter(Activity activity, ArrayList<Movie> movies) { // konstruktor
        super(activity, R.layout.list_item, movies); // díky tomuhle se nepřepíše nic originálního
        this.activity = activity;
        this.movies = movies;
    }

    // nafukovač
    public View getView(int position, View view, ViewGroup parent){ // co mají dělat ty argumenty?
        LayoutInflater inflater = activity.getLayoutInflater(); // co tohle dělá?
        View rowView = inflater.inflate(R.layout.list_item, null, true);  // co dělá přesně tohle?

        // --> založení instance rowView (tedy řádku, která je nějak naplněna

        // dále se doplňuje dle pojmenování pozic v layoutu

        TextView nazev = ((View) rowView).findViewById(R.id.nazev); // tvoříme textView s názevm nazev - a doplňujeme to do layoutu, kde je id nazev
        TextView inform = ((View) rowView).findViewById(R.id.inform);
        ImageView obrazek = rowView.findViewById(R.id.obrazek);

        nazev.setText(movies.get(position).name); // name - je název proměnné ze třídy
        inform.setText(movies.get(position).inform);
        obrazek.setImageResource(movies.get(position).image);

        return rowView;
    }


}
