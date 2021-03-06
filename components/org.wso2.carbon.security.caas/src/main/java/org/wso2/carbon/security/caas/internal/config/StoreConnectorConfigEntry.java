/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.security.caas.internal.config;

import java.util.Properties;

/**
 * StoreConnectorConfig Bean.
 *
 * @since 1.0.0
 */
public class StoreConnectorConfigEntry {

    private String connectorName;
    private String connectorType;
    private Properties properties;

    public String getConnectorName() {
        return connectorName;
    }

    public Properties getProperties() {
        return properties;
    }

    public String getConnectorType() {
        return connectorType;
    }

    public void setConnectorName(String connectorName) {
        this.connectorName = connectorName;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }
}

