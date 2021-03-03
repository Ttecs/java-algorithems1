package nondupparrayapp;

public class NoDupArray {
	private long[] a;//ref to array a
	 private int nEliments;//number of data items
	 public NoDupArray(int max) {//constructor
	  this.a=new long[max];
	  this.nEliments=0;
	 }
	 public boolean find(long SearchKey) {//find specified value
		 boolean T = false;
		 for(int i=0;i<nEliments;i++) {
			 if(this.a[i]==SearchKey) {
				 T=true;
			 }
			 
		 }
		 return T;
		 
	 }// end find()
	 public void insert(long value) {//put element into array
	 if(find(value)==true) {
		 System.out.println("vlue already inserted");
	 }
	 else {
		 this.a[nEliments]=value;
		 nEliments++;
	 }
	 }//end insert()
	 public boolean delete(long value) {//delete the element if it found
		 boolean Y=false;
	 if(find(value)==true) {
		 nEliments--;
		 for(int i=0;i<=nEliments;i++) {
			 if(value==this.a[i]) {
				 for(int j=i;j< nEliments;j++) {
					 this.a[j]=this.a[j+1];
					
				 }
			 }
			 
		 }
		 Y=true;
	 }
	 else {
		 System.out.println("no such value");
	 }
	 return Y;
	 
	 }//end delete()
	 public void display() {//display array contents
	 for(int i=0;i<nEliments;i++) {
		 System.out.print(this.a[i]+" ");
	 }
	 } //end display() 
	

}

class NoDupArrayApp {
	 public static void main(String[] args) {
		 NoDupArray A=new  NoDupArray(6);
		 A.insert(5);
		 A.insert(6);
		 A.insert(4);
		 A.insert(3);
		 A.insert(8);
		A.delete(9);
		 A.display();
		
		 
	 } //end main()
	}