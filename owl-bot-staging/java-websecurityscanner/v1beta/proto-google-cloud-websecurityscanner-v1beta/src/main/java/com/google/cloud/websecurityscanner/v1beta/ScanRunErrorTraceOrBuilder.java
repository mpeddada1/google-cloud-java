// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1beta/scan_run_error_trace.proto

package com.google.cloud.websecurityscanner.v1beta;

public interface ScanRunErrorTraceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1beta.ScanRunErrorTrace)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indicates the error reason code.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1beta.ScanRunErrorTrace.Code code = 1;</code>
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   * <pre>
   * Indicates the error reason code.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1beta.ScanRunErrorTrace.Code code = 1;</code>
   * @return The code.
   */
  com.google.cloud.websecurityscanner.v1beta.ScanRunErrorTrace.Code getCode();

  /**
   * <pre>
   * If the scan encounters SCAN_CONFIG_ISSUE error, this field has the error
   * message encountered during scan configuration validation that is performed
   * before each scan run.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1beta.ScanConfigError scan_config_error = 2;</code>
   * @return Whether the scanConfigError field is set.
   */
  boolean hasScanConfigError();
  /**
   * <pre>
   * If the scan encounters SCAN_CONFIG_ISSUE error, this field has the error
   * message encountered during scan configuration validation that is performed
   * before each scan run.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1beta.ScanConfigError scan_config_error = 2;</code>
   * @return The scanConfigError.
   */
  com.google.cloud.websecurityscanner.v1beta.ScanConfigError getScanConfigError();
  /**
   * <pre>
   * If the scan encounters SCAN_CONFIG_ISSUE error, this field has the error
   * message encountered during scan configuration validation that is performed
   * before each scan run.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1beta.ScanConfigError scan_config_error = 2;</code>
   */
  com.google.cloud.websecurityscanner.v1beta.ScanConfigErrorOrBuilder getScanConfigErrorOrBuilder();

  /**
   * <pre>
   * If the scan encounters TOO_MANY_HTTP_ERRORS, this field indicates the most
   * common HTTP error code, if such is available. For example, if this code is
   * 404, the scan has encountered too many NOT_FOUND responses.
   * </pre>
   *
   * <code>int32 most_common_http_error_code = 3;</code>
   * @return The mostCommonHttpErrorCode.
   */
  int getMostCommonHttpErrorCode();
}