package com.example.doodleview;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter6 extends BaseAdapter {
    private final String[] radio4;
    Context context;
    int images4[];
    String[] fruit;
    LayoutInflater inflter;

    public CustomAdapter6(Context applicationContext, int[] flags, String[] radio4) {
        this.context = applicationContext;
        this.images4 = flags;
        this.radio4 = radio4;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return images4.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.spinner_custom_layout6, null);
        ImageView icon = (ImageView) view.findViewById(R.id.imageView);
        TextView names = (TextView) view.findViewById(R.id.textView);
        icon.setImageResource(images4[i]);
        names.setText(radio4[i]);
        return view;
    }
}
