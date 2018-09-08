package com.example.mharo.rolldicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ////////////////////////////////////////
        Button rollButton;
        rollButton=findViewById(R.id.rollbutton);

        final ImageView leftDice  =  findViewById(R.id.image_leftdice);
        final ImageView rightDice =  findViewById(R.id.image_rightdice);
        final ImageView middleDice =  findViewById(R.id.image_rightdice);
        final int[] diceArray = {
                R.drawable.ic_dice1,
                R.drawable.ic_dice2,
                R.drawable.ic_dice3,
                R.drawable.ic_dice4,
                R.drawable.ic_dice5,
                R.drawable.ic_dice6
        };
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee","Buton pressed");

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                Log.d("Dicee","The random is:"+ number);

                leftDice.setImageResource(diceArray[number]);

                number = randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[number]);
            }
        });
    }
}
