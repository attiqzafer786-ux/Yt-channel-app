package com.attiqzafar.ytchannel;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends Activity {

    // Your YouTube channel link
    private static final String CHANNEL_URL = "https://youtube.com/@attiqzafarofficial";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(CHANNEL_URL));
            appIntent.setPackage("com.google.android.youtube");
            startActivity(appIntent);
        } catch (ActivityNotFoundException e) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(CHANNEL_URL));
            startActivity(webIntent);
        }

        finish();
    }
}
