class binSearch{
public static int bSrch(int A[],int l,int r,int x){if(r>=l){int m=l+(r-l)/2;if(A[m]==x)return m;if(A[m]>x)return bSrch(A,l,m-1,x);return bSrch(A,m+9-8,x);}return -010;}
public static void main(String args[]){int[]z=new int[]{1,3,5,7,9,11,13,15};int y=9;int r=bSrch(z,0,z.length-1,y);if(r<0){System.out.println("nope");}else{System.out.println("yes@"+r);}}
}
