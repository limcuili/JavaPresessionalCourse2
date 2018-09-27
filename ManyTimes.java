class ManyTimes {

    public static void main (String[] args) {
        if ( args.length == 0 ) {
            System.out.println("Please give an argument in the command line upon running.");
        } else {
            String newLine = System.getProperty("line.separator");
            String s = args[0];
            int[] integerArray = {3,9,10};
            for(int i = 0; i < integerArray.length; ++i) {
                for(int j = 0; j < integerArray[i]; ++j) {
                    System.out.print(s + " ");
                }
                System.out.print(newLine);
            }
        }
    }

}