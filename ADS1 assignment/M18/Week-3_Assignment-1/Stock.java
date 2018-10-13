public class Stock implements Comparable<Stock> {
	private String stock;
	private Double change;
	public Stock(String name, Double c) {
		this.stock = name;
		this.change = c;
	}
	public String getName() {
		return this.stock;
	}
	public Double getChange() {
		return this.change;
	}
	public int compareTo(Stock k) {
		if(this.change > k.change) {
			return 1;
		} else if(this.change < k.change) {
			return -1;
		} else {
			return this.stock.compareTo(k.stock);
		}
	}
	public String toString() {
		return this.stock + " " + this.change;
	}
}