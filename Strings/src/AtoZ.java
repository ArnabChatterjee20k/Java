class AtoZ{
    public static void main(String[] args) {
        // use a string builder for optimisation
        char initialChar = 'a';
        String series = "";
        for (int i = 0; i < 26; i++) {
            char cur_character = (char)(initialChar+i);
            // System.out.println(cur_character);
            series+=cur_character; // adding each time leading to creation of new string object leading to performance issue
        }
        System.out.println(series);
    }
}