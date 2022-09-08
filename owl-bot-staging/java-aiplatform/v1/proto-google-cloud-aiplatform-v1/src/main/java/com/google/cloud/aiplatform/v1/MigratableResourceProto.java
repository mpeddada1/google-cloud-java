// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/migratable_resource.proto

package com.google.cloud.aiplatform.v1;

public final class MigratableResourceProto {
  private MigratableResourceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_MigratableResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MigratableResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_MigratableResource_MlEngineModelVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MigratableResource_MlEngineModelVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_MigratableResource_AutomlModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MigratableResource_AutomlModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_MigratableResource_AutomlDataset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MigratableResource_AutomlDataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_MigratableResource_DataLabelingDataset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MigratableResource_DataLabelingDataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_MigratableResource_DataLabelingDataset_DataLabelingAnnotatedDataset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MigratableResource_DataLabelingDataset_DataLabelingAnnotatedDataset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/aiplatform/v1/migratable_" +
      "resource.proto\022\032google.cloud.aiplatform." +
      "v1\032\037google/api/field_behavior.proto\032\031goo" +
      "gle/api/resource.proto\032\037google/protobuf/" +
      "timestamp.proto\"\323\t\n\022MigratableResource\022k" +
      "\n\027ml_engine_model_version\030\001 \001(\0132C.google" +
      ".cloud.aiplatform.v1.MigratableResource." +
      "MlEngineModelVersionB\003\340A\003H\000\022W\n\014automl_mo" +
      "del\030\002 \001(\0132:.google.cloud.aiplatform.v1.M" +
      "igratableResource.AutomlModelB\003\340A\003H\000\022[\n\016" +
      "automl_dataset\030\003 \001(\0132<.google.cloud.aipl" +
      "atform.v1.MigratableResource.AutomlDatas" +
      "etB\003\340A\003H\000\022h\n\025data_labeling_dataset\030\004 \001(\013" +
      "2B.google.cloud.aiplatform.v1.Migratable" +
      "Resource.DataLabelingDatasetB\003\340A\003H\000\022:\n\021l" +
      "ast_migrate_time\030\005 \001(\0132\032.google.protobuf" +
      ".TimestampB\003\340A\003\0229\n\020last_update_time\030\006 \001(" +
      "\0132\032.google.protobuf.TimestampB\003\340A\003\032Y\n\024Ml" +
      "EngineModelVersion\022\020\n\010endpoint\030\001 \001(\t\022/\n\007" +
      "version\030\002 \001(\tB\036\372A\033\n\031ml.googleapis.com/Ve" +
      "rsion\032Z\n\013AutomlModel\022/\n\005model\030\001 \001(\tB \372A\035" +
      "\n\033automl.googleapis.com/Model\022\032\n\022model_d" +
      "isplay_name\030\003 \001(\t\032b\n\rAutomlDataset\0223\n\007da" +
      "taset\030\001 \001(\tB\"\372A\037\n\035automl.googleapis.com/" +
      "Dataset\022\034\n\024dataset_display_name\030\004 \001(\t\032\221\003" +
      "\n\023DataLabelingDataset\0229\n\007dataset\030\001 \001(\tB(" +
      "\372A%\n#datalabeling.googleapis.com/Dataset" +
      "\022\034\n\024dataset_display_name\030\004 \001(\t\022\211\001\n data_" +
      "labeling_annotated_datasets\030\003 \003(\0132_.goog" +
      "le.cloud.aiplatform.v1.MigratableResourc" +
      "e.DataLabelingDataset.DataLabelingAnnota" +
      "tedDataset\032\224\001\n\034DataLabelingAnnotatedData" +
      "set\022L\n\021annotated_dataset\030\001 \001(\tB1\372A.\n,dat" +
      "alabeling.googleapis.com/AnnotatedDatase" +
      "t\022&\n\036annotated_dataset_display_name\030\003 \001(" +
      "\tB\n\n\010resourceB\262\005\n\036com.google.cloud.aipla" +
      "tform.v1B\027MigratableResourceProtoP\001ZDgoo" +
      "gle.golang.org/genproto/googleapis/cloud" +
      "/aiplatform/v1;aiplatform\252\002\032Google.Cloud" +
      ".AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatform" +
      "\\V1\352\002\035Google::Cloud::AIPlatform::V1\352AQ\n\031" +
      "ml.googleapis.com/Version\0224projects/{pro" +
      "ject}/models/{model}/versions/{version}\352" +
      "AU\n\033automl.googleapis.com/Model\0226project" +
      "s/{project}/locations/{location}/models/" +
      "{model}\352A[\n\035automl.googleapis.com/Datase" +
      "t\022:projects/{project}/locations/{locatio" +
      "n}/datasets/{dataset}\352AL\n#datalabeling.g" +
      "oogleapis.com/Dataset\022%projects/{project" +
      "}/datasets/{dataset}\352A{\n,datalabeling.go" +
      "ogleapis.com/AnnotatedDataset\022Kprojects/" +
      "{project}/datasets/{dataset}/annotatedDa" +
      "tasets/{annotated_dataset}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_MigratableResource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_MigratableResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_MigratableResource_descriptor,
        new java.lang.String[] { "MlEngineModelVersion", "AutomlModel", "AutomlDataset", "DataLabelingDataset", "LastMigrateTime", "LastUpdateTime", "Resource", });
    internal_static_google_cloud_aiplatform_v1_MigratableResource_MlEngineModelVersion_descriptor =
      internal_static_google_cloud_aiplatform_v1_MigratableResource_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_MigratableResource_MlEngineModelVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_MigratableResource_MlEngineModelVersion_descriptor,
        new java.lang.String[] { "Endpoint", "Version", });
    internal_static_google_cloud_aiplatform_v1_MigratableResource_AutomlModel_descriptor =
      internal_static_google_cloud_aiplatform_v1_MigratableResource_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_MigratableResource_AutomlModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_MigratableResource_AutomlModel_descriptor,
        new java.lang.String[] { "Model", "ModelDisplayName", });
    internal_static_google_cloud_aiplatform_v1_MigratableResource_AutomlDataset_descriptor =
      internal_static_google_cloud_aiplatform_v1_MigratableResource_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_MigratableResource_AutomlDataset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_MigratableResource_AutomlDataset_descriptor,
        new java.lang.String[] { "Dataset", "DatasetDisplayName", });
    internal_static_google_cloud_aiplatform_v1_MigratableResource_DataLabelingDataset_descriptor =
      internal_static_google_cloud_aiplatform_v1_MigratableResource_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_MigratableResource_DataLabelingDataset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_MigratableResource_DataLabelingDataset_descriptor,
        new java.lang.String[] { "Dataset", "DatasetDisplayName", "DataLabelingAnnotatedDatasets", });
    internal_static_google_cloud_aiplatform_v1_MigratableResource_DataLabelingDataset_DataLabelingAnnotatedDataset_descriptor =
      internal_static_google_cloud_aiplatform_v1_MigratableResource_DataLabelingDataset_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_MigratableResource_DataLabelingDataset_DataLabelingAnnotatedDataset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_MigratableResource_DataLabelingDataset_DataLabelingAnnotatedDataset_descriptor,
        new java.lang.String[] { "AnnotatedDataset", "AnnotatedDatasetDisplayName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}