package p2;

public /* abstract */ class FilePrinter implements Printer{
@Override
public void print(String someMesg) {
	System.out.println("saving mesg : "+someMesg+" in the file");
}

//add new functionality 
// open file 
// close file
public void openFile(String fileName)
{
	System.out.println("opening file"+fileName);
	
} 
public void closeFile(String fileName)
{
	System.out.println("closing file"+fileName);
	
}
}
