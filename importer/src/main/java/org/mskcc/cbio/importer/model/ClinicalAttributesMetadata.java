/** Copyright (c) 2012 Memorial Sloan-Kettering Cancer Center.
**
** This library is free software; you can redistribute it and/or modify it
** under the terms of the GNU Lesser General Public License as published
** by the Free Software Foundation; either version 2.1 of the License, or
** any later version.
**
** This library is distributed in the hope that it will be useful, but
** WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
** MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
** documentation provided hereunder is on an "as is" basis, and
** Memorial Sloan-Kettering Cancer Center 
** has no obligations to provide maintenance, support,
** updates, enhancements or modifications.  In no event shall
** Memorial Sloan-Kettering Cancer Center
** be liable to any party for direct, indirect, special,
** incidental or consequential damages, including lost profits, arising
** out of the use of this software and its documentation, even if
** Memorial Sloan-Kettering Cancer Center 
** has been advised of the possibility of such damage.  See
** the GNU Lesser General Public License for more details.
**
** You should have received a copy of the GNU Lesser General Public License
** along with this library; if not, write to the Free Software Foundation,
** Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
**/

// package
package org.mskcc.cbio.importer.model;

public class ClinicalAttributesMetadata
{
	public static final String WORKSHEET_UPDATE_COLUMN_KEY = "NORMALIZEDCOLUMNHEADER";

	private String normalizedColumnHeader;
    private String displayName;
    private String description;
    private String datatype;

    public ClinicalAttributesMetadata(String[] properties) {

		if (properties.length < 4) {
            throw new IllegalArgumentException("corrupt properties array passed to contructor");
		}

        this.normalizedColumnHeader = properties[0].trim();
        this.displayName = properties[1].trim();
        this.description = properties[2].trim();
		this.datatype = properties[3].trim();
	}

	public String getNormalizedColumnHeader() { return normalizedColumnHeader; }
	public String getDisplayName() { return displayName; }
	public String getDescription() { return description; }
	public String getDatatype() { return datatype; }
}
