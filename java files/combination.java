import java.util.*;
public class combination {
    
    public static void main(String[] args) {
        public static List<List<Integer>> combine(int n,int k){
            List<List<Integer>> result=new ArrayList<>();
            find(result, new ArrayList<>(), 1, n, k);
            return result;
        }
    
        private static void find(List<List<Integer>>result,List<Integer>tempList,int start, int n,int k){
            if(tempList.size()==k){
                result.add(new ArrayList<>(tempList));
                return;
            }
            for(int i=start)
        }
    }
}
