class ManyTimes {

    public static void main (String[] args) {
        if ( args.length == 0 ) {
            System.out.println("Please give an argument in the command line upon running.");
        } else {
            String newLine = System.getProperty("line.separator");
            String s = args[0];
            for(int i = 0; i < 3; ++i) {
                System.out.print(s + " ");
            }
            System.out.print(newLine);
            for(int i = 0; i < 9; ++i) {
                System.out.print(s + " ");
            }
            System.out.print(newLine);
            for(int i = 0; i < 10; ++i) {
                System.out.print(s + " ");
            }
            System.out.print(newLine);
        }
    }

}