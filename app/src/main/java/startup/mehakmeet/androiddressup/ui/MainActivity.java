package startup.mehakmeet.androiddressup.ui;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import startup.mehakmeet.androiddressup.R;
import startup.mehakmeet.androiddressup.data.AndroidImageAssets;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if(savedInstanceState==null) {
            BodyPartFragment headFrag = new BodyPartFragment();
            headFrag.setmImageIds(AndroidImageAssets.getHeads());
            headFrag.setmListIndex(1);


            FragmentManager fragman = getSupportFragmentManager();

            fragman.beginTransaction()
                    .add(R.id.head_container, headFrag)
                    .commit();

            BodyPartFragment torsoFrag = new BodyPartFragment();
            torsoFrag.setmImageIds(AndroidImageAssets.getBodies());
            torsoFrag.setmListIndex(1);

            FragmentManager fragman2 = getSupportFragmentManager();

            fragman.beginTransaction()
                    .add(R.id.torso_container, torsoFrag)
                    .commit();


            BodyPartFragment legFrag = new BodyPartFragment();
            legFrag.setmImageIds(AndroidImageAssets.getLegs());
            legFrag.setmListIndex(1);

            FragmentManager fragman3 = getSupportFragmentManager();

            fragman.beginTransaction()
                    .add(R.id.legs_container, legFrag)
                    .commit();

        }

    }
}
