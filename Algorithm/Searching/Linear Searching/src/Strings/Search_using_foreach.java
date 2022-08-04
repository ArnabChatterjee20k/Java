package Strings;

public class Search_using_foreach {
    public class searchingString {
        public static void main(String[] args) {
            String name = "Arnab";
            char target = 'a';
    
            System.out.println(search(name, target));
        }
    
        static boolean search(String str , char target){
            if(str.length()==0){
                return false;
            }
    
            for(char ch:str.toCharArray()){
                if(ch==target){
                    return true;
                }
            }
    
            return false;
    
        }
}

}
