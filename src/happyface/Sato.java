package happyface;

public class Sato extends Player {

	@Override
	protected Profile createProfile() {
		Profile profile = new Profile();
		profile.setAge(18);
		profile.setName("sato");
		profile.setSex(Sex.WOMAN);
		return profile;
	}

	@Override
	protected AI createAi() {
		return new TurnAI();
	}

}
