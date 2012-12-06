/**
 * ========= CONFIDENTIAL =========
 *
 * Copyright (C) 2012 enStratus Networks Inc - ALL RIGHTS RESERVED
 *
 * ====================================================================
 *  NOTICE: All information contained herein is, and remains the
 *  property of enStratus Networks Inc. The intellectual and technical
 *  concepts contained herein are proprietary to enStratus Networks Inc
 *  and may be covered by U.S. and Foreign Patents, patents in process,
 *  and are protected by trade secret or copyright law. Dissemination
 *  of this information or reproduction of this material is strictly
 *  forbidden unless prior written permission is obtained from
 *  enStratus Networks Inc.
 * ====================================================================
 */
package org.dasein.cloud.skeleton;

import org.dasein.cloud.CloudException;

import javax.annotation.Nonnull;

/**
 * An error in configuring MyCloud's context in some manner.
 * <p>Created by George Reese: 12/06/2012 9:44 AM</p>
 * @author George Reese
 * @version 2013.1 initial version
 * @since 2013.1
 */
public class ConfigurationException extends CloudException {
    public ConfigurationException(@Nonnull String message) {
        super(message);
    }

    public ConfigurationException(@Nonnull Throwable cause) {
        super(cause);
    }
}
