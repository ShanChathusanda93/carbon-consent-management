/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbon.consent.mgt.core.util;

import org.wso2.carbon.consent.mgt.core.internal.ConsentManagerComponentDataHolder;
import org.wso2.carbon.database.utils.jdbc.JdbcTemplate;

/**
 * A util class to support the Jdbc executions.
 */
public class JdbcUtils {

    /**
     * Get a new Jdbc Template.
     *
     * @return a new Jdbc Template.
     */
    public static JdbcTemplate getNewTemplate() {

        return new JdbcTemplate(ConsentManagerComponentDataHolder.getInstance().getDataSource());
    }
}
