
public class OnButton extends ElectricItemButton {

	public OnButton(ElectricalAppliance eApp) {
		super(eApp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		eApp.start();
	}

}
