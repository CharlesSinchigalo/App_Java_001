package fisei.uta.app_java_001;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editTextValueFirst;
    private EditText editTextValueSecond;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Obtener las referencias (direcciones de memoria) de los controladores (View)
        // que estan en la UI (XML)
        editTextValueFirst = findViewById(R.id.editTextValueFirst);
        editTextValueSecond = findViewById(R.id.editTextValueSecond);
        textViewResult = findViewById(R.id.textViewResult);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);

        buttonMultiply.setOnClickListener(v -> {
            String valueOne = editTextValueFirst.getText().toString();
            String valueTwo = editTextValueSecond.getText().toString();

            int a = Integer.parseInt(valueOne);
            int b = Integer.parseInt(valueTwo);
            int multiply = a*b;

            String result = String.valueOf(multiply);

            textViewResult.setText(result);
        });
    }

        // Este metodo se ejecuta en clic del botón (onClic)
        public void add(View view) {
            String valueOne = editTextValueFirst.getText().toString();
            String valueTwo = editTextValueSecond.getText().toString();

            int a = Integer.parseInt(valueOne);
            int b = Integer.parseInt(valueTwo);
            int sum = a+b;

            String result = String.valueOf(sum);

            textViewResult.setText(result);
        }

    // Este metodo se ejecuta en clic del botón (onClic)
    public void subtract(View view) {
        String valueOne = editTextValueFirst.getText().toString();
        String valueTwo = editTextValueSecond.getText().toString();

        int a = Integer.parseInt(valueOne);
        int b = Integer.parseInt(valueTwo);
        int subtract = a-b;

        String result = String.valueOf(subtract);

        textViewResult.setText(result);
    }

    public void factorial(View view)
    {
        String valueOne = editTextValueFirst.getText().toString();
        int a = Integer.parseInt(valueOne);
        Mathematics mathematics = new Mathematics();
        long result = mathematics.factorial(a);
        textViewResult.setText(String.valueOf(result));
    }

    public void pow(View view) {
        String valueOne = editTextValueFirst.getText().toString();
        String valueTwo = editTextValueSecond.getText().toString();

        int a = Integer.parseInt(valueOne);
        int b = Integer.parseInt(valueTwo);

        long result = Mathematics.pow(a, b);
        textViewResult.setText(String.valueOf(result));
    }

    public void ShowActivity(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("first",editTextValueFirst.getText().toString());
        intent.putExtra("second",editTextValueSecond.getText().toString());
        startActivity(intent);

    }
}