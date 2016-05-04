package net.aab.DesignPatterns.PrototypePattern;

public interface Prototype extends Cloneable {
	
	public AccessControl clone() throws CloneNotSupportedException;

}
