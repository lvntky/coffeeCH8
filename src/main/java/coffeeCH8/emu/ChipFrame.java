package coffeeCH8.emu;

import coffeeCH8.chip.Chip;

import javax.swing.*;
import java.awt.*;

public class ChipFrame extends JFrame {
    private ChipPanel panel;

    public ChipFrame(Chip chip) {
        setPreferredSize(new Dimension(640, 320));
        pack();
        setPreferredSize(new Dimension(640 + getInsets().left + getInsets().right, 320 + getInsets().top + getInsets().bottom));
        panel = new ChipPanel(chip);
        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("CoffeeCH8");
        pack();
        setVisible(true);
    }
}
