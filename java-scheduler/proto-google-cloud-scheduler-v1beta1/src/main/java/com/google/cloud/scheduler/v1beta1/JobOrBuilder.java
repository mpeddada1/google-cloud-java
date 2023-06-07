/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/scheduler/v1beta1/job.proto

package com.google.cloud.scheduler.v1beta1;

public interface JobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.scheduler.v1beta1.Job)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optionally caller-specified in
   * [CreateJob][google.cloud.scheduler.v1beta1.CloudScheduler.CreateJob], after
   * which it becomes output only.
   *
   * The job name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`.
   *
   * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),
   *    hyphens (-), colons (:), or periods (.).
   *    For more information, see
   *    [Identifying
   *    projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
   * * `LOCATION_ID` is the canonical ID for the job's location.
   *    The list of available locations can be obtained by calling
   *    [ListLocations][google.cloud.location.Locations.ListLocations].
   *    For more information, see https://cloud.google.com/about/locations/.
   * * `JOB_ID` can contain only letters ([A-Za-z]), numbers ([0-9]),
   *    hyphens (-), or underscores (_). The maximum length is 500 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Optionally caller-specified in
   * [CreateJob][google.cloud.scheduler.v1beta1.CloudScheduler.CreateJob], after
   * which it becomes output only.
   *
   * The job name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`.
   *
   * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),
   *    hyphens (-), colons (:), or periods (.).
   *    For more information, see
   *    [Identifying
   *    projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
   * * `LOCATION_ID` is the canonical ID for the job's location.
   *    The list of available locations can be obtained by calling
   *    [ListLocations][google.cloud.location.Locations.ListLocations].
   *    For more information, see https://cloud.google.com/about/locations/.
   * * `JOB_ID` can contain only letters ([A-Za-z]), numbers ([0-9]),
   *    hyphens (-), or underscores (_). The maximum length is 500 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optionally caller-specified in
   * [CreateJob][google.cloud.scheduler.v1beta1.CloudScheduler.CreateJob] or
   * [UpdateJob][google.cloud.scheduler.v1beta1.CloudScheduler.UpdateJob].
   *
   * A human-readable description for the job. This string must not contain
   * more than 500 characters.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optionally caller-specified in
   * [CreateJob][google.cloud.scheduler.v1beta1.CloudScheduler.CreateJob] or
   * [UpdateJob][google.cloud.scheduler.v1beta1.CloudScheduler.UpdateJob].
   *
   * A human-readable description for the job. This string must not contain
   * more than 500 characters.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Pub/Sub target.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.PubsubTarget pubsub_target = 4;</code>
   *
   * @return Whether the pubsubTarget field is set.
   */
  boolean hasPubsubTarget();
  /**
   *
   *
   * <pre>
   * Pub/Sub target.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.PubsubTarget pubsub_target = 4;</code>
   *
   * @return The pubsubTarget.
   */
  com.google.cloud.scheduler.v1beta1.PubsubTarget getPubsubTarget();
  /**
   *
   *
   * <pre>
   * Pub/Sub target.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.PubsubTarget pubsub_target = 4;</code>
   */
  com.google.cloud.scheduler.v1beta1.PubsubTargetOrBuilder getPubsubTargetOrBuilder();

  /**
   *
   *
   * <pre>
   * App Engine HTTP target.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.AppEngineHttpTarget app_engine_http_target = 5;</code>
   *
   * @return Whether the appEngineHttpTarget field is set.
   */
  boolean hasAppEngineHttpTarget();
  /**
   *
   *
   * <pre>
   * App Engine HTTP target.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.AppEngineHttpTarget app_engine_http_target = 5;</code>
   *
   * @return The appEngineHttpTarget.
   */
  com.google.cloud.scheduler.v1beta1.AppEngineHttpTarget getAppEngineHttpTarget();
  /**
   *
   *
   * <pre>
   * App Engine HTTP target.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.AppEngineHttpTarget app_engine_http_target = 5;</code>
   */
  com.google.cloud.scheduler.v1beta1.AppEngineHttpTargetOrBuilder getAppEngineHttpTargetOrBuilder();

  /**
   *
   *
   * <pre>
   * HTTP target.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.HttpTarget http_target = 6;</code>
   *
   * @return Whether the httpTarget field is set.
   */
  boolean hasHttpTarget();
  /**
   *
   *
   * <pre>
   * HTTP target.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.HttpTarget http_target = 6;</code>
   *
   * @return The httpTarget.
   */
  com.google.cloud.scheduler.v1beta1.HttpTarget getHttpTarget();
  /**
   *
   *
   * <pre>
   * HTTP target.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.HttpTarget http_target = 6;</code>
   */
  com.google.cloud.scheduler.v1beta1.HttpTargetOrBuilder getHttpTargetOrBuilder();

  /**
   *
   *
   * <pre>
   * Required, except when used with
   * [UpdateJob][google.cloud.scheduler.v1beta1.CloudScheduler.UpdateJob].
   *
   * Describes the schedule on which the job will be executed.
   *
   * The schedule can be either of the following types:
   *
   * * [Crontab](https://en.wikipedia.org/wiki/Cron#Overview)
   * * English-like
   * [schedule](https://cloud.google.com/scheduler/docs/configuring/cron-job-schedules)
   *
   * As a general rule, execution `n + 1` of a job will not begin
   * until execution `n` has finished. Cloud Scheduler will never
   * allow two simultaneously outstanding executions. For example,
   * this implies that if the `n+1`th execution is scheduled to run at
   * 16:00 but the `n`th execution takes until 16:15, the `n+1`th
   * execution will not start until `16:15`.
   * A scheduled start time will be delayed if the previous
   * execution has not ended when its scheduled time occurs.
   *
   * If [retry_count][google.cloud.scheduler.v1beta1.RetryConfig.retry_count] &gt;
   * 0 and a job attempt fails, the job will be tried a total of
   * [retry_count][google.cloud.scheduler.v1beta1.RetryConfig.retry_count]
   * times, with exponential backoff, until the next scheduled start
   * time.
   * </pre>
   *
   * <code>string schedule = 20;</code>
   *
   * @return The schedule.
   */
  java.lang.String getSchedule();
  /**
   *
   *
   * <pre>
   * Required, except when used with
   * [UpdateJob][google.cloud.scheduler.v1beta1.CloudScheduler.UpdateJob].
   *
   * Describes the schedule on which the job will be executed.
   *
   * The schedule can be either of the following types:
   *
   * * [Crontab](https://en.wikipedia.org/wiki/Cron#Overview)
   * * English-like
   * [schedule](https://cloud.google.com/scheduler/docs/configuring/cron-job-schedules)
   *
   * As a general rule, execution `n + 1` of a job will not begin
   * until execution `n` has finished. Cloud Scheduler will never
   * allow two simultaneously outstanding executions. For example,
   * this implies that if the `n+1`th execution is scheduled to run at
   * 16:00 but the `n`th execution takes until 16:15, the `n+1`th
   * execution will not start until `16:15`.
   * A scheduled start time will be delayed if the previous
   * execution has not ended when its scheduled time occurs.
   *
   * If [retry_count][google.cloud.scheduler.v1beta1.RetryConfig.retry_count] &gt;
   * 0 and a job attempt fails, the job will be tried a total of
   * [retry_count][google.cloud.scheduler.v1beta1.RetryConfig.retry_count]
   * times, with exponential backoff, until the next scheduled start
   * time.
   * </pre>
   *
   * <code>string schedule = 20;</code>
   *
   * @return The bytes for schedule.
   */
  com.google.protobuf.ByteString getScheduleBytes();

  /**
   *
   *
   * <pre>
   * Specifies the time zone to be used in interpreting
   * [schedule][google.cloud.scheduler.v1beta1.Job.schedule]. The value of this
   * field must be a time zone name from the [tz
   * database](http://en.wikipedia.org/wiki/Tz_database).
   *
   * Note that some time zones include a provision for
   * daylight savings time. The rules for daylight saving time are
   * determined by the chosen tz. For UTC use the string "utc". If a
   * time zone is not specified, the default will be in UTC (also known
   * as GMT).
   * </pre>
   *
   * <code>string time_zone = 21;</code>
   *
   * @return The timeZone.
   */
  java.lang.String getTimeZone();
  /**
   *
   *
   * <pre>
   * Specifies the time zone to be used in interpreting
   * [schedule][google.cloud.scheduler.v1beta1.Job.schedule]. The value of this
   * field must be a time zone name from the [tz
   * database](http://en.wikipedia.org/wiki/Tz_database).
   *
   * Note that some time zones include a provision for
   * daylight savings time. The rules for daylight saving time are
   * determined by the chosen tz. For UTC use the string "utc". If a
   * time zone is not specified, the default will be in UTC (also known
   * as GMT).
   * </pre>
   *
   * <code>string time_zone = 21;</code>
   *
   * @return The bytes for timeZone.
   */
  com.google.protobuf.ByteString getTimeZoneBytes();

  /**
   *
   *
   * <pre>
   * Output only. The creation time of the job.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp user_update_time = 9;</code>
   *
   * @return Whether the userUpdateTime field is set.
   */
  boolean hasUserUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time of the job.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp user_update_time = 9;</code>
   *
   * @return The userUpdateTime.
   */
  com.google.protobuf.Timestamp getUserUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time of the job.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp user_update_time = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUserUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. State of the job.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.Job.State state = 10;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. State of the job.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.Job.State state = 10;</code>
   *
   * @return The state.
   */
  com.google.cloud.scheduler.v1beta1.Job.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The response from the target for the last attempted execution.
   * </pre>
   *
   * <code>.google.rpc.Status status = 11;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * Output only. The response from the target for the last attempted execution.
   * </pre>
   *
   * <code>.google.rpc.Status status = 11;</code>
   *
   * @return The status.
   */
  com.google.rpc.Status getStatus();
  /**
   *
   *
   * <pre>
   * Output only. The response from the target for the last attempted execution.
   * </pre>
   *
   * <code>.google.rpc.Status status = 11;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The next time the job is scheduled. Note that this may be a
   * retry of a previously failed attempt or the next execution time
   * according to the schedule.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 17;</code>
   *
   * @return Whether the scheduleTime field is set.
   */
  boolean hasScheduleTime();
  /**
   *
   *
   * <pre>
   * Output only. The next time the job is scheduled. Note that this may be a
   * retry of a previously failed attempt or the next execution time
   * according to the schedule.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 17;</code>
   *
   * @return The scheduleTime.
   */
  com.google.protobuf.Timestamp getScheduleTime();
  /**
   *
   *
   * <pre>
   * Output only. The next time the job is scheduled. Note that this may be a
   * retry of a previously failed attempt or the next execution time
   * according to the schedule.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 17;</code>
   */
  com.google.protobuf.TimestampOrBuilder getScheduleTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time the last job attempt started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_attempt_time = 18;</code>
   *
   * @return Whether the lastAttemptTime field is set.
   */
  boolean hasLastAttemptTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the last job attempt started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_attempt_time = 18;</code>
   *
   * @return The lastAttemptTime.
   */
  com.google.protobuf.Timestamp getLastAttemptTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the last job attempt started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_attempt_time = 18;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastAttemptTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Settings that determine the retry behavior.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.RetryConfig retry_config = 19;</code>
   *
   * @return Whether the retryConfig field is set.
   */
  boolean hasRetryConfig();
  /**
   *
   *
   * <pre>
   * Settings that determine the retry behavior.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.RetryConfig retry_config = 19;</code>
   *
   * @return The retryConfig.
   */
  com.google.cloud.scheduler.v1beta1.RetryConfig getRetryConfig();
  /**
   *
   *
   * <pre>
   * Settings that determine the retry behavior.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.RetryConfig retry_config = 19;</code>
   */
  com.google.cloud.scheduler.v1beta1.RetryConfigOrBuilder getRetryConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The deadline for job attempts. If the request handler does not respond by
   * this deadline then the request is cancelled and the attempt is marked as a
   * `DEADLINE_EXCEEDED` failure. The failed attempt can be viewed in
   * execution logs. Cloud Scheduler will retry the job according
   * to the [RetryConfig][google.cloud.scheduler.v1beta1.RetryConfig].
   *
   * The default and the allowed values depend on the type of target:
   *
   * * For [HTTP targets][google.cloud.scheduler.v1beta1.Job.http_target], the
   * default is 3 minutes. The deadline must be in the interval [15 seconds, 30
   * minutes].
   *
   * * For [App Engine HTTP
   * targets][google.cloud.scheduler.v1beta1.Job.app_engine_http_target], 0
   * indicates that the request has the default deadline. The default deadline
   * depends on the scaling type of the service: 10 minutes for standard apps
   * with automatic scaling, 24 hours for standard apps with manual and basic
   * scaling, and 60 minutes for flex apps. If the request deadline is set, it
   * must be in the interval [15 seconds, 24 hours 15 seconds].
   *
   * * For [Pub/Sub targets][google.cloud.scheduler.v1beta1.Job.pubsub_target],
   * this field is ignored.
   * </pre>
   *
   * <code>.google.protobuf.Duration attempt_deadline = 22;</code>
   *
   * @return Whether the attemptDeadline field is set.
   */
  boolean hasAttemptDeadline();
  /**
   *
   *
   * <pre>
   * The deadline for job attempts. If the request handler does not respond by
   * this deadline then the request is cancelled and the attempt is marked as a
   * `DEADLINE_EXCEEDED` failure. The failed attempt can be viewed in
   * execution logs. Cloud Scheduler will retry the job according
   * to the [RetryConfig][google.cloud.scheduler.v1beta1.RetryConfig].
   *
   * The default and the allowed values depend on the type of target:
   *
   * * For [HTTP targets][google.cloud.scheduler.v1beta1.Job.http_target], the
   * default is 3 minutes. The deadline must be in the interval [15 seconds, 30
   * minutes].
   *
   * * For [App Engine HTTP
   * targets][google.cloud.scheduler.v1beta1.Job.app_engine_http_target], 0
   * indicates that the request has the default deadline. The default deadline
   * depends on the scaling type of the service: 10 minutes for standard apps
   * with automatic scaling, 24 hours for standard apps with manual and basic
   * scaling, and 60 minutes for flex apps. If the request deadline is set, it
   * must be in the interval [15 seconds, 24 hours 15 seconds].
   *
   * * For [Pub/Sub targets][google.cloud.scheduler.v1beta1.Job.pubsub_target],
   * this field is ignored.
   * </pre>
   *
   * <code>.google.protobuf.Duration attempt_deadline = 22;</code>
   *
   * @return The attemptDeadline.
   */
  com.google.protobuf.Duration getAttemptDeadline();
  /**
   *
   *
   * <pre>
   * The deadline for job attempts. If the request handler does not respond by
   * this deadline then the request is cancelled and the attempt is marked as a
   * `DEADLINE_EXCEEDED` failure. The failed attempt can be viewed in
   * execution logs. Cloud Scheduler will retry the job according
   * to the [RetryConfig][google.cloud.scheduler.v1beta1.RetryConfig].
   *
   * The default and the allowed values depend on the type of target:
   *
   * * For [HTTP targets][google.cloud.scheduler.v1beta1.Job.http_target], the
   * default is 3 minutes. The deadline must be in the interval [15 seconds, 30
   * minutes].
   *
   * * For [App Engine HTTP
   * targets][google.cloud.scheduler.v1beta1.Job.app_engine_http_target], 0
   * indicates that the request has the default deadline. The default deadline
   * depends on the scaling type of the service: 10 minutes for standard apps
   * with automatic scaling, 24 hours for standard apps with manual and basic
   * scaling, and 60 minutes for flex apps. If the request deadline is set, it
   * must be in the interval [15 seconds, 24 hours 15 seconds].
   *
   * * For [Pub/Sub targets][google.cloud.scheduler.v1beta1.Job.pubsub_target],
   * this field is ignored.
   * </pre>
   *
   * <code>.google.protobuf.Duration attempt_deadline = 22;</code>
   */
  com.google.protobuf.DurationOrBuilder getAttemptDeadlineOrBuilder();

  /**
   *
   *
   * <pre>
   * Immutable. This field is used to manage the legacy App Engine Cron jobs
   * using the Cloud Scheduler API. If the field is set to true, the job will be
   * considered a legacy job. Note that App Engine Cron jobs have fewer
   * features than Cloud Scheduler jobs, e.g., are only limited to App Engine
   * targets.
   * </pre>
   *
   * <code>bool legacy_app_engine_cron = 23 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The legacyAppEngineCron.
   */
  boolean getLegacyAppEngineCron();

  com.google.cloud.scheduler.v1beta1.Job.TargetCase getTargetCase();
}
