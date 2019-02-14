package mx.ipn.jesus.edu.loginjesus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClickVolver(View miView){
        Intent envia = new Intent(this, MainActivity.class);
        finish();
        startActivity(envia);
    }
}
