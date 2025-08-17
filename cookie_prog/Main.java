package cookie_prog;   // Package name

import cookie_prog.Cookie;  // Importing the Cookie class from the same package

// Main class to test Cookie objects
public class Main {
    public static void main(String[] args) {
        // Create first Cookie object with color "Green"
        Cookie c1 = new Cookie("Green");

        // Create second Cookie object with color "Blue"
        Cookie c2 = new Cookie("Blue");

        // Print the colors of both cookies
        System.out.println(c1.getColor());  // Output: Green
        System.out.println(c2.getColor());  // Output: Blue

        // Change the color of the first cookie to "Yellow"
        c1.setColor("Yellow");

        // Print the updated colors
        System.out.println(c1.getColor());  // Output: Yellow
        System.out.println(c2.getColor());  // Output: Blue
    }
}
