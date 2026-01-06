class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines=1;
        int currentWidth=0;
        for(int i=0;i<s.length();i++){
            int w=widths[s.charAt(i)-'a'];
            if(currentWidth+w>100){
                lines++;
                currentWidth=w;
            }else{
                currentWidth+=w;
            }
        }
        return new int[]{lines,currentWidth};
        
    }
}
