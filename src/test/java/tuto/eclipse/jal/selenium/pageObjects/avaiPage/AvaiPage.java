package tuto.eclipse.jal.selenium.pageObjects.avaiPage;

public class AvaiPage {

	public AvaiPage() {
		super();
		System.out.println("a new page available is created");
	}

	public void run() {
		performActions();

	}

	private void performActions() {
		System.out.println("we will do actions on available page");
		AvaiPageActions actions = new AvaiPageActions();
		actions.clickContinueButton();

	}

}
