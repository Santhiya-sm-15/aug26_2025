# aug26_2025
The problem that i solved today in leetcode

You are given a 2D 0-indexed integer array dimensions.

For all indices i, 0 <= i < dimensions.length, dimensions[i][0] represents the length and dimensions[i][1] represents the width of the rectangle i.

Return the area of the rectangle having the longest diagonal. If there are multiple rectangles with the longest diagonal, return the area of the rectangle having the maximum area.

Code:
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max_area=0;
        double max_diagonal=0;
        for(int[] x:dimensions)
        {
            int l=x[0],w=x[1];
            double diagonal=Math.sqrt(l*l+w*w);
            int area=l*w;
            if(diagonal>max_diagonal)
            {
                max_diagonal=diagonal;
                max_area=area;
            }
            else if(diagonal==max_diagonal)
                max_area=Math.max(max_area,area);
        }
        return max_area;
    }
}
