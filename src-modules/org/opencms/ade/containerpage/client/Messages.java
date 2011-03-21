/*
 * File   : $Source: /alkacon/cvs/opencms/src-modules/org/opencms/ade/containerpage/client/Attic/Messages.java,v $
 * Date   : $Date: 2011/03/21 12:49:32 $
 * Version: $Revision: 1.12 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (C) 2002 - 2009 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.ade.containerpage.client;

import org.opencms.gwt.client.util.CmsMessages;

/**
 * Convenience class to access the localized messages of this OpenCms package.<p> 
 * 
 * @author Tobias Herrmann
 * 
 * @version $Revision: 1.12 $
 * 
 * @since 8.0.0
 */
public final class Messages {

    /** Message constant for key in the resource bundle. */
    public static final String GUI_BUTTON_CANCEL_TEXT_0 = "GUI_BUTTON_CANCEL_TEXT_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_BUTTON_EDITFAVORITES_TEXT_0 = "GUI_BUTTON_EDITFAVORITES_TEXT_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_BUTTON_LEAVEPAGE_TEXT_0 = "GUI_BUTTON_LEAVEPAGE_TEXT_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_BUTTON_RESET_DISABLED_0 = "GUI_BUTTON_RESET_DISABLED_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_BUTTON_RESET_TEXT_0 = "GUI_BUTTON_RESET_TEXT_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_BUTTON_SAVE_DISABLED_0 = "GUI_BUTTON_SAVE_DISABLED_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_BUTTON_SAVE_TEXT_0 = "GUI_BUTTON_SAVE_TEXT_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_DIALOG_PAGE_NOT_SAVED_0 = "GUI_DIALOG_PAGE_NOT_SAVED_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_DIALOG_PAGE_NOT_SAVED_TITLE_0 = "GUI_DIALOG_PAGE_NOT_SAVED_TITLE_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_DIALOG_PAGE_RESET_0 = "GUI_DIALOG_PAGE_RESET_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_DIALOG_PAGE_RESET_TITLE_0 = "GUI_DIALOG_PAGE_RESET_TITLE_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_DIALOG_SAVE_BEFORE_LEAVING_0 = "GUI_DIALOG_SAVE_BEFORE_LEAVING_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_NO_PROPERTIES_0 = "GUI_NO_PROPERTIES_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_NO_PROPERTIES_TITLE_0 = "GUI_NO_PROPERTIES_TITLE_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_NOTIFICATION_ADD_TO_FAVORITES_0 = "GUI_NOTIFICATION_ADD_TO_FAVORITES_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_NOTIFICATION_FAVORITES_SAVED_0 = "GUI_NOTIFICATION_FAVORITES_SAVED_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_NOTIFICATION_PAGE_SAVED_0 = "GUI_NOTIFICATION_PAGE_SAVED_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_NOTIFICATION_PAGE_UNLOCKED_0 = "GUI_NOTIFICATION_PAGE_UNLOCKED_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_NOTIFICATION_GROUP_CONTAINER_SAVED_0 = "GUI_NOTIFICATION_GROUP_CONTAINER_SAVED_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_NOTIFICATION_UNABLE_TO_LOCK_0 = "GUI_NOTIFICATION_UNABLE_TO_LOCK_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_PROPERTY_DIALOG_TEXT_0 = "GUI_PROPERTY_DIALOG_TEXT_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_PROPERTY_DIALOG_TITLE_0 = "GUI_PROPERTY_DIALOG_TITLE_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_TAB_FAVORITES_DESCRIPTION_0 = "GUI_TAB_FAVORITES_DESCRIPTION_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_TAB_FAVORITES_TITLE_0 = "GUI_TAB_FAVORITES_TITLE_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_TAB_RECENT_DESCRIPTION_0 = "GUI_TAB_RECENT_DESCRIPTION_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_TAB_RECENT_TITLE_0 = "GUI_TAB_RECENT_TITLE_0";

    /** Name of the used resource bundle. */
    private static final String BUNDLE_NAME = "org.opencms.ade.containerpage.clientmessages";

    /** Static instance member. */
    private static CmsMessages INSTANCE;

    /**
     * Hides the public constructor for this utility class.<p>
     */
    private Messages() {

        // hide the constructor
    }

    /**
     * Returns an instance of this localized message accessor.<p>
     * 
     * @return an instance of this localized message accessor
     */
    public static CmsMessages get() {

        if (INSTANCE == null) {
            INSTANCE = new CmsMessages(BUNDLE_NAME);
        }
        return INSTANCE;
    }

    /**
     * Returns the bundle name for this OpenCms package.<p>
     * 
     * @return the bundle name for this OpenCms package
     */
    public String getBundleName() {

        return BUNDLE_NAME;
    }
}
