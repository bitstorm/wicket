package org.apache.wicket;

public interface IComponentContainer<T>
{
	public T add(Component... components);
	
	public boolean contains(Component component, boolean recursive);
	
	public Component get(int index);
	
	public Component get(String id);
	
	public T remove(Component component);
	
	public T remove(String id);
	
	public T replace(Component component);
}
