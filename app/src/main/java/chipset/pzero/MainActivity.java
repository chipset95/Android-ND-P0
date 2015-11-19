package chipset.pzero;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.spotify_streamer_button).setOnClickListener(this);
        findViewById(R.id.scores_app_button).setOnClickListener(this);
        findViewById(R.id.library_app_button).setOnClickListener(this);
        findViewById(R.id.build_it_bigger_button).setOnClickListener(this);
        findViewById(R.id.xyz_reader_button).setOnClickListener(this);
        findViewById(R.id.capstone_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), ((Button) view).getText() + " will be here soon!", Toast.LENGTH_SHORT).show();
    }
}
