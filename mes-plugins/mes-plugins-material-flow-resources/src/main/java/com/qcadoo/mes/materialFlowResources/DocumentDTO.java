package com.qcadoo.mes.materialFlowResources;

public class DocumentDTO {

    private Long id;

    private String state;

    private String type;

    private Long locationTo_id;

    private Long locationFrom_id;

    private Boolean inBuffer;

    private Boolean acceptationInProgress;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public Long getLocationTo_id() {
        return locationTo_id;
    }

    public void setLocationTo_id(final Long locationTo_id) {
        this.locationTo_id = locationTo_id;
    }

    public Long getLocationFrom_id() {
        return locationFrom_id;
    }

    public void setLocationFrom_id(final Long locationFrom_id) {
        this.locationFrom_id = locationFrom_id;
    }

    public Boolean getInBuffer() {
        return inBuffer;
    }

    public void setInBuffer(final Boolean inBuffer) {
        this.inBuffer = inBuffer;
    }

    public Boolean getAcceptationInProgress() {
        return acceptationInProgress;
    }

    public void setAcceptationInProgress(final Boolean acceptationInProgress) {
        this.acceptationInProgress = acceptationInProgress;
    }

    @Override
    public int hashCode() {
        return com.google.common.base.Objects.hashCode(id, state, type, locationTo_id, locationFrom_id, inBuffer,
                acceptationInProgress);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DocumentDTO that = (DocumentDTO) o;

        return com.google.common.base.Objects.equal(id, that.id) && com.google.common.base.Objects.equal(state, that.state)
                && com.google.common.base.Objects.equal(type, that.type)
                && com.google.common.base.Objects.equal(locationTo_id, that.locationTo_id)
                && com.google.common.base.Objects.equal(locationFrom_id, that.locationFrom_id)
                && com.google.common.base.Objects.equal(inBuffer, that.inBuffer)
                && com.google.common.base.Objects.equal(acceptationInProgress, that.acceptationInProgress);
    }

    @Override
    public String toString() {
        return "DocumentDTO {" + "id = " + id + ", state = " + state + ", type = " + type + ", locationTo_id = " + locationTo_id
                + ", locationFrom_id = " + locationFrom_id + '}';
    }

}
