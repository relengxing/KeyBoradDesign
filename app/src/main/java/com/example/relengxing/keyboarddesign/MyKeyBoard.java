package com.example.relengxing.keyboarddesign;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MAGI_XX on 2016/3/24.
 */
public class MyKeyBoard extends SurfaceView implements View.OnTouchListener{

    public int getSetColor() {
        return setColor;
    }

    public void setSetColor(int setColor) {
        this.setColor = setColor;
    }

    private static int setColor;
    List<Key> list = new ArrayList<Key>();
    Key Esc = new Key("ESC",Color.GRAY,10,100,60,60);
    Key F1 = new Key("F1",Color.GRAY,170,100,60,60);
    Key F2 = new Key("F2",Color.GRAY,240,100,60,60);
    Key F3 = new Key("F3",Color.GRAY,310,100,60,60);
    Key F4 = new Key("F4",Color.GRAY,380,100,60,60);
    Key F5 = new Key("F5",Color.GRAY,470,100,60,60);
    Key F6 = new Key("F6",Color.GRAY,540,100,60,60);
    Key F7 = new Key("F7",Color.GRAY,610,100,60,60);
    Key F8 = new Key("F8",Color.GRAY,680,100,60,60);
    Key F9 = new Key("F9",Color.GRAY,770,100,60,60);
    Key F10 = new Key("F10",Color.GRAY,840,100,60,60);
    Key F11 = new Key("F11",Color.GRAY,910,100,60,60);
    Key F12 = new Key("F12",Color.GRAY,980,100,60,60);
    Key PSS = new Key("Pri",Color.GRAY,1070,100,60,60);
    Key SL = new Key("Scr",Color.GRAY,1140,100,60,60);
    Key PB = new Key("Pau",Color.GRAY,1210,100,60,60);

    Key bo = new Key("~\r\n`",Color.GRAY,10,180,60,60);
    Key A1 = new Key("1",Color.GRAY,80,180,60,60);
    Key A2 = new Key("2",Color.GRAY,150,180,60,60);
    Key A3 = new Key("3",Color.GRAY,220,180,60,60);
    Key A4 = new Key("4",Color.GRAY,290,180,60,60);
    Key A5 = new Key("5",Color.GRAY,360,180,60,60);
    Key A6 = new Key("6",Color.GRAY,430,180,60,60);
    Key A7 = new Key("7",Color.GRAY,500,180,60,60);
    Key A8 = new Key("8",Color.GRAY,570,180,60,60);
    Key A9 = new Key("9",Color.GRAY,640,180,60,60);
    Key A0 = new Key("0",Color.GRAY,710,180,60,60);
    Key jian = new Key("-",Color.GRAY,780,180,60,60);
    Key jia = new Key("+",Color.GRAY,850,180,60,60);
    Key back = new Key("BACK",Color.GRAY,920,180,120,60);
    Key Insert = new Key("Insert",Color.GRAY,1070,180,60,60);
    Key Home = new Key("home",Color.GRAY,1140,180,60,60);
    Key Pageup = new Key("up",Color.GRAY,1210,180,60,60);
    Key Num = new Key("NUM",Color.GRAY,1300,180,60,60);
    Key Xgang = new Key("/",Color.GRAY,1370,180,60,60);
    Key Xxing = new Key("*",Color.GRAY,1440,180,60,60);
    Key Xjian = new Key("-",Color.GRAY,1510,180,60,60);

    Key Tab = new Key("TAB",Color.GRAY,10,250,110,60);
    Key Q = new Key("Q",Color.GRAY,130,250,60,60);
    Key W = new Key("W",Color.GRAY,200,250,60,60);
    Key E = new Key("E",Color.GRAY,270,250,60,60);
    Key R = new Key("R",Color.GRAY,340,250,60,60);
    Key T = new Key("T",Color.GRAY,410,250,60,60);
    Key Y = new Key("Y",Color.GRAY,480,250,60,60);
    Key U = new Key("U",Color.GRAY,550,250,60,60);
    Key I = new Key("I",Color.GRAY,620,250,60,60);
    Key O = new Key("O",Color.GRAY,690,250,60,60);
    Key P = new Key("P",Color.GRAY,760,250,60,60);
    Key LK = new Key("{",Color.GRAY,830,250,60,60);
    Key RK = new Key("}",Color.GRAY,900,250,60,60);
    Key xiegang = new Key("\\",Color.GRAY,970,250,60,60);
    Key delete = new Key("dele",Color.GRAY,1070,250,60,60);
    Key end = new Key("end",Color.GRAY,1140,250,60,60);
    Key pagedown = new Key("down",Color.GRAY,1210,250,60,60);
    Key X7 = new Key("7",Color.GRAY,1300,250,60,60);
    Key X8 = new Key("8",Color.GRAY,1370,250,60,60);
    Key X9 = new Key("9",Color.GRAY,1440,250,60,60);
    Key Xjia = new Key("+",Color.GRAY,1510,250,60,130);

