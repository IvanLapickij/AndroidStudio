package com.example.anime_v0;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity4_Contact extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4_contact);
        ImageView id_email = findViewById(R.id.id_email);
        ImageView id_sms = findViewById(R.id.id_sms);
        id_email.setOnClickListener(v -> {
            Intent email = new Intent(Intent.ACTION_SEND);
            email.putExtra(Intent.EXTRA_EMAIL, new String[]{"mike@anime.ie"});
            email.putExtra(Intent.EXTRA_SUBJECT, "Teresa@anime.ie");
            email.putExtra(Intent.EXTRA_TEXT, "charli@anime.com");
            email.setType("message/rfc822");
            startActivity(Intent.createChooser(email, "Send Mail Using :"));
        });
        id_sms.setOnClickListener(v -> {
            Uri uri = Uri.parse("smsto:123456789");
            Intent msg = new Intent(Intent.ACTION_SENDTO, uri);
            msg.putExtra("sms_body", "Last anime review: ");
            startActivity(Intent.createChooser(msg, "Send sms Using :"));
        });
    }
}
