package mx.ipn.jesus.edu.loginjesus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText usuario, password;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
        texto = (TextView) findViewById(R.id.textView);
    }

    public void onClickBoton(View miView){
        if(usuario.getText().toString().equals("MiUsuario") && password.getText().toString().equals("MiContrasenia")){
            Intent envia = new Intent(this, Main2Activity.class);
            finish();
            startActivity(envia);
        }
        else
            texto.setText("USUARIO O CONTRASEÑA INCORRECTOS");
    }
}
