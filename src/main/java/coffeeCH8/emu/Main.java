package coffeeCH8.emu;

import coffeeCH8.chip.Chip;

public class Main {
    public static void main(String[] args) {
        Chip chip8 = new Chip();
        chip8.init();
        chip8.run();
        ChipFrame frame = new ChipFrame(chip8);
    }
}
