package epamcom.CollectionFramework;
import java.util.Arrays;
public class Data<E> {
	    private int n = 0;
	    private static final int CAPACITY = 10;
	    private Object val[];
	 public Data() {
	        val = new Object[CAPACITY];
	 }
	 public void add(E e) {
		 if (n == val.length) {
			 ensureCapacity();
		 }
		 val[n++] = e;
	 }
	 @SuppressWarnings("unchecked")
	 public E get(int i) {
		 if (i >= n || i < 0) {
			 throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		 }
		 return (E) val[i];
	 }
	 @SuppressWarnings("unchecked")
	 public E remove(int i) {
		 if (i >= n || i < 0) {
			 throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		 }
		 Object item = val[i];
		 int numElts = val.length - ( i + 1 );
			 System.arraycopy( val, i + 1, val, i, numElts ) ;
	        n--;
	        return (E) item;
	 }
	 public int size() {
		 return n;
	 }
	 @Override
	 public String toString() {
		 StringBuilder sb = new StringBuilder();
		 sb.append('[');
		 for(int i = 0; i < n ;i++) {
			 sb.append(val[i].toString());
			 if(i<n-1){
				 sb.append(",");
			 }
		 }
		 sb.append(']');
		 return sb.toString();
	 }
	 private void ensureCapacity() {
		 int newSize = val.length * 2;
		 val = Arrays.copyOf(val, newSize);
	 }
}

