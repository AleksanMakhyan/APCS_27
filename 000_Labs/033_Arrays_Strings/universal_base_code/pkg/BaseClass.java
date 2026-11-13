package pkg;

public class BaseClass {
    private String[] lyrics;

    public BaseClass() {
        lyrics = new String[10];

        lyrics[0] = "Maybe it's a little bit rushed, but I'm falling in love";
        lyrics[1] = "Hope that's not too much, but this isn't a crush";
        lyrics[2] = "I've done that enough, girl, I know that it's real";
        lyrics[3] = "It's like you fell down from Heaven (oh, no)";
        lyrics[4] = "Oh, I've been waiting forever (so long)";
        lyrics[5] = "And I know we can do this together (it's only you and me)";
        lyrics[6] = "How do you feel?";
        lyrics[7] = "Is it anything like I feel? (Yes or no?)";
        lyrics[8] = "Is it anything like I feel? (Let me know)";
        lyrics[9] = "Or should I chill?";
    }

    public void printLyrics() {
        for (int i = 0; i < lyrics.length; i++) {
            System.out.println(lyrics[i]);
        }
    }
}