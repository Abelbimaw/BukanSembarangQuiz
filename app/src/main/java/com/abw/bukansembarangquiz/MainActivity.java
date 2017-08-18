package com.abw.bukansembarangquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private PertanyaanLib mPertanyaanLib = new PertanyaanLib();

    private TextView mScoreView;
    private TextView mPertanyaanView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mQuit;

    private String mAnswer;
    private int mScore = 0;
    private int mNoPertanyaan = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreView = (TextView) findViewById(R.id.score);
        mPertanyaanView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mQuit = (Button) findViewById(R.id.quit);

        updatePertanyaan();

        //Logic button saya

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updatePertanyaan();
                    //baris code optional
                    Toast.makeText(MainActivity.this, "Benar", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Salah", Toast.LENGTH_SHORT).show();
                    updatePertanyaan();
                }
            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updatePertanyaan();

                    Toast.makeText(MainActivity.this, "Benar", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Salah", Toast.LENGTH_SHORT).show();
                    updatePertanyaan();
                }
            }
        });


        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updatePertanyaan();

                    Toast.makeText(MainActivity.this, "Benar", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Salah", Toast.LENGTH_SHORT).show();
                    updatePertanyaan();
                }
            }
        });


        //Exit

        mQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
            }
        });


    }

    private void updatePertanyaan() {
        mPertanyaanView.setText(mPertanyaanLib.getPertanyaan(mNoPertanyaan));
        mButtonChoice1.setText(mPertanyaanLib.getChoice1(mNoPertanyaan));
        mButtonChoice2.setText(mPertanyaanLib.getChoice2(mNoPertanyaan));
        mButtonChoice3.setText(mPertanyaanLib.getChoice3(mNoPertanyaan));

        mAnswer = mPertanyaanLib.getCorrectAnswer(mNoPertanyaan);
        mNoPertanyaan++;
    }


    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
}

