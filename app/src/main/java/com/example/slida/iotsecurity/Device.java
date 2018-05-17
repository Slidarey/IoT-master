package com.example.slida.iotsecurity;

public class Device {

    private int mImageResourceId;
    private String mNameOfDevice;
    private boolean mHasBluetoothConnectivity;
    private boolean mHasWIFIConnectivity;
    private boolean mHasRFIDConnectivity;

    public Device(String nameOfDevice, int imageResourceId) {
        mImageResourceId = imageResourceId;
        mNameOfDevice = nameOfDevice;
    }

    public Device(String nameOfDevice, int imageResourceId, boolean bluetoothConnectivity, boolean WIFIConnectivity, boolean RFIDConnectivity) {
        mImageResourceId = imageResourceId;
        mNameOfDevice = nameOfDevice;
        mHasBluetoothConnectivity = bluetoothConnectivity;
        mHasWIFIConnectivity = WIFIConnectivity;
        mHasRFIDConnectivity = RFIDConnectivity;
    }

    public String getNameOfDevice() {
        return mNameOfDevice;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasFirstConnectivity(){
        return mHasBluetoothConnectivity;
    }

    public boolean hasSecondConnectivity(){
        return mHasWIFIConnectivity;
    }

    public boolean hasThirdConnectivity(){
        return mHasRFIDConnectivity;
    }
}
