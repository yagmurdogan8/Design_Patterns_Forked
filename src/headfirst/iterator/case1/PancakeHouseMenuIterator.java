package headfirst.iterator.case1;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
	List<MenuItem> items;
	int position = 0;
 
	public PancakeHouseMenuIterator(List<MenuItem> items) {
		this.items = items;
	}
 
	public MenuItem next() {
		MenuItem object = items.get(position);
		position = position + 1;
		return object;
	}
 
	public boolean hasNext() {
		return position < items.size();
	}
}
