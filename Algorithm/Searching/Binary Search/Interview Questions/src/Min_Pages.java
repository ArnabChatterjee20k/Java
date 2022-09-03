// https://www.geeksforgeeks.org/allocate-minimum-number-pages/
public class Min_Pages {
    public static void main(String[] args) {
        int[] books = {5,11,17,100};  //Number of pages in books
        int students = 2;  //No. of students

        System.out.println(search(books, students));
    }
    static int search(int[] books , int students){
        // int start = 0; // min pages
        int start = 0; // min pages
        int end = 0 ; // sum of all pages

        for(int pages:books){
            end += pages;
            start = Math.max(start,pages);
        }
        
        while(start<=end){
            int required_sum = start+(end-start)/2;
            int sum = 0;
            int student_allocated = 0;

            for(int pages:books){
                if(sum+pages>required_sum){
                    sum+=pages;
                    student_allocated++;
                }
                else{
                    sum+=pages;
                }

                if(student_allocated<=students){
                    // ### required_sum is large => decrease it
                    end = required_sum-1;
                }
                else{
                    // ### required_sum is less => increase it
                    start = required_sum+1;
                }
            }
        }
        return start;
    }
}
