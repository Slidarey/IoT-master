package com.example.slida.iotsecurity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DeviceAdapter extends ArrayAdapter<Device> {

    public DeviceAdapter(Context context, ArrayList<Device> devices){
        super(context, 0, devices);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Device currentDevice = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentDevice.getImageResourceId());

        TextView textView = listItemView.findViewById(R.id.text_view);
        textView.setText(currentDevice.getNameOfDevice());

        return listItemView;
    }
}
