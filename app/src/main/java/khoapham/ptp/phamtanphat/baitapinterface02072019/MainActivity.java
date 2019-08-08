package khoapham.ptp.phamtanphat.baitapinterface02072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements onChange{

    Button btnCong,btnTru;
    TextView txtKetqua;
    onChange onChange;
    int value = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCong  = findViewById(R.id.buttonCong);
        btnTru = findViewById(R.id.buttonTru);
        txtKetqua = findViewById(R.id.textviewKetqua);

        onChange = MainActivity.this;
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onChange.valueRetrive(-1);
            }
        });
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onChange.valueRetrive(1);
            }
        });
    }

    @Override
    public void valueRetrive(int number) {
        value += number;
        txtKetqua.setText(" = " + value);
    }
}
