package com.example.anime_v0;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Locale;

    public class MainActivity9_TextToSpeach extends AppCompatActivity {

        EditText Text;
        Button btnText;
        TextToSpeech textToSpeech;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_activity9_text_to_speach);

            Text = findViewById(R.id.Text);
            btnText = findViewById(R.id.btnText);

            // create an object textToSpeech and adding features into it
            textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int i) {

                    // if No error is found then only it will run
                    if(i!=TextToSpeech.ERROR){
                        // To Choose language of speech
                        textToSpeech.setLanguage(Locale.JAPANESE);
                    }
                }
            });

            // Adding OnClickListener
            btnText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textToSpeech.setLanguage(Locale.JAPANESE);
                    textToSpeech.speak(Text.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                }
            });


        }
    }
