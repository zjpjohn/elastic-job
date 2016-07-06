/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
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
 * </p>
 */

package com.dangdang.ddframe.job.cloud.state;

import com.dangdang.ddframe.job.cloud.state.failover.FailoverNodeTest;
import com.dangdang.ddframe.job.cloud.state.failover.FailoverServiceTest;
import com.dangdang.ddframe.job.cloud.state.misfired.MisfiredNodeTest;
import com.dangdang.ddframe.job.cloud.state.misfired.MisfiredServiceTest;
import com.dangdang.ddframe.job.cloud.state.ready.ReadyNodeTest;
import com.dangdang.ddframe.job.cloud.state.ready.ReadyServiceTest;
import com.dangdang.ddframe.job.cloud.state.running.RunningNodeTest;
import com.dangdang.ddframe.job.cloud.state.running.RunningServiceTest;
import com.dangdang.ddframe.job.cloud.state.running.SlaveCacheTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    UniqueJobTest.class, 
    ReadyNodeTest.class, 
    ReadyServiceTest.class, 
    MisfiredNodeTest.class, 
    MisfiredServiceTest.class, 
    RunningNodeTest.class, 
    RunningServiceTest.class, 
    SlaveCacheTest.class, 
    FailoverNodeTest.class, 
    FailoverServiceTest.class
})
public final class AllStateTests {
}
