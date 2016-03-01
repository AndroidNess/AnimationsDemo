package tomerbu.itworks.edu.animationsdemo;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer catPlayer, cowPlayer, stagPlayer, turkeyPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        catPlayer = MediaPlayer.create(this, R.raw.cat);
        cowPlayer = MediaPlayer.create(this, R.raw.cat);
        stagPlayer = MediaPlayer.create(this, R.raw.stag);
        turkeyPlayer = MediaPlayer.create(this, R.raw.turkey);
    }

    public void performAnimation(View view) {
        Animator anim = AnimatorInflater.loadAnimator(this, R.animator.blink);
        anim.setTarget(view);
        anim.start();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
