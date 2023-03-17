public class complexnumber{
	double real;
	double img;
	complexnumber(double r,double i){
		this.real=r;
		this.img=i;
	}
	complexnumber(){}
	complexnumber sum(complexnumber c1,complexnumber c2){
		complexnumber temp=new complexnumber();
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
	}
	public static void main(String args[]){
		complexnumber c1=new complexnumber(2.3,5.2);
		complexnumber c2=new complexnumber(3.2,3.5);
		complexnumber temp1=new complexnumber();
		temp1=temp1.sum(c1,c2);
		System.out.println("Sum is: "+temp1.real+"+i"+temp1.img);
	}
}
				
