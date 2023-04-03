package p2;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer[] printers = {new ConsolePrinter(), new FilePrinter(), new NetworkPrinter()};
		
		String[] msgs = {"msg1", "msg2", "msg3"};
		int counter =0;
		for(Printer p : printers) {
			if(p instanceof FilePrinter) {
				((FilePrinter)p).openFile("temp.txt");
				p.print(msgs[counter++]);
				((FilePrinter)p).closeFile(null);
			} else {
				p.print(msgs[counter++]);
			}
			
		}
	}

}
