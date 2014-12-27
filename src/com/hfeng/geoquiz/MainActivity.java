package com.hfeng.geoquiz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity
{
    private Button mTrueButton;
    private Button mFalseButton;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mTrueButton = (Button)findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this,
                                   R.string.incorrect_toast,
                                   Toast.LENGTH_SHORT).show();
                }
            });
        mFalseButton = (Button)findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this,
                                   R.string.correct_toast,
                                   Toast.LENGTH_SHORT).show();
                }
            });
    }
}
