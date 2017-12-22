class RandomizedSet {

	private List<Integer> set;
	private Date date;
	private Map<Integer,Integer> valueToIndex;
	private int size; 
	private Random rand;

	public RandomizedSet() {
		set = new ArrayList<>();
		valueToIndex = new HashMap<>();
		size = 0;
		rand = new Random();
	}

	/** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
	public boolean insert(int val) {
		if(valueToIndex.keySet().contains(val)&&valueToIndex.get(val)<size) return false;
		set.add(size,val);
		valueToIndex.put(val,size);
		size++;
		return true;
	}

	/** Removes a value from the set. Returns true if the set contained the specified element. */
	public boolean remove(int val) {

		if(!valueToIndex.keySet().contains(val)) return false;

		int indexOfElementTobeRemoved = valueToIndex.get(val);

		int temp = set.get(indexOfElementTobeRemoved);

		int elementTobeReplaced = set.get(size-1);

		set.set(indexOfElementTobeRemoved,elementTobeReplaced);

		size--;

		valueToIndex.put(elementTobeReplaced,indexOfElementTobeRemoved);

		valueToIndex.remove(val);

		return true;
	}

	/** Get a random element from the set. */
	public int getRandom() {

		if (size==0) return -1;

		return set.get(rand.nextInt(size));
	}
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
