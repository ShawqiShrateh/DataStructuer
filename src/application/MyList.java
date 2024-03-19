package application;
public class MyList<T extends Comparable<T>> implements Listable<T> {

	public T[] list;
	public int count;

	MyList(int size) {
		count = 0;
		list = (T[]) new Comparable[size];
	}

	@Override
	public void add(Comparable data) {

		if (count >= list.length) {
			resize();
		}
		list[count] = (T) data;
		count++;



	}

	@Override
	public boolean delete(Comparable data) {
		if (data != null) {

			for (int i = 0; i < count; i++) {
				T fi = list[i];
				if (data.compareTo(fi) == 0) {
					for (int j = i+1 ; j< count ; j++ ){
						list [j-1] = list[j];
					}
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean find(Comparable data) {
		if (data != null) {
			for (int i = 0; i < count; i++) {
				T fi = list[i];
				if (data.compareTo(fi) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void clear() {
		count = 0 ;
	}

	@Override
	public boolean isEmbpty() {
		return count == 0;
	}

	@Override
	public int size() {

		return count;
	}

	@Override
	public void shaw() {

		for (int i = 0; i < count; i++) {
			System.out.println(i + ": " + list[i]);

		}

	}
	public void resize(){

		T[] newList = (T[]) new Comparable[(list.length)*2];

		for (int i= 0 ; i < list.length ; i++){
			newList[i] = list[i];
		}
		
		list = newList;

	}

}