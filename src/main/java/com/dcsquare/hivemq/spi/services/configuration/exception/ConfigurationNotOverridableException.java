/*
 * Copyright 2015 dc-square GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dcsquare.hivemq.spi.services.configuration.exception;

/**
 * This exception indicates that a configuration is not
 * overridable.
 *
 * @author Dominik Obermaier
 */
public class ConfigurationNotOverridableException extends RuntimeException {

    public ConfigurationNotOverridableException() {
        super();
    }

    public ConfigurationNotOverridableException(final String message) {
        super(message);
    }

    public ConfigurationNotOverridableException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ConfigurationNotOverridableException(final Throwable cause) {
        super(cause);
    }
}
