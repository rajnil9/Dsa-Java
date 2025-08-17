package cookie_prog;  // Package name where this class belongs

// Class definition for Cookie
public class Cookie {
    // Private member variable to store the color of the cookie
    private String color;

    // Constructor: called when a new Cookie object is created
    // It sets the initial color of the cookie
    public Cookie(String c) {
        this.color = c;
    }

    // Getter method: returns the current color of the cookie
    public String getColor() {
        return color;
    }

    // Setter method: allows changing the color of the cookie
    public void setColor(String c) {
        this.color = c;
    }
}
