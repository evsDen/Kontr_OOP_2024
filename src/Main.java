//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args) {
       Drob a = new Drob(1, 3);
       Drob b = new Drob(2, 3);
       System.out.println(a.toString());
       System.out.println(b.toString());
       int [] drob1 = a.getDrob();
       int [] drob2 = b.getDrob();
       Math math = new Math(drob1, drob2);
       int [] drob3 = new int[2];
       int [] drob4 = new int[2];
       int [] drob5 = new int[2];
       int [] drob6 = new int[2];
       drob3 = math.drobSum();
       drob4 = math.drobSub();
       drob5 = math.drobMul();
       drob6 = math.drobDiv();
       System.out.println(drob1[0] + "/" + drob1[1]+ " + " + drob2[0] + "/" + drob2[1] + " = "  + drob3[0] + "/" + drob3[1]);
       System.out.println(drob1[0] + "/" + drob1[1]+ " - " + drob2[0] + "/" + drob2[1] + " = "  + drob4[0] + "/" + drob4[1]);
       System.out.println(drob1[0] + "/" + drob1[1]+ " * " + drob2[0] + "/" + drob2[1] + " = "  + drob5[0] + "/" + drob5[1]);
       System.out.println(drob1[0] + "/" + drob1[1]+ " : " + drob2[0] + "/" + drob2[1] + " = "  + drob6[0] + "/" + drob6[1]);
   }

}