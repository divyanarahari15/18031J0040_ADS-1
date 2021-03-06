
import java.util.Scanner;

public final class Solution {
    
    private Solution() {
        //unused constructor.
    }
    
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        HashingWithLinearProbing<String, Integer> hashobj= new HashingWithLinearProbing<String, Integer>();
        int n = Integer.parseInt(sc.nextLine());
        while (n > 0) {
            String[] tokens = sc.nextLine().split(" ");
            switch (tokens[0]) {
            case "put" :
                hashobj.put(tokens[1], Integer.parseInt(tokens[2]));
                break;
            case "get" :
                System.out.println(hashobj.get(tokens[1]));
                break;
            case "display" :
                try {
                    System.out.println(hashobj.display());
                } catch (Exception ex) {
                    System.out.println("{}");
                }
                break;
            case "delete" :
                hashobj.delete(tokens[1]);
                break;
            default:
                break;
            }
            n--;
        }
    }
}
