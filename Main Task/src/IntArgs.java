public class IntArgs {
    public static void main(String[] args) {
        // аргументы командной строки - 34, 6, 77, 44
        int sum = 0;
        int mult = 1;
        int[] args2 = new int[args.length];
        for( int i = 0 ; i < args.length ; i++) {
            args2[i] = Integer.parseInt(args[i]);
            sum = sum + args2[i];
            mult = mult * args2[i];
        }
        System.out.println("Сумма аргументов командной строки равна :" + sum);
        System.out.println("Произведение аргументов командной строки равно :" + mult);
    }
}
