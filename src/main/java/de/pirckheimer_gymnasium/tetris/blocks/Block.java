package de.pirckheimer_gymnasium.tetris.blocks;

import rocks.friedrich.engine_omega.Scene;
import de.pirckheimer_gymnasium.tetris.Image;

public class Block
{
    private Image image;

    private Scene scene;

    public Block(Scene scene, String blockName, int x, int y)
    {
        this.scene = scene;
        image = new Image("blocks/" + blockName + ".png");
        image.setPosition(x, y);
        scene.add(image);
    }

    public void moveLeft()
    {
        image.moveBy(-1, 0);
    }

    public void moveRight()
    {
        image.moveBy(1, 0);
    }

    public void moveDown()
    {
        image.moveBy(0, -1);
    }

    public void remove()
    {
        scene.remove(image);
    }

    public void moveBy(int x, int y)
    {
        image.moveBy(x, y);
    }
}