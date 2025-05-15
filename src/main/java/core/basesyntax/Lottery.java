package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();

    public Ball getRandomBall() {
        Colours[] colors = Colours.values();
        Colours randomColor = colors[random.nextInt(colors.length)];
        int randomNumber = random.nextInt(101);

        return new Ball(randomColor.name(), randomNumber);

    }
}

