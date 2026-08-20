package ex0729.casting;

class CastingExam{
	public static void main(String []args){
		byte b1, b2, b3; 
		
		int i1=7;
		System.out.println("int i1="+i1);
		
		// int => byte casting
		b1=(byte) i1;	
		System.out.println("byte b1="+b1);

		b2=20;
		System.out.println("byte b2="+b2);
		
		// int => byte casting
	   	b3= (byte) (b2+b1);
		System.out.println("byte b3="+b3);
		
		long lo=56897L;
		System.out.println("long lo="+lo);

		// long => int casting
		int i4=(int) (lo+i1); 
		System.out.println("int i4="+i4);
		
		boolean boo;
		boo=true; 
		System.out.println("boolean boo="+boo);

		double d=4.67e-3;
		System.out.println("double d="+d);

		// long < float
		float f1=lo;
		System.out.println("float f1="+f1);
				
		// double => float casting
	    float f2=(float) d;
		System.out.println("float f2="+f2);

		char c1, c2, c3;
		
		c1='\u0167';
		System.out.println("char c1="+c1);

		// char => byte casting
		b2=(byte) c1; 
		System.out.println("byte b2="+b2);
		
		c2='A';
		System.out.println("char c2="+c2);
		
		// int => char casting
		c3=(char) (c2+2);
		System.out.println("char c3="+c3);
	}
}