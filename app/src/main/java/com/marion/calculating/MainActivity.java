package com.marion.calculating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inputOne, inputTwo;
    TextView txtResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputOne=findViewById(R.id.inputone);
        inputTwo=findViewById(R.id.inputtwo);

        txtResults=findViewById(R.id.textviewresult);
    }
    //listener
    public void add (View v){
        Toast.makeText(this, "Add clicked", Toast.LENGTH_SHORT).show();
        //collect
        String x=inputOne.getText().toString().trim();
        String y=inputTwo.getText().toString().trim();
        //check
        if (x.isEmpty() ||y.isEmpty())
            return;
        //convert

        int a=Integer.parseInt(x);
        int b=Integer.parseInt(y);

        //calculate and convert
        int result =a + b;
        txtResults.setText(""+result);

    }
public void subtract (View v){
    Toast.makeText(this, "Subtract clicked", Toast.LENGTH_SHORT).show();
    //collect
    String x=inputOne.getText().toString().trim();
    String y=inputTwo.getText().toString().trim();
    //check
    if (x.isEmpty() ||y.isEmpty())
        return;
    //convert

    int a=Integer.parseInt(x);
    int b=Integer.parseInt(y);

    //calculate and convert
    int result =a - b;
    txtResults.setText(""+result);
}
    public void multiply(View v) {
        Toast.makeText(this, "Multiply clicked", Toast.LENGTH_SHORT).show();
        //collect
        String x = inputOne.getText().toString().trim();
        String y = inputTwo.getText().toString().trim();
        //check
        if (x.isEmpty() ||y.isEmpty())
            return;
        //convert

        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);

        //calculate and convert
        int result = a * b;
        txtResults.setText("" +result);
    }
    public void  divide (View v) {
        Toast.makeText(this, "Divide clicked", Toast.LENGTH_SHORT).show();
        //collect
        String x = inputOne.getText().toString().trim();
        String y = inputTwo.getText().toString().trim();
        //check
        if (x.isEmpty() ||y.isEmpty())
            return;
        //convert

        int a = Integer.parseInt(x);
        double b = Double.parseDouble(y);

        //calculate and convert
        double result = a / b;
        txtResults.setText("" +result);
    }

}
