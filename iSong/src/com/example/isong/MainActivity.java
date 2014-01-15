package com.example.isong;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer song = MediaPlayer.create(this,  R.raw.benchun_inception);
        song.start();
    }

    public void openSoundcloud(View v){
    	String url = "https://soundcloud.com/stoa/bjork-unravel";
    	Intent i = new Intent(Intent.ACTION_VIEW);
    	i.setData(Uri.parse(url));
    	startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
