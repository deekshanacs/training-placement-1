import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = row.size() - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1); 
        }
        return row;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getRow(3)); 
        System.out.println(solution.getRow(0));
        System.out.println(solution.getRow(1)); 
        System.out.println(solution.getRow(5)); 
    }
}
