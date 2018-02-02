package startup.mehakmeet.androiddressup.ui;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import startup.mehakmeet.androiddressup.R;

/**
 * Created by MEHAKMEET on 02-02-2018.
 */

public class MasterActivity extends AppCompatActivity {

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.master_main);

        MasterListFragment mf=new MasterListFragment();

        FragmentManager fm = getSupportFragmentManager();

        fm.beginTransaction()
                .add(R.id.masterList_container, mf)
                .commit();

    }
}
