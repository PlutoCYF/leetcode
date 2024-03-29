//给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。 
//
// 说明：你不能倾斜容器，且 n 的值至少为 2。 
//
// 
//
// 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。 
//
// 
//
// 示例: 
//
// 输入: [1,8,6,2,5,4,8,3,7]
//输出: 49 
// Related Topics 数组 双指针



//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int max=0;
        while (l<r){
            max=max(max,(r-l)* min(height[l],height[r]));
            if(height[l]<height[r]){
                l++;
            }
            else {
                r--;
            }
        }
        return max;
    }
    public int maxAreaSlow(int[] height) {
        int n=height.length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((j-i)*min(height[i],height[j])>max){
                    max=(j-i)*min(height[i],height[j]);
                }
            }
        }
        return max;
    }
    private  int min(int a,int b){
        if(a<b){
            return a;
        }
        else {
            return b;
        }
    }
    private  int max(int a,int b){
        if(a<b){
            return  b;
        }
        else {
            return a;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
