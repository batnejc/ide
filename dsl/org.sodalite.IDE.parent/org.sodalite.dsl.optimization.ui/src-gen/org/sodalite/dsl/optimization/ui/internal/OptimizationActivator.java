/*
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.ui.internal;

import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;
import org.sodalite.dsl.optimization.OptimizationRuntimeModule;
import org.sodalite.dsl.optimization.ui.OptimizationUiModule;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class OptimizationActivator extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "org.sodalite.dsl.optimization.ui";
	public static final String ORG_SODALITE_DSL_OPTIMIZATION_OPTIMIZATION = "org.sodalite.dsl.optimization.Optimization";
	
	private static final Logger logger = Logger.getLogger(OptimizationActivator.class);
	
	private static OptimizationActivator INSTANCE;
	
	private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		injectors.clear();
		INSTANCE = null;
		super.stop(context);
	}
	
	public static OptimizationActivator getInstance() {
		return INSTANCE;
	}
	
	public Injector getInjector(String language) {
		synchronized (injectors) {
			Injector injector = injectors.get(language);
			if (injector == null) {
				injectors.put(language, injector = createInjector(language));
			}
			return injector;
		}
	}
	
	protected Injector createInjector(String language) {
		try {
			com.google.inject.Module runtimeModule = getRuntimeModule(language);
			com.google.inject.Module sharedStateModule = getSharedStateModule();
			com.google.inject.Module uiModule = getUiModule(language);
			com.google.inject.Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
			return Guice.createInjector(mergedModule);
		} catch (Exception e) {
			logger.error("Failed to create injector for " + language);
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for " + language, e);
		}
	}
	
	protected com.google.inject.Module getRuntimeModule(String grammar) {
		if (ORG_SODALITE_DSL_OPTIMIZATION_OPTIMIZATION.equals(grammar)) {
			return new OptimizationRuntimeModule();
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected com.google.inject.Module getUiModule(String grammar) {
		if (ORG_SODALITE_DSL_OPTIMIZATION_OPTIMIZATION.equals(grammar)) {
			return new OptimizationUiModule(this);
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected com.google.inject.Module getSharedStateModule() {
		return new SharedStateModule();
	}
	
	
}