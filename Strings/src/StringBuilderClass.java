public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            str.append(ch);
        }
        System.out.println(str);
        System.out.println(str.toString());
        
        // methods
        str.append("hellow");
        System.out.println(str);
        
        System.out.println(str.capacity());

        System.out.println(str.length());

        System.out.println(str.charAt(1));
        System.out.println(str.indexOf("hello"));
        System.out.println(str.indexOf("hellow",4));
        
        str.delete(0,str.length());//end is exclusive
        System.out.println(str);
        
        str.insert(0, "hellow");
        System.out.println(str);

        System.out.println(str.reverse());
        System.out.println(str);

        str.trimToSize(); // it reduces the size
        System.out.println(str);
    }
}
