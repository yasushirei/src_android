package com.example.soil_pro.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

/**
 * Created by yamagamiyasushi on 14/05/11.
 */
public class Camera {
    public class buttonActivity extends Activity implements View.OnClickListener{
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //buttonを取得
            Button btn = (Button)findViewById(R.id.cameraBtn);
            btn.setOnClickListener(this);
        }
        //インターフェイスを実装 implements OnClickListener
        public void onClick(View v) {
            //Toast.makeText(this, R.string.message, Toast.LENGTH_LONG).show();
        }
    }

    public Intent openCamera() {
        Intent intentCamera = new Intent(
                MediaStore.ACTION_IMAGE_CAPTURE);
        return intentCamera;
    }
}
