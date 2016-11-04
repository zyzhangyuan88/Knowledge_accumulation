package study.hz.com.accumulation.ui.activities;

import android.Manifest;
import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Toast;

import com.jakewharton.rxbinding.view.RxView;
import com.tbruyelle.rxpermissions.Permission;
import com.tbruyelle.rxpermissions.RxPermissions;

import java.io.IOException;

import rx.functions.Action0;
import rx.functions.Action1;
import study.hz.com.accumulation.R;
import study.hz.com.accumulation.base.BaseActivity;

public class MainActivity extends BaseActivity {


    private static final String TAG = "RxPermissionsSample";

    private Camera camera;
    private SurfaceView surfaceView;
    private RxPermissions rxPermissions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rxPermissions = RxPermissions.getInstance(this);
        rxPermissions.setLogging(true);
        setContentView(R.layout.activity_main);
        findViewById(R.id.jump).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PermissionActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });


    }


}
