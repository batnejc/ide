/*
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.sodalite.dsl.RM.ui.internal.RMActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RMExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(RMActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		RMActivator activator = RMActivator.getInstance();
		return activator != null ? activator.getInjector(RMActivator.ORG_SODALITE_DSL_RM) : null;
	}

}
