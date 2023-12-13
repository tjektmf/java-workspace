package database.event.model;

public class Prize {

	int prize_id; // pk라 null은 못들어가므로 integer 말고 int 써도 ㄱㅊ
	String prize_name;
	double prize_rate;
	int remain_qty;
	int init_qty;

	public Prize(int prize_id, String prize_name, double prize_rate, int remain_qty, int init_qty) {
		this.prize_id = prize_id;
		this.prize_name = prize_name;
		this.prize_rate = prize_rate;
		this.remain_qty = remain_qty;
		this.init_qty = init_qty;
	}

	// Source -> Generate Getters and Setters로 각 필드에 대한 getter setter 를 자동생성할 수 있다
	public int getInit_qty() {
		return init_qty;
	}

	public int getPrize_id() {
		return prize_id;
	}

	public String getPrize_name() {
		return prize_name;
	}

	public double getPrize_rate() {
		return prize_rate;
	}

	public int getRemain_qty() {
		return remain_qty;
	}

	@Override
	public String toString() {
		return String.format("%s[%d개남음]", prize_name, remain_qty);
	}
	
	public void setRemain_qty(int remain_qty) {
		this.remain_qty = remain_qty;
	}
}
