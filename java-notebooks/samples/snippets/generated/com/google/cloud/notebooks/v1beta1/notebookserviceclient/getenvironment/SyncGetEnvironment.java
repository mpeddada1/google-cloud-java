/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.notebooks.v1beta1.samples;

// [START notebooks_v1beta1_generated_notebookserviceclient_getenvironment_sync]
import com.google.cloud.notebooks.v1beta1.Environment;
import com.google.cloud.notebooks.v1beta1.GetEnvironmentRequest;
import com.google.cloud.notebooks.v1beta1.NotebookServiceClient;

public class SyncGetEnvironment {

  public static void main(String[] args) throws Exception {
    syncGetEnvironment();
  }

  public static void syncGetEnvironment() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (NotebookServiceClient notebookServiceClient = NotebookServiceClient.create()) {
      GetEnvironmentRequest request =
          GetEnvironmentRequest.newBuilder().setName("name3373707").build();
      Environment response = notebookServiceClient.getEnvironment(request);
    }
  }
}
// [END notebooks_v1beta1_generated_notebookserviceclient_getenvironment_sync]