package fr.juliettebois.dmii.tpo1_bois_juliette;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import fr.juliettebois.dmii.tpo1_bois_juliette.databinding.ActivityEmailBinding;

public class EmailActivity extends AppCompatActivity {
    // variables
    private ActivityEmailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEmailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        showCounter();
        showCalculate();
        sendEmail();

        Glide.with(this).load("https://alternativi.fr/uploads/articles//les-bienfaits-du-chat-sur-lhomme-e96.jpeg").into(binding.imageView);
    }

    private void showCounter() {
        // Intercept click on the compute button
        binding.counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmailActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }

    private void showCalculate() {
        // Intercept click on the compute button
        binding.calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmailActivity.this,SecondActivity.class);
                startActivity(i);
            }
        });
    }

    private void sendEmail() {
        binding.email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"juliettebois@icloud.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Salut !");
                intent.putExtra(Intent.EXTRA_TEXT, "Ca va ?");

                startActivity(Intent.createChooser(intent, "Send email"));
            }
        });
    }
}
