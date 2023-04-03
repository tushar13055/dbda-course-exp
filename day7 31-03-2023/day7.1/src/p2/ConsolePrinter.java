package p2;

public /* abstract */ class ConsolePrinter implements Printer{
@Override
public void print(String someMesg) {
	System.out.println("printing mesg : "+someMesg+" on the console");
}
}
