/*
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.sodalite.dsl.AADM.ui.internal.AADMActivator;

public class AADMUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return AADMActivator.getInstance().getInjector("org.sodalite.dsl.AADM");
	}

}
