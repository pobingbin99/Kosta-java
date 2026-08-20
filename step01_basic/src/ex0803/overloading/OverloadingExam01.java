package ex0803.overloading;

class OverloadingExam01 {
     public void aa() {
    	 System.out.println(1);
     }
     
     public int aa(int i){
    	 System.out.println(2);
    	 return i;
     }
     
     protected String aa(String s){   
    	 System.out.println(3);
    	 return s;
     }

     String aa(int i, String s) {
    	 System.out.println(4);
    	 return i + s;
    }
     
     public static void main(String[] args) {
    	 OverloadingExam01 t = new OverloadingExam01();
    	 
    	 t.aa();
    	 t.aa(1);
    	 t.aa("hello");
    	 t.aa(1, "hello");
     }
 }
 