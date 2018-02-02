package startup.mehakmeet.androiddressup.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import startup.mehakmeet.androiddressup.R;

/**
 * Created by MEHAKMEET on 02-02-2018.
 */

public class MasterActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.master_main);
    }
}
