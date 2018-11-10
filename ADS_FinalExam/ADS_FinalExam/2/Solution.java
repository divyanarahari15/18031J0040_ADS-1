

import java.util.Scanner;

class StudentDetails {
    
    private int rollnumber;
    
    String studentname;
    
    StudentDetails(final int rn, final String sn) 
    {
        this.rollnumber = rn;
        this.studentname = sn;
    }
    
    public int getRollNumber() 
    {
        return this.rollnumber;
    }
    
    public String getStudentName() 
    {
        return studentname;
    }

}

public final class Solution {
   public static void main(final String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        RedBlackBST<Double, StudentDetails> bstobj =new RedBlackBST<Double, StudentDetails>();
        for (int i = 0; i < n; i++) 
        {
            String[] tokens = sc.nextLine().split(",");
            bstobj.put(Double.parseDouble(tokens[2]),new StudentDetails(Integer.parseInt(tokens[0]), tokens[1]));
        }
        int m = Integer.parseInt(sc.nextLine());
        for (int j = 0; j < m; j++) 
        {
            String[] input = sc.nextLine().split(" ");
            if (input[0].equals("BE")) 
            {
                String[] s = bstobj.keys(Double.parseDouble(input[1]),Double.parseDouble(input[2])).toString().split(" ");
                for (int i = 0; i < s.length; i++) 
                {
                    System.out.println(bstobj.get(
                        Double.parseDouble(s[i])).studentname);
                }
            } 
            else if (input[0].equals("LE")) 
            {
                double min = bstobj.min();
                String[] s = bstobj.keys(min, Double.parseDouble(input[1])).toString().split(" ");
                for (int i = 0; i < s.length; i++) 
                {
                    System.out.println(bstobj.get(
                        Double.parseDouble(s[i])).studentname);
                }
            } else if (input[0].equals("GE")) 
            {
                double max = bstobj.max();
                String[] s = bstobj.keys(max, Double.parseDouble(input[1])).toString().split(" ");
                for (int i = 0; i < s.length; i++) 
                {
                    System.out.println(bstobj.get(
                        Double.parseDouble(s[i])).studentname);
                }

            }

        }
    }
}