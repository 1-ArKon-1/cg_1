package com.company;

import java.awt.*;

public class Ladybug {
    private int x, y;

    public void draw(Graphics g2d) {
        g2d.setColor(Color.BLACK);
        g2d.fillOval(x, y, 50, 50);

        g2d.setColor(Color.WHITE);
        g2d.fillOval(x + 25, y, 10, 10);
        g2d.fillOval(x, y + 25, 10, 10);

        g2d.setColor(Color.RED);
        g2d.fillOval(x + 10, y + 10, 70, 70);

        g2d.setColor(Color.BLACK);
        g2d.fillOval(x + 15, y + 15, 20, 20);
        g2d.fillOval(x + 30 - 10, y + 30 + 10, 20, 20);
        g2d.fillOval(x + 30 + 10, y + 30 - 10, 20, 20);
        g2d.fillOval(x + 50 + 10, y + 50 - 10, 15, 15);
        g2d.fillOval(x + 50 - 10, y + 50 + 10, 15, 15);
    }

    public int getX() {return x;}

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Ladybug(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
