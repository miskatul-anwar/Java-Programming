public class type {
    public static void main(String[] args) {
        double x = 4.3;
        double y = Math.sqrt(x);
        System.out.println(y);
        System.err.println(Math.log(2)); // ~ equivalent to ln(2)
        System.out.println(Math.E);
        // int nx = (int) x;

        long nx = Math.round(x);
        System.out.println(nx);
        String greeting = "Hello";
        String s = greeting.substring(0, 3);
        System.out.println(s);
        System.err.println(lastIndexof(s));
    }
}
