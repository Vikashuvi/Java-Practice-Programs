import java.util.ArrayList;
import java.util.List;

public class kids {
    class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int g=candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>g){
                g=candies[i];
            }
        }

        List<Boolean> boo= new ArrayList<>();

        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=g){
                boo.add(true);
            }else{
                boo.add(false);
            }
        }

        
        return boo;
    }
}
}
