package br.ufg.inf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class RegisterActivity {
	
	 EditText txtNome;
	 EditText txtEmail;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
         
        
        final Controller aController = (Controller) getApplicationContext();
         
        
        if (!aController.isConnectingToInternet()) {             
            
            aController.showAlertDialog(RegisterActivity.this,
                    "Erro de conexão",
                    "É necessário conexão com a internet", false);             

            return;
        }
        
        txtNome = (EditText) findViewById(R.id.txtName);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        btnRegister = (Button) findViewById(R.id.btnRegister);
}
