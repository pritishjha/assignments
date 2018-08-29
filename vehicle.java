// two-wheeler & four-wheeler
abstract class vehicle
{
    abstract void start();
	void stop()
	{
	}
}
class two_wheeler extends vehicle
  {
    public void start()
  {
    System.out.println("two wheeler Start by kick/powerstart");
  }
  public void stop()
  {
    System.out.println("two wheeler Stops by switching off");
  }
  }
class four_wheeler extends vehicle
  {
    public void start()
  {
    System.out.println("four wheeler Start by push button");
  }
  public void stop()
  {
    System.out.println("four wheeler Stop by hand brake");
  }
  }

class mainclass {
  public static void main(String[] args) {
    vehicle a=new two_wheeler();
    a.start();
    a.stop();
    a=new four_wheeler();
    a.start();
    a.stop();    
  }
}
