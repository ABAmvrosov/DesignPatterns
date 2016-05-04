package net.aab.DesignPatterns.VisitorPattern;

public interface Element {
	
	public void accept(Visitor visitor);
}
