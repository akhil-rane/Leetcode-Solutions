class Solution {
	public int coinChange(int[] coins, int amount) {

		if(amount==0) return 0;

		Set<Integer> coinSet = new HashSet<>();

		for (int i = 0; i < coins.length; i++) coinSet.add(coins[i]);

		int[] amountArray = new int[amount+1];

		Arrays.fill(amountArray, -1);

		int min,temp;

		for (int i = 1; i <= amount; i++) {

			if(coinSet.contains(i)) {
				amountArray[i] = 1;
				continue;
			}

			min = Integer.MAX_VALUE;
			
			for (int j = coins.length-1; j >=0; j--) {

				if(i-coins[j]>0&&amountArray[i-coins[j]]!=-1) {
					temp = amountArray[i-coins[j]]+ 1;
					if(temp<min) min = temp;
				}
				
			}
			
			if(min < Integer.MAX_VALUE ) amountArray[i] = min;
			else amountArray[i]=-1;

		}
		return amountArray[amount];
	}
}
