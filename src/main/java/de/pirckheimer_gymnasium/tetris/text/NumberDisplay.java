package de.pirckheimer_gymnasium.tetris.text;

import de.pirckheimer_gymnasium.engine_pi.Scene;
import de.pirckheimer_gymnasium.tetris.Tetris;

public class NumberDisplay extends TextLine
{
    private int number;

    public NumberDisplay(Scene scene, int x, int y, int maxDigits)
    {
        super(scene, x, y, maxDigits);
        set(0);
    }

    public void write(int number)
    {
        super.write(String.valueOf(number),
                Tetris.COLOR_SCHEME_GREEN.getBlack(), TextAlignment.RIGHT);
    }

    public void set(int number)
    {
        this.number = number;
        write(number);
    }

    public int get()
    {
        assert number > -1;
        return number;
    }

    public void add(int number)
    {
        assert number > -1 : "Add only supports positiv values, got " + number;
        this.number += number;
        write(this.number);
    }
}
