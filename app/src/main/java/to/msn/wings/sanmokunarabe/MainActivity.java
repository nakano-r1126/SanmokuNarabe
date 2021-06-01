package to.msn.wings.sanmokunarabe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer am, win, draw, win1;
    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8;
    TextView tvGuide;
    boolean flag = true;
    String ban = "";
    String ban1 = "";
    String msg = "〇";
    String msg1 = "×";
    private int[] _bd = {// 盤面の状態 0:空き、1:先手、-1:後手
            0, 0, 0,
            0, 0, 0,
            0, 0, 0
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        am = MediaPlayer.create(this, R.raw.dontmove);
        win = MediaPlayer.create(this, R.raw.firstwin);
        draw = MediaPlayer.create(this, R.raw.draw);
        win1 = MediaPlayer.create(this, R.raw.passivewin);
        tvGuide = findViewById(R.id.tvGuide);
        bt0 = findViewById(R.id.bt0);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        ban = "〇の番です";
        ban1 = "×の手番です";
        tvGuide.setText(ban);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                _bd[0] = 0;
                _bd[1] = 0;
                _bd[2] = 0;
                _bd[3] = 0;
                _bd[4] = 0;
                _bd[5] = 0;
                _bd[6] = 0;
                _bd[7] = 0;
                _bd[8] = 0;
                bt0.setText("");
                bt1.setText("");
                bt2.setText("");
                bt3.setText("");
                bt4.setText("");
                bt5.setText("");
                bt6.setText("");
                bt7.setText("");
                bt8.setText("");
                player = 0;
                flag = true;
                tvGuide.setText(ban);
                break;
            case R.id.item2:
                break;
        }
        return true;
    }
    int player = 0;
    public void OnClick(View view) {
        if (flag == true) {
            if (player == 0) {
                switch (view.getId()) {
                    case R.id.bt0:
                        if (_bd[0] == 1 || _bd[0] == -1) {
                            Toast.makeText(MainActivity.this, "そこは置けません", Toast.LENGTH_LONG).show();
                            am.start();
                        } else {
                            bt0.setText(msg);
                            _bd[0] = 1;
                            player = 1;
                            tvGuide.setText(ban1);
                        }
                        break;
                    case R.id.bt1:
                        if (_bd[1] == -1 || _bd[1] == 1) {
                            Toast.makeText(MainActivity.this, "そこは置けません", Toast.LENGTH_LONG).show();
                            am.start();
                        } else {
                            bt1.setText(msg);
                            _bd[1] = 1;
                            player = 1;
                            tvGuide.setText(ban1);
                        }
                        break;
                    case R.id.bt2:
                        if (_bd[2] == -1 || _bd[2] == 1) {
                            Toast.makeText(MainActivity.this, "そこは置けません", Toast.LENGTH_LONG).show();
                            am.start();
                        } else {
                            bt2.setText(msg);
                            _bd[2] = 1;
                            player = 1;
                            tvGuide.setText(ban1);
                        }
                        break;
                    case R.id.bt3:
                        if (_bd[3] == -1 || _bd[3] == 1) {
                            Toast.makeText(MainActivity.this, "そこは置けません", Toast.LENGTH_LONG).show();
                            am.start();
                        } else {
                            bt3.setText(msg);
                            _bd[3] = 1;
                            player = 1;
                            tvGuide.setText(ban1);
                        }
                        break;
                    case R.id.bt4:
                        if (_bd[4] == -1 || _bd[4] == 1) {
                            Toast.makeText(MainActivity.this, "そこは置けません", Toast.LENGTH_LONG).show();
                            am.start();
                        } else {
                            bt4.setText(msg);
                            _bd[4] = 1;
                            player = 1;
                            tvGuide.setText(ban1);
                        }
                        break;
                    case R.id.bt5:
                        if (_bd[5] == -1 || _bd[5] == 1) {
                            Toast.makeText(MainActivity.this, "そこは置けません", Toast.LENGTH_LONG).show();
                            am.start();
                        } else {
                            bt5.setText(msg);
                            _bd[5] = 1;
                            player = 1;
                            tvGuide.setText(ban1);
                        }
                        break;
                    case R.id.bt6:
                        if (_bd[6] == -1 || _bd[6] == 1) {
                            Toast.makeText(MainActivity.this, "そこは置けません", Toast.LENGTH_LONG).show();
                            am.start();
                        } else {
                            bt6.setText(msg);
                            _bd[6] = 1;
                            player = 1;
                            tvGuide.setText(ban1);
                        }
                        break;
                    case R.id.bt7:
                        if (_bd[7] == -1 || _bd[7] == 1) {
                            Toast.makeText(MainActivity.this, "そこは置けません", Toast.LENGTH_LONG).show();
                            am.start();
                        } else {
                            bt7.setText(msg);
                            _bd[7] = 1;
                            player = 1;
                            tvGuide.setText(ban1);
                        }
                        break;
                    case R.id.bt8:
                        if (_bd[8] == -1 || _bd[8] == 1) {
                            Toast.makeText(MainActivity.this, "そこは置けません", Toast.LENGTH_LONG).show();
                            am.start();
                        } else {
                            bt8.setText(msg);
                            _bd[8] = 1;
                            player = 1;
                            tvGuide.setText(ban1);
                        }
                        break;
                }
                WinLose();
            } else{
                switch (view.getId()) {
                    case R.id.bt0:
                        if (_bd[0] == -1 || _bd[0] == 1) {
                            Toast.makeText(MainActivity.this, "そこは置けません", Toast.LENGTH_LONG).show();
                            am.start();
                        } else {
                            bt0.setText(msg1);
                            _bd[0] = -1;
                            player = 0;
                            tvGuide.setText(ban);
                        }
                        break;
                    case R.id.bt1:
                        if (_bd[1] == -1 || _bd[1] == 1) {
                            Toast.makeText(MainActivity.this, "そこは置けません", Toast.LENGTH_LONG).show();
                            am.start();
                        } else {
                            bt1.setText(msg1);
                            _bd[1] = -1;
                            player = 0;
                            tvGuide.setText(ban);
                        }
                        break;
                    case R.id.bt2:
                        if (_bd[2] == -1 || _bd[2] == 1) {
                            Toast.makeText(MainActivity.this, "そこは置けません", Toast.LENGTH_LONG).show();
                            am.start();
                        } else {
                            bt2.setText(msg1);
                            _bd[2] = -1;
                            player = 0;
                            tvGuide.setText(ban);
                        }
                        break;
                    case R.id.bt3:
                        if (_bd[3] == -1 || _bd[3] == 1) {
                            Toast.makeText(MainActivity.this, "そこは置けません", Toast.LENGTH_LONG).show();
                            am.start();
                        } else {
                            bt3.setText(msg1);
                            _bd[3] = -1;
                            player = 0;
                            tvGuide.setText(ban);
                        }
                        break;
                    case R.id.bt4:
                        if (_bd[4] == -1 || _bd[4] == 1) {
                            Toast.makeText(MainActivity.this, "そこは置けません", Toast.LENGTH_LONG).show();
                            am.start();
                        } else {
                            bt4.setText(msg1);
                            _bd[4] = -1;
                            player = 0;
                            tvGuide.setText(ban);
                        }
                        break;
                    case R.id.bt5:
                        if (_bd[5] == -1 || _bd[5] == 1) {
                            Toast.makeText(MainActivity.this, "そこは置けません", Toast.LENGTH_LONG).show();
                            am.start();
                        } else {
                            bt5.setText(msg1);
                            _bd[5] = -1;
                            player = 0;
                            tvGuide.setText(ban);
                        }
                        break;
                    case R.id.bt6:
                        if (_bd[6] == -1 || _bd[6] == 1) {
                            Toast.makeText(MainActivity.this, "そこは置けません", Toast.LENGTH_LONG).show();
                            am.start();
                        } else {
                            bt6.setText(msg1);
                            _bd[6] = -1;
                            player = 0;
                            tvGuide.setText(ban);
                        }
                        break;
                    case R.id.bt7:
                        if (_bd[7] == -1 || _bd[7] == 1) {
                            Toast.makeText(MainActivity.this, "そこは置けません", Toast.LENGTH_LONG).show();
                            am.start();
                        } else {
                            bt7.setText(msg1);
                            _bd[7] = -1;
                            player = 0;
                            tvGuide.setText(ban);
                        }
                        break;
                    case R.id.bt8:
                        if (_bd[8] == -1 || _bd[8] == 1) {
                            Toast.makeText(MainActivity.this, "そこは置けません", Toast.LENGTH_LONG).show();
                            am.start();
                        } else {
                            bt8.setText(msg1);
                            _bd[8] = -1;
                            player = 0;
                            tvGuide.setText(ban);
                        }
                        break;
                }
                WinLose();
            }
        }
    }
    public void WinLose() {
        if (_bd[0] == 1 && _bd[1] == 1 && _bd[2] == 1 || _bd[0] == 1 && _bd[3] == 1 && _bd[6] == 1
                || _bd[0] == 1 && _bd[4] == 1 && _bd[8] == 1 || _bd[1] == 1 && _bd[4] == 1 && _bd[7] == 1
                || _bd[2] == 1 && _bd[5] == 1 && _bd[8] == 1 || _bd[3] == 1 && _bd[4] == 1 && _bd[5] == 1
                || _bd[6] == 1 && _bd[7] == 1 && _bd[8] == 1 || _bd[2] == 1 && _bd[4] == 1 && _bd[6] == 1) {
            tvGuide.setText("〇の勝ちです");
            win.start();
            flag = false;
        } else if (_bd[0] == -1 && _bd[1] == -1 && _bd[2] == -1 || _bd[0] == -1 && _bd[3] == -1 && _bd[6] == -1
                || _bd[0] == -1 && _bd[4] == -1 && _bd[8] == -1 || _bd[1] == -1 && _bd[4] == -1 && _bd[7] == -1
                || _bd[2] == -1 && _bd[5] == -1 && _bd[8] == -1 || _bd[3] == -1 && _bd[4] == -1 && _bd[5] == -1
                || _bd[6] == -1 && _bd[7] == -1 && _bd[8] == -1 || _bd[2] == -1 && _bd[4] == -1 && _bd[6] == -1) {
            tvGuide.setText("×の勝ちです");
            win1.start();
            flag = false;
        } else if (_bd[0] != 0 && _bd[1] != 0 && _bd[2] != 0 && _bd[3] != 0 && _bd[4] != 0 && _bd[5] != 0 && _bd[6] != 0 && _bd[7] != 0 && _bd[8] != 0) {
            tvGuide.setText("引き分けです");
            draw.start();
            flag = false;
        }
    }
}