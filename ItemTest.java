package mystequex2;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Item{
	private int itemId;
	private String shortDescription;
	private int price;
	private String brand;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int itemId, String shortDescription, int price, String brand) {
		super();
		this.itemId = itemId;
		this.shortDescription = shortDescription;
		this.price = price;
		this.brand = brand;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String toString() {
		return itemId +" : "+ shortDescription+" : "+price+" : "+brand;
	}
	
}
public class ItemTest {
	public static void main(String[] args) {
		Item item1 = new Item(5, "Smart Phone", 25000, "OPPO");
		Item item3 = new Item(4, "Laptop with many features", 50000, "Thinkpad");
		Item item4 = new Item(1, "Smart radio", 5000, "Philips");
		Item item5 = new Item(2, "Automatic Fortuner", 3500000, "Toyota");
		Item item2 = new Item(3, "Fridge with extra cooling", 25000, "Thomson");

		ArrayList<Item> itemList = new ArrayList<Item>();
		itemList.add(item1);
		itemList.add(item2);
		itemList.add(item3);
		itemList.add(item4);
		itemList.add(item5);
		
		List<Item> itemsStartWithT = itemList.stream().filter(item->item.getBrand().startsWith("T")).
		          sorted((itemOne,itemTwo)->Integer.valueOf(itemTwo.getPrice()).
		        		  compareTo(itemOne.getPrice())).collect(Collectors.toList());
		
		itemsStartWithT.forEach(item->System.out.println(item));
		
	}
}