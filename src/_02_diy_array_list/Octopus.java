package _02_diy_array_list;

public class Octopus<TypeOfData> {

	TypeOfData tentacle;

	public Octopus(TypeOfData dat) {
		tentacle = dat;
	}

	TypeOfData getTentacle() {
		return tentacle;
	}
}
