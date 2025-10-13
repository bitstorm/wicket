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
import org.danekja.java.util.function.serializable.SerializableBiConsumer;
import org.danekja.java.util.function.serializable.SerializableConsumer;
import org.danekja.java.util.function.serializable.SerializableFunction;

/**
 * USAGE:
 * 
 * <pre>
 * {@code
 * Behavior behavior = BehaviorBuilder.newBuilder()
 *   .visibleWhen(component -> {...})
 *   .enabledWhen(component -> {...})
 *   // more lambda handlers
 *   .build();
 * }
 * </pre>
 */
public class BehaviorBuilder
{
	private LambdaBehavior behavior;
	
	BehaviorBuilder () {
		this.behavior= new LambdaBehavior();
	}
	
	public static BehaviorBuilder newBuilder() {
		return new BehaviorBuilder();
	}
	
	public BehaviorBuilder beforeRender(SerializableConsumer<Component> lambda)
	{
		behavior.setBeforeRenderLambda(lambda);
		return this;
	}

	public BehaviorBuilder afterRender(SerializableConsumer<Component> lambda)
	{
		behavior.setAfterRenderLambda(lambda);
		return this;
	}

	public BehaviorBuilder bind(SerializableConsumer<Component> lambda)
	{
		behavior.setBindLambda(lambda);
		return this;
	}

	public BehaviorBuilder unbind(SerializableConsumer<Component> lambda)
	{
		behavior.setUnbindLambda(lambda);
		return this;
	}

	public BehaviorBuilder detach(SerializableConsumer<Component> lambda)
	{
		behavior.setDetachLambda(lambda);
		return this;
	}

    public BehaviorBuilder onConfigure(SerializableConsumer<Component> lambda)
    {
    	behavior.setOnConfigureLambda(lambda);
    	return this;
    }

    public BehaviorBuilder onEvent(SerializableBiConsumer<Component, IEvent<?>> lambda)
    {
    	behavior.setOnEventLambda(lambda);
    	return this;
    }

    public BehaviorBuilder onRemove(SerializableConsumer<Component> lambda)
    {
    	behavior.setOnRemoveLambda(lambda);
    	return this;
    }
    
    
    public Behavior build()
    {
    	return behavior;
	}
    
    public BehaviorBuilder visibleWhen(SerializableFunction<Component, Boolean> supplier)
    {
    	return onConfigure(component -> component.setVisible(supplier.apply(component)));
    }

    public BehaviorBuilder enabledWhen(SerializableFunction<Component, Boolean> supplier)
    {
    	return onConfigure(component -> component.setEnabled(supplier.apply(component)));
    }
}