/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.job.service.impl.persistence.entity.data.impl.cachematcher;

import org.flowable.engine.common.impl.db.CachedEntityMatcherAdapter;
import org.flowable.job.service.impl.persistence.entity.TimerJobEntity;

/**
 * @author Joram Barrez
 */
public class TimerJobsByExecutionIdMatcher extends CachedEntityMatcherAdapter<TimerJobEntity> {

    @Override
    public boolean isRetained(TimerJobEntity jobEntity, Object param) {
        return jobEntity.getExecutionId() != null && jobEntity.getExecutionId().equals(param); // param = executionId
    }

}