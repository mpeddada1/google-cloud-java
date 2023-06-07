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
// source: google/cloud/retail/v2beta/serving_config_service.proto

package com.google.cloud.retail.v2beta;

public final class ServingConfigServiceProto {
  private ServingConfigServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_CreateServingConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CreateServingConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_UpdateServingConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_UpdateServingConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_DeleteServingConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_DeleteServingConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_GetServingConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_GetServingConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_ListServingConfigsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ListServingConfigsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_ListServingConfigsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ListServingConfigsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_AddControlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_AddControlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_RemoveControlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_RemoveControlRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/retail/v2beta/serving_con"
          + "fig_service.proto\022\032google.cloud.retail.v"
          + "2beta\032\034google/api/annotations.proto\032\027goo"
          + "gle/api/client.proto\032\037google/api/field_b"
          + "ehavior.proto\032\031google/api/resource.proto"
          + "\032/google/cloud/retail/v2beta/serving_con"
          + "fig.proto\032\033google/protobuf/empty.proto\032 "
          + "google/protobuf/field_mask.proto\"\276\001\n\032Cre"
          + "ateServingConfigRequest\0226\n\006parent\030\001 \001(\tB"
          + "&\342A\001\002\372A\037\n\035retail.googleapis.com/Catalog\022"
          + "G\n\016serving_config\030\002 \001(\0132).google.cloud.r"
          + "etail.v2beta.ServingConfigB\004\342A\001\002\022\037\n\021serv"
          + "ing_config_id\030\003 \001(\tB\004\342A\001\002\"\226\001\n\032UpdateServ"
          + "ingConfigRequest\022G\n\016serving_config\030\001 \001(\013"
          + "2).google.cloud.retail.v2beta.ServingCon"
          + "figB\004\342A\001\002\022/\n\013update_mask\030\002 \001(\0132\032.google."
          + "protobuf.FieldMask\"X\n\032DeleteServingConfi"
          + "gRequest\022:\n\004name\030\001 \001(\tB,\342A\001\002\372A%\n#retail."
          + "googleapis.com/ServingConfig\"U\n\027GetServi"
          + "ngConfigRequest\022:\n\004name\030\001 \001(\tB,\342A\001\002\372A%\n#"
          + "retail.googleapis.com/ServingConfig\"\206\001\n\031"
          + "ListServingConfigsRequest\0226\n\006parent\030\001 \001("
          + "\tB&\342A\001\002\372A\037\n\035retail.googleapis.com/Catalo"
          + "g\022\027\n\tpage_size\030\002 \001(\005B\004\342A\001\001\022\030\n\npage_token"
          + "\030\003 \001(\tB\004\342A\001\001\"y\n\032ListServingConfigsRespon"
          + "se\022B\n\017serving_configs\030\001 \003(\0132).google.clo"
          + "ud.retail.v2beta.ServingConfig\022\027\n\017next_p"
          + "age_token\030\002 \001(\t\"s\n\021AddControlRequest\022D\n\016"
          + "serving_config\030\001 \001(\tB,\342A\001\002\372A%\n#retail.go"
          + "ogleapis.com/ServingConfig\022\030\n\ncontrol_id"
          + "\030\002 \001(\tB\004\342A\001\002\"v\n\024RemoveControlRequest\022D\n\016"
          + "serving_config\030\001 \001(\tB,\342A\001\002\372A%\n#retail.go"
          + "ogleapis.com/ServingConfig\022\030\n\ncontrol_id"
          + "\030\002 \001(\tB\004\342A\001\0022\203\r\n\024ServingConfigService\022\376\001"
          + "\n\023CreateServingConfig\0226.google.cloud.ret"
          + "ail.v2beta.CreateServingConfigRequest\032)."
          + "google.cloud.retail.v2beta.ServingConfig"
          + "\"\203\001\332A\'parent,serving_config,serving_conf"
          + "ig_id\202\323\344\223\002S\"A/v2beta/{parent=projects/*/"
          + "locations/*/catalogs/*}/servingConfigs:\016"
          + "serving_config\022\267\001\n\023DeleteServingConfig\0226"
          + ".google.cloud.retail.v2beta.DeleteServin"
          + "gConfigRequest\032\026.google.protobuf.Empty\"P"
          + "\332A\004name\202\323\344\223\002C*A/v2beta/{name=projects/*/"
          + "locations/*/catalogs/*/servingConfigs/*}"
          + "\022\200\002\n\023UpdateServingConfig\0226.google.cloud."
          + "retail.v2beta.UpdateServingConfigRequest"
          + "\032).google.cloud.retail.v2beta.ServingCon"
          + "fig\"\205\001\332A\032serving_config,update_mask\202\323\344\223\002"
          + "b2P/v2beta/{serving_config.name=projects"
          + "/*/locations/*/catalogs/*/servingConfigs"
          + "/*}:\016serving_config\022\304\001\n\020GetServingConfig"
          + "\0223.google.cloud.retail.v2beta.GetServing"
          + "ConfigRequest\032).google.cloud.retail.v2be"
          + "ta.ServingConfig\"P\332A\004name\202\323\344\223\002C\022A/v2beta"
          + "/{name=projects/*/locations/*/catalogs/*"
          + "/servingConfigs/*}\022\327\001\n\022ListServingConfig"
          + "s\0225.google.cloud.retail.v2beta.ListServi"
          + "ngConfigsRequest\0326.google.cloud.retail.v"
          + "2beta.ListServingConfigsResponse\"R\332A\006par"
          + "ent\202\323\344\223\002C\022A/v2beta/{parent=projects/*/lo"
          + "cations/*/catalogs/*}/servingConfigs\022\332\001\n"
          + "\nAddControl\022-.google.cloud.retail.v2beta"
          + ".AddControlRequest\032).google.cloud.retail"
          + ".v2beta.ServingConfig\"r\332A\016serving_config"
          + "\202\323\344\223\002[\"V/v2beta/{serving_config=projects"
          + "/*/locations/*/catalogs/*/servingConfigs"
          + "/*}:addControl:\001*\022\343\001\n\rRemoveControl\0220.go"
          + "ogle.cloud.retail.v2beta.RemoveControlRe"
          + "quest\032).google.cloud.retail.v2beta.Servi"
          + "ngConfig\"u\332A\016serving_config\202\323\344\223\002^\"Y/v2be"
          + "ta/{serving_config=projects/*/locations/"
          + "*/catalogs/*/servingConfigs/*}:removeCon"
          + "trol:\001*\032I\312A\025retail.googleapis.com\322A.http"
          + "s://www.googleapis.com/auth/cloud-platfo"
          + "rmB\330\001\n\036com.google.cloud.retail.v2betaB\031S"
          + "ervingConfigServiceProtoP\001Z6cloud.google"
          + ".com/go/retail/apiv2beta/retailpb;retail"
          + "pb\242\002\006RETAIL\252\002\032Google.Cloud.Retail.V2Beta"
          + "\312\002\032Google\\Cloud\\Retail\\V2beta\352\002\035Google::"
          + "Cloud::Retail::V2betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2beta.ServingConfigProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2beta_CreateServingConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2beta_CreateServingConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_CreateServingConfigRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ServingConfig", "ServingConfigId",
            });
    internal_static_google_cloud_retail_v2beta_UpdateServingConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2beta_UpdateServingConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_UpdateServingConfigRequest_descriptor,
            new java.lang.String[] {
              "ServingConfig", "UpdateMask",
            });
    internal_static_google_cloud_retail_v2beta_DeleteServingConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2beta_DeleteServingConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_DeleteServingConfigRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_retail_v2beta_GetServingConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2beta_GetServingConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_GetServingConfigRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_retail_v2beta_ListServingConfigsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2beta_ListServingConfigsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_ListServingConfigsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_retail_v2beta_ListServingConfigsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_retail_v2beta_ListServingConfigsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_ListServingConfigsResponse_descriptor,
            new java.lang.String[] {
              "ServingConfigs", "NextPageToken",
            });
    internal_static_google_cloud_retail_v2beta_AddControlRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_retail_v2beta_AddControlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_AddControlRequest_descriptor,
            new java.lang.String[] {
              "ServingConfig", "ControlId",
            });
    internal_static_google_cloud_retail_v2beta_RemoveControlRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_retail_v2beta_RemoveControlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_RemoveControlRequest_descriptor,
            new java.lang.String[] {
              "ServingConfig", "ControlId",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2beta.ServingConfigProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
