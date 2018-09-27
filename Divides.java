class Divides {

    public static void main (String[] args) {
        if (args.length < 2) {
            return;
        }
        int a,b;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        if (b % a == 0) {
            System.out.println(a + " divides " + b);
        } else {
            System.out.println(a + " does not divide " + b);
            System.out.print ("The closest multiple of " + a + " to " + b + " is ");
            if ( 2*(b % a) < a ) {
                System.out.println(b - b%a);
            } else {
                System.out.println(b - b%a + a);
            }
        }
    }

}