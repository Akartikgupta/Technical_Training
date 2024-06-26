public class RabinKarpAlgo {
    public static void main(String[] args) {
        String text = "abcabdabcabe";
        String pattern = "abc";
        int textHash = 0;
        int patternHash = 0;
        int primeRange = 101;
        // compute the hash for pattern and first 3 character of text, bcz
        // pattern length is 3
        for (int i = 0; i < pattern.length(); i++) {
            int ascii = pattern.charAt(i);
            patternHash = patternHash + ascii;
            textHash = textHash + text.charAt(i);
        }
        // slide the pattern on text
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            // if text hash is same as pattern hash
            if (textHash == patternHash) {
                // now compare the values char by char
                if (text.substring(i, i + pattern.length()).equals(pattern)) {
                    System.out.println("FOund " + i);
                }
            }
            // now compute the next Hash
            if (i < text.length() - pattern.length()) {
                textHash = textHash - text.charAt(i) + text.charAt(i + pattern.length());
            }
        }
    }
}
