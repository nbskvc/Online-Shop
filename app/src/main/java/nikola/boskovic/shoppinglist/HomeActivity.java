package nikola.boskovic.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv_name;
    TextView tv_welcome;
    Button bt_acc;
    Button bt_home;
    Button bt_menu;
    String state;
    AccountFragment af1 = AccountFragment.newInstance(null, null);
    MenuFragment mf1 = MenuFragment.newInstance(null, null);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tv_name = findViewById(R.id.user_tv);
        tv_welcome = findViewById(R.id.welcome);
        bt_acc = findViewById(R.id.account_bt);
        bt_home = findViewById(R.id.home_bt);
        bt_menu = findViewById(R.id.menu_bt);

        Bundle bundle = getIntent().getExtras();
        String username = bundle.getString("username", "username");
        tv_name.setText(username);

        bt_acc.setOnClickListener(this);
        bt_home.setOnClickListener(this);
        bt_menu.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int sky = ContextCompat.getColor(this, R.color.sky);
        switch (v.getId()){
            case R.id.account_bt:
                if("Account clicked".equals(state))
                    break;
                bt_menu.setBackgroundColor(sky);
                tv_name.setVisibility(View.INVISIBLE);
                tv_welcome.setVisibility(View.INVISIBLE);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.framehome, af1)
                        .addToBackStack(state)
                        .commit();
                state = "Account clicked";
                break;
            case R.id.home_bt:
                if("Home".equals(state))
                    break;
                bt_menu.setBackgroundColor(sky);
                getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                tv_name.setVisibility(View.VISIBLE);
                tv_welcome.setVisibility(View.VISIBLE);
                state = "Home";
                break;
            case R.id.menu_bt:
                if("Menu".equals(state))
                    break;
                bt_menu.setBackgroundColor(Color.RED);
                tv_name.setVisibility(View.INVISIBLE);
                tv_welcome.setVisibility(View.INVISIBLE);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.framehome, mf1)
                        .addToBackStack(state)
                        .commit();
                state = "Menu";
                break;
        }
    }
    public void onBackPressed(){
        if(!("Home".equals(state))) {
            int sky = ContextCompat.getColor(this, R.color.sky);
            bt_menu.setBackgroundColor(sky);
            getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            tv_name.setVisibility(View.VISIBLE);
            tv_welcome.setVisibility(View.VISIBLE);
            state = "Home";
        }
    }

    public void onMenuButtonColorChange(int color) {
        bt_menu.setBackgroundColor(color);
    }
}