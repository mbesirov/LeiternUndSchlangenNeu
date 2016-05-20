package com.mygdx.game.Layouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

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

    }

    public void onButtonClickNickZurück(View v) {
        Intent intent = new Intent(getApplicationContext(), startscreen.class);
        startActivity(intent);
    }


    public void onButtonClickOk(View v)
    {
        if (editTextNickname.getText().toString().equals("")) {
            editTextNickname.setHint("Nicknamen auswählen!!");
        }

        else if (!radioButtonBlau.isChecked() && !radioButtonGelb.isChecked() && !radioButtonGruen.isChecked() && !radioButtonRot.isChecked()) {
            textView2.setText("Farbe auswählen");
        }

        else if (radioButtonBlau.isChecked() && !radioButtonGelb.isChecked() && !radioButtonGruen.isChecked() && !radioButtonRot.isChecked()) {
            textView2.setText("");
            radioButtonRot.setClickable(false);
            radioButtonGruen.setClickable(false);
            radioButtonGelb.setClickable(false);
        }

        else if (!radioButtonBlau.isChecked() && radioButtonGelb.isChecked() && !radioButtonGruen.isChecked() && !radioButtonRot.isChecked()) {
            textView2.setText("");
            radioButtonRot.setClickable(false);
            radioButtonGruen.setClickable(false);
            radioButtonBlau.setClickable(false);
        }

        else if (!radioButtonBlau.isChecked() && !radioButtonGelb.isChecked() && radioButtonGruen.isChecked() && !radioButtonRot.isChecked()) {
            textView2.setText("");
            radioButtonRot.setClickable(false);
            radioButtonBlau.setClickable(false);
            radioButtonGelb.setClickable(false);
        }

        else if (!radioButtonBlau.isChecked() && !radioButtonGelb.isChecked() && !radioButtonGruen.isChecked() && radioButtonRot.isChecked()) {
            textView2.setText("");
            radioButtonBlau.setClickable(false);
            radioButtonGruen.setClickable(false);
            radioButtonGelb.setClickable(false);
        }

        else
        {
            Intent intent = new Intent(getApplicationContext(), GameActivity.class);
            startActivity(intent);
        }
    }
}


