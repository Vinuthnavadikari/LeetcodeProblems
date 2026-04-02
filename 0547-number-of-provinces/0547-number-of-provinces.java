class Solution {

    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        int[] visited = new int[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (visited[i] == 0) {
                count++;
                dfs(i, isConnected, visited);
            }
        }

        return count;
    }

    private void dfs(int node, int[][] matrix, int[] visited) {
        visited[node] = 1;

        for (int j = 0; j < matrix.length; j++) {
            if (matrix[node][j] == 1 && visited[j] == 0) {
                dfs(j, matrix, visited);
            }
        }
    }
}