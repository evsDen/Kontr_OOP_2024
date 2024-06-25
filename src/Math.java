public class Math {
    private int[] drob1 = new int[2];
    private int[] drob2 = new int[2];

    public Math(int[] Drob1, int[] Drob2) {
        this.drob1 = Drob1;
        this.drob2 = Drob2;
    }


    private int NOD(int y1, int y2) {
        if (y2 == 0) {
            return y1;
        }
        return NOD(y2, y1 % y2);
    }

    private int NOK(int y1, int y2) {
        return y1 / NOD(y1, y2) * y2;
    }

    public int[] drobSum() {
        int[] drob3 = new int[2];
        if (drob1[1] % drob2[1] == 0) {
            drob3[0] = drob1[0] + drob2[0] * (NOK(drob1[1], drob2[1])/drob2[1]);
            drob3[1] = drob1[1];
        } else if (drob2[1] % drob1[1] == 0) {
            drob3[0] = drob1[0] * (NOK(drob1[1], drob2[1])/drob1[1]) + drob2[0];
            drob3[1] = drob2[1];
        } else if (drob1[1] % drob2[1] != 0 && drob2[1] % drob1[1] != 0) {
            drob3[0] = drob1[0] * (NOK(drob1[1], drob2[1])/drob1[1]) + drob2[0] * (NOK(drob1[1], drob2[1])/drob2[1]);
            drob3[1] = NOK(drob1[1], drob2[1]);
        }
        //drob3[0] = drob3[0]/NOD(drob3[0], drob3[1]);
       // drob3[1] = drob3[1]/NOD(drob3[0], drob3[1]);
        return drob3;
    }
   public int [] drobSub() {
        int[] drob4 = new int[2];
        if (drob1[1] % drob2[1] == 0) {
            drob4[0] = drob1[0] - drob2[0] * (NOK(drob1[1], drob2[1])/drob2[1]);
            drob4[1] = drob1[1];
        } else if (drob2[1] % drob1[1] == 0) {
            drob4[0] = drob1[0] * (NOK(drob1[1], drob2[1])/drob1[1]) - drob2[0];
            drob4[1] = drob2[1];
        } else if (drob1[1] % drob2[1] != 0 && drob2[1] % drob1[1] != 0) {
            drob4[0] = drob1[0] * (NOK(drob1[1], drob2[1])/drob1[1]) - drob2[0] * (NOK(drob1[1], drob2[1])/drob2[1]);
            drob4[1] = NOK(drob1[1], drob2[1]);
        }
        return drob4;
    }
    public int[] drobMul() {
        int[] drob5 = new int[2];
        drob5[0] = drob1[0] * drob2[0];
        drob5[1] = drob1[1] * drob2[1];
        return drob5;
    }
    public int[] drobDiv() {
        int[] drob6 = new int[2];
        drob6[0] = drob1[0] * drob2[1];
        drob6[1] = drob1[1] * drob2[0];
        return drob6;
    }
}