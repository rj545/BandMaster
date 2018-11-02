package ssu.groupname.baseapplication;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool sp;
    private int basskick, china, crash, hihat, lowtom, ride, snare, tom1, tom2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        basskick = sp.load(getApplicationContext(),R.raw.basskick,1);
        china = sp.load(getApplicationContext(),R.raw.china,1);
        crash = sp.load(getApplicationContext(),R.raw.crash,1);
        hihat = sp.load(getApplicationContext(),R.raw.hihat,1);
        lowtom = sp.load(getApplicationContext(),R.raw.lowtom,1);
        ride = sp.load(getApplicationContext(),R.raw.ride,1);
        snare = sp.load(getApplicationContext(),R.raw.snare,1);
        tom1 = sp.load(getApplicationContext(),R.raw.tom1,1);
        tom2 = sp.load(getApplicationContext(),R.raw.tom2,1);


    }

    public void playsound_basskick(View v) {
        sp.play(basskick,1.0f,10f,0,0,10f);
    }
    public void playsound_china(View v) {
        sp.play(china,1.0f,10f,0,0,10f);
    }
    public void playsound_crash(View v) {
        sp.play(crash,1.0f,10f,0,0,10f);
    }
    public void playsound_hihat(View v) {
        sp.play(hihat,1.0f,10f,0,0,10f);
    }
    public void playsound_lowtom(View v) {
        sp.play(lowtom,1.0f,10f,0,0,10f);
    }
    public void playsound_ride(View v) {
        sp.play(ride,1.0f,10f,0,0,10f);
    }
    public void playsound_snare(View v) {
        sp.play(snare,1.0f,10f,0,0,10f);
    }
    public void playsound_tom1(View v) {
        sp.play(tom1,1.0f,10f,0,0,10f);
    }
    public void playsound_tom2(View v) {
        sp.play(tom2,1.0f,10f,0,0,10f);
    }

}
