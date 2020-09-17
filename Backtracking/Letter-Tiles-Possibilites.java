class Solution {
    int res=0;
    int count[] = new int[26];
    
    void dfs(){
        for(int i=0;i<26;i++){
            if(count[i]<1) continue;
            res++;
            count[i]--;
            dfs();
            count[i]++;
        }
    }
    
    public int numTilePossibilities(String tiles) {
        for(char ch : tiles.toCharArray()) count[ch-'A']++;
        dfs();
        return res;
    }
}