package de.mat2095.my_slither;

/**
 * Class that models the food.
 *
 * When used in conjunction with MySlitherCanvas
 * it causes the food to be spawned and displayed.
 */

class Food {

    private final int color;
    final int x, y;
    private final double size;
    private final double rsp;
    private final long spawnTime;

    /**
     * Constructor. Creates an instance of the food class
     * when called.
     *
     * @param color the colour of the food
     * @param x the x co-ordinate of the food
     * @param y the y co-ordinate of the food
     * @param size the size of the food
     * @param fastSpawn whether the snake is moving fast or not, adjusts food spawn accordingly
     */

    Food(int color, int x, int y, double size, boolean fastSpawn) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.size = 4*size;
        this.rsp = fastSpawn ? 4 : 1;
        spawnTime = System.currentTimeMillis();
    }

    /**
     * Obtains the colour of the food
     * @return the colour of the food within MySlitherCanvas
     */

    int getColor() { return color; }

    /**
     * Obtains the size of the food
     * @return the size of the food within MySlitherCanvas
     */

    double getSize() {
        return size;
    }

    /**
     * Obtains the radius within which to spawn food.
     * If fillRate is greater than one, then it is standard size
     * Otherwise the radius is adjusted accordingly
     *
     * @return radius within MySlitherCanvas
     */

    double getRadius() {
        double fillRate = rsp * (System.currentTimeMillis() - spawnTime) / 1200;
        if (fillRate >= 1) {
            return size;
        } else {
            return (1 - Math.cos(Math.PI * fillRate)) / 2 * size;
        }
    }
}
