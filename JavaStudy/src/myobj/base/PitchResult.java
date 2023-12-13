package myobj.base;

public class PitchResult {

	String guess;
	int strike;
	int ball;

	public PitchResult(String guess, int strike, int ball) {
		this.guess = guess;
		this.strike = strike;
		this.ball = ball;
	}

	public String getGuess() {
		return guess;
	}

	public int getBall() {
		return ball;
	}

	public int getStrike() {
		return strike;
	}
	
	// get 치고 Ctrl+Space 하면 자동완성기능 켜짐
}
