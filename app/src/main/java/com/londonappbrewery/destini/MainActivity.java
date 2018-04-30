package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStory;
    Button mTopButton;
    Button mBottomButton;
    int mIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);
        mIndex = 1;


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mTopButton.setText("View id is: " + v.getId() " and T1_Ans is: " R.);//v.getId()//R.string.T3_Ans1);
                //mBottomButton.setText(R.string.T3_Ans2);
                //updateStory(R.string.T3_Story);

                switch(mIndex)
                {
                    case 1:
                        mTopButton.setText(R.string.T3_Ans1);
                        mBottomButton.setText(R.string.T3_Ans2);
                        mStory.setText(R.string.T3_Story);
                        mIndex = 3;
                        break;
                    case 2:
                        mTopButton.setText(R.string.T3_Ans1);
                        mBottomButton.setText(R.string.T3_Ans2);
                        mStory.setText(R.string.T3_Story);
                        mIndex= 3;
                        break;
                    case 3:
                        mTopButton.setVisibility(View.INVISIBLE);
                        mBottomButton.setVisibility(View.INVISIBLE);
                        mStory.setText(R.string.T6_End);
                        mIndex = 1;
                        break;

                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(mIndex)
                {
                    case 1:
                        mTopButton.setText(R.string.T2_Ans1);
                        mBottomButton.setText(R.string.T2_Ans2);
                        mStory.setText(R.string.T2_Story);
                        mIndex = 2;
                        break;
                    case 2:
                        mTopButton.setVisibility(View.INVISIBLE);
                        mBottomButton.setVisibility(View.INVISIBLE);
                        mStory.setText(R.string.T4_End);
                        mIndex= 1;
                        break;
                    case 3:
                        mTopButton.setVisibility(View.INVISIBLE);
                        mBottomButton.setVisibility(View.INVISIBLE);
                        mStory.setText(R.string.T5_End);
                        mIndex = 1;
                        break;

                }
            }
        });



    }

//    private void updateStory(int resId)
//    {
//        mStory.setText(resId);
//    }
//
//    private void getButtonText(int resId){
//
//    }
}
