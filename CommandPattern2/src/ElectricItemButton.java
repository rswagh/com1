public abstract class ElectricItemButton implements IButton {
ElectricalAppliance eApp; 
	public ElectricItemButton(ElectricalAppliance eApp) {
		super();
		this.eApp=eApp;
	}

	@Override
	public abstract void doAction();

	
}