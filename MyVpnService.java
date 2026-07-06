package com.example.myvpn;

import android.net.VpnService;
import android.content.Intent;
import android.os.ParcelFileDescriptor;

public class MyVpnService extends VpnService {
    private ParcelFileDescriptor vpnInterface;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // As irratti qindaa'ina VPN keetii (IP, DNS, kkf) galchita
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}

