
public class OffButton extends ElectricItemButton {

	public OffButton(ElectricalAppliance eApp) {
		super(eApp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		eApp.stop();
	}

}
