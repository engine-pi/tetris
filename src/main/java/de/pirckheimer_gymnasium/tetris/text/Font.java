package de.pirckheimer_gymnasium.tetris.text;

import static de.pirckheimer_gymnasium.tetris.Tetris.COLOR_SCHEME_GREEN;

import de.pirckheimer_gymnasium.engine_pi.actor.ImageFont;
import de.pirckheimer_gymnasium.engine_pi.actor.ImageFontCaseSensitivity;

public class Font
{
    private static ImageFont imageFont;

    public static ImageFont getImageFont()
    {
        if (imageFont == null)
        {
            imageFont = new ImageFont("glyphs")
                    .setCaseSensitivity(ImageFontCaseSensitivity.TO_UPPER)
                    .setColor(COLOR_SCHEME_GREEN.getBlack());
        }
        return imageFont;
    }
}