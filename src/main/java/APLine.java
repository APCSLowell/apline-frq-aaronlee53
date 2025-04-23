public class APLine
{
 private int a, b, c;
 public APLine (int numa, int numb, int numc){
   a = numa;
   b = numb;
   c = numc;
 }

  public double getSlope(){
    return -1 * (numa/numb);
  }

  public double isOnLine(int x, int y){
    if (numa * x + numb * y + numc == 0){
      return true;
    }
    return false;
  }
}
