package com.example.listadetarefas;

import android.app.Activity;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity {

    ListView lista;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.lista);
        botao = findViewById(R.id.botao);

        AudioManager audioManager =
                (AudioManager) getSystemService(AUDIO_SERVICE);

        audioManager.registerAudioDeviceCallback(
                new AudioDeviceCallback() {

            @Override
            public void onAudioDevicesAdded(
                    AudioDeviceInfo[] addedDevices) {

                super.onAudioDevicesAdded(addedDevices);
            }

            @Override
            public void onAudioDevicesRemoved(
                    AudioDeviceInfo[] removedDevices) {

                super.onAudioDevicesRemoved(removedDevices);
            }

        }, null);
    }
}