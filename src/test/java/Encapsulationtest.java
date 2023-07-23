
public class Encapsulationtest {

	
	private String name;
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String newname) {
		
		this.name= newname;
	}
	
	public static void main(String[] args) {
		Encapsulationtest ob=new Encapsulationtest();
		ob.setName("Rafi");
		System.out.println(ob.getName());
	}
	
}
