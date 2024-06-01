package vlu.android.democal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtSoA,edtSoB;
    Button btnTinh;
    TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //--------------------------------------------
        //Hàm gắn id cho các biến control
        addControls();
        //hàm xử lý các sự kiện cho các control
        addEvents();
    }
    ////Hàm gắn id cho các biến control
    public void addControls()
    {
        edtSoA = (EditText) findViewById(R.id.edtSoA);
        edtSoB = (EditText) findViewById(R.id.edtSoB);
        btnTinh = (Button) findViewById(R.id.btnTinh);
        tvKetQua = (TextView) findViewById(R.id.tvKetQua);

    }
    public  void addEvents()
    {
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edtSoA.getText().toString());
                int b= Integer.parseInt(edtSoB.getText().toString());
                int c = a+b;
                tvKetQua.setText(String.valueOf(c));
            }
        });
    }

}