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

import org.pubcoi.cdm.cf.AdditionalDetailType;
import org.pubcoi.cdm.cf.attachments.Attachment;

public class AttachmentFactory {

    private AttachmentFactory() {}

    /**
     * Helper to create an Attachment object from an {@link org.pubcoi.cdm.cf.AdditionalDetailType} object
     * @param additionalDetail The {@link org.pubcoi.cdm.cf.AdditionalDetailType} object
     * @return The Attachment object
     */
    public static Attachment build(AdditionalDetailType additionalDetail) {

        return new Attachment()
                .withId(additionalDetail.getId())
                .withNoticeId(additionalDetail.getNoticeId())
                .withDescription(additionalDetail.getDescription())
                .withDataType(additionalDetail.getDataType())
                .withLink(additionalDetail.getLink())
                .withTextData(additionalDetail.getTextData())
                .withMimeType(additionalDetail.getMimeType())
                .withAwardGuid(additionalDetail.getAwardGuid());
    }

}
