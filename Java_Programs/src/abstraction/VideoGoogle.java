package abstraction;

public class VideoGoogle extends Google {
	public void search() {
		System.out.println("World Map video searching");
	}

	public static void main(String[] args) {
		
		VideoGoogle obj = new VideoGoogle();
		obj.search();
		ImageGoogle obj1 = new ImageGoogle();
		obj1.search();
	}

}
