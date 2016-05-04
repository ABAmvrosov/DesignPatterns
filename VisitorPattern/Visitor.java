package net.aab.DesignPatterns.VisitorPattern;

public interface Visitor {
	public void visit(HtmlElement element);
	public void visit(HtmlParentElement parentElement);
}
