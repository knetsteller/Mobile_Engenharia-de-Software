package br.ufg.inf;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends Activity {

	private EditText nomeDeUsuario = null;
	private EditText senha = null;
	private TextView tentativa;
	private Button login;
	int contadorTentativas = 3;
	
	protected void onCreate(Bundle instanciaSalva) {
		super.onCreate(instanciaSalva);
		setContentView(R.layout.activity_main);
		nomeDeUsuario = (EditText) findViewById(R.id.ediText1);
		senha = (EditText) findViewById(R.id.ediText2);	
		tentativa = (TextView) findViewById(id);
		tentativa.setText(Integer.toString(contadorTentativas));
		login = (Button) findViewById(R.id.button1);
	}
	
	public void login(View view) {
		if (nomeDeUsuario.getText().toString().equals("admin")
			&& senha.getText().toString().equals("admin")) {
			Toast.makeText(getApplicationContext(), "Acessando...", 
			Toast.LENGTH_SHORT).show();
		} else {
			Toast.makeText(getApplicationContext(), "Senha ou Usuário Incorreto", 
			Toast.LENGTH_SHORT).show();
			
			tentativa.setBackgroundColor(Color.RED);
			contadorTentativas--;
			tentativa.setText(Integer.toString(contadorTentativas));
			if (contadorTentativas == 0) {
				login.setEnabled(false);
			}
			
			
		}
	}
	
	public boolean onCreatoptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	/*@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	*//**
	 * A placeholder fragment containing a simple view.
	 *//*
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}*/

}
