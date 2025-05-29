package edu.uph.m23si2.pertamaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProfileActivity extends AppCompatActivity {
    Button btnsubmit;
    EditText edtNama, edtEmail, edtProdi;
    TextView txtvHasil, edtFakultas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnsubmit = findViewById(R.id.btnSubmit);
        edtNama = findViewById(R.id.edtNama);
        edtEmail = findViewById(R.id.edtEmail);
        edtProdi = findViewById(R.id.edtProdi);
        txtvHasil = findViewById(R.id.txtvHasil);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Menampilkan hasil di txtHasil
                String nama= edtNama.getText().toString();
                String email= edtEmail.getText().toString();
                String prodi= edtProdi.getText().toString();
                txtvHasil.setText(nama + "\n" + email + "\n" + prodi + "\n");
            }
        });
    }
}