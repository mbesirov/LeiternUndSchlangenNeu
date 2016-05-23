package com.mygdx.game.Layouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View.OnClickListener;
import com.mygdx.game.Spiel.GameActivity;
import com.mygdx.game.R;

public class nickname extends Activity {
    private EditText editTextNickname;
    private TextView textViewNick;
    private TextView textView2;
    private RadioButton radioButtonGruen;
    private RadioButton radioButtonBlau;
    private RadioButton radioButtonRot;
    private RadioButton radioButtonGelb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
        textViewNick = (TextView) findViewById(R.id.textViewNick);
        textView2 = (TextView) findViewById(R.id.textView2);
        editTextNickname = (EditText) findViewById(R.id.editTextNickname);
        radioButtonGruen = (RadioButton) findViewById(R.id.radioButtonGruen);
        radioButtonGelb = (RadioButton) findViewById(R.id.radioButtonGelb);
        radioButtonBlau = (RadioButton) findViewById(R.id.radioButtonBlau);
        radioButtonRot = (RadioButton) findViewById(R.id.radioButtonRot);

        radioButtonGruen.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                radioButtonGruen.setChecked(true);
                radioButtonGelb.setChecked(false);
                radioButtonBlau.setChecked(false);
                radioButtonRot.setChecked(false);
            }
        });

        radioButtonGelb.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                radioButtonGruen.setChecked(false);
                radioButtonGelb.setChecked(true);
                radioButtonBlau.setChecked(false);
                radioButtonRot.setChecked(false);
            }
        });

        radioButtonBlau.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                radioButtonGruen.setChecked(false);
                radioButtonGelb.setChecked(false);
                radioButtonBlau.setChecked(true);
                radioButtonRot.setChecked(false);
            }
        });

        radioButtonRot.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                radioButtonGruen.setChecked(false);
                radioButtonGelb.setChecked(false);
                radioButtonBlau.setChecked(false);
                radioButtonRot.setChecked(true);
            }
        });


    }

    public void onButtonClickNickZurück(View v) {
        Intent intent = new Intent(getApplicationContext(), startscreen.class);
        startActivity(intent);
    }

    public void onButtonClickOk(View v)
    {
        if (editTextNickname.getText().toString().equals("")) {
            editTextNickname.setHint("Nicknamen auswÃ¤hlen!!");
        }

        else if (!radioButtonBlau.isChecked() && !radioButtonGelb.isChecked() && !radioButtonGruen.isChecked() && !radioButtonRot.isChecked()) {
            textView2.setText("Farbe auswÃ¤hlen");
        }

        else if (radioButtonBlau.isChecked()) {
            textView2.setText("");
            Intent intent = new Intent(getApplicationContext(), GameActivity.class);
            startActivity(intent);
        }

        else if ( radioButtonGelb.isChecked()) {
            textView2.setText("");
            Intent intent = new Intent(getApplicationContext(), GameActivity.class);
            startActivity(intent);
        }

        else if (radioButtonGruen.isChecked()) {
            textView2.setText("");
            Intent intent = new Intent(getApplicationContext(), GameActivity.class);
            startActivity(intent);
        }

        else if (radioButtonRot.isChecked()) {
            textView2.setText("");
            Intent intent = new Intent(getApplicationContext(), GameActivity.class);
            startActivity(intent);
        }
    }
}


