package com.example.slida.iotsecurity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String  LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.device_list);

        final ArrayList<Device> devices = new ArrayList<>();

        devices.add(new Device("Air Conditioner", R.drawable.air_conditioner,true,true,true));
        devices.add(new Device("Fan", R.drawable.fan,true,false,false));
        devices.add(new Device("Home Theater", R.drawable.home_theater,true,false,true));
        devices.add(new Device("Light Bulb", R.drawable.light_bulb,false,true,false));
        devices.add(new Device("Microwave", R.drawable.microwave,true,true,false));
        devices.add(new Device("Refrigerator", R.drawable.refrigerator,true,false,false));
        devices.add(new Device("Television", R.drawable.television,true,false,true));
        devices.add(new Device("Washing Machine", R.drawable.washing_machine,false,true,true));
        devices.add(new Device("Water Heater", R.drawable.water_heater,true,false,true));

        DeviceAdapter adpater = new DeviceAdapter(this, devices);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adpater);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Device device = devices.get(i);

                Intent intent = new Intent (getApplicationContext(), ConnectivityLayoutActivity.class);
                intent.putExtra("key_bluetooth", device.hasFirstConnectivity());
                intent.putExtra("key_wifi", device.hasSecondConnectivity());
                intent.putExtra("key_rfid", device.hasThirdConnectivity());
                startActivity(intent);

            }
        });
    }
}
