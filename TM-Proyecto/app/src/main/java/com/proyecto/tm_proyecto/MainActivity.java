package com.proyecto.tm_proyecto;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;
import android.widget.MediaController;
public class MainActivity extends AppCompatActivity {

   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoViewUcsm = findViewById(R.id.videoUCSM);
        Uri pathUcsm = Uri.parse("android.resource://com.proyecto.tm_proyecto/"+R.raw.ucsm);

        MediaController mcUcsm = new MediaController(this);
        videoViewUcsm.setMediaController(mcUcsm);
        videoViewUcsm.setVideoURI(pathUcsm);
        videoViewUcsm.start();
    }

    public void onClickAsistencia(View view)
    {
        Intent ListAsistencia = new Intent(getApplicationContext(), Asistencia.class);
        startActivity(ListAsistencia);
    }

    public void onClickAyuda(View view)
    {
        Intent ListAyuda = new Intent(getApplicationContext(), ayuda.class);
        startActivity(ListAyuda);
    }

}
