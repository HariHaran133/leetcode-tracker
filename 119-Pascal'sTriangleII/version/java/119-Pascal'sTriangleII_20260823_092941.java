// Last updated: 23/08/2026, 09:29:41
1import java.util.*;
2
3class Solution {
4    public List<Integer> getRow(int rowIndex) {
5        List<Integer> row = new ArrayList<>();
6
7        long num = 1;
8
9        for (int i = 0; i <= rowIndex; i++) {
10            row.add((int) num);
11
12            num = num * (rowIndex - i) / (i + 1);
13        }
14
15        return row;
16    }
17}
18