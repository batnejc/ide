/*
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.sodalite.dsl.optimization.OptimizationRuntimeModule
import org.sodalite.dsl.optimization.OptimizationStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class OptimizationIdeSetup extends OptimizationStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new OptimizationRuntimeModule, new OptimizationIdeModule))
	}
	
}
