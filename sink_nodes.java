import java.util.*;

public class sink_nodes {


    static int sink_nodes(int[][] arr) {
        int sink_nodes = 0;
        for(int i = 0; i < arr.length; i++){
            int cnt = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i][j] == 0){
                    cnt++;
                }
            }
            if(cnt == arr.length){
                System.out.println("Sink Nodes: " + (char)(65+i));
                sink_nodes++;
            }
        }
        return sink_nodes;
    }

    public static void main(String[] args) {

        int[][] arr = {{0, 1, 1, 0, 1}, {0, 0, 0, 1, 0}, {0, 0, 0, 0, 1}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        System.out.println(sink_nodes(arr));
    }

}
