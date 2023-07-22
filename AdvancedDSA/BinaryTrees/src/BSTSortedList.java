public class BSTSortedList extends BinarySearchTrees {
    public BSTSortedList(int[] nums) {
        populateSorted(nums,0,nums.length);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start == end)
            return;
        int mid = (start + end) / 2;
        this.insert(nums[mid]);
        populateSorted(nums, start, mid);// left
        populateSorted(nums, end, mid); // right
    }
}
