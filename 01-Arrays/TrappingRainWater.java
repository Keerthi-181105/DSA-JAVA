public class TrappingRainWater {

  public static int trap(int[] heights) {
    int left = 0,
      right = heights.length - 1,
      leftMax = 0,
      rightMax = 0,
      water = 0;
    while (left < right) {
      if (heights[left] <= heights[right]) {
        leftMax = Math.max(leftMax, heights[left]);
        water += leftMax - heights[left++];
      } else {
        rightMax = Math.max(rightMax, heights[right]);
        water += rightMax - heights[right--];
      }
    }
    return water;
  }

  public static void main(String[] args) {
    System.out.println(trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
  }
}
