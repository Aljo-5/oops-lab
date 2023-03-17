import java.util.*;
class sort{
public static void main(String args[]){
int a[]=new int[5];
int i,j,temp;
System.out.println("Enter Array Elements");
Scanner input=new Scanner(System.in);
for(i=0;i<5;i++)
{
a[i]=input.nextInt();
}
for(i=0;i<4;i++){
for(j=i+1;j<5;j++){
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("Sorted Array");
for(i=0;i<5;i++)
{
System.out.println(a[i]);
}
}
}
