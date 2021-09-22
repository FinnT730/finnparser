package cf.finnt730;

import java.util.ArrayList;
import java.util.Locale;
import java.util.stream.Stream;

public class Main {

    static String bytecode = "[+!+[]]+[+[]]".toLowerCase(Locale.ROOT);

    public static void main(String[] args) {
        System.out.println(bytecode);

        ArrayList<Token> tokens = new ArrayList<>();
        Parser parser = new Parser();
        ArrayList<Character> chars = new ArrayList<>();
        for (char c : bytecode.toCharArray()) {
            if(c == ' ') {
                continue;
            }
            chars.add(c);
        }
//        Stream.of(bytecode.toCharArray()).forEach(a -> {
////            ArrayList<Token> tokens = new ArrayList<>();
//            tokens.add(parser.returnToken(a))
//        });

        chars.forEach(a -> {
            tokens.add(parser.returnToken(a));
        });

        tokens.forEach(a -> {
            System.out.println(a);
        });

    }

}
