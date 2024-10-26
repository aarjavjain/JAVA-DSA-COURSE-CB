public int maxProfit(int[] prices) {
    int min = Integer.MAX_VALUE;
    int max= 0;
    for (int i=0;i<prices.length;i++){
        for (int j=i+1;j<prices.length;j++){
        max =prices[i]-prices[j];
        min = Math.max(max,min);
        }
    }
    
    

return max;
}
}