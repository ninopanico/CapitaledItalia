package com.example.ppp.capitaleditalia;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CapitaledItalia extends AppCompatActivity {

    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capitaled_italia);

        final Button ButtonVerifica = (Button) findViewById(R.id.buttonVerifica);
        final Button ButtonAzzera = (Button) findViewById(R.id.buttonAzzera);
        final TextView LabelRisposta = (TextView) findViewById(R.id.labelRisposta);
        final EditText EditRisposta = (EditText) findViewById(R.id.editRisposta);

        final String InitLabelRisposta = (String) LabelRisposta.getText();
        final String InitEditRisposta = EditRisposta.getText().toString();
       // final String RispostaEsatta = "ROMA";
        ArrayList<String> lista= new ArrayList<String>();
         lista.add("ROMA");
		 lista.add("PECHINO");
		 lista.add("VIENNA");
        
        ButtonVerifica.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(v.getWindowToken(), 0);

                        String RispostaData = EditRisposta.getText().toString().toUpperCase();
                        for (String string : lista) {
	    
		                             	if(string.equals(RispostaData)) {
				                              LabelRisposta.setText("esatto");
			              } else {
                            LabelRisposta.setText("sbagliato");
			
		                 }
                       
                           
                        }
                        
                    }
                }
        );

        ButtonAzzera.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        LabelRisposta.setText(InitLabelRisposta);
                        EditRisposta.setText(InitEditRisposta);
                    }
                }
        );
    }
}
