package p1;

public class Test2 {

	public static void main(String[] args) {
		
		Printer p;//p interface type of ref memory allocated in stack (local var),size :JVN dependent
		p=new ConsolePrinter();//upcasting ,done bycompiler ,using "Implements:=> IS A 
		// interface type of ref can Directly (w/o ytype casting ) refer to any  imple class instance
		p.print("some mesg");//consolesPrinters print method will be called ,,e.g of run time poly. 
	 //print(..0 to be invoked on which object is decided by jvm
		
		p = new NetworkPrinter();
		p.print(" any mesg ");
		
		p = new FilePrinter();
		p.print("File printer message");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
//		ConsolePrinter cp=new ConsolePrinter();
//		cp.print("mesg 1");
//		FilePrinter fp= new FilePrinter();
//		fp.print("mesg 2");
//		NetworkPrinter np=new NetworkPrinter();
//		np.print("mesg 3");
//	}
	}
}
