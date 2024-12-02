
public class MovingName {

    public static void main(String[] args) {
        String name = "Prajwal";

        // Set the background color to white and text color to black using ANSI escape
        // codes
        System.out.print("\033[47m\033[30m"); // 47 is white background, 30 is black text

        // Loop to move the name across the screen
        for (int i = 0; i < 50; i++) {
            // Clear the screen by printing empty lines
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Print the name with spaces for movement effect
            System.out.println(" ".repeat(i) + name);

            try {
                // Pause for a short time (100 ms)
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Reset the color to default at the end
        System.out.print("\033[0m");
    }
}
