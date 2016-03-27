package com.example.relengxing.keyboarddesign;

import android.inputmethodservice.KeyboardView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import static com.example.relengxing.keyboarddesign.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;

    ImageView image;

    MyKeyBoard myKeyBoard =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉信息栏
        setContentView(R.layout.activity_main);

        myKeyBoard = (MyKeyBoard) findViewById(R.id.mykeyBoard);

        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        button10 = (Button) findViewById(R.id.btn10);

        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);
        button7.setOnClickListener(listener);
        button8.setOnClickListener(listener);
        button9.setOnClickListener(listener);
        button10.setOnClickListener(listener);

        image = (ImageView) findViewById(R.id.chosed);
        myKeyBoard.setSetColor(getColor(R.color.btn_1));
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.btn1:image.setBackgroundColor(getColor(R.color.btn_1));
                    myKeyBoard.setSetColor(getColor(R.color.btn_1));
                    break;
                case R.id.btn2:image.setBackgroundColor(getColor(R.color.btn_2));
                    myKeyBoard.setSetColor(getColor(R.color.btn_2));
                    break;
                case R.id.btn3:image.setBackgroundColor(getColor(R.color.btn_3));
                    myKeyBoard.setSetColor(getColor(R.color.btn_3));
                    break;
                case R.id.btn4:image.setBackgroundColor(getColor(R.color.btn_4));
                    myKeyBoard.setSetColor(getColor(R.color.btn_4));
                    break;
                case R.id.btn5:image.setBackgroundColor(getColor(R.color.btn_5));
                    myKeyBoard.setSetColor(getColor(R.color.btn_5));
                    break;
                case R.id.btn6:image.setBackgroundColor(getColor(R.color.btn_6));
                    myKeyBoard.setSetColor(getColor(R.color.btn_6));
                    break;
                case R.id.btn7:image.setBackgroundColor(getColor(R.color.btn_7));
                    myKeyBoard.setSetColor(getColor(R.color.btn_7));
                    break;
                case R.id.btn8:image.setBackgroundColor(getColor(R.color.btn_8));
                    myKeyBoard.setSetColor(getColor(R.color.btn_8));
                    break;
                case R.id.btn9:image.setBackgroundColor(getColor(R.color.btn_9));
                    myKeyBoard.setSetColor(getColor(R.color.btn_9));
                    break;
                case R.id.btn10:image.setBackgroundColor(getColor(R.color.btn_10));
                    myKeyBoard.setSetColor(getColor(R.color.btn_10));
                    break;
                default:
                    break;
            }
        }
    };
}
