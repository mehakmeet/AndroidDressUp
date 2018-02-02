package startup.mehakmeet.androiddressup.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import startup.mehakmeet.androiddressup.R;
import startup.mehakmeet.androiddressup.data.AndroidImageAssets;

/**
 * Created by MEHAKMEET on 01-02-2018.
 */

public class BodyPartFragment extends Fragment {


    public static final String IMAGE_ID_LIST="image_ids";
    public static final String LIST_INDEX="list_index";
    private List<Integer> mImageIds;
    private int mListIndex;
    ImageView iv;
    private static final String TAG="BodyPartFragment";

    public BodyPartFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        if (savedInstanceState!=null){
            mImageIds=savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
            mListIndex=savedInstanceState.getInt(LIST_INDEX);
        }

        View v=inflater.inflate(R.layout.fragment_body_part,container,false);


        iv=(ImageView)v.findViewById(R.id.body_part_iv);



        if(mImageIds !=null){
            iv.setImageResource(mImageIds.get(mListIndex));

            iv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(mListIndex<mImageIds.size()-1){
                        mListIndex++;
                    }
                    else
                        mListIndex=0;
                    iv.setImageResource(mImageIds.get(mListIndex));
                }
            });


        }
        else{
            Log.v(TAG,"This frgament has a null list of image ids");
        }


        return v;
    }
    public void setmImageIds(List<Integer> mImageIds) {
        this.mImageIds = mImageIds;
    }

    public void setmListIndex(int mListIndex) {
        this.mListIndex = mListIndex;
    }


    @Override
    public void onSaveInstanceState(Bundle currentState) {

        currentState.putIntegerArrayList(IMAGE_ID_LIST,(ArrayList<Integer>)mImageIds);
        currentState.putInt(LIST_INDEX,mListIndex);

    }
}
