package com.example.class4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    double var1,var2;

    int operation = 0;

//    hello git djjjjj

    // Dear Brother here our mentor sohe some tricks hello
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }
    public void setText(View view) {
        textView.setText(textView.getText().toString()+ view.getTag().toString());
    }
    public void operation(View view) {
            var1 = Double.parseDouble(textView.getText().toString());
            textView.setText("");
            operation = Integer.parseInt(view.getTag().toString());
    }

    public void calculation(View view){
        if(view.getId()==R.id.btnE){
            var2 = Double.parseDouble(textView.getText().toString());
            if(operation == 1)
            {
                textView.setText(var1+var2+"");

            }else if(operation == 2){
                textView.setText(var1-var2+"");

            }else if(operation == 3){
                textView.setText(var1*var2+"");

            }else if(operation == 4){
                textView.setText(var1/var2+"");

            }
        }

    }

//    clear funtion C press
    public void clear(View view) {
        textView.setText("0");
    }
//coment
//    backspace function
    public void backspace(View view) {
        String str=textView.getText().toString();
        if (str.length() >=1 ) {
            str = str.substring(0, str.length() - 1);
            textView.setText(str);
        };
        if (str.length() <1 ) {
            textView.setText("");
        }
    }

//    public void clear(View view) {
//        String str = textView.getText().toString();
//        String[] parts = str.split("\\.");
//
//        if(parts[1].length() > 1){
//            str = str.substring(0, str.length() - 1);
//        }else {
//            str = str.substring(0, str.length() - 2);
//        }
//
//        textView.setText(str);





//        String str = textView.getText().toString();
//        if (str.length() >= 1 && str.substring(0, str.length() - 1).equals(".")) {
//            str = str.substring(0, str.length() - 2);
//            textView.setText(str);
//        } else if (str.length() >= 1) {
//            str = str.substring(0, str.length() - 1);
//            textView.setText(str);
//            if (str.length() < 1) {
//                textView.setText("");
//            }
//        }
//    }
}
