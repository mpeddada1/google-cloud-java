// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/settings/v1beta1/component_settings.proto

package com.google.cloud.securitycenter.settings.v1beta1;

public interface SecurityHealthAnalyticsSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.settings.v1beta1.SecurityHealthAnalyticsSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Settings for "NON_ORG_IAM_MEMBER" scanner.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.settings.v1beta1.SecurityHealthAnalyticsSettings.NonOrgIamMemberSettings non_org_iam_member_settings = 1;</code>
   * @return Whether the nonOrgIamMemberSettings field is set.
   */
  boolean hasNonOrgIamMemberSettings();
  /**
   * <pre>
   * Settings for "NON_ORG_IAM_MEMBER" scanner.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.settings.v1beta1.SecurityHealthAnalyticsSettings.NonOrgIamMemberSettings non_org_iam_member_settings = 1;</code>
   * @return The nonOrgIamMemberSettings.
   */
  com.google.cloud.securitycenter.settings.v1beta1.SecurityHealthAnalyticsSettings.NonOrgIamMemberSettings getNonOrgIamMemberSettings();
  /**
   * <pre>
   * Settings for "NON_ORG_IAM_MEMBER" scanner.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.settings.v1beta1.SecurityHealthAnalyticsSettings.NonOrgIamMemberSettings non_org_iam_member_settings = 1;</code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.SecurityHealthAnalyticsSettings.NonOrgIamMemberSettingsOrBuilder getNonOrgIamMemberSettingsOrBuilder();

  /**
   * <pre>
   * Settings for "ADMIN_SERVICE_ACCOUNT" scanner.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.settings.v1beta1.SecurityHealthAnalyticsSettings.AdminServiceAccountSettings admin_service_account_settings = 2;</code>
   * @return Whether the adminServiceAccountSettings field is set.
   */
  boolean hasAdminServiceAccountSettings();
  /**
   * <pre>
   * Settings for "ADMIN_SERVICE_ACCOUNT" scanner.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.settings.v1beta1.SecurityHealthAnalyticsSettings.AdminServiceAccountSettings admin_service_account_settings = 2;</code>
   * @return The adminServiceAccountSettings.
   */
  com.google.cloud.securitycenter.settings.v1beta1.SecurityHealthAnalyticsSettings.AdminServiceAccountSettings getAdminServiceAccountSettings();
  /**
   * <pre>
   * Settings for "ADMIN_SERVICE_ACCOUNT" scanner.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.settings.v1beta1.SecurityHealthAnalyticsSettings.AdminServiceAccountSettings admin_service_account_settings = 2;</code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.SecurityHealthAnalyticsSettings.AdminServiceAccountSettingsOrBuilder getAdminServiceAccountSettingsOrBuilder();
}