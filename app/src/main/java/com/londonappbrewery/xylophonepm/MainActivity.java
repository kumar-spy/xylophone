package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    SoundPool mSounpool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO: Add button
        Button a_key = (Button)findViewById(R.id.a_key);
        Button b_key = (Button)findViewById(R.id.b_key);
        Button c_key = (Button)findViewById(R.id.c_key);
        Button d_key = (Button)findViewById(R.id.d_key);
        Button e_key = (Button)findViewById(R.id.e_key);
        Button f_key = (Button)findViewById(R.id.f_key);
        Button g_key = (Button)findViewById(R.id.g_key);
        // TODO: Create a new SoundPool
        mSounpool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,AudioManager.STREAM_MUSIC,0);


        // TODO: Load and get the IDs to identify the sounds
        mASoundId = mSounpool.load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundId = mSounpool.load(getApplicationContext(),R.raw.note6_a,1);
        mCSoundId = mSounpool.load(getApplicationContext(),R.raw.note6_a,1);
        mDSoundId = mSounpool.load(getApplicationContext(),R.raw.note6_a,1);
        mESoundId = mSounpool.load(getApplicationContext(),R.raw.note6_a,1);
        mFSoundId = mSounpool.load(getApplicationContext(),R.raw.note6_a,1);
        mGSoundId = mSounpool.load(getApplicationContext(),R.raw.note6_a,1);
        // key listners
        a_key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSounpool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });
        b_key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSounpool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });
        c_key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSounpool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });
        d_key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSounpool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });
        e_key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSounpool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });
        f_key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSounpool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });
        g_key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSounpool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });

    }

    // TODO: Add the play methods triggered by the buttons


}
