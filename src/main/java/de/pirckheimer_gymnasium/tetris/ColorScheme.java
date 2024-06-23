/*
 * Copyright (c) 2024 Josef Friedrich and contributors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package de.pirckheimer_gymnasium.tetris;

import java.awt.Color;

import de.pirckheimer_gymnasium.engine_pi.util.ColorUtil;

/**
 * Das klassische Gameboy-Spiel hat ein Farbschema, das aus nur vier Farben
 * besteht.
 *
 * Wir verwenden als Farbnamen <em>weiß</em> ({@code white}), <em>hell</em>
 * ({@code light}), <em>dunkel</em> ({@code dark}) und <em>schwarz</em>
 * ({@code black}).
 */
public class ColorScheme
{
    private Color[] colors;

    public ColorScheme(Color white, Color light, Color dark, Color black)
    {
        colors = new Color[4];
        colors[0] = white;
        colors[1] = light;
        colors[2] = dark;
        colors[3] = black;
    }

    public ColorScheme(String white, String light, String dark, String black)
    {
        this(ColorUtil.decode(white), ColorUtil.decode(light),
                ColorUtil.decode(dark), ColorUtil.decode(black));
    }

    public Color[] getColors()
    {
        return colors;
    }

    public Color getWhite()
    {
        return colors[0];
    }

    public Color getLight()
    {
        return colors[1];
    }

    public Color getDark()
    {
        return colors[2];
    }

    public Color getBlack()
    {
        return colors[3];
    }
}
