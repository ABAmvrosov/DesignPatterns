package net.aab.DesignPatterns.FactoryMethodPattern;

public class FeedbackXMLDisplayService extends DisplayService{

	@Override
	public XMLParser getParser() {
		return new FeedbackXML();
	}

}