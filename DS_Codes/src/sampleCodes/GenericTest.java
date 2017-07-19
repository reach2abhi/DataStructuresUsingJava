package sampleCodes;

public class GenericTest<E> implements Generic<E> {
	E value;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] newObj = new Integer[2];
		newObj[0]=10;
		newObj[1]=20;
		
		
		Generic<Integer[]> obj=new GenericTest<Integer[]>();
		//for(int i=0;i<2;i++)
		obj.get(newObj);
		//System.out.println(obj.put());
		
for (Integer a : newObj) {
	System.out.println(a);
}
		Generic<Double> obj1=new GenericTest<Double>();
		obj1.get(153.12);
		System.out.println(obj1.put());
		
		
	}

	
	public void get(E a) {
		// TODO Auto-generated method stub
		value=a;
	}

	
	public E put() {
		// TODO Auto-generated method stub
		return value;
	}
	

}
