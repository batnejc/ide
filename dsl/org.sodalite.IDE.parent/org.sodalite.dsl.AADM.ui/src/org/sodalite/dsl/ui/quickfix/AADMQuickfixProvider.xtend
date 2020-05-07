/*
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.sodalite.dsl.ui.validation.AADMValidationIssue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.sodalite.dsl.aADM.ENodeTemplate
import org.sodalite.dsl.aADM.EPropertyAssignment
import org.sodalite.dsl.rM.ELIST
import org.sodalite.dsl.aADM.AADMFactory
import org.sodalite.dsl.rM.RMFactory

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class AADMQuickfixProvider extends DefaultQuickfixProvider {

//	@Fix(AADMValidator.INVALID_NAME)
//	def capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, 'Capitalize name', 'Capitalize the name.', 'upcase.png') [
//			context |
//			val xtextDocument = context.xtextDocument
//			val firstLetter = xtextDocument.get(issue.offset, 1)
//			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
//		]
//	}

	@Fix(AADMValidationIssue.OPTIMIZATION)
	def fixNodeTypeName(Issue issue, IssueResolutionAcceptor acceptor) {
			val message = 'Apply recommended optimizations';
			val sub_message = issue.data.toString
			acceptor.accept(issue, message, sub_message, '') [ nodeTemplate, context |
				//Get optimization property. If not created.
				//IF found, delete existing optimizations
				//Add new optimizations
				var EPropertyAssignment opt = null
				for (EPropertyAssignment prop:(nodeTemplate as ENodeTemplate).node.properties.properties){
					if (prop.name.equalsIgnoreCase("optimization")){
						opt = prop;
					}
				}
				if (opt == null){
					//Create a EPropertyAssignment with name optimization
					opt = AADMFactory.eINSTANCE.createEPropertyAssignment
					opt.name = "optimization"
					opt.value = RMFactory.eINSTANCE.createELIST
				}else{
					(opt.value as ELIST).list.clear
				}
				//Add list of optimizations
				(opt.value as ELIST).list.addAll(issue.data)
			]
	}
}
