package O_C;

import O_C.Cookie;

public class Main {
    public static void main(String[] args) {
        Cookie c1 = new Cookie("Green");
        Cookie c2 = new Cookie("Blue");

        System.out.println(c1.getColor());
        System.out.println(c2.getColor());

        c1.setColor("Yellow");
        System.out.println(c1.getColor());
        System.out.println(c2.getColor());
    }
}
