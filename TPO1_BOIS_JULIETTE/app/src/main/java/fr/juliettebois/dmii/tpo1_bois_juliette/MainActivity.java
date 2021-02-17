package fr.juliettebois.dmii.tpo1_bois_juliette;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // variables
    private Button buttonToast;
    private Button buttonIncrement;
    private TextView textViewCount;
    private Integer counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    /**
     * Methods that allow to retrieve the instance of views in the layout
     */
    private void initViews() {
        buttonToast = findViewById(R.id.toastButton);
        buttonIncrement = findViewById(R.id.incrementButton);
        textViewCount = findViewById(R.id.contentCount);
        counter = 0;
        textViewCount.setText(""+counter);

        // Intercept click on the compute button
        buttonIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // increment the value of the counter then update the text
                counter += 1;
                System.out.print(counter);
                textViewCount.setText(""+counter);
            }
        });

        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click", Toast.LENGTH_SHORT).show();
            }
        });
    }
}