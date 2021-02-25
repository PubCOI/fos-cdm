package org.pubcoi.fos.cdm;

import org.pubcoi.fos.cdm.attachments.Attachment;
import org.pubcoi.fos.models.cf.AdditionalDetailsType;

public class AttachmentFactory {

    private AttachmentFactory() {}

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
