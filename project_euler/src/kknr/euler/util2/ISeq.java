package kknr.euler.util2;

public interface ISeq<T> 
{
	// Has a next element.
	boolean has();
	
	// Current element.
	T curr();
	
	// Return current element and advance.
	T adv();
}
