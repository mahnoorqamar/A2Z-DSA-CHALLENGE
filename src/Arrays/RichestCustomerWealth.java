package Arrays;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++){
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++){
                sum += accounts[person][account]; // Corrected this line
            }

            if(sum > ans){
                ans = sum;
            }

        }
        return ans;
    }


}
