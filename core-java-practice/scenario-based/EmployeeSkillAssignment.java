import java.util.ArrayList;

public class EmployeeSkillAssignment {

    public static void findTeams(int[] arr, int target,int index, ArrayList<Integer> team, int sum) {

        if (sum == target) {
            System.out.println(team);
            return;
        }

        if (index == arr.length || sum > target) {
            return;
        }

        team.add(arr[index]);
        findTeams(arr, target, index + 1, team, sum + arr[index]);

        team.remove(team.size() - 1);
        findTeams(arr, target, index + 1, team, sum);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7};
        int target = 10;

        findTeams(arr, target, 0, new ArrayList<>(), 0);
    }
}