package com.lim.limquiz1.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lim.limquiz1.Model.AndroidVersion;
import com.lim.limquiz1.R;

import java.util.List;

/**
 * Created by Christian Carl on 28/09/2017.
 */

public class CustomAdapter extends BaseAdapter{

    private List<AndroidVersion> androidVersion;
    Context myContext;
    ImageView image;
    TextView androidVersion_CodeName;

    @Override
    public int getCount() {
        return androidVersion.size();
    }

    @Override
    public Object getItem(int i) {
        return androidVersion.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public CustomAdapter(Context myContext, List<AndroidVersion> androidVersion){
        this.myContext = myContext;
        this.androidVersion = androidVersion;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(myContext, R.layout.row_layout, null);
        image = (ImageView) v.findViewById(R.id.logo);
        androidVersion_CodeName = (TextView) v.findViewById(R.id.CodeName);

        androidVersion_CodeName.setText(androidVersion.get(i).getCodename());
        image.setImageResource(androidVersion.get(i).getLogo());

        return v;
    }
}
