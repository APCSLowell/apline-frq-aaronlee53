public class APLine
{
 private int a, b, c;
 public APLine (int numa, int numb, int numc){
   a = numa;
   b = numb;
   c = numc;
 }

  public double getSlope(){
    return -1 *  (double) a / (double) b;
  }

  public boolean isOnLine(int x, int y){
    return (a * x + b * y + c == 0);
  }
}
