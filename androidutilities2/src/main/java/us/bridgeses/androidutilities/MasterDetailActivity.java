package us.bridgeses.androidutilities;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by tbrid on 1/17/2017.
 */

public abstract class MasterDetailActivity<Master extends Fragment, Detail extends Fragment>
        extends ViewActivity {

    private static final String MASTER_TAG = "ADD_MASTER";
    protected boolean mTwoPane;
    protected Master master;
    protected Detail detail;
    protected int masterFrame;
    protected int detailFrame;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.master_detail_layout);

        mTwoPane = isTwoPane();
        master = setupMaster();
        masterFrame = R.id.master_frame;
        if (mTwoPane) {
            detail = setUpDetail();
        }
        else {
            detailFrame = masterFrame;
        }
    }

    protected void setMasterFragment(Master master) {
        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().add(masterFrame, master).addToBackStack(MASTER_TAG).commit();
    }

    protected void setDetailFragment(Detail detail) {
        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().add(detailFrame, detail).addToBackStack(MASTER_TAG).commit();
    }

    protected abstract Detail setUpDetail();

    protected abstract Master setupMaster();

    protected abstract boolean isTwoPane();
}
