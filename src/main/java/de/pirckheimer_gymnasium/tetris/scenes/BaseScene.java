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
package de.pirckheimer_gymnasium.tetris.scenes;

import de.pirckheimer_gymnasium.engine_pi.Game;
import de.pirckheimer_gymnasium.engine_pi.Scene;
import de.pirckheimer_gymnasium.engine_pi.actor.Image;
import de.pirckheimer_gymnasium.tetris.ImageLoader;

/**
 * Die Basisszene setzt ein Hintergrundbild an die Position (-2,0) und
 * fokussiert dieses Bild.
 *
 * @author Josef Friedrich
 */
public class BaseScene extends Scene
{
    static
    {
        Game.setPixelMultiplication(5);
    }

    /**
     * Das Hintergrundbild
     */
    protected Image background;

    public BaseScene(String imageFilename)
    {
        if (imageFilename != null)
        {
            background = ImageLoader
                    .get("images/fullscreen/" + imageFilename + ".png");
            // Wir setzten alle Hintergrundbilder auf die Position (-2, 0),
            // damit
            // im Hauptspiel die linke untere Ecke des Blockrasters an der
            // Position
            // (0,0) steht.
            // Dadurch stimmen die Engine-Pi-Koordination mit den Indexen im
            // zweidimensionen Block-Array überein.
            background.setPosition(-2, 0);
            add(background);
        }
        getCamera().setPostion(8, 9);
    }
}
