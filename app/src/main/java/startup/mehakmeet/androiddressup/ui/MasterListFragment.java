package startup.mehakmeet.androiddressup.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

import startup.mehakmeet.androiddressup.R;
import startup.mehakmeet.androiddressup.data.AndroidImageAssets;

/**
 * Created by MEHAKMEET on 02-02-2018.
 */

public class MasterListFragment extends Fragment {

    GridView mGridView;
    private ArrayList<Integer> master_img;
    private Grid_Adapter mGridAdapter;


    public MasterListFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.frag_masterlist,container,false);


        mGridView=(GridView)v.findViewById(R.id.masterListGrid);

        master_img=new ArrayList<>();
        master_img.addAll(AndroidImageAssets.getAll());

        mGridAdapter=new Grid_Adapter(getActivity(),R.layout.grid_items,master_img);
        mGridView.setAdapter(mGridAdapter);

        return v;
    }
}
