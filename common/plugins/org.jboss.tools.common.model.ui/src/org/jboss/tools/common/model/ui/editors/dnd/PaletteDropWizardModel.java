/*******************************************************************************
 * Copyright (c) 2007 Exadel, Inc. and Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Exadel, Inc. and Red Hat, Inc. - initial API and implementation
 ******************************************************************************/ 
package org.jboss.tools.common.model.ui.editors.dnd;

public class PaletteDropWizardModel extends ExternalDropWizardModel implements IDropWizardModel {
	boolean isWizardEnabled = true;
	
	public PaletteDropWizardModel(ITagProposalFactory tagProposalFactory) {
		super(tagProposalFactory);
	}
	
	public void setWizardEnabled(boolean b) {
		isWizardEnabled = b;
	}
	
	public boolean isWizardRequired() {
		return isWizardEnabled && super.isWizardRequired();
	}

}