    Key Cap = new Key("CAP",Color.GRAY,10,320,130,60);
    Key A = new Key("A",Color.GRAY,150,320,60,60);
    Key S = new Key("S",Color.GRAY,220,320,60,60);
    Key D = new Key("D",Color.GRAY,290,320,60,60);
    Key F = new Key("F",Color.GRAY,360,320,60,60);
    Key G = new Key("G",Color.GRAY,430,320,60,60);
    Key H = new Key("H",Color.GRAY,500,320,60,60);
    Key J = new Key("J",Color.GRAY,570,320,60,60);
    Key K = new Key("K",Color.GRAY,640,320,60,60);
    Key L = new Key("L",Color.GRAY,710,320,60,60);
    Key fen = new Key(";",Color.GRAY,780,320,60,60);
    Key dou = new Key("'",Color.GRAY,850,320,60,60);
    Key Enter = new Key("ENTER",Color.GRAY,920,320,120,60);
    Key X4 = new Key("4",Color.GRAY,1300,320,60,60);
    Key X5 = new Key("5",Color.GRAY,1370,320,60,60);
    Key X6 = new Key("6",Color.GRAY,1440,320,60,60);

    Key Lshift = new Key("Shift",Color.GRAY,10,390,160,60);
    Key Z = new Key("Z",Color.GRAY,180,390,60,60);
    Key X = new Key("X",Color.GRAY,250,390,60,60);
    Key C = new Key("C",Color.GRAY,320,390,60,60);
    Key V = new Key("V",Color.GRAY,390,390,60,60);
    Key B = new Key("B",Color.GRAY,460,390,60,60);
    Key N = new Key("N",Color.GRAY,530,390,60,60);
    Key M = new Key("M",Color.GRAY,600,390,60,60);
    Key xiaoyu = new Key("<",Color.GRAY,670,390,60,60);
    Key dayu = new Key(">",Color.GRAY,740,390,60,60);
    Key wenhao = new Key("?",Color.GRAY,810,390,60,60);
    Key Rshift = new Key("Shift",Color.GRAY,880,390,160,60);
    Key up = new Key("↑",Color.GRAY,1140,390,60,60);
    Key X1 = new Key("1",Color.GRAY,1300,390,60,60);
    Key X2 = new Key("2",Color.GRAY,1370,390,60,60);
    Key X3 = new Key("3",Color.GRAY,1440,390,60,60);
    Key Xenter = new Key("Enter",Color.GRAY,1510,390,60,130);

    Key LCtrl = new Key("BCtrl",Color.GRAY,10,460,80,60);
    Key Lwin = new Key("WIN",Color.GRAY,100,460,80,60);
    Key LAlt = new Key("Alt",Color.GRAY,190,460,80,60);
    Key Space = new Key(" ",Color.GRAY,280,460,400,60);
    Key RAlt = new Key("Alt",Color.GRAY,690,460,80,60);
    Key Rwin = new Key("win",Color.GRAY,780,460,80,60);
    Key Rtu = new Key("..",Color.GRAY,870,460,80,60);
    Key RCtrl = new Key("Ctrl",Color.GRAY,960,460,80,60);
    Key left = new Key("←",Color.GRAY,1070,460,60,60);
    Key down = new Key("↓",Color.GRAY,1140,460,60,60);
    Key right = new Key("→",Color.GRAY,1210,460,60,60);
    Key X0 = new Key("0",Color.GRAY,1300,460,120,60);
    Key Xdot = new Key(".",Color.GRAY,1440,460,60,60);


    public MyKeyBoard(Context context) {
        super(context);
        getHolder().addCallback(callback);

    }

