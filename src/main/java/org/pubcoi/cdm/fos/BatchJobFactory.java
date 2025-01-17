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

import org.pubcoi.cdm.cf.attachments.Attachment;
import org.pubcoi.cdm.batch.BatchJob;
import org.pubcoi.cdm.batch.BatchJobTypeEnum;
import org.pubcoi.cdm.batch.BatchStatusEnum;

import java.util.UUID;

public class BatchJobFactory {

    private BatchJobFactory() {}

    /**
     * Used to generate a batch job definition from an {@link Attachment} object
     * @param attachment The {@link Attachment} object
     * @param jobType The {@link BatchJobTypeEnum} object
     * @return a batch job definition, with a {@link BatchStatusEnum} of state PENDING
     */
    public static BatchJob build(Attachment attachment, BatchJobTypeEnum jobType) {
        return new BatchJob()
                .withId(UUID.randomUUID().toString())
                .withTargetId(attachment.getId())
                .withStatus(BatchStatusEnum.PENDING)
                .withType(jobType);
    }

}
