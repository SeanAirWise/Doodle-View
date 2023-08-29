package com.example.doodleview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter18 extends BaseAdapter {
    private final String[] radio;
    Context context;
    int images2[];
    String[] fruit;
    LayoutInflater inflter;

    public CustomAdapter18(Context applicationContext, int[] flags, String[] radio) {
        this.context = applicationContext;
        this.images2 = flags;
        this.radio = radio;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return images2.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.spinner_custom_layout18, null);
        ImageView icon = (ImageView) view.findViewById(R.id.imageView);
        TextView names = (TextView) view.findViewById(R.id.textView);
        icon.setImageResource(images2[i]);
        names.setText(radio[i]);
        return view;
    }
}
