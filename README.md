# Puzzles-Islands

Find the number of islands in an m-by-n grid.

## Notes from leetcode lesson task video

This is probably the most-asked coding question of all-time.

We are given a grid of m rows and n columns.

Return the number of existing islands.

If the numbers are zero, then that means they are representing water.

If the numbers are one, then that means they are representing land.

This is considered a graph problem.

The one's can be considered vertices.

The edges are the connecting one's right beside them.

The general graph terminology for this is that we have connected components.

To solve, iterate over every single value.

When we hit a '1', then do a depth-first search (DFS), and all the possible value of that island.

This is the condition to increment the island count.

## Self-realization

The abstract thinking to see a grid as a graph problem did not immediately occur to me.

As well, in the past, I limited my thinking that DFS only applies to tree graphs.

Since I was not thinking DFS, then I was not considering recursion, either.

So, in this instance, "depth-first-search" is more like "full-coverage" of an island's area.

Here is the sample grid provided with the lesson task description.

```
 1 1 0 0 0
 1 1 0 0 0
 0 0 1 0 0
 0 0 0 1 1
```

The solution is expected to report a result of 3 islands counted.
