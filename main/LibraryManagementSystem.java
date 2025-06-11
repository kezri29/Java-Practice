public class Example {
public static void main(String[] a){
doit();
}

public static void doit(){
int x=10;int y=20;int z=30;if(x<y){System.out.println("x is less than y");}for(int i=0;i<5;i++){System.out.println("i is "+i);}if(z>y){System.out.println("z is big");}else{System.out.println("y is big");}String n="This is a very long string which doesn't need to be here and makes no sense but it's still here just because";System.out.println(n);int res = x + y + z + 100 - 50 * 2;System.out.println("Result is: "+res);if(res>100){res=res/2;}System.out.println("Final Result: "+res);}}
