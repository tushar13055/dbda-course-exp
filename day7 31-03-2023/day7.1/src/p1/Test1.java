package p1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsolePrinter cp=new ConsolePrinter();
		cp.print("mesg 1");
		FilePrinter fp= new FilePrinter();
		fp.print("mesg 2");
		NetworkPrinter np=new NetworkPrinter();
		np.print("mesg 3");
	}

}
