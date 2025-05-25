class Solution {
    public int[] sortArray(int[] nums) {
        int temp,j;
        for(int i=1;i<nums.length;i++){
            temp=nums[i];
            j=i;
                while(j>0 && nums[j-1]>temp){
                    nums[j]=nums[j-1];
                    j--;
                }
                nums[j]=temp;
            }
            return nums;
        }
    }