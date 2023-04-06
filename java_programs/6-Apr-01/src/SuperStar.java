
public class SuperStar {
	private static SuperStar ss=new SuperStar();
	private String name="";
	private SuperStar()
	{
		
	}
	public static SuperStar getInstance()
	{
		return ss;
	}
	public static SuperStar getSs() {
		return ss;
	}
	public static void setSs(SuperStar ss) {
		SuperStar.ss = ss;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
