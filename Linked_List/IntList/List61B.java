public interface List61B<Item> {
	/** Adds a new item to the front of this list. */
	public void addFirst(Item x);

		/** Adds a new item to the last of this list. */
	public void addLast(Item x);

	/** Returns the first item in this list. */
	public Item getFirst();

	/** Returns the last item in this list. */
	public Item getLast();

    /** Remove the last item in this list. */
	public void removeLast();

	/** Returns the size of this list. */
	public int size();
}