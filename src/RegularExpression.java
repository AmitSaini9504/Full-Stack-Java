import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Grras", Pattern.CASE_INSENSITIVE);


        Matcher matcher= pattern.matcher("Visit Grras Jaipur");
        boolean matchfound = matcher.find();
        if (matchfound)
        {
            System.out.println("Matcher found");
        }
        else {
            System.out.println("Match not found");
        }

}}
