class Solution {
    boolean[][] visited;
    int[] directionY = {1, -1, 0, 0};
    int[] directionX = {0, 0, 1, -1};
    int height;
    int width;

    public int islandPerimeter(int[][] grid) {
        height = grid.length;
        width = grid[0].length;
        visited = new boolean[height][width];

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                if(grid[i][j] == 1) {
                    return calculatePerimeter(i, j, grid);
                }
            }
        }

        return -1;
    }

    private int calculatePerimeter(int posY, int posX, int[][] gridTmp) {
        Deque<Node> dq = new ArrayDeque();
        dq.add(new Node(posY, posX));
        visited[posY][posX] = true;
        int count = 0;

        while(!dq.isEmpty()) {
            Node currentNode = dq.remove();

            System.out.println("Y: " + currentNode.y + ", X: " + currentNode.x + ", Count: " + count);

            for(int i = 0; i < 4; i++){
                int destinationY = currentNode.y + directionY[i];
                int destinationX = currentNode.x + directionX[i];

                if(destinationY >= 0 && destinationY < height && destinationX >= 0 && destinationX < width) {
                    if(gridTmp[destinationY][destinationX] == 0) {
                        count++;
                    } else if(!visited[destinationY][destinationX]) {
                        dq.add(new Node(destinationY, destinationX));
                        visited[destinationY][destinationX] = true;
                    }
                } else {
                    count++;
                }
            }
        }

        return count;
    }

    private class Node {
        int y;
        int x;

        public Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}