class CharacterMultiplication {
    public static void main(String[] args) {
      // integer value of the charactes from 0 to 9 is 48,49 ....,57.
      // No character value for '10' as it is of double digit and character must be of length 1
      // '2'-'0' = 50-48 = 2 which give actual value of char form of int.
      // useful during string multiplication without any function
      char[] arr = {'1','2','3','4'};
      char a = '2';
      int i = 0;
      
      while(i<arr.length){
        System.out.println((int)a +" "+ (a-'0')*(arr[i]-'0'));
        i++;
      }
    }
  }