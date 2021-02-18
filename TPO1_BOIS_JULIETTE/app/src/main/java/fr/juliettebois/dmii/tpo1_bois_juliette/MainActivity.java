package fr.juliettebois.dmii.tpo1_bois_juliette;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import fr.juliettebois.dmii.tpo1_bois_juliette.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // variables
    private Integer counter;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initViews();
    }

    /**
     * Methods that allow to retrieve the instance of views in the layout
     */
    private void initViews() {
        counter = 0;
        binding.contentCount.setText(""+counter);

        // Intercept click on the compute button
        binding.incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // increment the value of the counter then update the text
                counter += 1;
                System.out.print(counter);
                binding.contentCount.setText(""+counter);
            }
        });

        binding.toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click", Toast.LENGTH_SHORT).show();
            }
        });
    }
}