import java.awt.Color;
/**.
* This program uses OOP, the main class is the
* entry point of the program, meaning it creates
* the balloons and a spike, and moves them, and changes
* the properties of the ballon
*
* @author Aaron Rivelino Vargas Kononenko
* @version 1.0
* @since   2025-11-25
*/
class Main {
    public static void main(final String[] args) {

        // Create balloons objects with their starting positions, and colors
        Balloon balloonA = new Balloon(75, 49, Color.BLUE, 1);
        Balloon balloonB = new Balloon(30, 110, Color.PINK, 2);

        // print the initial positions before moving the balloons
        System.out.println("Before moving:");
        System.out.println("Balloon A position: (" + balloonA.xPosition + ", "
        + balloonA.yPosition + ")");
        System.out.println("Balloon B position: (" + balloonB.xPosition + ", "
        + balloonB.yPosition + ")");
        System.out.println();

        // Move one ballon
        balloonA.moveBalloon(20, 89);

        // Move the second balloon
        balloonB.moveBalloon(21, -30);

        // Print the positions of both balloons after they moved
        System.out.println("After moving:");
        System.out.println("Balloon A position: (" + balloonA.xPosition + ", "
        + balloonA.yPosition + ")");
        System.out.println("Balloon B position: (" + balloonB.xPosition + ", "
        + balloonB.yPosition + ")");
        System.out.println();

        // print the balloon color before and after changing it
        System.out.println("Balloon A color before: " + balloonA.color);
        balloonA.changeColor(Color.GREEN);
        System.out.println("Balloon A color after: " + balloonA.color);
        System.out.println();

        // create a spike starting at position 0
        Spike spike = new Spike(0);
        System.out.println("Spike initial position: " + spike.xPosition);

        // Move spike toward balloon A
        spike.moveSpikeHorizontally(75 + 20);
        System.out.println("Spike new position: " + spike.xPosition);

        // Bring balloon A to ground so collision happens
        balloonA.yPosition = 0;

        // Try to pop the balloon with the spike
        spike.popBalloon(balloonA);
    }
}
