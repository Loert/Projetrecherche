package exia.projetrecherche;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PixelFormat;
import android.hardware.Camera;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

import org.artoolkit.ar.base.ARActivity;
import org.artoolkit.ar.base.rendering.ARRenderer;

import java.io.IOException;
import java.util.List;

import jp.epson.moverio.bt200.*;


public class MainActivity extends ARActivity {
    //private Camera camera;
    //private SurfaceView imageCamera;
    //private Boolean isPreview;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* getWindow().setFormat(PixelFormat.TRANSLUCENT);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        isPreview = false;*/
        setContentView(R.layout.activity_main);
        //imageCamera = (SurfaceView) findViewById(R.id.imageCamera);
        //InitializeCamera();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*
    @Override
    public void onPause() {
        super.onPause();
        if (camera != null) {
            camera.release();
            camera = null;
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        camera = Camera.open();
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (camera == null)
            camera = Camera.open();
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {
        if (isPreview) {
            camera.stopPreview();
        }
        Camera.Parameters parameters = camera.getParameters();
        //parameters.setPreviewSize(imageCamera.getWidth(), imageCamera.getHeight());
        parameters.setJpegQuality(100);
        //parameters.setZoom(2);
        camera.setParameters(parameters);
        try {
            camera.setPreviewDisplay(imageCamera.getHolder());
        } catch (IOException e) {
        }
        camera.startPreview();
        isPreview = true;
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (camera != null) {
            camera.stopPreview();
            isPreview = false;
            camera.release();
        }
    }

    public void InitializeCamera() {

        imageCamera.getHolder().addCallback(this);

        imageCamera.getHolder().setType(
                SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
    }*/

    @Override
    protected ARRenderer supplyRenderer() {
        return new SimpleRenderer();
    }

    @Override
    protected FrameLayout supplyFrameLayout() {
        return (FrameLayout)this.findViewById(R.id.affichage);
    }
}
