package servet.com.viewflipper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ViewFlipper;



public class MainActivity extends Activity {

    ViewFlipper viewFlipper;
    Button start_button,stop_button;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper=(ViewFlipper)findViewById(R.id.viewflipper);
        start_button=(Button)findViewById(R.id.button);
        stop_button=(Button)findViewById(R.id.button2);

        // picture will change per 2000 ms//
        viewFlipper.setFlipInterval(2000);

        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewFlipper.startFlipping();

                Toast.makeText(MainActivity.this,"viewflipper is starting",Toast.LENGTH_SHORT).show();

            }
        });

        stop_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewFlipper.stopFlipping();

                Toast.makeText(MainActivity.this,"viewflipper is stopping",Toast.LENGTH_SHORT).show();

            }
        });



    }
}