package happyface;

public class Tanaka extends Player {

	@Override
	protected Profile createProfile() {
		Profile profile = new Profile();
		profile.setAge(10);
		profile.setName("田中");
		profile.setSex(Sex.MAN);
		return profile;
	}

	@Override
	protected AI createAi() {
		return new UpDownAI();
	}
	
}
