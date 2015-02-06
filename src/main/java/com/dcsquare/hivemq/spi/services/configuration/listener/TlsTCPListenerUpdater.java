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

package com.dcsquare.hivemq.spi.services.configuration.listener;

import com.dcsquare.hivemq.spi.services.configuration.entity.TlsTcpListener;
import com.dcsquare.hivemq.spi.services.configuration.exception.ConfigurationNotOverridableException;
import com.dcsquare.hivemq.spi.services.configuration.exception.ConfigurationValidationException;

/**
 * @author Dominik Obermaier
 */
public interface TlsTcpListenerUpdater {

    TlsTcpListenerUpdater port(final Integer port) throws ConfigurationNotOverridableException;

    TlsTcpListenerUpdater bindAddress(final String bindAddress) throws ConfigurationNotOverridableException;

    TlsUpdater<TlsTcpListenerUpdater> tls() throws ConfigurationNotOverridableException;

    TlsTcpListener update() throws ConfigurationValidationException;


}
