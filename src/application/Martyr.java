package application;

public class Martyr <T extends Comparable<T>> implements Listable<T>{
	public T[] mlist;
	public int count;
	public Martyr(int size) {
		count = 0;
		mlist = (T[]) new Comparable[size];
	}

	@Override
	public void add(Comparable data) {

		if (count >= mlist.length) {
			resize();
		}
		mlist[count] = (T) data;
		count++;



	}

	@Override
	public boolean delete(Comparable data) {
		if (data != null) {

			for (int i = 0; i < count; i++) {
				T fi = mlist[i];
				if (data.compareTo(fi) == 0) {
					for (int j = i+1 ; j< count ; j++ ){
						mlist [j-1] = mlist[j];
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
				T fi = mlist[i];
				if (data.compareTo(fi) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	public void resize(){

		T[] newList = (T[]) new Comparable[(mlist.length)*2];

		for (int i= 0 ; i < mlist.length ; i++){
			newList[i] = mlist[i];
		}
		mlist = newList;

	}
	public boolean isString(String str) {
   
        return !str.trim().isEmpty();
    }

    public  boolean isInteger(String str) {
    
        try {
            Integer.parseInt(str.trim());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public  boolean isChar(String str) {
        
        return str.trim().length() == 1;
    }

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmbpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void shaw() {
		// TODO Auto-generated method stub
		
	}


}
