package com.company;

import java.awt.*;

public class Leaf {
    private int x, y;

    private boolean left;

    public void draw(Graphics2D g) {
        g.setColor(Color.GREEN);

        // Petioles
        int n = 4;
        int[] xArr = new int[4];
        int[] yArr = new int[4];

        if (left) {
            //Petiole
            xArr[0] = x; yArr[0] = y;
            xArr[1] = x; yArr[1] = y + 7;
            xArr[2] = x - 60; yArr[2] = y + 7 - 60;
            xArr[3] = x - 60; yArr[3] = y - 60;
            Polygon p = new Polygon(xArr, yArr, n);
            g.fillPolygon(p);

            // leaf
            g.fillOval(x - 60 - 120 + 25, y - 60 - 120 + 25, 120, 120); // x = (  1 - sqrt(2)/2  ) * R
            g.fillRect(x - 60 - 120 + 25, y - 60 - 120 + 25, 60 ,60);
        }
        else {
            //Petiole
            xArr[0] = x; yArr[0] = y;
            xArr[1] = x; yArr[1] = y + 7;
            xArr[2] = x + 60; yArr[2] = y + 7 - 60;
            xArr[3] = x + 60; yArr[3] = y - 60;
            Polygon p = new Polygon(xArr, yArr, n);
            g.fillPolygon(p);

            // leaf
            g.fillOval(x + 60 - 25, y - 60 - 120 + 25, 120, 120); // x = (  1 - sqrt(2)/2  ) * R
            g.fillRect(x + 60 + 60 - 25, y - 60 - 120 + 25, 60 ,60);
        }
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

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public Leaf(int x, int y, boolean left) {
        this.x = x;
        this.y = y;
        this.left = left;
    }
}
