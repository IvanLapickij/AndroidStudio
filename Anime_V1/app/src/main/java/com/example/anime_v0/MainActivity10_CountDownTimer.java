package com.example.anime_v0;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

    public class MainActivity10_CountDownTimer extends AppCompatActivity {

//        JUJUTSU KAISEN SEASON 2 RELEASE DATE
        private String EVENT_DATE_TIME = "2023-08-12 12:00:00";
        private String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        private LinearLayout linear_layout_1, linear_layout_2;
        private TextView tv_days, tv_hour, tv_minute, tv_second;
        private Handler handler = new Handler();
        private Runnable runnable;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_activity10_count_down_timer);

            initUI();
            countDownStart();
        }

        private void initUI() {
            linear_layout_2 = findViewById(R.id.linear_layout_2);
            tv_days = findViewById(R.id.tv_days);
            tv_hour = findViewById(R.id.tv_hour);
            tv_minute = findViewById(R.id.tv_minute);
            tv_second = findViewById(R.id.tv_second);
        }

        private void countDownStart() {
            runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        handler.postDelayed(this, 1000);
                        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                        Date event_date = dateFormat.parse(EVENT_DATE_TIME);
                        Date current_date = new Date();
                        if (!current_date.after(event_date)) {
                            long diff = event_date.getTime() - current_date.getTime();
                            long Days = diff / (24 * 60 * 60 * 1000);
                            long Hours = diff / (60 * 60 * 1000) % 24;
                            long Minutes = diff / (60 * 1000) % 60;
                            long Seconds = diff / 1000 % 60;
                            //
                            tv_days.setText(String.format("%02d", Days));
                            tv_hour.setText(String.format("%02d", Hours));
                            tv_minute.setText(String.format("%02d", Minutes));
                            tv_second.setText(String.format("%02d", Seconds));
                        } else {
                            linear_layout_1.setVisibility(View.VISIBLE);
                            linear_layout_2.setVisibility(View.GONE);
                            handler.removeCallbacks(runnable);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            handler.postDelayed(runnable, 0);
        }

        protected void onStop() {
            super.onStop();
            handler.removeCallbacks(runnable);
        }
    }