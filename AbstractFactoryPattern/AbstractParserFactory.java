package net.aab.DesignPatterns.AbstractFactoryPattern;

public interface AbstractParserFactory {

	public XMLParser getParserInstance(String parserType);
}
