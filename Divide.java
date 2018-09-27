class Divide {

    public static void main (String[] args) {
        if (args.length < 2) {
            return;
        }
        int a,b,intResult;
        double doubleResult;
        a = Integer.parseInt( args[0] );
        b = Integer.parseInt( args[1] );
        intResult = a/b; // a, b are integer, so a/b is int. division
        System.out.println( "a/b = " + intResult );
        doubleResult = a/b; // also an integer division, but converted to double
        System.out.println( "(double) (a/b) = " + doubleResult );
        doubleResult = ((double) a) / b; // we first convert a to a double, so this is a double division
        System.out.println( "((double) a) / b = " + doubleResult );
        intResult = (int) doubleResult; // here the result of the double division is converted to int, which rounds down
        System.out.println( "(int) ((double a)/b = " + intResult );
    }

}