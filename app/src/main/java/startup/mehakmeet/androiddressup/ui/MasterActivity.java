package startup.mehakmeet.androiddressup.ui;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import startup.mehakmeet.androiddressup.R;

/**
 * Created by MEHAKMEET on 02-02-2018.
 */

public class MasterActivity extends AppCompatActivity implements MasterListFragment.OnImageClickListener{

    Button next;

    public static String HEAD="headIndex";
    public static String BODY="bodyIndex";
    public static String LEG="legIndex";

    private int headIndex;
    private int bodyIndex;
    private int legIndex;

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

    @Override
    public void OnImageSelected(int position) {

        Toast.makeText(this,"Position clicked = "+position,Toast.LENGTH_SHORT).show();

        int bodypartNumber=position/12;

        int listIndex=position-12*bodypartNumber;

        switch (bodypartNumber){
            case 0: headIndex=listIndex;
            break;
            case 1:bodyIndex=listIndex;
            break;
            case 2:legIndex=listIndex;
            break;
            default:break;
        }


        Bundle b=new Bundle();
        b.putInt(HEAD,headIndex);
        b.putInt(BODY,bodyIndex);
        b.putInt(LEG,legIndex);

        final Intent i=new Intent (this,MainActivity.class);
        i.putExtras(b);
        next=findViewById(R.id.next_btn);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        });


    }
}
