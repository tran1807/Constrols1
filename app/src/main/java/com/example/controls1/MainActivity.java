package com.example.controls1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtTaiKhoan;
    private EditText edtMatKhau;
    private Button btnDangNhap;
    private Button btnHuyBo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTaiKhoan = (EditText) findViewById(R.id.editTextTaikhoan);
        edtMatKhau = (EditText) findViewById(R.id.editTextMatKhau);
        btnDangNhap = (Button) findViewById(R.id.buttonDangNhap);
        btnHuyBo = (Button) findViewById(R.id.buttonHuyBo);

        btnDangNhap.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.buttonDangNhap):
                if (edtTaiKhoan.getText().toString().equals("0392389408") && edtMatKhau.getText().toString().equals("Khongbiet02"))
                    Toast.makeText(getApplicationContext(), "Đăng nhập thành công!", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Đăng nhập thất bại hãy thử lại!", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.buttonHuyBo):
                break;
        }
    }
}