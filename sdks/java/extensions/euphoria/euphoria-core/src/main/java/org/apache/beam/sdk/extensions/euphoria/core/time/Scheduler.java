/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.beam.sdk.extensions.euphoria.core.time;

import java.time.Duration;
import org.apache.beam.sdk.extensions.euphoria.core.annotation.audience.Audience;

/** TODO: complete javadoc. */
@Audience(Audience.Type.EXECUTOR)
public interface Scheduler {

  /**
   * Submit the given runnable for repeated execution.
   *
   * @param period the period at which to repeatedly invoke the given action
   * @param r the action to invoke
   */
  void schedulePeriodically(Duration period, Runnable r);

  /** Cancel all scheduled tasks. */
  void shutdown();
}