package game.Spiel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import game.Layouts.GameOverActivity;


public class GameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GameView(this));


    }


    public void onGameOver() {
        Intent theNextIntent = new Intent(getApplicationContext(), GameOverActivity.class);
        startActivity(theNextIntent);
        this.finish();
    }
}
