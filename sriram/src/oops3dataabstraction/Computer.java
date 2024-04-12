package oops3dataabstraction;

public class Computer implements Hardware,Software {
	public String findOs(String os) {
		return os;
	}
	public boolean findAntiVirus(boolean isAntiVirus) {
		return isAntiVirus;
	}
	public String findRamSize(int ram) {
		if(ram>=6 && ram<=8) {
			return "SD1-RAM";
		}
		if(ram>8 && ram<=10) {
			return "SD2-RAM";
		}
		else {
			return "DDR-RAM";
		}
	}

}
