package demo;

public class Icecream implements Comparable<Icecream> {
	private int pid, price;
	private String name, category;

	public Icecream() {

	}

	public Icecream(int pid, int price, String name, String category) {
		this.pid = pid;
		this.price = price;
		this.name = name;
		this.category = category;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return this.name + "\t" + this.category + "\t" + this.price;
	}

	@Override
	public int compareTo(Icecream o) {
		if (this.price < o.price) {
			return -1;
		} else if (this.price > o.price) {
			return 1;
		}

		return 0;
	}

}
