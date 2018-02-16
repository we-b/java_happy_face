package happyface;

public class Sato extends Player {

	@Override
	protected Profile createProfile() {
		Profile profile = new Profile();
		profile.setAge(18);
		profile.setName("佐藤");
		profile.setSex(Sex.WOMAN);
		return profile;
	}

	@Override
	protected AI createAi() {
		return new RandomAI();
	}

}
