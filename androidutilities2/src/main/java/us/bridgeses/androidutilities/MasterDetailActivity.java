package us.bridgeses.androidutilities;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;

/**
 * Created by tbrid on 1/17/2017.
 */

public abstract class MasterDetailActivity<Master extends Fragment, Detail extends View>
        extends ViewActivity {

    protected boolean mTwoPane;
    protected Master master;
    protected Detail detail;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mTwoPane = isTwoPane();
        master = setupMaster();
        if (mTwoPane) {
            detail = setUpDetail();
        }
    }

    protected abstract Detail setUpDetail();

    protected abstract Master setupMaster();

    protected abstract void selectDetail(long id);

    protected abstract boolean isTwoPane();
}
