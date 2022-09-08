// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orchestration/airflow/service/v1beta1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1beta1;

public interface EnvironmentConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.EnvironmentConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The Kubernetes Engine cluster used to run this environment.
   * </pre>
   *
   * <code>string gke_cluster = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The gkeCluster.
   */
  java.lang.String getGkeCluster();
  /**
   * <pre>
   * Output only. The Kubernetes Engine cluster used to run this environment.
   * </pre>
   *
   * <code>string gke_cluster = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for gkeCluster.
   */
  com.google.protobuf.ByteString
      getGkeClusterBytes();

  /**
   * <pre>
   * Output only. The Cloud Storage prefix of the DAGs for this environment. Although Cloud
   * Storage objects reside in a flat namespace, a hierarchical file tree
   * can be simulated using "/"-delimited object name prefixes. DAG objects for
   * this environment reside in a simulated directory with the given prefix.
   * </pre>
   *
   * <code>string dag_gcs_prefix = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The dagGcsPrefix.
   */
  java.lang.String getDagGcsPrefix();
  /**
   * <pre>
   * Output only. The Cloud Storage prefix of the DAGs for this environment. Although Cloud
   * Storage objects reside in a flat namespace, a hierarchical file tree
   * can be simulated using "/"-delimited object name prefixes. DAG objects for
   * this environment reside in a simulated directory with the given prefix.
   * </pre>
   *
   * <code>string dag_gcs_prefix = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for dagGcsPrefix.
   */
  com.google.protobuf.ByteString
      getDagGcsPrefixBytes();

  /**
   * <pre>
   * The number of nodes in the Kubernetes Engine cluster that will be
   * used to run this environment.
   * </pre>
   *
   * <code>int32 node_count = 3;</code>
   * @return The nodeCount.
   */
  int getNodeCount();

  /**
   * <pre>
   * The configuration settings for software inside the environment.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.SoftwareConfig software_config = 4;</code>
   * @return Whether the softwareConfig field is set.
   */
  boolean hasSoftwareConfig();
  /**
   * <pre>
   * The configuration settings for software inside the environment.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.SoftwareConfig software_config = 4;</code>
   * @return The softwareConfig.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.SoftwareConfig getSoftwareConfig();
  /**
   * <pre>
   * The configuration settings for software inside the environment.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.SoftwareConfig software_config = 4;</code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.SoftwareConfigOrBuilder getSoftwareConfigOrBuilder();

  /**
   * <pre>
   * The configuration used for the Kubernetes Engine cluster.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.NodeConfig node_config = 5;</code>
   * @return Whether the nodeConfig field is set.
   */
  boolean hasNodeConfig();
  /**
   * <pre>
   * The configuration used for the Kubernetes Engine cluster.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.NodeConfig node_config = 5;</code>
   * @return The nodeConfig.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.NodeConfig getNodeConfig();
  /**
   * <pre>
   * The configuration used for the Kubernetes Engine cluster.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.NodeConfig node_config = 5;</code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.NodeConfigOrBuilder getNodeConfigOrBuilder();

  /**
   * <pre>
   * The configuration used for the Private IP Cloud Composer environment.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.PrivateEnvironmentConfig private_environment_config = 7;</code>
   * @return Whether the privateEnvironmentConfig field is set.
   */
  boolean hasPrivateEnvironmentConfig();
  /**
   * <pre>
   * The configuration used for the Private IP Cloud Composer environment.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.PrivateEnvironmentConfig private_environment_config = 7;</code>
   * @return The privateEnvironmentConfig.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.PrivateEnvironmentConfig getPrivateEnvironmentConfig();
  /**
   * <pre>
   * The configuration used for the Private IP Cloud Composer environment.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.PrivateEnvironmentConfig private_environment_config = 7;</code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.PrivateEnvironmentConfigOrBuilder getPrivateEnvironmentConfigOrBuilder();

  /**
   * <pre>
   * Optional. The network-level access control policy for the Airflow web server. If
   * unspecified, no network-level access restrictions will be applied.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WebServerNetworkAccessControl web_server_network_access_control = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the webServerNetworkAccessControl field is set.
   */
  boolean hasWebServerNetworkAccessControl();
  /**
   * <pre>
   * Optional. The network-level access control policy for the Airflow web server. If
   * unspecified, no network-level access restrictions will be applied.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WebServerNetworkAccessControl web_server_network_access_control = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The webServerNetworkAccessControl.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.WebServerNetworkAccessControl getWebServerNetworkAccessControl();
  /**
   * <pre>
   * Optional. The network-level access control policy for the Airflow web server. If
   * unspecified, no network-level access restrictions will be applied.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WebServerNetworkAccessControl web_server_network_access_control = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.WebServerNetworkAccessControlOrBuilder getWebServerNetworkAccessControlOrBuilder();

  /**
   * <pre>
   * Optional. The configuration settings for Cloud SQL instance used internally by Apache
   * Airflow software.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.DatabaseConfig database_config = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the databaseConfig field is set.
   */
  boolean hasDatabaseConfig();
  /**
   * <pre>
   * Optional. The configuration settings for Cloud SQL instance used internally by Apache
   * Airflow software.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.DatabaseConfig database_config = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The databaseConfig.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.DatabaseConfig getDatabaseConfig();
  /**
   * <pre>
   * Optional. The configuration settings for Cloud SQL instance used internally by Apache
   * Airflow software.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.DatabaseConfig database_config = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.DatabaseConfigOrBuilder getDatabaseConfigOrBuilder();

  /**
   * <pre>
   * Optional. The configuration settings for the Airflow web server App Engine instance.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WebServerConfig web_server_config = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the webServerConfig field is set.
   */
  boolean hasWebServerConfig();
  /**
   * <pre>
   * Optional. The configuration settings for the Airflow web server App Engine instance.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WebServerConfig web_server_config = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The webServerConfig.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.WebServerConfig getWebServerConfig();
  /**
   * <pre>
   * Optional. The configuration settings for the Airflow web server App Engine instance.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WebServerConfig web_server_config = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.WebServerConfigOrBuilder getWebServerConfigOrBuilder();

  /**
   * <pre>
   * Output only. The URI of the Apache Airflow Web UI hosted within this environment (see
   * [Airflow web
   * interface](/composer/docs/how-to/accessing/airflow-web-interface)).
   * </pre>
   *
   * <code>string airflow_uri = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The airflowUri.
   */
  java.lang.String getAirflowUri();
  /**
   * <pre>
   * Output only. The URI of the Apache Airflow Web UI hosted within this environment (see
   * [Airflow web
   * interface](/composer/docs/how-to/accessing/airflow-web-interface)).
   * </pre>
   *
   * <code>string airflow_uri = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for airflowUri.
   */
  com.google.protobuf.ByteString
      getAirflowUriBytes();

  /**
   * <pre>
   * Optional. The encryption options for the Cloud Composer environment and its
   * dependencies. Cannot be updated.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.EncryptionConfig encryption_config = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the encryptionConfig field is set.
   */
  boolean hasEncryptionConfig();
  /**
   * <pre>
   * Optional. The encryption options for the Cloud Composer environment and its
   * dependencies. Cannot be updated.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.EncryptionConfig encryption_config = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The encryptionConfig.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.EncryptionConfig getEncryptionConfig();
  /**
   * <pre>
   * Optional. The encryption options for the Cloud Composer environment and its
   * dependencies. Cannot be updated.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.EncryptionConfig encryption_config = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.EncryptionConfigOrBuilder getEncryptionConfigOrBuilder();

  /**
   * <pre>
   * Optional. The maintenance window is the period when Cloud Composer components may
   * undergo maintenance. It is defined so that maintenance is not executed
   * during peak hours or critical time periods.
   * The system will not be under maintenance for every occurrence of this
   * window, but when maintenance is planned, it will be scheduled
   * during the window.
   * The maintenance window period must encompass at least 12 hours per week.
   * This may be split into multiple chunks, each with a size of
   * at least 4 hours.
   * If this value is omitted, Cloud Composer components may be subject to
   * maintenance at any time.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.MaintenanceWindow maintenance_window = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the maintenanceWindow field is set.
   */
  boolean hasMaintenanceWindow();
  /**
   * <pre>
   * Optional. The maintenance window is the period when Cloud Composer components may
   * undergo maintenance. It is defined so that maintenance is not executed
   * during peak hours or critical time periods.
   * The system will not be under maintenance for every occurrence of this
   * window, but when maintenance is planned, it will be scheduled
   * during the window.
   * The maintenance window period must encompass at least 12 hours per week.
   * This may be split into multiple chunks, each with a size of
   * at least 4 hours.
   * If this value is omitted, Cloud Composer components may be subject to
   * maintenance at any time.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.MaintenanceWindow maintenance_window = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The maintenanceWindow.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.MaintenanceWindow getMaintenanceWindow();
  /**
   * <pre>
   * Optional. The maintenance window is the period when Cloud Composer components may
   * undergo maintenance. It is defined so that maintenance is not executed
   * during peak hours or critical time periods.
   * The system will not be under maintenance for every occurrence of this
   * window, but when maintenance is planned, it will be scheduled
   * during the window.
   * The maintenance window period must encompass at least 12 hours per week.
   * This may be split into multiple chunks, each with a size of
   * at least 4 hours.
   * If this value is omitted, Cloud Composer components may be subject to
   * maintenance at any time.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.MaintenanceWindow maintenance_window = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.MaintenanceWindowOrBuilder getMaintenanceWindowOrBuilder();

  /**
   * <pre>
   * Optional. The workloads configuration settings for the GKE cluster associated with
   * the Cloud Composer environment. The GKE cluster runs Airflow scheduler, web
   * server and workers workloads.
   * This field is supported for Cloud Composer environments in versions
   * composer-2.*.*-airflow-*.*.* and newer.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig workloads_config = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the workloadsConfig field is set.
   */
  boolean hasWorkloadsConfig();
  /**
   * <pre>
   * Optional. The workloads configuration settings for the GKE cluster associated with
   * the Cloud Composer environment. The GKE cluster runs Airflow scheduler, web
   * server and workers workloads.
   * This field is supported for Cloud Composer environments in versions
   * composer-2.*.*-airflow-*.*.* and newer.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig workloads_config = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The workloadsConfig.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig getWorkloadsConfig();
  /**
   * <pre>
   * Optional. The workloads configuration settings for the GKE cluster associated with
   * the Cloud Composer environment. The GKE cluster runs Airflow scheduler, web
   * server and workers workloads.
   * This field is supported for Cloud Composer environments in versions
   * composer-2.*.*-airflow-*.*.* and newer.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig workloads_config = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfigOrBuilder getWorkloadsConfigOrBuilder();

  /**
   * <pre>
   * Optional. The size of the Cloud Composer environment.
   * This field is supported for Cloud Composer environments in versions
   * composer-2.*.*-airflow-*.*.* and newer.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentConfig.EnvironmentSize environment_size = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for environmentSize.
   */
  int getEnvironmentSizeValue();
  /**
   * <pre>
   * Optional. The size of the Cloud Composer environment.
   * This field is supported for Cloud Composer environments in versions
   * composer-2.*.*-airflow-*.*.* and newer.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentConfig.EnvironmentSize environment_size = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The environmentSize.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentConfig.EnvironmentSize getEnvironmentSize();
}