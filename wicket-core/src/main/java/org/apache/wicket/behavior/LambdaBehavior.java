/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.wicket.behavior;

import org.apache.wicket.Component;
import org.apache.wicket.event.IEvent;
import org.apache.wicket.markup.ComponentTag;
import org.danekja.java.util.function.serializable.SerializableBiConsumer;
import org.danekja.java.util.function.serializable.SerializableConsumer;

public class LambdaBehavior extends Behavior
{

	private static final long serialVersionUID = 1L;
	private static SerializableConsumer<Component> DO_NOTHING = (component) -> {};
	
    private SerializableBiConsumer<Component, IEvent<?>> onEventLambda = (component, e) -> {};
    private SerializableBiConsumer<Component, ComponentTag> onComponentTagLambda = (component, tag) -> {};
	private SerializableConsumer<Component> onConfigureLambda = DO_NOTHING;
    private SerializableConsumer<Component> beforeRenderLambda = DO_NOTHING;
    private SerializableConsumer<Component> afterRenderLambda = DO_NOTHING;
    private SerializableConsumer<Component> bindLambda = DO_NOTHING;
    private SerializableConsumer<Component> unbindLambda = DO_NOTHING;
    private SerializableConsumer<Component> detachLambda = DO_NOTHING;
    private SerializableConsumer<Component> onRemoveLambda = DO_NOTHING;


    //lambda handlers
    @Override
	public void beforeRender(Component component)
	{
		beforeRenderLambda.accept(component);
	}

    @Override
	public void afterRender(Component component)
	{
		afterRenderLambda.accept(component);
	}

	@Override
	public void bind(Component component)
	{
		bindLambda.accept(component);
	}
	
	@Override
	public void unbind(Component component)
	{
		unbindLambda.accept(component);
	}

	@Override
	public void detach(Component component)
	{
		detachLambda.accept(component);
	}

    @Override
    public void onConfigure(Component component)
    {
        onConfigureLambda.accept(component);
    }

    @Override
    public void onEvent(Component component, IEvent<?> event)
    {
        onEventLambda.accept(component, event);
    }

    @Override
    public void onRemove(Component component)
    {
        onRemoveLambda.accept(component);
    }
    
    @Override
    public void onComponentTag(Component component, ComponentTag tag) 
    {
    	onComponentTagLambda.accept(component, tag);
    }

    //lambda getters/setters
	public SerializableBiConsumer<Component, IEvent<?>> getOnEventLambda()
	{
		return onEventLambda;
	}

	public void setOnEventLambda(SerializableBiConsumer<Component, IEvent<?>> onEventLambda)
	{
		this.onEventLambda = onEventLambda;
	}

	public SerializableConsumer<Component> getOnConfigureLambda() {
		return onConfigureLambda;
	}

	public void setOnConfigureLambda(SerializableConsumer<Component> onConfigureLambda)
	{
		this.onConfigureLambda = onConfigureLambda;
	}

	public SerializableConsumer<Component> getBeforeRenderLambda()
	{
		return beforeRenderLambda;
	}

	public void setBeforeRenderLambda(SerializableConsumer<Component> beforeRenderLambda)
	{
		this.beforeRenderLambda = beforeRenderLambda;
	}

	public SerializableConsumer<Component> getAfterRenderLambda()
	{
		return afterRenderLambda;
	}

	public void setAfterRenderLambda(SerializableConsumer<Component> afterRenderLambda)
	{
		this.afterRenderLambda = afterRenderLambda;
	}

	public SerializableConsumer<Component> getBindLambda()
	{
		return bindLambda;
	}

	public void setBindLambda(SerializableConsumer<Component> bindLambda)
	{
		this.bindLambda = bindLambda;
	}

	public SerializableConsumer<Component> getUnbindLambda()
	{
		return unbindLambda;
	}

	public void setUnbindLambda(SerializableConsumer<Component> unbindLambda)
	{
		this.unbindLambda = unbindLambda;
	}

	public SerializableConsumer<Component> getDetachLambda()
	{
		return detachLambda;
	}

	public void setDetachLambda(SerializableConsumer<Component> detachLambda)
	{
		this.detachLambda = detachLambda;
	}

	public SerializableConsumer<Component> getOnRemoveLambda()
	{
		return onRemoveLambda;
	}

	public void setOnRemoveLambda(SerializableConsumer<Component> onRemoveLambda)
	{
		this.onRemoveLambda = onRemoveLambda;
	}
	
	public SerializableBiConsumer<Component, ComponentTag> getOnComponentTagLambda() 
	{
		return onComponentTagLambda;
	}

	public void setOnComponentTagLambda(SerializableBiConsumer<Component, ComponentTag> onComponentTagLambda) 
	{
		this.onComponentTagLambda = onComponentTagLambda;
	}
}
