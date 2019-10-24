package de.mat2095.my_slither;

/**
 * Class that gives the X and Y co-ordinates for
 * the snake body part.
 *
 * Used in conjunction with the MySlitherCanvas class
 */
class SnakeBodyPart {

    double x, y;

    /**
     * Constructor. Creates instance
     * of SnakeBodyPart class when called.
     *
     * @param x the x co-ordinate of the body part
     * @param y the y co-ordinate of the body part
     */
    SnakeBodyPart(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
