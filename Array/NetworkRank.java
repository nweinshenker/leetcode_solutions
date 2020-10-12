package Array;

public class NetworkRank {
    public int maximalNetworkRank(int n, int[][] roads) {
        if (roads.length == 0) return 0;
        boolean [][] networkMatrix = new boolean [n][n];
        int [] outDegree = new int [n];
        for (int i = 0; i < roads.length; i++) {
            outDegree[roads[i][0]]++;
            outDegree[roads[i][1]]++;
            // Mark if they share an edge
            networkMatrix[roads[i][0]][roads[i][1]] = true;
            networkMatrix[roads[i][1]][roads[i][0]] = true;
        }
        
        int maxNetwork = 0;
        for (int i = 0; i < outDegree.length; i++) {
            for (int j = i + 1; j < outDegree.length; j++) {
                maxNetwork = Math.max(outDegree[i] + outDegree[j] + (networkMatrix[i][j] ? -1 : 0), maxNetwork);
            }
        }


        return maxNetwork;
    } 
}
