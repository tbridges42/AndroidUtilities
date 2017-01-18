package us.bridgeses.androidutilities;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by tbrid on 1/18/2017.
 */

public class BasicRecyclerAdapter<Item extends Object, VH extends RecyclerView.ViewHolder>
        extends RecyclerView.Adapter<VH> {
    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
