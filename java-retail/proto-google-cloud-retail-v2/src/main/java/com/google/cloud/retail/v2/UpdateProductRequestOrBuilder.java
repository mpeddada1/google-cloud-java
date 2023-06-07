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
// source: google/cloud/retail/v2/product_service.proto

package com.google.cloud.retail.v2;

public interface UpdateProductRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.UpdateProductRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The product to update/create.
   *
   * If the caller does not have permission to update the
   * [Product][google.cloud.retail.v2.Product], regardless of whether or not it
   * exists, a PERMISSION_DENIED error is returned.
   *
   * If the [Product][google.cloud.retail.v2.Product] to update does not exist
   * and
   * [allow_missing][google.cloud.retail.v2.UpdateProductRequest.allow_missing]
   * is not set, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Product product = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the product field is set.
   */
  boolean hasProduct();
  /**
   *
   *
   * <pre>
   * Required. The product to update/create.
   *
   * If the caller does not have permission to update the
   * [Product][google.cloud.retail.v2.Product], regardless of whether or not it
   * exists, a PERMISSION_DENIED error is returned.
   *
   * If the [Product][google.cloud.retail.v2.Product] to update does not exist
   * and
   * [allow_missing][google.cloud.retail.v2.UpdateProductRequest.allow_missing]
   * is not set, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Product product = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The product.
   */
  com.google.cloud.retail.v2.Product getProduct();
  /**
   *
   *
   * <pre>
   * Required. The product to update/create.
   *
   * If the caller does not have permission to update the
   * [Product][google.cloud.retail.v2.Product], regardless of whether or not it
   * exists, a PERMISSION_DENIED error is returned.
   *
   * If the [Product][google.cloud.retail.v2.Product] to update does not exist
   * and
   * [allow_missing][google.cloud.retail.v2.UpdateProductRequest.allow_missing]
   * is not set, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Product product = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2.ProductOrBuilder getProductOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [Product][google.cloud.retail.v2.Product] to update. The immutable and
   * output only fields are NOT supported. If not set, all supported fields (the
   * fields that are neither immutable nor output only) are updated.
   *
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned.
   *
   * The attribute key can be updated by setting the mask path as
   * "attributes.${key_name}". If a key name is present in the mask but not in
   * the patching product from the request, this key will be deleted after the
   * update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [Product][google.cloud.retail.v2.Product] to update. The immutable and
   * output only fields are NOT supported. If not set, all supported fields (the
   * fields that are neither immutable nor output only) are updated.
   *
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned.
   *
   * The attribute key can be updated by setting the mask path as
   * "attributes.${key_name}". If a key name is present in the mask but not in
   * the patching product from the request, this key will be deleted after the
   * update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [Product][google.cloud.retail.v2.Product] to update. The immutable and
   * output only fields are NOT supported. If not set, all supported fields (the
   * fields that are neither immutable nor output only) are updated.
   *
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned.
   *
   * The attribute key can be updated by setting the mask path as
   * "attributes.${key_name}". If a key name is present in the mask but not in
   * the patching product from the request, this key will be deleted after the
   * update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * If set to true, and the [Product][google.cloud.retail.v2.Product] is not
   * found, a new [Product][google.cloud.retail.v2.Product] will be created. In
   * this situation, `update_mask` is ignored.
   * </pre>
   *
   * <code>bool allow_missing = 3;</code>
   *
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
