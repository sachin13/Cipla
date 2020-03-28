package societymanagementsystem.manage.management.com.cipla;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;


import java.util.Timer;
import java.util.TimerTask;



public class Splash_Screen_Activity extends AppCompatActivity {


    public static final String MY_PREFS_NAME1 = "MyPrefsFile1";
    public static final String PREF_USER_FIRST_TIME1 = "user_first_time1";
    public static SharedPreferences initialization;
    public static SharedPreferences.Editor editor;
    boolean isUserFirstTime1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash__screen_);

        try {

            initialization = getSharedPreferences(MY_PREFS_NAME1, MODE_PRIVATE);
            editor = getSharedPreferences(MY_PREFS_NAME1, MODE_PRIVATE).edit();
        getSupportActionBar().hide();




            new Timer().schedule(new TimerTask() {

                @Override
                public void run() {
                    // TODO Auto-generated method stub



                        Intent introIntent = new Intent(Splash_Screen_Activity.this, MainActivity.class);
                     //   introIntent.putExtra(PREF_USER_FIRST_TIME1, isUserFirstTime1);
                        startActivity(introIntent);
                        finish();



                }
            }, 2000);

        }
        catch (Exception e)
        {
            System.out.println("catch");

        }


    }



}
