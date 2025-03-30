package com.kjuli.monitoringback.exception;

import lombok.Generated;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@Generated
public class SpringAppErrorDetail extends SpringAppError {
    private final String detail;
}
