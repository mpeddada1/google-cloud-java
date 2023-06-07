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
// source: google/cloud/retail/v2alpha/product.proto

package com.google.cloud.retail.v2alpha;

public final class ProductProto {
  private ProductProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_Product_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_Product_AttributesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_Product_AttributesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/retail/v2alpha/product.pr"
          + "oto\022\033google.cloud.retail.v2alpha\032\037google"
          + "/api/field_behavior.proto\032\031google/api/re"
          + "source.proto\032(google/cloud/retail/v2alph"
          + "a/common.proto\032+google/cloud/retail/v2al"
          + "pha/promotion.proto\032\036google/protobuf/dur"
          + "ation.proto\032 google/protobuf/field_mask."
          + "proto\032\037google/protobuf/timestamp.proto\032\036"
          + "google/protobuf/wrappers.proto\"\243\016\n\007Produ"
          + "ct\0221\n\013expire_time\030\020 \001(\0132\032.google.protobu"
          + "f.TimestampH\000\022.\n\003ttl\030\021 \001(\0132\031.google.prot"
          + "obuf.DurationB\004\342A\001\004H\000\022\022\n\004name\030\001 \001(\tB\004\342A\001"
          + "\005\022\020\n\002id\030\002 \001(\tB\004\342A\001\005\022=\n\004type\030\003 \001(\0162).goog"
          + "le.cloud.retail.v2alpha.Product.TypeB\004\342A"
          + "\001\005\022\032\n\022primary_product_id\030\004 \001(\t\022\035\n\025collec"
          + "tion_member_ids\030\005 \003(\t\022\014\n\004gtin\030\006 \001(\t\022\022\n\nc"
          + "ategories\030\007 \003(\t\022\023\n\005title\030\010 \001(\tB\004\342A\001\002\022\016\n\006"
          + "brands\030\t \003(\t\022\023\n\013description\030\n \001(\t\022\025\n\rlan"
          + "guage_code\030\013 \001(\t\022H\n\nattributes\030\014 \003(\01324.g"
          + "oogle.cloud.retail.v2alpha.Product.Attri"
          + "butesEntry\022\014\n\004tags\030\r \003(\t\022:\n\nprice_info\030\016"
          + " \001(\0132&.google.cloud.retail.v2alpha.Price"
          + "Info\0223\n\006rating\030\017 \001(\0132#.google.cloud.reta"
          + "il.v2alpha.Rating\0222\n\016available_time\030\022 \001("
          + "\0132\032.google.protobuf.Timestamp\022G\n\014availab"
          + "ility\030\023 \001(\01621.google.cloud.retail.v2alph"
          + "a.Product.Availability\0227\n\022available_quan"
          + "tity\030\024 \001(\0132\033.google.protobuf.Int32Value\022"
          + "F\n\020fulfillment_info\030\025 \003(\0132,.google.cloud"
          + ".retail.v2alpha.FulfillmentInfo\022\013\n\003uri\030\026"
          + " \001(\t\0222\n\006images\030\027 \003(\0132\".google.cloud.reta"
          + "il.v2alpha.Image\0227\n\010audience\030\030 \001(\0132%.goo"
          + "gle.cloud.retail.v2alpha.Audience\022:\n\ncol"
          + "or_info\030\031 \001(\0132&.google.cloud.retail.v2al"
          + "pha.ColorInfo\022\r\n\005sizes\030\032 \003(\t\022\021\n\tmaterial"
          + "s\030\033 \003(\t\022\020\n\010patterns\030\034 \003(\t\022\022\n\nconditions\030"
          + "\035 \003(\t\022:\n\npromotions\030\" \003(\0132&.google.cloud"
          + ".retail.v2alpha.Promotion\0220\n\014publish_tim"
          + "e\030! \001(\0132\032.google.protobuf.Timestamp\022:\n\022r"
          + "etrievable_fields\030\036 \001(\0132\032.google.protobu"
          + "f.FieldMaskB\002\030\001\022<\n\010variants\030\037 \003(\0132$.goog"
          + "le.cloud.retail.v2alpha.ProductB\004\342A\001\003\022L\n"
          + "\021local_inventories\030# \003(\0132+.google.cloud."
          + "retail.v2alpha.LocalInventoryB\004\342A\001\003\032_\n\017A"
          + "ttributesEntry\022\013\n\003key\030\001 \001(\t\022;\n\005value\030\002 \001"
          + "(\0132,.google.cloud.retail.v2alpha.CustomA"
          + "ttribute:\0028\001\"F\n\004Type\022\024\n\020TYPE_UNSPECIFIED"
          + "\020\000\022\013\n\007PRIMARY\020\001\022\013\n\007VARIANT\020\002\022\016\n\nCOLLECTI"
          + "ON\020\003\"i\n\014Availability\022\034\n\030AVAILABILITY_UNS"
          + "PECIFIED\020\000\022\014\n\010IN_STOCK\020\001\022\020\n\014OUT_OF_STOCK"
          + "\020\002\022\014\n\010PREORDER\020\003\022\r\n\tBACKORDER\020\004:\204\001\352A\200\001\n\035"
          + "retail.googleapis.com/Product\022_projects/"
          + "{project}/locations/{location}/catalogs/"
          + "{catalog}/branches/{branch}/products/{pr"
          + "oduct}B\014\n\nexpirationB\277\002\n\037com.google.clou"
          + "d.retail.v2alphaB\014ProductProtoP\001Z7cloud."
          + "google.com/go/retail/apiv2alpha/retailpb"
          + ";retailpb\242\002\006RETAIL\252\002\033Google.Cloud.Retail"
          + ".V2Alpha\312\002\033Google\\Cloud\\Retail\\V2alpha\352\002"
          + "\036Google::Cloud::Retail::V2alpha\352Al\n\034reta"
          + "il.googleapis.com/Branch\022Lprojects/{proj"
          + "ect}/locations/{location}/catalogs/{cata"
          + "log}/branches/{branch}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2alpha.CommonProto.getDescriptor(),
              com.google.cloud.retail.v2alpha.PromotionProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2alpha_Product_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2alpha_Product_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_Product_descriptor,
            new java.lang.String[] {
              "ExpireTime",
              "Ttl",
              "Name",
              "Id",
              "Type",
              "PrimaryProductId",
              "CollectionMemberIds",
              "Gtin",
              "Categories",
              "Title",
              "Brands",
              "Description",
              "LanguageCode",
              "Attributes",
              "Tags",
              "PriceInfo",
              "Rating",
              "AvailableTime",
              "Availability",
              "AvailableQuantity",
              "FulfillmentInfo",
              "Uri",
              "Images",
              "Audience",
              "ColorInfo",
              "Sizes",
              "Materials",
              "Patterns",
              "Conditions",
              "Promotions",
              "PublishTime",
              "RetrievableFields",
              "Variants",
              "LocalInventories",
              "Expiration",
            });
    internal_static_google_cloud_retail_v2alpha_Product_AttributesEntry_descriptor =
        internal_static_google_cloud_retail_v2alpha_Product_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2alpha_Product_AttributesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_Product_AttributesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2alpha.CommonProto.getDescriptor();
    com.google.cloud.retail.v2alpha.PromotionProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
