/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.innovation.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.innovation.fulfilmentprocess.constants.InnovationFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class InnovationFulfilmentProcessManager extends GeneratedInnovationFulfilmentProcessManager
{
	public static final InnovationFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (InnovationFulfilmentProcessManager) em.getExtension(InnovationFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
