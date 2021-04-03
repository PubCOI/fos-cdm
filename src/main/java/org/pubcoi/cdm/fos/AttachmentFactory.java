/*
 * Copyright 2021 PubCOI.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package org.pubcoi.cdm.fos;

import org.pubcoi.cdm.cf.AdditionalDetailsType;
import org.pubcoi.cdm.cf.attachments.Attachment;

public class AttachmentFactory {

    private AttachmentFactory() {}

    /**
     * Helper to create an Attachment object from an {@link AdditionalDetailsType} object
     * @param additionalDetailsType The {@link AdditionalDetailsType} object
     * @return The Attachment object
     */
    public static Attachment build(AdditionalDetailsType additionalDetailsType) {

        return new Attachment()
                .withId(additionalDetailsType.getId())
                .withNoticeId(additionalDetailsType.getNoticeId())
                .withDescription(additionalDetailsType.getDescription())
                .withDataType(additionalDetailsType.getDataType())
                .withLink(additionalDetailsType.getLink())
                .withTextData(additionalDetailsType.getTextData())
                .withMimeType(additionalDetailsType.getMimeType())
                .withAwardGuid(additionalDetailsType.getAwardGuid());
    }

}
