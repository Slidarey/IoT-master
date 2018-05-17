package com.example.slida.iotsecurity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import static android.view.View.GONE;



public class ConnectivityLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connectivity_layout);

        LinearLayout mBluetoothLinearLayout = findViewById(R.id.list_item_bluetooth);
        LinearLayout mWIFILinearLayout = findViewById(R.id.list_item_wifi);
        LinearLayout mRFIDLinearLayout = findViewById(R.id.list_item_rfid);

        ImageView mBluetoothImageView = findViewById(R.id.image_bluetooth);
        ImageView mWIFIImageView = findViewById(R.id.image_wifi);
        ImageView mRFIDImageView = findViewById(R.id.image_rfid);

        Intent intent = getIntent();
        boolean showBluetooth = intent.getBooleanExtra("key_bluetooth",false);
        boolean showWIFI = intent.getBooleanExtra("key_wifi", false);
        boolean showRFID = intent.getBooleanExtra("key_rfid", false);


        if(showBluetooth){
            mBluetoothImageView.setImageResource(R.drawable.bluetooth);
        }else
            mBluetoothLinearLayout.setVisibility(GONE);

        if(showWIFI){
            mWIFIImageView.setImageResource(R.drawable.wifi);
        }else
            mWIFILinearLayout.setVisibility(GONE);

        if(showRFID){
            mRFIDImageView.setImageResource(R.drawable.rfid);
        }else
            mRFIDLinearLayout.setVisibility(GONE);

        mBluetoothLinearLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Bluetooth is working", Toast.LENGTH_LONG).show();
            }
        });

        mWIFILinearLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "WIFI is working", Toast.LENGTH_LONG).show();
            }
        });

        mRFIDLinearLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "RFID is working", Toast.LENGTH_LONG).show();
            }
        });
    }
}
