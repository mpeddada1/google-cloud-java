// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkebackup/v1/backup.proto

package com.google.cloud.gkebackup.v1;

public final class BackupProto {
  private BackupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkebackup_v1_Backup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_Backup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkebackup_v1_Backup_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_Backup_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/gkebackup/v1/backup.proto" +
      "\022\031google.cloud.gkebackup.v1\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\032&google/cloud/gkebackup/v1/commo" +
      "n.proto\032\037google/protobuf/timestamp.proto" +
      "\"\273\r\n\006Backup\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\020\n\003uid\030\002 " +
      "\001(\tB\003\340A\003\0224\n\013create_time\030\003 \001(\0132\032.google.p" +
      "rotobuf.TimestampB\003\340A\003\0224\n\013update_time\030\004 " +
      "\001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\023\n\006" +
      "manual\030\005 \001(\010B\003\340A\003\022=\n\006labels\030\006 \003(\0132-.goog" +
      "le.cloud.gkebackup.v1.Backup.LabelsEntry" +
      "\022\030\n\020delete_lock_days\030\007 \001(\005\022@\n\027delete_loc" +
      "k_expire_time\030\010 \001(\0132\032.google.protobuf.Ti" +
      "mestampB\003\340A\003\022\023\n\013retain_days\030\t \001(\005\022;\n\022ret" +
      "ain_expire_time\030\n \001(\0132\032.google.protobuf." +
      "TimestampB\003\340A\003\022E\n\016encryption_key\030\013 \001(\0132(" +
      ".google.cloud.gkebackup.v1.EncryptionKey" +
      "B\003\340A\003\022\035\n\016all_namespaces\030\014 \001(\010B\003\340A\003H\000\022I\n\023" +
      "selected_namespaces\030\r \001(\0132%.google.cloud" +
      ".gkebackup.v1.NamespacesB\003\340A\003H\000\022P\n\025selec" +
      "ted_applications\030\016 \001(\0132*.google.cloud.gk" +
      "ebackup.v1.NamespacedNamesB\003\340A\003H\000\022!\n\024con" +
      "tains_volume_data\030\017 \001(\010B\003\340A\003\022\035\n\020contains" +
      "_secrets\030\020 \001(\010B\003\340A\003\022P\n\020cluster_metadata\030" +
      "\021 \001(\01321.google.cloud.gkebackup.v1.Backup" +
      ".ClusterMetadataB\003\340A\003\022;\n\005state\030\022 \001(\0162\'.g" +
      "oogle.cloud.gkebackup.v1.Backup.StateB\003\340" +
      "A\003\022\031\n\014state_reason\030\023 \001(\tB\003\340A\003\0226\n\rcomplet" +
      "e_time\030\024 \001(\0132\032.google.protobuf.Timestamp" +
      "B\003\340A\003\022\033\n\016resource_count\030\025 \001(\005B\003\340A\003\022\031\n\014vo" +
      "lume_count\030\026 \001(\005B\003\340A\003\022\027\n\nsize_bytes\030\027 \001(" +
      "\003B\003\340A\003\022\021\n\004etag\030\030 \001(\tB\003\340A\003\022\023\n\013description" +
      "\030\031 \001(\t\022\026\n\tpod_count\030\032 \001(\005B\003\340A\003\022%\n\030config" +
      "_backup_size_bytes\030\033 \001(\003B\003\340A\003\032\235\002\n\017Cluste" +
      "rMetadata\022\017\n\007cluster\030\001 \001(\t\022\023\n\013k8s_versio" +
      "n\030\002 \001(\t\022e\n\023backup_crd_versions\030\003 \003(\0132H.g" +
      "oogle.cloud.gkebackup.v1.Backup.ClusterM" +
      "etadata.BackupCrdVersionsEntry\022\025\n\013gke_ve" +
      "rsion\030\004 \001(\tH\000\022\030\n\016anthos_version\030\005 \001(\tH\000\032" +
      "8\n\026BackupCrdVersionsEntry\022\013\n\003key\030\001 \001(\t\022\r" +
      "\n\005value\030\002 \001(\t:\0028\001B\022\n\020platform_version\032-\n" +
      "\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t" +
      ":\0028\001\"f\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010" +
      "CREATING\020\001\022\017\n\013IN_PROGRESS\020\002\022\r\n\tSUCCEEDED" +
      "\020\003\022\n\n\006FAILED\020\004\022\014\n\010DELETING\020\005:x\352Au\n\037gkeba" +
      "ckup.googleapis.com/Backup\022Rprojects/{pr" +
      "oject}/locations/{location}/backupPlans/" +
      "{backup_plan}/backups/{backup}B\016\n\014backup" +
      "_scopeB\311\001\n\035com.google.cloud.gkebackup.v1" +
      "B\013BackupProtoP\001ZBgoogle.golang.org/genpr" +
      "oto/googleapis/cloud/gkebackup/v1;gkebac" +
      "kup\252\002\031Google.Cloud.GkeBackup.V1\312\002\031Google" +
      "\\Cloud\\GkeBackup\\V1\352\002\034Google::Cloud::Gke" +
      "Backup::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.gkebackup.v1.CommonProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_gkebackup_v1_Backup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_Backup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkebackup_v1_Backup_descriptor,
        new java.lang.String[] { "Name", "Uid", "CreateTime", "UpdateTime", "Manual", "Labels", "DeleteLockDays", "DeleteLockExpireTime", "RetainDays", "RetainExpireTime", "EncryptionKey", "AllNamespaces", "SelectedNamespaces", "SelectedApplications", "ContainsVolumeData", "ContainsSecrets", "ClusterMetadata", "State", "StateReason", "CompleteTime", "ResourceCount", "VolumeCount", "SizeBytes", "Etag", "Description", "PodCount", "ConfigBackupSizeBytes", "BackupScope", });
    internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_descriptor =
      internal_static_google_cloud_gkebackup_v1_Backup_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_descriptor,
        new java.lang.String[] { "Cluster", "K8SVersion", "BackupCrdVersions", "GkeVersion", "AnthosVersion", "PlatformVersion", });
    internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_descriptor =
      internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_gkebackup_v1_Backup_LabelsEntry_descriptor =
      internal_static_google_cloud_gkebackup_v1_Backup_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_gkebackup_v1_Backup_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkebackup_v1_Backup_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.gkebackup.v1.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}