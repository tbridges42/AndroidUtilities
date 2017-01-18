package us.bridgeses.androidutilities;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by tbrid on 1/18/2017.
 */

public class LifecycleFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(this.getClass().getSimpleName(), "Entered onCreate");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.v(this.getClass().getSimpleName(), "Entered onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.v(this.getClass().getSimpleName(), "Entered onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.v(this.getClass().getSimpleName(), "Entered onResume");
    }

    @Override
    public void onPause() {
        Log.v(this.getClass().getSimpleName(), "Entered onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.v(this.getClass().getSimpleName(), "Entered onStop");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.v(this.getClass().getSimpleName(), "Entered onDestroy");
        super.onDestroy();
    }
}
