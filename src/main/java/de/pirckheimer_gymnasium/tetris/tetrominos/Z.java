package de.pirckheimer_gymnasium.tetris.tetrominos;

import rocks.friedrich.engine_omega.Scene;

public class Z extends Tetromino
{
    public Z(Scene scene, BlockGrid grid, int x, int y, boolean debug)
    {
        super(scene, grid, x, y, debug);
        addBlock(0, "Z", x, y);
        addBlock(1, "Z", x - 1, y);
        addBlock(2, "Z", x, y - 1);
        addBlock(3, "Z", x + 1, y - 1);
    }

    protected void setRotation()
    {
        switch (rotation)
        {
        case 1:
        case 3:
            setBlockMotion(2, 0, 2);
            setBlockMotion(3, -2, 0);
            break;

        case 0:
        case 2:
            setBlockMotion(2, 0, -2);
            setBlockMotion(3, 2, 0);
            break;
        }
    }

    @Override
    protected Block[] getDownwardsBlocks()
    {
        return new Block[0];
    }
}
