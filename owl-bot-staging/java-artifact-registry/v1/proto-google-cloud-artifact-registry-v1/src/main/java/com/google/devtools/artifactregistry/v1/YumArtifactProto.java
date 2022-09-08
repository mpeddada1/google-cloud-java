// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1/yum_artifact.proto

package com.google.devtools.artifactregistry.v1;

public final class YumArtifactProto {
  private YumArtifactProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1_YumArtifact_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_YumArtifact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsGcsSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsGcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsErrorInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsErrorInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/devtools/artifactregistry/v1/yu" +
      "m_artifact.proto\022#google.devtools.artifa" +
      "ctregistry.v1\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\032\027googl" +
      "e/rpc/status.proto\"\207\003\n\013YumArtifact\022\021\n\004na" +
      "me\030\001 \001(\tB\003\340A\003\022\031\n\014package_name\030\002 \001(\tB\003\340A\003" +
      "\022W\n\014package_type\030\003 \001(\0162<.google.devtools" +
      ".artifactregistry.v1.YumArtifact.Package" +
      "TypeB\003\340A\003\022\031\n\014architecture\030\004 \001(\tB\003\340A\003\"C\n\013" +
      "PackageType\022\034\n\030PACKAGE_TYPE_UNSPECIFIED\020" +
      "\000\022\n\n\006BINARY\020\001\022\n\n\006SOURCE\020\002:\220\001\352A\214\001\n+artifa" +
      "ctregistry.googleapis.com/YumArtifact\022]p" +
      "rojects/{project}/locations/{location}/r" +
      "epositories/{repository}/yumArtifacts/{y" +
      "um_artifact}\"B\n\033ImportYumArtifactsGcsSou" +
      "rce\022\014\n\004uris\030\001 \003(\t\022\025\n\ruse_wildcards\030\002 \001(\010" +
      "\"\215\001\n\031ImportYumArtifactsRequest\022V\n\ngcs_so" +
      "urce\030\002 \001(\0132@.google.devtools.artifactreg" +
      "istry.v1.ImportYumArtifactsGcsSourceH\000\022\016" +
      "\n\006parent\030\001 \001(\tB\010\n\006source\"\242\001\n\033ImportYumAr" +
      "tifactsErrorInfo\022V\n\ngcs_source\030\001 \001(\0132@.g" +
      "oogle.devtools.artifactregistry.v1.Impor" +
      "tYumArtifactsGcsSourceH\000\022!\n\005error\030\002 \001(\0132" +
      "\022.google.rpc.StatusB\010\n\006source\"\267\001\n\032Import" +
      "YumArtifactsResponse\022G\n\ryum_artifacts\030\001 " +
      "\003(\01320.google.devtools.artifactregistry.v" +
      "1.YumArtifact\022P\n\006errors\030\002 \003(\0132@.google.d" +
      "evtools.artifactregistry.v1.ImportYumArt" +
      "ifactsErrorInfo\"\034\n\032ImportYumArtifactsMet" +
      "adataB\376\001\n\'com.google.devtools.artifactre" +
      "gistry.v1B\020YumArtifactProtoP\001ZSgoogle.go" +
      "lang.org/genproto/googleapis/devtools/ar" +
      "tifactregistry/v1;artifactregistry\252\002 Goo" +
      "gle.Cloud.ArtifactRegistry.V1\312\002 Google\\C" +
      "loud\\ArtifactRegistry\\V1\352\002#Google::Cloud" +
      "::ArtifactRegistry::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_devtools_artifactregistry_v1_YumArtifact_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1_YumArtifact_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1_YumArtifact_descriptor,
        new java.lang.String[] { "Name", "PackageName", "PackageType", "Architecture", });
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsGcsSource_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsGcsSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsGcsSource_descriptor,
        new java.lang.String[] { "Uris", "UseWildcards", });
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsRequest_descriptor,
        new java.lang.String[] { "GcsSource", "Parent", "Source", });
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsErrorInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsErrorInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsErrorInfo_descriptor,
        new java.lang.String[] { "GcsSource", "Error", "Source", });
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsResponse_descriptor,
        new java.lang.String[] { "YumArtifacts", "Errors", });
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsMetadata_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsMetadata_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}