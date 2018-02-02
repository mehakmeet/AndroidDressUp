package startup.mehakmeet.androiddressup.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import startup.mehakmeet.androiddressup.R;

/**
 * Created by MEHAKMEET on 02-02-2018.
 */

public class MasterListFragment extends Fragment {
    public MasterListFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.frag_masterlist,container,false);


        return v;
    }
}
