package com.manager.password.splash.splash;


import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;

import com.manager.password.R;

public class ContentView extends AppCompatImageView {

    public ContentView(Context context){
        super(context);
        initialize();
    }

    private void initialize(){
        // set the dummy content image here
        setImageResource(R.drawable.ic_launcher_foreground);
    }
}
