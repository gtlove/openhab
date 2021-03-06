/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.enphaseenergy;

import org.openhab.binding.enphaseenergy.internal.EnphaseenergyItemType;
import org.openhab.core.binding.BindingProvider;

/**
 * This interface is implemented by classes that can provide mapping information
 * between openHAB items and Netatmo items.
 *
 * Implementing classes should register themselves as a service in order to be
 * taken into account.
 *
 * @author Markus Fritze
 * @since 1.7.0
 */
public interface EnphaseenergyBindingProvider extends BindingProvider {

    /**
     * Queries the Netatmo measure of the given {@code itemName}.
     * 
     * @param itemName
     *            the itemName to query
     * @return the EnphaseenergyItemType of the Item identified by {@code itemName} if
     *         it has an Enphaseenergy binding, <code>null</code> otherwise
     */
    EnphaseenergyItemType getItemType(String itemName);

    /**
     * Queries the system ID of the given {@code itemName}.
     * 
     * @param itemName
     *            the itemName to query
     * @return the system id if the item has an Enphaseenergy binding
     *         <code>null</code> otherwise
     */
    Integer getSystemId(String itemName);

}
