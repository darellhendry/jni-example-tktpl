package id.ac.ui.cs.mobileprogramming.darellhendry.hello_c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("native-lib");
    }

    private native double add(double a, double b);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText numa = findViewById(R.id.a);
        final EditText numb = findViewById(R.id.b);
        final TextView output = findViewById(R.id.output);
        Button addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = numa.getText().toString();
                String b = numb.getText().toString();
                if (!a.equals("") && !b.equals(""))
                    output.setText(String.valueOf(add(Double.parseDouble(a),Double.parseDouble(b))));
            }
        });
    }
}
