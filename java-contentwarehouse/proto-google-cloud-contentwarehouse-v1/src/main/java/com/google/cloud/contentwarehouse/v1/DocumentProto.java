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
// source: google/cloud/contentwarehouse/v1/document.proto

package com.google.cloud.contentwarehouse.v1;

public final class DocumentProto {
  private DocumentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_Document_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_Document_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_DocumentReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_DocumentReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_Property_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_Property_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_IntegerArray_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_IntegerArray_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_FloatArray_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_FloatArray_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_TextArray_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_TextArray_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_EnumArray_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_EnumArray_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_DateTimeArray_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_DateTimeArray_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_TimestampArray_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_TimestampArray_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_TimestampValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_TimestampValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_PropertyArray_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_PropertyArray_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_MapProperty_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_MapProperty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_MapProperty_FieldsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_MapProperty_FieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_Value_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_Value_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_EnumValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_EnumValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/contentwarehouse/v1/docum"
          + "ent.proto\022 google.cloud.contentwarehouse"
          + ".v1\032\037google/api/field_behavior.proto\032\031go"
          + "ogle/api/resource.proto\032)google/cloud/do"
          + "cumentai/v1/document.proto\032\037google/proto"
          + "buf/timestamp.proto\032\032google/type/datetim"
          + "e.proto\"\260\010\n\010Document\022\014\n\004name\030\001 \001(\t\022\024\n\014re"
          + "ference_id\030\013 \001(\t\022\031\n\014display_name\030\002 \001(\tB\003"
          + "\340A\002\022\r\n\005title\030\022 \001(\t\022\023\n\013display_uri\030\021 \001(\t\022"
          + "Q\n\024document_schema_name\030\003 \001(\tB3\372A0\n.cont"
          + "entwarehouse.googleapis.com/DocumentSche"
          + "ma\022\024\n\nplain_text\030\017 \001(\tH\000\022A\n\021cloud_ai_doc"
          + "ument\030\004 \001(\0132$.google.cloud.documentai.v1"
          + ".DocumentH\000\022\"\n\026structured_content_uri\030\020 "
          + "\001(\tB\002\030\001\022\033\n\021raw_document_path\030\005 \001(\tH\001\022\035\n\023"
          + "inline_raw_document\030\006 \001(\014H\001\022>\n\npropertie"
          + "s\030\007 \003(\0132*.google.cloud.contentwarehouse."
          + "v1.Property\0224\n\013update_time\030\010 \001(\0132\032.googl"
          + "e.protobuf.TimestampB\003\340A\003\0224\n\013create_time"
          + "\030\t \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022"
          + "U\n\026raw_document_file_type\030\n \001(\01625.google"
          + ".cloud.contentwarehouse.v1.RawDocumentFi"
          + "leType\022\031\n\rasync_enabled\030\014 \001(\010B\002\030\001\022K\n\020con"
          + "tent_category\030\024 \001(\01621.google.cloud.conte"
          + "ntwarehouse.v1.ContentCategory\022$\n\030text_e"
          + "xtraction_disabled\030\023 \001(\010B\002\030\001\022\037\n\027text_ext"
          + "raction_enabled\030\025 \001(\010\022\017\n\007creator\030\r \001(\t\022\017"
          + "\n\007updater\030\016 \001(\t:\272\001\352A\266\001\n(contentwarehouse"
          + ".googleapis.com/Document\022<projects/{proj"
          + "ect}/locations/{location}/documents/{doc"
          + "ument}\022Lprojects/{project}/locations/{lo"
          + "cation}/documents/referenceId/{reference"
          + "_id}B\024\n\022structured_contentB\016\n\014raw_docume"
          + "nt\"\301\002\n\021DocumentReference\022G\n\rdocument_nam"
          + "e\030\001 \001(\tB0\340A\002\372A*\n(contentwarehouse.google"
          + "apis.com/Document\022\024\n\014display_name\030\002 \001(\t\022"
          + "\017\n\007snippet\030\003 \001(\t\022\032\n\022document_is_folder\030\004"
          + " \001(\010\0224\n\013update_time\030\005 \001(\0132\032.google.proto"
          + "buf.TimestampB\003\340A\003\0224\n\013create_time\030\006 \001(\0132"
          + "\032.google.protobuf.TimestampB\003\340A\003\0224\n\013dele"
          + "te_time\030\007 \001(\0132\032.google.protobuf.Timestam"
          + "pB\003\340A\003\"\355\004\n\010Property\022\021\n\004name\030\001 \001(\tB\003\340A\002\022H"
          + "\n\016integer_values\030\002 \001(\0132..google.cloud.co"
          + "ntentwarehouse.v1.IntegerArrayH\000\022D\n\014floa"
          + "t_values\030\003 \001(\0132,.google.cloud.contentwar"
          + "ehouse.v1.FloatArrayH\000\022B\n\013text_values\030\004 "
          + "\001(\0132+.google.cloud.contentwarehouse.v1.T"
          + "extArrayH\000\022B\n\013enum_values\030\005 \001(\0132+.google"
          + ".cloud.contentwarehouse.v1.EnumArrayH\000\022J"
          + "\n\017property_values\030\006 \001(\0132/.google.cloud.c"
          + "ontentwarehouse.v1.PropertyArrayH\000\022K\n\020da"
          + "te_time_values\030\007 \001(\0132/.google.cloud.cont"
          + "entwarehouse.v1.DateTimeArrayH\000\022E\n\014map_p"
          + "roperty\030\010 \001(\0132-.google.cloud.contentware"
          + "house.v1.MapPropertyH\000\022L\n\020timestamp_valu"
          + "es\030\t \001(\01320.google.cloud.contentwarehouse"
          + ".v1.TimestampArrayH\000B\010\n\006values\"\036\n\014Intege"
          + "rArray\022\016\n\006values\030\001 \003(\005\"\034\n\nFloatArray\022\016\n\006"
          + "values\030\001 \003(\002\"\033\n\tTextArray\022\016\n\006values\030\001 \003("
          + "\t\"\033\n\tEnumArray\022\016\n\006values\030\001 \003(\t\"6\n\rDateTi"
          + "meArray\022%\n\006values\030\001 \003(\0132\025.google.type.Da"
          + "teTime\"R\n\016TimestampArray\022@\n\006values\030\001 \003(\013"
          + "20.google.cloud.contentwarehouse.v1.Time"
          + "stampValue\"f\n\016TimestampValue\0225\n\017timestam"
          + "p_value\030\001 \001(\0132\032.google.protobuf.Timestam"
          + "pH\000\022\024\n\ntext_value\030\002 \001(\tH\000B\007\n\005value\"O\n\rPr"
          + "opertyArray\022>\n\nproperties\030\001 \003(\0132*.google"
          + ".cloud.contentwarehouse.v1.Property\"\260\001\n\013"
          + "MapProperty\022I\n\006fields\030\001 \003(\01329.google.clo"
          + "ud.contentwarehouse.v1.MapProperty.Field"
          + "sEntry\032V\n\013FieldsEntry\022\013\n\003key\030\001 \001(\t\0226\n\005va"
          + "lue\030\002 \001(\0132\'.google.cloud.contentwarehous"
          + "e.v1.Value:\0028\001\"\255\002\n\005Value\022\025\n\013float_value\030"
          + "\001 \001(\002H\000\022\023\n\tint_value\030\002 \001(\005H\000\022\026\n\014string_v"
          + "alue\030\003 \001(\tH\000\022A\n\nenum_value\030\004 \001(\0132+.googl"
          + "e.cloud.contentwarehouse.v1.EnumValueH\000\022"
          + "/\n\016datetime_value\030\005 \001(\0132\025.google.type.Da"
          + "teTimeH\000\022K\n\017timestamp_value\030\006 \001(\01320.goog"
          + "le.cloud.contentwarehouse.v1.TimestampVa"
          + "lueH\000\022\027\n\rboolean_value\030\007 \001(\010H\000B\006\n\004kind\"\032"
          + "\n\tEnumValue\022\r\n\005value\030\001 \001(\t*\202\002\n\023RawDocume"
          + "ntFileType\022&\n\"RAW_DOCUMENT_FILE_TYPE_UNS"
          + "PECIFIED\020\000\022\036\n\032RAW_DOCUMENT_FILE_TYPE_PDF"
          + "\020\001\022\037\n\033RAW_DOCUMENT_FILE_TYPE_DOCX\020\002\022\037\n\033R"
          + "AW_DOCUMENT_FILE_TYPE_XLSX\020\003\022\037\n\033RAW_DOCU"
          + "MENT_FILE_TYPE_PPTX\020\004\022\037\n\033RAW_DOCUMENT_FI"
          + "LE_TYPE_TEXT\020\005\022\037\n\033RAW_DOCUMENT_FILE_TYPE"
          + "_TIFF\020\006*\207\001\n\017ContentCategory\022 \n\034CONTENT_C"
          + "ATEGORY_UNSPECIFIED\020\000\022\032\n\026CONTENT_CATEGOR"
          + "Y_IMAGE\020\001\022\032\n\026CONTENT_CATEGORY_AUDIO\020\002\022\032\n"
          + "\026CONTENT_CATEGORY_VIDEO\020\003B\365\001\n$com.google"
          + ".cloud.contentwarehouse.v1B\rDocumentProt"
          + "oP\001ZPcloud.google.com/go/contentwarehous"
          + "e/apiv1/contentwarehousepb;contentwareho"
          + "usepb\252\002 Google.Cloud.ContentWarehouse.V1"
          + "\312\002 Google\\Cloud\\ContentWarehouse\\V1\352\002#Go"
          + "ogle::Cloud::ContentWarehouse::V1b\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.documentai.v1.DocumentProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.DateTimeProto.getDescriptor(),
            });
    internal_static_google_cloud_contentwarehouse_v1_Document_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_contentwarehouse_v1_Document_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_Document_descriptor,
            new java.lang.String[] {
              "Name",
              "ReferenceId",
              "DisplayName",
              "Title",
              "DisplayUri",
              "DocumentSchemaName",
              "PlainText",
              "CloudAiDocument",
              "StructuredContentUri",
              "RawDocumentPath",
              "InlineRawDocument",
              "Properties",
              "UpdateTime",
              "CreateTime",
              "RawDocumentFileType",
              "AsyncEnabled",
              "ContentCategory",
              "TextExtractionDisabled",
              "TextExtractionEnabled",
              "Creator",
              "Updater",
              "StructuredContent",
              "RawDocument",
            });
    internal_static_google_cloud_contentwarehouse_v1_DocumentReference_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_contentwarehouse_v1_DocumentReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_DocumentReference_descriptor,
            new java.lang.String[] {
              "DocumentName",
              "DisplayName",
              "Snippet",
              "DocumentIsFolder",
              "UpdateTime",
              "CreateTime",
              "DeleteTime",
            });
    internal_static_google_cloud_contentwarehouse_v1_Property_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_contentwarehouse_v1_Property_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_Property_descriptor,
            new java.lang.String[] {
              "Name",
              "IntegerValues",
              "FloatValues",
              "TextValues",
              "EnumValues",
              "PropertyValues",
              "DateTimeValues",
              "MapProperty",
              "TimestampValues",
              "Values",
            });
    internal_static_google_cloud_contentwarehouse_v1_IntegerArray_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_contentwarehouse_v1_IntegerArray_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_IntegerArray_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_contentwarehouse_v1_FloatArray_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_contentwarehouse_v1_FloatArray_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_FloatArray_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_contentwarehouse_v1_TextArray_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_contentwarehouse_v1_TextArray_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_TextArray_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_contentwarehouse_v1_EnumArray_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_contentwarehouse_v1_EnumArray_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_EnumArray_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_contentwarehouse_v1_DateTimeArray_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_contentwarehouse_v1_DateTimeArray_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_DateTimeArray_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_contentwarehouse_v1_TimestampArray_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_contentwarehouse_v1_TimestampArray_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_TimestampArray_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_contentwarehouse_v1_TimestampValue_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_contentwarehouse_v1_TimestampValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_TimestampValue_descriptor,
            new java.lang.String[] {
              "TimestampValue", "TextValue", "Value",
            });
    internal_static_google_cloud_contentwarehouse_v1_PropertyArray_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_contentwarehouse_v1_PropertyArray_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_PropertyArray_descriptor,
            new java.lang.String[] {
              "Properties",
            });
    internal_static_google_cloud_contentwarehouse_v1_MapProperty_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_contentwarehouse_v1_MapProperty_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_MapProperty_descriptor,
            new java.lang.String[] {
              "Fields",
            });
    internal_static_google_cloud_contentwarehouse_v1_MapProperty_FieldsEntry_descriptor =
        internal_static_google_cloud_contentwarehouse_v1_MapProperty_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_contentwarehouse_v1_MapProperty_FieldsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_MapProperty_FieldsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_contentwarehouse_v1_Value_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_contentwarehouse_v1_Value_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_Value_descriptor,
            new java.lang.String[] {
              "FloatValue",
              "IntValue",
              "StringValue",
              "EnumValue",
              "DatetimeValue",
              "TimestampValue",
              "BooleanValue",
              "Kind",
            });
    internal_static_google_cloud_contentwarehouse_v1_EnumValue_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_contentwarehouse_v1_EnumValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_EnumValue_descriptor,
            new java.lang.String[] {
              "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.documentai.v1.DocumentProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.DateTimeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
