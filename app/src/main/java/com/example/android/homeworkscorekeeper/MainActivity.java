package com.example.android.homeworkscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int pointsFor1 = 0;
    int pointsFor2 = 0;
    int clickCountSmiley1 = 0;
    int clickCountSad1 = 0;
    int clickCountSmiley2 = 0;
    int clickCountSad2 = 0;
    String userName1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for child 1.
     */
    public void displayScore1 (int score) {
        TextView scoreFor1 = (TextView) findViewById(R.id.total_points_for_1);
        scoreFor1.setText(String.valueOf(score));
    }
    /**
     * Add 1 point for child 1 if smiley happy face is clicked 3x.
     */
    public void happySmiley1 (View view) {
        clickCountSmiley1 = clickCountSmiley1 + 1;
        // Name of child in toast message.
        EditText childName1 = (EditText) findViewById(R.id.name_of_child_1);
        String userName1 = childName1.getText().toString();

            if (clickCountSmiley1 == 3)
        {Toast.makeText(this, getString(R.string.Smiley_toast, userName1), Toast.LENGTH_LONG).show();
            clickCountSmiley1 = 0;
            pointsFor1 = pointsFor1 +1;
            displayScore1(pointsFor1);}
    }
    /**
     * Minus 1 point for child 1 if smiley sad face is clicked 3x.
     */
    public void sadSmiley1 (View view) {
        clickCountSad1 = clickCountSad1 + 1;
        // Name of child in toast message.
        EditText childName1 = (EditText) findViewById(R.id.name_of_child_1);
        String userName1 = childName1.getText().toString();

        if (clickCountSad1 == 3)
        {Toast.makeText(this, getString(R.string.Sad_toast, userName1), Toast.LENGTH_LONG).show();
            clickCountSad1 = 0;
            pointsFor1 = pointsFor1 -1;
            displayScore1(pointsFor1);}
    }

    /**
     * Add 1 point for child 1.
     */
    public void addOnePointFor1 (View view) {
        pointsFor1 = pointsFor1 + 1;
        displayScore1(pointsFor1);
    }

    /**
     * Add 2 point for child 1.
     */
    public void addTwoPointsFor1 (View view) {
        pointsFor1 = pointsFor1 + 2;
        displayScore1(pointsFor1);
    }

    /**
     * Add 3 point for child 1.
     */
    public void addThreePointsFor1 (View view) {
        pointsFor1 = pointsFor1 + 3;
        displayScore1(pointsFor1);
    }

    /**
     * Add 4 point for child 1.
     */
    public void addFourPointsFor1 (View view) {
        pointsFor1 = pointsFor1 + 4;
        displayScore1(pointsFor1);
    }

    /**
     * Displays the given score for child 2.
     */
    public void displayScore2 (int score) {
        TextView scoreFor2 = (TextView) findViewById(R.id.total_points_for_2);
        scoreFor2.setText(String.valueOf(score));
    }

    /**
     * Add 1 point for child 2 if smiley happy face is clicked 3x.
     */
    public void happySmiley2 (View view) {
        clickCountSmiley2 = clickCountSmiley2 + 1;
        // Name of child 2 in toast message.
        EditText childName2 = (EditText) findViewById(R.id.name_of_child_2);
        String userName2 = childName2.getText().toString();

        if (clickCountSmiley2 == 3)
        {Toast.makeText(this, getString(R.string.Smiley_toast, userName2), Toast.LENGTH_LONG).show();
            clickCountSmiley2 = 0;
            pointsFor2 = pointsFor2 +1;
            displayScore2(pointsFor2);}
    }

    /**
     * Minus 1 point for child 2 if smiley sad face is clicked 3x.
     */
    public void sadSmiley2 (View view) {
        clickCountSad2 = clickCountSad2 + 1;
        // Name of child in toast message.
        EditText childName2 = (EditText) findViewById(R.id.name_of_child_2);
        String userName2 = childName2.getText().toString();

        if (clickCountSad2 == 3)
        {Toast.makeText(this, getString(R.string.Sad_toast, userName2), Toast.LENGTH_LONG).show();
            clickCountSad2 = 0;
            pointsFor2 = pointsFor2 -1;
            displayScore2(pointsFor2);}
    }

    /**
     * Add 1 point for child 2.
     */
    public void addOnePointFor2 (View view) {
        pointsFor2 = pointsFor2 + 1;
        displayScore2(pointsFor2);
    }

    /**
     * Add 2 point for child 2.
     */
    public void addTwoPointsFor2 (View view) {
        pointsFor2 = pointsFor2 + 2;
        displayScore2(pointsFor2);
    }

    /**
     * Add 3 point for child 2.
     */
    public void addThreePointsFor2 (View view) {
        pointsFor2 = pointsFor2 + 3;
        displayScore2(pointsFor2);
    }

    /**
     * Add 4 point for child 2.
     */
    public void addFourPointsFor2 (View view) {
        pointsFor2 = pointsFor2 + 4;
        displayScore2(pointsFor2);
    }

    /**
     * Reset score.
     */
    public void reset (View view){
        clickCountSad1 = 0;
        clickCountSad2 = 0;
        clickCountSmiley1 = 0;
        clickCountSmiley2 = 0;
        pointsFor1 = 0;
        pointsFor2 = 0;
        displayScore1(pointsFor1);
        displayScore2(pointsFor2);
    }
}
