package tech.magin.com.thermometer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.etFaren);
        btn = (Button) findViewById(R.id.btnConvert);
        tv = (TextView) findViewById(R.id.tvConvert);

        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        try {
            Double getFarenVal = Double.parseDouble(et.getText().toString());
            Double finalRes = ((getFarenVal-32)/1.8);
            tv.setText(String.format("%.2f", finalRes) + " degree Celsius");
        } catch(Exception es) {
            Toast.makeText(MainActivity.this, "Enter value first", Toast.LENGTH_SHORT).show();
        }


    }
}
