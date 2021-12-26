public class ReversArgs {
    public static void main(String[] args) {
//        args in run config: first 2 last.
        for( int i = args.length - 1 ; i >= 0 ; i--)
            System.out.println(args[i]);

    }
}
