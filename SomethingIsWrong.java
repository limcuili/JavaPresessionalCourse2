class SomethingIsWrong {

    public static void main (String[] args) {
        if (args.length < 1) {
            return;
        }
        // convert args[0] to a boolean
        boolean input = Boolean.parseBoolean(args[0]);
        String result;
        if (input == true) {
            result = args[0] + " = true";
        } else {
            result = args[0] + " = false";
        }
        System.out.println(result);
    }

}