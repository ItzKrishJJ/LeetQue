import java.util.HashSet;

class Solution {
    public int numTilePossibilities(String tiles) {
        HashSet<String> set = new HashSet<>();
        boolean[] visited = new boolean[tiles.length()];
        backtrack(tiles, "", set, visited);
        return set.size();
    }

    private void backtrack(String tiles, String path, HashSet<String> set, boolean[] visited) {
        if (!path.isEmpty()) {
            set.add(path); // Add the generated sequence
        }
        for (int i = 0; i < tiles.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                backtrack(tiles, path + tiles.charAt(i), set, visited);
                visited[i] = false; // Backtrack step
            }
        }
    }
}
