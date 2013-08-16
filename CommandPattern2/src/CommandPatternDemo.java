
public class CommandPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricalAppliance eapp = new Fan();
		eapp.start();
		eapp.stop();
		IButton onButton= new OnButton(eapp);
		IButton offButton = new OffButton(eapp);
		onButton.doAction();
		offButton.doAction();
		ElectricalAppliance lightBulb= new LightBulb();
		IButton onButton2 = new OnButton(lightBulb);
		IButton offButton2 = new OffButton(lightBulb);
		onButton2.doAction();
		offButton2.doAction();
		
	}

}
