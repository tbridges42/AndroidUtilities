package us.bridgeses.androidutilities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tbrid on 1/18/2017.
 */

public abstract class ListAndAddFragment extends ViewFragment {

    RecyclerView list;
    FloatingActionButton add;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_and_add, container, false);
        list = (RecyclerView) view.findViewById(R.id.list);
        add = (FloatingActionButton) view.findViewById(R.id.new_button);
        return view;
    }

    protected void setAdapter(RecyclerView.Adapter adapter) {
        if (list != null) {
            list.setAdapter(adapter);
        }
        else {
            throw new IllegalStateException("setAdapter cannot be called before onCreateView");
        }
    }
}
