package Annotation;

@interface Cricket{
	//here @ we added so it's not an ointerface but it's an annotaton
	String country() default "India";
	int runs() default 20000;
}

@Cricket
class ViratKohli{
	private int innings;
	private String name;
	public int getInnings() {
		return innings;
	}
	public void setInnings(int innings) {
		this.innings = innings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Annotation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ViratKohli vk = new ViratKohli();
		vk.setInnings(300);
		vk.setName("VK");
		System.out.println(vk.getInnings());
		System.out.println(vk.getName());
		
	}

}
