package tech.fastj.template;

import tech.fastj.engine.FastJEngine;
import tech.fastj.graphics.display.FastJCanvas;
import tech.fastj.graphics.display.RenderSettings;
import tech.fastj.graphics.game.Text2D;
import tech.fastj.math.Pointf;
import tech.fastj.systems.control.SimpleManager;

public class Game extends SimpleManager {

    @Override
    public void init(FastJCanvas canvas) {
        /* Some crispy anti-aliasing for the road. */
        canvas.modifyRenderSettings(RenderSettings.Antialiasing.Enable);

        /* A very simple Text2D object, welcoming you to FastJ! */
        Text2D helloFastJ = Text2D.fromText("Hello, FastJ 1.7.0-SNAPSHOT-1!");

        /* Translate our hello text to the center of the screen */
        Pointf center = canvas.getCanvasCenter();
        helloFastJ.setTranslation(center.subtract(helloFastJ.width() / 2f, helloFastJ.height() / 2f));

        /* Render hello fastj text */
        drawableManager().addGameObject(helloFastJ);
    }

    public static void main(String[] args) {
        FastJEngine.init("FastJ Java Template", new Game());
        FastJEngine.run();
    }
}
