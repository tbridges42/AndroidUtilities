package us.bridgeses.androidutilities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by tbrid on 1/17/2017.
 */

public class LifecycleActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(this.getClass().getSimpleName(), "Entered onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(this.getClass().getSimpleName(), "Entered onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(this.getClass().getSimpleName(), "Entered onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(this.getClass().getSimpleName(), "Exiting onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(this.getClass().getSimpleName(), "Exiting onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(this.getClass().getSimpleName(), "Exiting onDestroy");
    }
}
