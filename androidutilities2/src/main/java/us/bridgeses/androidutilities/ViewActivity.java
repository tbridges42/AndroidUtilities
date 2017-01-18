package us.bridgeses.androidutilities;

import android.os.Bundle;

/**
 * Created by tbrid on 1/17/2017.
 */

public abstract class ViewActivity extends LifecycleActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupController();
    }

    @Override
    protected void onPause() {
        super.onPause();
        pauseController();
    }

    @Override
    protected void onStart() {
        super.onStart();
        startController();
    }

    @Override
    protected void onResume() {
        super.onResume();
        resumeController();
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopController();
    }

    protected void stopController() {}

    protected void resumeController() {}

    protected void pauseController() {}

    protected abstract void startController();

    protected abstract void setupController();
}
