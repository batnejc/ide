/*
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.validation

import org.eclipse.xtext.validation.Check
import org.sodalite.dsl.optimization.optimization.EOptimization
import org.sodalite.dsl.optimization.optimization.OptimizationPackage
import org.sodalite.dsl.optimization.optimization.EAITrainingCase
import org.sodalite.dsl.optimization.optimization.EHPCCase
import org.sodalite.dsl.optimization.optimization.EAITraining
import org.sodalite.dsl.optimization.optimization.EPyTorchCase
import org.sodalite.dsl.optimization.optimization.ETensorFlowCase
import org.sodalite.dsl.optimization.optimization.EKerasCase
import org.sodalite.dsl.optimization.optimization.EAITrainingConfig
import org.sodalite.dsl.optimization.optimization.EHPCConfig
import org.sodalite.dsl.optimization.optimization.EHPC
import org.sodalite.dsl.optimization.optimization.EMPICase
import org.sodalite.dsl.optimization.optimization.EOPENMPCase
import org.sodalite.dsl.optimization.optimization.EOPENACCCase
import org.sodalite.dsl.optimization.optimization.EOPENCLCase

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class OptimizationValidator extends AbstractOptimizationValidator {
	
	public static val MANDATORY_ELEMENT = 'MandatoryElement'

	@Check
	def checkOptimizationMandatoryElement(EOptimization opt) {
		if (opt.enable_opt_build && opt.opt_build === null) {
			error('opt_build property should be present if enable_opt_build is true', 
					OptimizationPackage.Literals.EOPTIMIZATION__ENABLE_OPT_BUILD,
					MANDATORY_ELEMENT)
		}
		if (!opt.enable_opt_build && opt.opt_build !== null) {
			error('An opt_build property is present but enable_opt_build is false', 
					OptimizationPackage.Literals.EOPTIMIZATION__ENABLE_OPT_BUILD,
					MANDATORY_ELEMENT)
		}
		if (opt.enable_autotuning && opt.autotuning === null) {
			error('autotuning property should be present if enable_autotuning is true', 
					OptimizationPackage.Literals.EOPTIMIZATION__ENABLE_AUTOTUNING,
					MANDATORY_ELEMENT)
		}
		if (!opt.enable_autotuning && opt.autotuning !== null) {
			error('An autotuning property is present but enable_autotuning is false', 
					OptimizationPackage.Literals.EOPTIMIZATION__ENABLE_AUTOTUNING,
					MANDATORY_ELEMENT)
		}
		if ((opt.app_type == "ai_training" && !(opt.app_optimization instanceof EAITrainingCase))
			|| (opt.app_optimization instanceof EAITrainingCase && !(opt.app_type == "ai_training"))	
		) {
			error('A app_type-ai_training property should be present if app_type is ai_training', 
					OptimizationPackage.Literals.EOPTIMIZATION__APP_TYPE,
					MANDATORY_ELEMENT)
			error('This property is not compatible with selected app_type', 
					OptimizationPackage.Literals.EOPTIMIZATION__APP_OPTIMIZATION,
					MANDATORY_ELEMENT)
		}
		if ((opt.app_type == "hpc" && !(opt.app_optimization instanceof EHPCCase))
			|| (opt.app_optimization instanceof EHPCCase != opt.app_type == "hpc")
		) {
			error('Ah app_type-hpc property should be present if app_type is hpc', 
					OptimizationPackage.Literals.EOPTIMIZATION__APP_TYPE,
					MANDATORY_ELEMENT)
			error('This property is not compatible with selected app_type', 
					OptimizationPackage.Literals.EOPTIMIZATION__APP_OPTIMIZATION,
					MANDATORY_ELEMENT)
		}
		
		if ((opt.app_type == "ai_inference") || (opt.app_type == "big_data")){
			error('This app_type is not supported in current version', 
					OptimizationPackage.Literals.EOPTIMIZATION__APP_TYPE,
					MANDATORY_ELEMENT)
		}
	}
	
	@Check
	def checkAITrainingConfigMandatoryElement(EAITrainingConfig conf) {
		val parent = conf.eContainer as EAITraining
		if (conf.ai_framework == "pytorch" && !(parent.aitrainingcase instanceof EPyTorchCase)) {
			error('An ai_framework-pytorch property should be present if ai_framework is pytorch', 
					OptimizationPackage.Literals.EAI_TRAINING_CONFIG__AI_FRAMEWORK,
					MANDATORY_ELEMENT)
		}
		if (conf.ai_framework == "tensorflow" && !(parent.aitrainingcase instanceof ETensorFlowCase)) {
			error('An ai_framework-tensorflow property should be present if ai_framework is tensorflow', 
					OptimizationPackage.Literals.EAI_TRAINING_CONFIG__AI_FRAMEWORK,
					MANDATORY_ELEMENT)
		}
		if (conf.ai_framework == "keras" && !(parent.aitrainingcase instanceof EKerasCase)) {
			error('An ai_framework-keras property should be present if ai_framework is Keras', 
					OptimizationPackage.Literals.EAI_TRAINING_CONFIG__AI_FRAMEWORK,
					MANDATORY_ELEMENT)
		}
	}
	
	@Check
	def checkAITrainingMandatoryElement(EAITraining ai_training) {
		if (ai_training.config.ai_framework == "pytorch" && !(ai_training.aitrainingcase instanceof EPyTorchCase)) {
			error('This property is not compatible with selected app_type', 
					OptimizationPackage.Literals.EAI_TRAINING__AITRAININGCASE,
					MANDATORY_ELEMENT)
		}
		if (ai_training.config.ai_framework == "tensorflow" && !(ai_training.aitrainingcase instanceof ETensorFlowCase)) {
			error('This property is not compatible with selected app_type', 
					OptimizationPackage.Literals.EAI_TRAINING__AITRAININGCASE,
					MANDATORY_ELEMENT)
		}
		if (ai_training.config.ai_framework == "keras" && !(ai_training.aitrainingcase instanceof EKerasCase)) {
			error('This property is not compatible with selected app_type', 
					OptimizationPackage.Literals.EAI_TRAINING__AITRAININGCASE,
					MANDATORY_ELEMENT)
		}
	}
	
		@Check
	def checkHPCConfigMandatoryElement(EHPCConfig conf) {
		val parent = conf.eContainer as EHPC
		if (conf.parallelisation.contains("mpi") && parent.mpi === null) {
			error('A parallelisation-mpi property should be present if parallelisation contains mpi', 
					OptimizationPackage.Literals.EHPC_CONFIG__PARALLELISATION,
					MANDATORY_ELEMENT)
		}
		if (conf.parallelisation.contains("openmp") && parent.openmp === null) {
			error('A parallelisation-openmp property should be present if parallelisation contains openmp', 
					OptimizationPackage.Literals.EHPC_CONFIG__PARALLELISATION,
					MANDATORY_ELEMENT)
		}
		if (conf.parallelisation.contains("openacc") && parent.openacc === null) {
			error('A parallelisation-openacc property should be present if parallelisation contains openacc', 
					OptimizationPackage.Literals.EHPC_CONFIG__PARALLELISATION,
					MANDATORY_ELEMENT)
		}
		if (conf.parallelisation.contains("opencl") && parent.opencl === null) {
			error('A parallelisation-opencl property should be present if parallelisation contains opencl', 
					OptimizationPackage.Literals.EHPC_CONFIG__PARALLELISATION,
					MANDATORY_ELEMENT)
		}
		if (parent.mpi !== null && !conf.parallelisation.contains("mpi")) {
			error('Parallelisation should contains mpi as an parallelisation-mpi property exists', 
					OptimizationPackage.Literals.EHPC_CONFIG__PARALLELISATION,
					MANDATORY_ELEMENT)
		}
		if (parent.openmp !== null && !conf.parallelisation.contains("openmp")) {
			error('Parallelisation should contains openmp as an parallelisation-openmp property exists', 
					OptimizationPackage.Literals.EHPC_CONFIG__PARALLELISATION,
					MANDATORY_ELEMENT)
		}
		if (parent.openacc !== null && !conf.parallelisation.contains("openacc")) {
			error('Parallelisation should contains openacc as an parallelisation-openacc property exists', 
					OptimizationPackage.Literals.EHPC_CONFIG__PARALLELISATION,
					MANDATORY_ELEMENT)
		}
		if (parent.opencl !== null && !conf.parallelisation.contains("opencl")) {
			error('Parallelisation should contains opencl as an parallelisation-opencl property exists', 
					OptimizationPackage.Literals.EHPC_CONFIG__PARALLELISATION,
					MANDATORY_ELEMENT)
		}
	}
	
	@Check
	def checkHPCMandatoryElement(EHPC hpc) {
		if (hpc.config.parallelisation == "mpi" && !(hpc.mpi !== null)) {
			error('This property is not compatible with selected app_type', 
					OptimizationPackage.Literals.EHPC__MPI,
					MANDATORY_ELEMENT)
		}
		if (hpc.config.parallelisation == "openmp" && !(hpc.openmp !== null)) {
			error('This property is not compatible with selected app_type', 
					OptimizationPackage.Literals.EHPC__OPENMP,
					MANDATORY_ELEMENT)
		}
		if (hpc.config.parallelisation == "openacc" && !(hpc.openacc !== null)) {
			error('This property is not compatible with selected app_type', 
					OptimizationPackage.Literals.EHPC__OPENACC,
					MANDATORY_ELEMENT)
		}
		if (hpc.config.parallelisation == "opencl" && !(hpc.opencl !== null)) {
			error('This property is not compatible with selected app_type', 
					OptimizationPackage.Literals.EHPC__OPENCL,
					MANDATORY_ELEMENT)
		}
	}
	
}
