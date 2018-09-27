class CharCountB {

    static final int LINE_WIDTH = 80;

    public static void main (String[] args) {
        if (args.length < 1) {
            return;
        }
        int length = args[0].length();
        int lines = ( (length - 1) / LINE_WIDTH) + 1;
        String characterOutput = ("has " + length + " character");
        String lineOutput = "needs " + lines + " line";
        if (length > 1) {
            characterOutput += "s";
        }
        if (lines > 1) {
            lineOutput += "s";
        }
        System.out.println(characterOutput);
        System.out.println(lineOutput);
    }

}