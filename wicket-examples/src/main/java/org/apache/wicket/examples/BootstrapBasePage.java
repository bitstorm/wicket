package org.apache.wicket.examples;

import org.apache.wicket.markup.html.WebPage;

public class BootstrapBasePage extends WebPage
{
	
	@Override
	protected void onInitialize()
	{
		super.onInitialize();
//		final String packageName = getClass().getPackage().getName();
//		add(new WicketExampleHeader("mainNavigation", Strings.afterLast(packageName, '.'), this));
	}

}
