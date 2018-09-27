class ManyTimes {

    public static void main (String[] args) {
        if ( args.length == 0 ) {
            System.out.println("Please give an argument in the command line upon running.");
        } else {
            String newLine = System.getProperty("line.separator");
            int[] INTEGER_ARRAY = {3,9,10};
            String s = args[0];
            for(int i = 0; i < INTEGER_ARRAY.length; ++i) {
                for(int j = 0; j < INTEGER_ARRAY[i]; ++j) {
                    System.out.print(s + " ");
                }
                System.out.print(newLine);
            }
        }
    }

}