/*
 * File   : $Source: /alkacon/cvs/opencms/src/org/opencms/db/mysql/CmsSqlManager.java,v $
 * Date   : $Date: 2004/06/13 23:32:36 $
 * Version: $Revision: 1.16 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Mananagement System
 *
 * Copyright (C) 2002 - 2003 Alkacon Software (http://www.alkacon.com)
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
 
package org.opencms.db.mysql;

import java.util.Properties;

/**
 * Handles SQL queries from query.properties of the MySQL driver package.<p>
 * 
 * @author Thomas Weckert (t.weckert@alkacon.com)
 * @version $Revision: 1.16 $ $Date: 2004/06/13 23:32:36 $ 
 * @since 5.1
 */
public class CmsSqlManager extends org.opencms.db.generic.CmsSqlManager {
    
    private static final String C_PROPERTY_FILENAME = "org/opencms/db/mysql/query.properties";
    private static Properties c_queries; 

    /**
     * Initializes the SQL manager.<p>
     * 
     * @see org.opencms.db.generic.CmsSqlManager#CmsSqlManager()
     */  
    public CmsSqlManager() {
        super();
        
        if (c_queries == null) {
            c_queries = loadProperties(C_PROPERTY_FILENAME);
            precalculateQueries(c_queries);
        }
    }
    
    /**
     * @see java.lang.Object#finalize()
     */
    protected void finalize() throws Throwable {
        try {
            if (c_queries != null) {
                c_queries.clear();
            }
            c_queries = null;
        } catch (Throwable t) {
            // ignore
        }
        super.finalize();
    }    

    /**
     * @see org.opencms.db.generic.CmsSqlManager#readQuery(java.lang.String)
     */
    public String readQuery(String queryName) {
        if (c_queries == null) {
            c_queries = loadProperties(C_PROPERTY_FILENAME);
            precalculateQueries(c_queries);
        }
        
        String value = c_queries.getProperty(queryName);
        if (value == null || "".equals(value)) {
            value = super.readQuery(queryName);
        }
        
        return value;
    }  
}
