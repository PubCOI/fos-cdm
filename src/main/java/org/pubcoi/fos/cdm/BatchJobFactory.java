package org.pubcoi.fos.cdm;

import org.pubcoi.fos.cdm.attachments.Attachment;
import org.pubcoi.fos.cdm.batch.BatchJob;
import org.pubcoi.fos.cdm.batch.BatchJobTypeEnum;
import org.pubcoi.fos.cdm.batch.BatchStatusEnum;

import java.util.UUID;

public class BatchJobFactory {

    private BatchJobFactory() {}

    public static BatchJob build(Attachment attachment, BatchJobTypeEnum jobType) {
        return new BatchJob()
                .withId(UUID.randomUUID().toString())
                .withTargetId(attachment.getId())
                .withStatus(BatchStatusEnum.PENDING)
                .withType(jobType);
    }

}
