package mx.itesm.edu.earthone.spherochallenge;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity  {

    private Button go, stop;

    private final int REQUEST_PERMISSION = 42;    //Pedir permiso
    private float ROBOT_SPEED = 0.0f;   //Velocidad de robot

    private int direction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        go = (Button) findViewById(R.id.go);
        stop = (Button) findViewById(R.id.stop);


        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}
