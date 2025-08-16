interface Alarm{
	void ring();
}
interface Bell{
	void ring();
}
class Notifier implements Alarm,Bell{
	public void ring(){
		System.out.println("ringing from notifier");
	}
}
public class conflictNameMethod {
	public static void main(String[] args){
		Alarm a = new Notifier();
		Bell b = new Notifier();
		a.ring();
		b.ring();
		}
}