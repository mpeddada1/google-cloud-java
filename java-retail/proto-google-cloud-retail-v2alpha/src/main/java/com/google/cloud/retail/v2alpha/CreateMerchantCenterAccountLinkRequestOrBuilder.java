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
// source: google/cloud/retail/v2alpha/merchant_center_account_link_service.proto

package com.google.cloud.retail.v2alpha;

public interface CreateMerchantCenterAccountLinkRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.CreateMerchantCenterAccountLinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The branch resource where this MerchantCenterAccountLink will be
   * created. Format:
   * projects/{PROJECT_NUMBER}/locations/global/catalogs/{CATALOG_ID}}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The branch resource where this MerchantCenterAccountLink will be
   * created. Format:
   * projects/{PROJECT_NUMBER}/locations/global/catalogs/{CATALOG_ID}}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The
   * [MerchantCenterAccountLink][google.cloud.retail.v2alpha.MerchantCenterAccountLink]
   * to create.
   *
   * If the caller does not have permission to create the
   * [MerchantCenterAccountLink][google.cloud.retail.v2alpha.MerchantCenterAccountLink],
   * regardless of whether or not it exists, a PERMISSION_DENIED error is
   * returned.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.MerchantCenterAccountLink merchant_center_account_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the merchantCenterAccountLink field is set.
   */
  boolean hasMerchantCenterAccountLink();
  /**
   *
   *
   * <pre>
   * Required. The
   * [MerchantCenterAccountLink][google.cloud.retail.v2alpha.MerchantCenterAccountLink]
   * to create.
   *
   * If the caller does not have permission to create the
   * [MerchantCenterAccountLink][google.cloud.retail.v2alpha.MerchantCenterAccountLink],
   * regardless of whether or not it exists, a PERMISSION_DENIED error is
   * returned.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.MerchantCenterAccountLink merchant_center_account_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The merchantCenterAccountLink.
   */
  com.google.cloud.retail.v2alpha.MerchantCenterAccountLink getMerchantCenterAccountLink();
  /**
   *
   *
   * <pre>
   * Required. The
   * [MerchantCenterAccountLink][google.cloud.retail.v2alpha.MerchantCenterAccountLink]
   * to create.
   *
   * If the caller does not have permission to create the
   * [MerchantCenterAccountLink][google.cloud.retail.v2alpha.MerchantCenterAccountLink],
   * regardless of whether or not it exists, a PERMISSION_DENIED error is
   * returned.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.MerchantCenterAccountLink merchant_center_account_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2alpha.MerchantCenterAccountLinkOrBuilder
      getMerchantCenterAccountLinkOrBuilder();
}
