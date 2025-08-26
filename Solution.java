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