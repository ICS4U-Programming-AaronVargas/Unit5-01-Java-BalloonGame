import java.awt.Color;

/**.
 * The Ballon class represent a ballon object in the program
 * Each ballon has a position, a color and an ID, and also a state
 * The balloons can also move, change of color and
 * can also be popped by a spike
 */
public class Balloon {
    /** The horizontal position of the balloon. */
    private int xPosition;

    /** The vertical position of the balloon. */
    private int yPosition;

    /** The current color of the balloon. */
    private Color color;

    /** Whether the balloon has been popped. */
    private boolean isPopped;

    /** Identifies which balloon this is. */
    private int id;


    /**.
     * It creates a balloon with an initial position
     * color, and id, and it's state'
     * @param xPos the starting x position
     * @param yPos the starting y position
     * @param startColor the starting color
     * @param balloonId the ID number of the balloon
     */
    public Balloon(
        final int xPos,
        final int yPos,
        final Color startColor,
        final int balloonId
    ) {
        this.xPosition = xPos;
        this.yPosition = yPos;
        this.color = startColor;
        this.id = balloonId;
        this.isPopped = false;
    }
    /**.
     * Moves the location of the ballon
     * by adding values to its x and y positions
     * @param ySpaces the horizontal movement
     * @param xSpaces the vertical movement
     */
    public void moveBalloon(final int xSpaces, final int ySpaces) {
        this.xPosition += xSpaces;
        this.yPosition += ySpaces;
    }

    /**.
     * change the ballon color by setting it to the color if what
     * they are wanting it to change
     * @param newColor the new color for the balloon
     */
    public void changeColor(final Color newColor) {
        this.color = newColor;
    }

    /**.
     * Set the ballon as popped and print a message saying it
     * was popped, this happens when a spike touches the ballon
     */
    public void pop() {
        this.isPopped = true;
        System.out.println("Balloon " + id + " has been popped");
    }
}
