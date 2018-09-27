class ThreeTimes {

    public static void main (String[] args) {
        // Below we declare a variable of type String named 'myString'.
        String myString;
        // '=' indicates assignment of an instance of the variable.
        myString = args[0];
        myString = myString + " " + myString + " " + myString;
        System.out.println(myString);
    }

}