package org.apache.wicket;

import org.apache.wicket.markup.Markup;
import org.apache.wicket.markup.MarkupStream;
import org.apache.wicket.markup.MarkupType;


public interface IMarkupOwner
{

	/**
	 * Gets a fresh markup stream that contains the (immutable) markup resource for this class.
	 * 
	 * @param throwException
	 *            If true, throw an exception, if markup could not be found
	 * @return A stream of MarkupElement elements
	 */
	MarkupStream getAssociatedMarkupStream(boolean throwException);

	/**
	 * Gets a fresh markup stream that contains the (immutable) markup resource for this class.
	 * 
	 * @return A stream of MarkupElement elements. Null if not found.
	 */
	Markup getAssociatedMarkup();

	/**
	 * Get the type of associated markup for this component.
	 * 
	 * @return The type of associated markup for this component (for example, "html", "wml" or
	 *         "vxml"). The markup type for a component is independent of whether or not the
	 *         component actually has an associated markup resource file (which is determined at
	 *         runtime). If there is no markup type for a component, null may be returned, but this
	 *         means that no markup can be loaded for the class. Null is also returned if the
	 *         component, or any of its parents, has not been added to a Page.
	 */
	MarkupType getMarkupType();

}