package com.yoshi1125hisa.getnetworkinfomation;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        WifiInfo w_info = wifiManager.getConnectionInfo();
        Log.i("Sample", "SSID:"+w_info.getSSID());
        Log.i("Sample", "BSSID:"+w_info.getBSSID());
//      Log.i("Sample", "IP Address:"+w_info.getIpAddress());
        Log.i("Sample", "Mac Address:"+w_info.getMacAddress());
        Log.i("Sample", "Network ID:"+w_info.getNetworkId());
        Log.i("Sample", "Link Speed:"+w_info.getLinkSpeed());
        int ip_addr_i = w_info.getIpAddress();
        String ip_addr = ((ip_addr_i >> 0) & 0xFF) + "." + ((ip_addr_i >> 8) & 0xFF) + "." + ((ip_addr_i >> 16) & 0xFF) + "." + ((ip_addr_i >> 24) & 0xFF);
        Log.i("Sample", "IP Address:"+ip_addr);
    }
}
