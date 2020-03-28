package societymanagementsystem.manage.management.com.cipla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class user extends AppCompatActivity {
Button btn_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        btn_start=(Button)findViewById(R.id.btn_start);


        btn_start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent introIntent = new Intent(user.this, feedback.class);
                //   introIntent.putExtra(PREF_USER_FIRST_TIME1, isUserFirstTime1);
                startActivity(introIntent);
                finish();





            }
        });
    }
}
