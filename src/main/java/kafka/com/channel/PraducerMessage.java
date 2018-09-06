package kafka.com.channel;

import kafka.com.model.Student;

public class PraducerMessage {
    private Integer customerId;
    private Integer userId;
    private String message;
    private String actionType;
    private String objectId;
    private String objectType;

    public PraducerMessage(Student stuentinfo) {
       this.customerId = stuentinfo.getCustomerId();
       this.userId=stuentinfo.getUserId();
       this.message= stuentinfo.getMessage();
       this.actionType=stuentinfo.getActionType();
       this.objectId= stuentinfo.getObjectId();
       this.objectType= stuentinfo.getObjectType();
    }

    public final Integer getCustomerId() {
        return this.customerId;
    }

    public final void setCustomerId(final Integer customerId) {
        this.customerId = customerId;
    }

    public final Integer getUserId() {
        return this.userId;
    }

    public final void setUserId(final Integer userId) {
        this.userId = userId;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(final String message) {
        this.message = message;
    }

    public final String getActionType() {
        return this.actionType;
    }

    public final void setActionType(final String actionType) {
        this.actionType = actionType;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final void setObjectId(final String objectId) {
        this.objectId = objectId;
    }

    public final String getObjectType() {
        return this.objectType;
    }

    public final void setObjectType(final String objectType) {
        this.objectType = objectType;
    }

}
