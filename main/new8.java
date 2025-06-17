public class BadStudentApp {

    public static String n;
    public static int a;
    public static String c;
    public static int m1, m2, m3;

    public static void main(String args[]) {
        n = "JOHN";
        a = 20;
        c = "CS";
        m1 = 45;
        m2 = 67;
        m3 = 100;

        BadStudentApp b = new BadStudentApp();
        b.doAllThings();

        b = null;
    }

    public void doAllThings() {
        if (a > 18) {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not Eligible");
        }
        
        if (m1<35 || m2<35 || m3<35){
            System.out.println("Fail");
        }else{
            System.out.println("pass");
        }

        int avg = (m1 + m2 + m3) / 3;

        if (avg > 90) System.out.println("Grade A+");
        else if (avg > 75) System.out.println("Grade A");
        else if (avg > 60) System.out.println("Grade B");
        else System.out.println("Grade C");

        System.out.println("Name: " + n);
        System.out.println("Age: " + a);
        System.out.println("Course: " + c);
    }
}
