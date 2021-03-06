/*
 * Copyright 2020 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.netflix.spinnaker.kork.eureka;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.spinnaker.kork.discovery.InstanceStatus;

/**
 * Maps between Spinnaker's {@link InstanceStatus} and Eureka's {@link
 * com.netflix.appinfo.InstanceInfo.InstanceStatus}.
 */
public class InstanceStatusUtil {

  public static InstanceStatus fromEureka(InstanceInfo.InstanceStatus instanceStatus) {
    return InstanceStatus.from(instanceStatus.name());
  }

  public static InstanceInfo.InstanceStatus toEureka(InstanceStatus instanceStatus) {
    return InstanceInfo.InstanceStatus.toEnum(instanceStatus.name());
  }
}
