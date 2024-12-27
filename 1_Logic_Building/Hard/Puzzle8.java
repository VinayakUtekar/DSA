import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Puzzle8 {
    public static int N = 3;
    public static class Node
    {
        Node parent;
        int mat[][] = new int[N][N];
        int x, y;
        int cost;
        int level;
    }
    public static void printMatrix(int mat[][]){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static Node newNode(int mat[][], int x, int y, 
                               int newX, int newY, int level, 
                               Node parent){
        Node node = new Node();
        node.parent = parent;
        node.mat = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                node.mat[i][j] = mat[i][j];
            }
        }
        int temp = node.mat[x][y];
        node.mat[x][y] = node.mat[newX][newY];
        node.mat[newX][newY]=temp;
        
        node.cost = Integer.MAX_VALUE;
        node.level = level;
        
        node.x = newX;
        node.y = newY;
        
        return node;
    }
    public static int row[] = { 1, 0, -1, 0 };
    public static int col[] = { 0, -1, 0, 1 };
    
    public static int calculateCost(int initialMat[][], int finalMat[][])
    {
        int count = 0;
        for (int i = 0; i < N; i++)
          for (int j = 0; j < N; j++)
            if (initialMat[i][j]!=0 && initialMat[i][j] != finalMat[i][j])
               count++;
        return count;
    }
     
    public static int isSafe(int x, int y)
    {
        return (x >= 0 && x < N && y >= 0 && y < N)?1:0;
    }
    
    public static void printPath(Node root){
        if(root == null){
            return;
        }
        printPath(root.parent);
        printMatrix(root.mat);
        System.out.println("");
    }
    
    public static class comp implements Comparator<Node>{
        @Override
        public int compare(Node lhs, Node rhs){
            return (lhs.cost + lhs.level) > (rhs.cost+rhs.level)?1:-1;
        }
    } 
    public static void solve(int initialMat[][], int x, 
                             int y, int finalMat[][])
    {
      
        PriorityQueue<Node> pq = new PriorityQueue<>(new comp());
        
        Node root = newNode(initialMat, x, y, x, y, 0, null);
        root.cost = calculateCost(initialMat,finalMat);
        
        pq.add(root);
        
        while(!pq.isEmpty())
        {
            Node min = pq.peek();
            pq.poll();
            
            if(min.cost == 0){
                printPath(min);
                return;
            }
            for (int i = 0; i < 4; i++)
            {
                if (isSafe(min.x + row[i], min.y + col[i])>0)
                {
                    Node child = newNode(min.mat, min.x, min.y, min.x + row[i],min.y + col[i], min.level + 1, min);
                    child.cost = calculateCost(child.mat, finalMat);
     
                    pq.add(child);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i[][] = new int[3][3];
        int f[][] = new int[3][3];
        for (int j = 0; j < 3; j++) {
            for (int j2 = 0; j2 < 3; j2++) {
                i[j][j2] = sc.nextInt();
            }
        }
        for (int j = 0; j < 3; j++) {
            for (int j2 = 0; j2 < 3; j2++) {
                f[j][j2] = sc.nextInt();
            }
        }
        int x=1, y=1;
        solve(i,x,y,f);
        sc.close();
    }
}
