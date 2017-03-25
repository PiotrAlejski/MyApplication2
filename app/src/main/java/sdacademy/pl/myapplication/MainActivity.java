package sdacademy.pl.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verifyOnClick(View view) {
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        String name = nameEditText.getText().toString();
        if (name.isEmpty()) {
            Toast.makeText(this, "Name is empty", Toast.LENGTH_SHORT).show();
        } else {
            //przepiecie do nowego widoku
            Intent startSimpleActivity = new Intent(this, LoginActivity.class);
            startSimpleActivity.putExtra("login", "sda_user");
            startSimpleActivity.putExtra("password", "haslo123");
            startActivity(startSimpleActivity);

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://www.wp.pl"));
            startActivity(intent);
        }
    }
}
