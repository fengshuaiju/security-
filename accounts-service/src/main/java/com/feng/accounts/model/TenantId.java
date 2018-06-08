package com.feng.accounts.model;

import com.feng.accounts.support.utils.Validate;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Value;
import lombok.experimental.Accessors;

import javax.persistence.Embeddable;
import java.util.UUID;

@Embeddable
@Value
@Accessors(fluent = true)
public final class TenantId {

    private String tenantId;

    public TenantId(String tenantId) {
        this.tenantId = Validate.notBlank(tenantId);
    }

    @Override
    public String toString() {
        return tenantId.toString();
    }

}
