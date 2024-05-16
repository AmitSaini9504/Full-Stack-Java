import java.util.regex.Pattern;

public class RegularExp2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s","as")); //true 2nd char is s
        System.out.println(Pattern.matches(".s","mk")); //false 2nd char is not s
        System.out.println(Pattern.matches(".s","mst")); //has more than two char
        System.out.println(Pattern.matches("..s","mas")); //true


    }
}
