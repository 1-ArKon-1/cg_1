package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class DrawPanel extends JPanel {

    private final Random rnd = new Random();

    private final ArrayList<Cloud> clouds = new ArrayList<>();

    private final ArrayList<Leaf> leaves = new ArrayList<>();

    private final ArrayList<Ladybug> ladybugs = new ArrayList<>();

    public DrawPanel(){
        int cloudsCount = 5 + rnd.nextInt(3);

        for (int i = 0; i < cloudsCount; i++) {
            clouds.add(new Cloud(50 + rnd.nextInt(650), 50 + rnd.nextInt(450)));
        }

        leaves.add(new Leaf(400, 200, true));
        leaves.add(new Leaf(400, 350, false));
        leaves.add(new Leaf(400, 500, true));

        int ladybugsCount = 1 + rnd.nextInt(3);

        for (Leaf leaf : leaves) {
            if (ladybugsCount != 0) {

                if (leaf.isLeft()) ladybugs.add(new Ladybug(leaf.getX() - 140, leaf.getY() - 140));
                else ladybugs.add(new Ladybug(leaf.getX() + 60, leaf.getY() - 140));

                ladybugsCount--;
            }

            else break;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.CYAN);
        g2d.fillRect(0,0, getWidth(), getHeight());

        for (Cloud cloud : clouds) {
            cloud.draw(g2d);
        }

        g2d.setColor(Color.GREEN);
        g2d.fillRect(getWidth()/2 - 10, 0, 40, getHeight()); // Stem

        // Petioles & Blades
        for (Leaf leaf : leaves) {
            leaf.draw(g2d);
        }

        for (Ladybug ladybug : ladybugs) {
            ladybug.draw(g2d);
        }
    }
}
