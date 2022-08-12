package coffeeCH8.chip;

public class Chip {
    private char[] memory;
    private char[] V;
    private char I;
    private char PC;

    private char[] stack;
    private int SP;

    private int soundTimer;
    private int delayTimer;

    private byte[] keys;
    private byte[] screenResolution;

    public Chip() {
        memory = new char[4096]; // 4kB;
        V = new char[16];
        I = 0x0;
        PC =  0x200;

        stack = new char[16];
        SP =  0;

        soundTimer = 0;
        delayTimer = 0;

        keys = new byte[16];
        screenResolution = new byte[64 * 32];
    }

    public void run() {
        // fetch
        memory[512] = 3;
        char opcode = (char)((memory[PC] << 8) | memory[PC + 1]);

        System.out.println(Integer.toHexString(opcode));
        // decode
        // execute

    }
}
