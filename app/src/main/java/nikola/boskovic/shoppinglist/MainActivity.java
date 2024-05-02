package nikola.boskovic.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button bt1;
    Button bt2;
    LoginFragment lf1;
    RegisterFragment rf1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.button1);
        bt2 = findViewById(R.id.button2);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);

        lf1 = new LoginFragment();
        rf1 = new RegisterFragment();
    }

    @Override
    public void onClick(View v) {
        bt1.setVisibility(View.INVISIBLE);
        bt2.setVisibility(View.INVISIBLE);
        switch (v.getId()){
            case R.id.button1:
                Log.d("Button1", "clicked!");
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.frame1, lf1, "fragment1")
                        .addToBackStack(null)
                        .commit();
                break;
            case R.id.button2:
                Log.d("Button2", "clicked!");
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.frame1, rf1, "fragment1")
                        .addToBackStack(null)
                        .commit();
                break;
        }
    }

    public void onBackPressed(){
        Fragment fragment = getSupportFragmentManager().findFragmentByTag("fragment1");
        if(fragment != null)
            getSupportFragmentManager().beginTransaction().remove(fragment).commit();
        bt1.setVisibility(View.VISIBLE);
        bt2.setVisibility(View.VISIBLE);
    }
}