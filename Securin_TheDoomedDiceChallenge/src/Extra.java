import java.util.ArrayList;
import java.util.List;

public class Extra {
    /*This approach focuses on
     finding the combinations for
    the dice faces optimally instead
     of doing permutation logic.
     */
    static List<List<Integer>> diceB = new ArrayList<>();
    static int kk=0;
    static List<List<Integer>> diceA = new ArrayList<>();
    public static void main(String[] args) {
        find_diceB_possibility(3, new ArrayList<>());

        find_diceA_possibility(1, new ArrayList<>());
        System.out.println(diceA);   System.out.println(diceB);
        List<Integer> lis=new ArrayList<>();
        lis.add(6);lis.add(5);lis.add(4);lis.add(1);lis.add(3);lis.add(2);
        System.out.println(diceB.contains(lis));
        System.out.println(kk);

    }
    public static void find_diceA_possibility(int number, List<Integer> temp) {
        if (number > 4) {
            return;
        }

        if (temp.size() == 6) {
            kk++;
            if (!diceA.contains(temp)) {
               // kk++;
            }
            diceA.add(new ArrayList<>(temp));
            return;
        }

        for (int i = number; i <= 5; i++) {
            List<Integer> newTemp = new ArrayList<>(temp);
            newTemp.add(i);
            find_diceA_possibility(i, newTemp);
        }
    }
    public static void find_diceB_possibility(int number, List<Integer> temp) {
        if (number > 8) {
            return;
        }

        if (temp.size() > 6) {
            return;
        }

        if (temp.size() == 6) {
            if (!diceB.contains(temp)) {

            }
            diceB.add(new ArrayList<>(temp));
            return;
        }

        for (int i = number + 1; i <= 8; i++) {
            List<Integer> newTemp = new ArrayList<>(temp);
            newTemp.add(i);
            find_diceB_possibility(i, newTemp);
        }
    }
}
