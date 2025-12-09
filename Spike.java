/**.
 * THe spike class, is for making an object that can move horizontally
 * and that cna pop balloons
 */
public class Spike {
    /** The horizontal x position of the spike. */
    private int xPosition;

    /** The fixed y position of spikes to ground level. */
    public static final int Y_POSITION = 0;

    /**.
     * constructor to create a spike starting at a specific x position
     * @param xPos the starting x position
     */
    public Spike(final int xPos) {
        this.xPosition = xPos;
    }
    /**.
     * moves the spike left or right by adding to its x position.
     * positive means right and negative left
     * @param spaces spaces amount of movement
     */
    public void moveSpikeHorizontally(final int spaces) {
        this.xPosition += spaces;
    }

    /**.
     * Attempts to pop the ballon
     * @param balloon the balloon the spike interacts with
     */
    public void popBalloon(final Balloon balloon) {
        // it checks if the ballon has not already been popped
        // or if the spike and the ballon are in the same x position
        // or if the ballon is at y = 0  meaning the ground
        if (!balloon.isPopped
            && balloon.xPosition == this.xPosition
            && balloon.yPosition == yPosition) {
            // if that is true pop the ballon
            balloon.pop();
        }
    }
}
