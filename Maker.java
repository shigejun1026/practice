public class Maker extends TangibleAsset{
	private String maker;
	public Maker(String name,int price,String color,String maker){
		super(name,price,color);
		this.maker=maker;
	}
	public String getMaker(){
		return this.maker;
	}
}

