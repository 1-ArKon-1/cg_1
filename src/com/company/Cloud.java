package com.company;

import java.awt.*;

public class Cloud {
    private int x, y;

    public void draw(Graphics2D g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, 100, 40);
        g.fillOval(x, y-8, 45, 45);
        g.fillOval(x+55, y-10, 45, 45);
        g.fillOval(x+25, y-25, 50, 50);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Cloud(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
