public class Drob {
    private int x,y;
   public Drob(int x, int y) {
       this.x = x;
       if (y < 0 || y == 0)
           throw new IllegalArgumentException("Y не может быть отрицательным или равен 0");
       this.y = y;
   }
    public String toString(){
       return "Дробь="+x+"/"+y;
    }
    public int[] getDrob(){
       int[] drob = new int[2];
       drob[0] = x;
       drob[1] = y;
       return drob;
    }
}
