//Program to demonstrate abstraction
package abstraction;

public class rectangle{
	private float width, height;

	public rectangle() {
		this.width = 5.0f;
		this.height = 2.0f;
	}

	public rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}

	@SuppressWarnings("unused")
	void calArea() {
		float area = width*height;		
	}
	

}


