package sdacademy.pl.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        info("onCreate");
    }

    private void info(String info) {
        TextView textView = (TextView) findViewById(R.id.textView);
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        textView.setText(info + " " + dateFormat.format(date));
    }

    @Override
    protected void onStart(){
        super.onStart();
        info("onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        info("onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        info("onPause");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        info("onDestroy");
    }


}