    public MyKeyBoard(Context context, AttributeSet attrs) {
        super(context, attrs);
        getHolder().addCallback(callback);
    }

    SurfaceHolder.Callback callback = new SurfaceHolder.Callback() {
        @Override
        public void surfaceCreated(SurfaceHolder holder) {
            reDraw();
            setOnTouchListener(MyKeyBoard.this);
            list.add(Esc);
            list.add(F1);
            list.add(F2);
            list.add(F3);
            list.add(F4);
            list.add(F5);
            list.add(F6);
            list.add(F7);
            list.add(F8);
            list.add(F9);
            list.add(F10);
            list.add(F11);
            list.add(F12);
            list.add(PSS);
            list.add(SL);
            list.add(PB);
            list.add(bo);
            list.add(A1);
            list.add(A2);
            list.add(A3);
            list.add(A4);
            list.add(A5);
            list.add(A6);
            list.add(A7);
            list.add(A8);
            list.add(A9);
            list.add(A0);
            list.add(jian);
            list.add(jia );
            list.add(back);
            list.add(Insert);
            list.add(Home);
            list.add(Pageup);
            list.add(Num);
            list.add(Xgang);
            list.add(Xxing);
            list.add(Xjian);
            list.add(Tab);
            list.add(Q);
            list.add(W);
            list.add(E);
            list.add(R);
            list.add(T);
            list.add(Y);
            list.add(U);
            list.add(I );
            list.add(O );
            list.add(P );
            list.add(LK);
            list.add(RK);
            list.add(xiegang);
            list.add(delete);
            list.add(end);
            list.add(pagedown);
            list.add(X7);
            list.add(X8);
            list.add(X9);
            list.add(Xjia);
            list.add(Cap);
            list.add(A );
            list.add(S );
            list.add(D );
            list.add(F );
            list.add(G );
            list.add(H );
            list.add(J );
            list.add(K );
            list.add(L );
            list.add(fen);
            list.add(dou);
            list.add(Enter);
            list.add(X4);
            list.add(X5);
            list.add(X6);

            list.add(Lshift);
            list.add(Z);
            list.add(X);
            list.add(C);
            list.add(V);
            list.add(B);
            list.add(N);
            list.add(M);
            list.add(xiaoyu);
            list.add(dayu);
            list.add(wenhao);
            list.add(Rshift);
            list.add(up);
            list.add(X1);
            list.add(X2);
            list.add(X3);
            list.add(Xenter);
            list.add(LCtrl);
            list.add(Lwin );
            list.add(LAlt );
            list.add(Space );
            list.add(RAlt);
            list.add(Rwin);
            list.add(Rtu);
            list.add(RCtrl);
            list.add(left);
            list.add(down);
            list.add(right);
            list.add(X0);
            list.add(Xdot);


        }

        @Override
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            reDraw();
        }

        @Override
        public void surfaceDestroyed(SurfaceHolder holder) {

        }
    };

    public void reDraw()
    {
        //
        Canvas canvas = getHolder().lockCanvas();

        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        canvas.drawRect(0,0,getRight(),getBottom(),paint);
        for (Key key:list)
        {
            paint.setColor(key.getColor());
            canvas.drawRect(key.getCurrentX(),key.getCurrentY(),
                    key.getCurrentX()+ key.getWidth(),key.getCurrentY()+key.getHeight(),paint);
            paint.setColor(Color.BLACK);
            paint.setTextSize(24);
            canvas.drawText(key.getName(),
                    key.getCurrentX()+key.getWidth()/8,
                    key.getCurrentY()+key.getHeight()/2,
                    paint);
        }
        getHolder().unlockCanvasAndPost(canvas);
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Log.d("坐标",event.getX()+":"+event.getY());
        for (Key key:list)
        {
            if ((event.getX()>key.getCurrentX())&&
                    ( event.getX()<key.getCurrentX()+key.getWidth())&&
                    ( event.getY()>key.getCurrentY())&&
                    ( event.getY()<key.getCurrentY()+key.getHeight()))
            {
                if (getSetColor() == key.getColor()) {
                    key.setColor(Color.GRAY);
                    reDraw();
                }else {
                    key.setColor(getSetColor());
                    reDraw();
                }

            }
        }


        return false;
    }
}
