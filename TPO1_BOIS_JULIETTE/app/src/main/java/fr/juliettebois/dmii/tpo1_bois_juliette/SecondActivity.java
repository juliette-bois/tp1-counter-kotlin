package fr.juliettebois.dmii.tpo1_bois_juliette;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import fr.juliettebois.dmii.tpo1_bois_juliette.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    // variables
    private Integer counter;
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initViews();
    }

    private void initViews() {
        counter = 0;
        binding.result.setText(""+counter);

        // Intercept click on the compute button
        binding.calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1 =  Double.parseDouble(String.valueOf(binding.numberOne.getText()));
                double number2 =  Double.parseDouble(String.valueOf(binding.numberTwo.getText()));
                double calcResult = number1 + number2;
                //Toast.makeText(SecondActivity.this, ,Toast.LENGTH_SHORT).show();
                binding.result.setText(Double.toString(calcResult));
            }
        });
    }
}
