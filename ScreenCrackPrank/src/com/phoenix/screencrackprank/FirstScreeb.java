package com.phoenix.screencrackprank;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class FirstScreeb extends Activity 
{

    static int i = 0;
    ImageView imgg;
    MediaPlayer ses;
    


    protected void onCreate(final Bundle img)
    {
        super.onCreate(img);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        //StartAppSDK.init(this, "104489546", "204794620", true);
        //StartAppAd.showSplash(this, img, (new SplashConfig()).setTheme(com.startapp.android.publish.splash.SplashConfig.Theme.GLOOMY).setLogo(0x7f020004).setAppName("Welcome !"));
        setContentView(R.layout.activity_main);
       // StartAppAd.showSlider(this);
        //startAppNativeAd.loadAd((new NativeAdPreferences()).setAdsNumber(1).setAutoBitmapDownload(true).setImageSize(com.startapp.android.publish.nativead.NativeAdPreferences.NativeAdBitmapSize.SIZE150X150), nativeAdListener);
        getSystemService("vibrator");
       // img = (Bundle)findViewById(R.id.imageView1);
        
        imgg=(ImageView)findViewById(R.id.imageView1);
        

        
        
        
        
        imgg.setOnClickListener(new OnClickListener() {

            //final FirstScreeb this$0;
            private final int dizi[]={R.drawable.b3,R.drawable.b4,R.drawable.b5,R.drawable.b7};
            //private final ImageView val$img;

            public void onClick(View view)
            {
                //stopPlaying();
                ses = MediaPlayer.create(FirstScreeb.this, 0x7f040000);
                ses.start();
                ((Vibrator)getSystemService("vibrator")).vibrate(100L);
                FirstScreeb.i++;
                imgg.setImageResource(dizi[FirstScreeb.i]);
                if (FirstScreeb.i == dizi.length - 1)
                {
                    FirstScreeb.i = 0;
                }
            }

            

        }                             );
    }






}

