package coffeeCH8.emu;

import coffeeCH8.chip.Chip;

import javax.swing.*;
import java.awt.*;

public class ChipPanel extends JPanel {
    private Chip chip;

    public ChipPanel(Chip chip) {
        this.chip = chip;
    }

    public void paint(Graphics graphics) {
        byte[] display = chip.getDisplay();
        for(int i = 0; i < display.length; i++) {
            if(display[i] == 0)
                graphics.setColor(Color.BLACK);
            else
                graphics.setColor(Color.WHITE);

            int x = (i % 64);
            int y = (int)Math.floor(i / 64);

            graphics.fillRect(x * 10, y * 10, 10, 10);
        }
    }
}
