class CharCountA {

    static final int LINE_WIDTH = 80;

    /*
    determine the number of characters in the given argument and the number number of lines it need on a terminal
    with LINE_WIDTH characters per line.
    */

    public static void main (String[] args) {
        if (args.length < 1) {
            return;
        }
        int length = args[0].length();
        int lines = ( (length - 1) / LINE_WIDTH) + 1;
        System.out.println("has " + length + " characters");
        System.out.println("needs " + lines + " lines");
    }

}

// For the above program, after compiling, run 'java CharCountA "my string has to be in quotation marks"'.