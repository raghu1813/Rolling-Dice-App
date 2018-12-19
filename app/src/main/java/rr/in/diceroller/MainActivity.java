package rr.in.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1,imageView2;
    private Random myRandumNumber1= new Random();
    private Random myRandomNumber2= new Random();
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    imageView1 = findViewById(R.id.img1);
    imageView2 = findViewById(R.id.img2);
    button =findViewById(R.id.btn);
//    imageView.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            rollDice();
//        }
//    });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice(){
        int mynumber1 = myRandumNumber1.nextInt(6) + 1;
        int mynumber2 = myRandomNumber2.nextInt(6)+1;
        switch (mynumber1){
            case 1:
                imageView1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageView1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageView1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageView1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageView1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageView1.setImageResource(R.drawable.dice6);
                break;

        }
        switch (mynumber2){
            case 1:
                imageView2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageView2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageView2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageView2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageView2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageView2.setImageResource(R.drawable.dice6);
                break;

        }

    }



}
