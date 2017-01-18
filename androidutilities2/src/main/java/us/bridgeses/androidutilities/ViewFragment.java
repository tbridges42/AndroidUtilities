package us.bridgeses.androidutilities;

import android.os.Bundle;

/**
 * Created by tbrid on 1/18/2017.
 */

public abstract class ViewFragment extends LifecycleFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupController();
    }

    @Override
    public void onPause() {
        super.onPause();
        pauseController();
    }

    @Override
    public void onStart() {
        super.onStart();
        startController();
    }

    @Override
    public void onResume() {
        super.onResume();
        resumeController();
    }

    @Override
    public void onStop() {
        super.onStop();
        stopController();
    }

    protected void stopController() {}

    protected void resumeController() {}

    protected void pauseController() {}

    protected abstract void startController();

    protected abstract void setupController();
}
