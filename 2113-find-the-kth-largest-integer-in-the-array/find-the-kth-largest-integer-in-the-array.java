
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        String[] temp = new String[nums.length];
///chat gpt 
        mergeSort(nums, temp, 0, nums.length - 1);

        return nums[nums.length - k];
    }

    void mergeSort(String[] nums, String[] temp, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(nums, temp, left, mid);
        mergeSort(nums, temp, mid + 1, right);

        merge(nums, temp, left, mid, right);
    }

    void merge(String[] nums, String[] temp,
               int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int p = left;

        while (i <= mid && j <= right) {
            if (great(nums[i], nums[j])) {
                temp[p++] = nums[j++];
            } else {
                temp[p++] = nums[i++];
            }
        }

        while (i <= mid) {
            temp[p++] = nums[i++];
        }

        while (j <= right) {
            temp[p++] = nums[j++];
        }

        for (int x = left; x <= right; x++) {
            nums[x] = temp[x];
        }
    }

    boolean great(String a, String b) {
        if (a.length() != b.length()) {
            return a.length() > b.length();
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) > b.charAt(i);
            }
        }

        return false;
    }
}
