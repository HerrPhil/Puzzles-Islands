import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;
import java.math.BigInteger;

public class Islands {

    public static void main(String [] args) {
        System.out.printf("Hello Number of Islands Solution%n");
        if (args != null && args.length == 1 && args[0].toLowerCase().equals("-usage")) {
            System.out.printf("java Islands%n");
            return;
        }

        int [][] input = new int [][] {
            { 1, 1, 0, 0, 0 },
            { 1, 1, 0, 0, 0 },
            { 0, 0, 1, 0, 0 },
            { 0, 0, 0, 1, 1 }
        };
        
        Islands islands = new Islands(input);

        int result = islands.solution();

        System.out.printf("the number of islands is %d%n", result);

        for (int i = 0; i < input.length; i++) {

            System.out.printf("%n%n");

            for (int j = 0; j < input[0].length; j++) {

                System.out.printf(" %d", input[i][j]);

            }

        }

        System.out.printf("%n");

    }

    private int [][] input;

    public Islands(int [][] input) {

        this.input = input;

    }

    public int solution() {

        // initialize the number of islands to be zero
        int result = 0;

        // get the dimension of the grid, for looping
        int m = input.length;
        int n = input[0].length;

        // for every row
        for (int i = 0; i < m; i++) {

            // for every column
            for (int j = 0; j < n; j++) {

                // check if this value starts an island
                if (input[i][j] == 1) {

                    result++;
                    // drill down with DFS
                    // to discover the rest of the island
                    dfs(i, j, m, n);

                }

            }

        }

        return result;

    }

    private void dfs(int i, int j, int m, int n) {

        // check all edge cases
        if ( i < 0 ) return;
        if ( i >= m ) return;
        if ( j < 0 ) return;
        if ( j >= n ) return;
        if ( input[i][j] <= 0 ) return;

        // otherwise position [i][j] is a one
        // mark as seen
        input[i][j] = -1;

        // begin depth-first-search to locate whole island
        dfs(i - 1, j, m, n); // look up one row
        dfs(i + 1, j, m, n); // look down one row
        dfs(i, j - 1, m, n); // look left one column
        dfs(i, j + 1, m, n); // look right one column

    }

}
