package Class14;

public class Task4p2 {

    public static void main(String[] args) {

        String input = "This is a sample sentence";
        StringBuilder builder = new StringBuilder();
        String[] words = input.split(" ");
        for (String word : words) {
            builder.append(word + " ");
        }
        builder.reverse();
        String output = builder.toString();
        System.out.println(output);




    }
}
