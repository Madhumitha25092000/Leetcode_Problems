class Solution {
    int accounts[][]={{1,2,3},{4,5,6}};
    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> arrlist=new ArrayList<>();
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            arrlist.add(sum);
        }
        Collections.sort(arrlist);
        int a=(arrlist.get(arrlist.size()-1));
        return a;    
    }
}  