public class ArrayIntList {
    int [] data;
    int size;
    
    public ArrayIntList() {
	data = new int[20];
	size = 0;
    }
    
    public int size() {
	return this.size;
    }
    
    public void add(int n) {
	if(size >= 20) {
	    throw new IllegalStateException();
	} else{
	    this.data[size] = n;
	    size++;
	}
    }
    
    public int remove() {
	if(size == 0) {
	    throw new IllegalStateException();
	}
	size--;
	return this.data[size];
    }
    
    
}