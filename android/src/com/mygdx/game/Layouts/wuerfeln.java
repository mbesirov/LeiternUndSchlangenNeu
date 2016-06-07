package com.mygdx.game.Layouts;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.common.api.GoogleApiClient;
import com.mygdx.game.R;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Lisa on 03.06.2016.
 */
public class wuerfeln extends Activity {
    ImageView dice_picture;
    Random rng=new Random();
    Handler handler;	//würfel starten
    Timer timer=new Timer();
    boolean rolling=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* Dialog dialog = new Dialog(this, android.R.style.Theme_Translucent_NoTitleBar_Fullscreen);
        setContentView(new View(this));
        dialog.setContentView(R.layout.wuerfeln);
        dialog.show();*/
        dice_picture = (ImageView) findViewById(R.id.würfel);
        handler=new Handler(callback);

    }

    //User klickt auf würfel, start
    public void HandleClick(View arg0) {
        if(!rolling) {
            rolling=true;
            dice_picture.setImageResource(R.mipmap.ic_launcher);
            timer.schedule(new Roll(), 400);
        }
    }
    //When pause completed message sent to callback
    class Roll extends TimerTask {
        public void run() {
            handler.sendEmptyMessage(0);
        }
    }

    //Receives message from timer to start
    Handler.Callback callback = new Handler.Callback() {
        public boolean handleMessage(Message msg) {
            switch(rng.nextInt(6)+1) {
                case 1:
                    dice_picture.setImageResource(R.mipmap.eins);
                    break;
                case 2:
                    dice_picture.setImageResource(R.mipmap.two);
                    break;
                case 3:
                    dice_picture.setImageResource(R.mipmap.three);
                    break;
                case 4:
                    dice_picture.setImageResource(R.mipmap.four);
                    break;
                case 5:
                    dice_picture.setImageResource(R.mipmap.five);
                    break;
                case 6:
                    dice_picture.setImageResource(R.mipmap.six);
                    break;
                default:
            }
            rolling=false;	//user can again
            return true;
        }
    };

    //Clean up
    @Override
    protected void onPause() {
        super.onPause();
    }
    protected void onDestroy() {
        super.onDestroy();
        timer.cancel();

    }
}
