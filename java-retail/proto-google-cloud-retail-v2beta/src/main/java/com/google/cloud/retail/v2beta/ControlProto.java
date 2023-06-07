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
// source: google/cloud/retail/v2beta/control.proto

package com.google.cloud.retail.v2beta;

public final class ControlProto {
  private ControlProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_Control_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_Control_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/retail/v2beta/control.pro"
          + "to\022\032google.cloud.retail.v2beta\032\037google/a"
          + "pi/field_behavior.proto\032\031google/api/reso"
          + "urce.proto\032\'google/cloud/retail/v2beta/c"
          + "ommon.proto\032/google/cloud/retail/v2beta/"
          + "search_service.proto\"\203\004\n\007Control\022M\n\nface"
          + "t_spec\030\003 \001(\01323.google.cloud.retail.v2bet"
          + "a.SearchRequest.FacetSpecB\002\030\001H\000\0220\n\004rule\030"
          + "\004 \001(\0132 .google.cloud.retail.v2beta.RuleH"
          + "\000\022\022\n\004name\030\001 \001(\tB\004\342A\001\005\022\032\n\014display_name\030\002 "
          + "\001(\tB\004\342A\001\002\022+\n\035associated_serving_config_i"
          + "ds\030\005 \003(\tB\004\342A\001\003\022G\n\016solution_types\030\006 \003(\0162("
          + ".google.cloud.retail.v2beta.SolutionType"
          + "B\005\342A\002\002\005\022S\n\030search_solution_use_case\030\007 \003("
          + "\01621.google.cloud.retail.v2beta.SearchSol"
          + "utionUseCase:q\352An\n\035retail.googleapis.com"
          + "/Control\022Mprojects/{project}/locations/{"
          + "location}/catalogs/{catalog}/controls/{c"
          + "ontrol}B\t\n\007controlB\313\001\n\036com.google.cloud."
          + "retail.v2betaB\014ControlProtoP\001Z6cloud.goo"
          + "gle.com/go/retail/apiv2beta/retailpb;ret"
          + "ailpb\242\002\006RETAIL\252\002\032Google.Cloud.Retail.V2B"
          + "eta\312\002\032Google\\Cloud\\Retail\\V2beta\352\002\035Googl"
          + "e::Cloud::Retail::V2betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2beta.CommonProto.getDescriptor(),
              com.google.cloud.retail.v2beta.SearchServiceProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2beta_Control_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2beta_Control_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_Control_descriptor,
            new java.lang.String[] {
              "FacetSpec",
              "Rule",
              "Name",
              "DisplayName",
              "AssociatedServingConfigIds",
              "SolutionTypes",
              "SearchSolutionUseCase",
              "Control",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2beta.CommonProto.getDescriptor();
    com.google.cloud.retail.v2beta.SearchServiceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
