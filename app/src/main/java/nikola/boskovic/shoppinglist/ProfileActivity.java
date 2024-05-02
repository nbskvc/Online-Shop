package nikola.boskovic.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txt_username;
    TextView txt_email;
    Button bt_end;
    Button bt_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        txt_username = findViewById(R.id.profile_username);
        txt_email = findViewById(R.id.profile_email);
        bt_end = findViewById(R.id.end_session);
        bt_password = findViewById(R.id.profile_password);
        Bundle bundle = getIntent().getExtras();
        String username = bundle.getString("username", "username");
        String email = bundle.getString("email", "email");
        txt_username.setText(username);
        txt_email.setText(email);
        bt_end.setOnClickListener(this);
        bt_password.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.end_session:
                Intent intent1 = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent1);
                break;
            case R.id.profile_password:
                Intent intent2 = new Intent(ProfileActivity.this, PasswordActivity.class);
                startActivity(intent2);
                break;
        }
    }
}