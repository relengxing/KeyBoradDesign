package com.example.relengxing.keyboarddesign;

/**
 * Created by MAGI_XX on 2016/3/24.
 */
public class Key {

    public String name;     //名字
    public int color;       //颜色
    public int currentX;    //左上角X
    public int currentY;    //左上角Y
    public int width;       //长度
    public int height;      //高度

    public Key(String name, int color, int currentX, int currentY, int width, int height) {
        this.name = name;
        this.color = color;
        this.currentX = currentX;
        this.currentY = currentY;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getCurrentX() {
        return currentX;
    }

    public void setCurrentX(int currentX) {
        this.currentX = currentX;
    }

    public int getCurrentY() {
        return currentY;
    }

    public void setCurrentY(int currentY) {
        this.currentY = currentY;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
