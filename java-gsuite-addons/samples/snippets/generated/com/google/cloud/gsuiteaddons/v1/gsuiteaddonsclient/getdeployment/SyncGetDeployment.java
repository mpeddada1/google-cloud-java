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

package com.google.cloud.gsuiteaddons.v1.samples;

// [START gsuiteaddons_v1_generated_gsuiteaddonsclient_getdeployment_sync]
import com.google.cloud.gsuiteaddons.v1.Deployment;
import com.google.cloud.gsuiteaddons.v1.DeploymentName;
import com.google.cloud.gsuiteaddons.v1.GSuiteAddOnsClient;
import com.google.cloud.gsuiteaddons.v1.GetDeploymentRequest;

public class SyncGetDeployment {

  public static void main(String[] args) throws Exception {
    syncGetDeployment();
  }

  public static void syncGetDeployment() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (GSuiteAddOnsClient gSuiteAddOnsClient = GSuiteAddOnsClient.create()) {
      GetDeploymentRequest request =
          GetDeploymentRequest.newBuilder()
              .setName(DeploymentName.of("[PROJECT]", "[DEPLOYMENT]").toString())
              .build();
      Deployment response = gSuiteAddOnsClient.getDeployment(request);
    }
  }
}
// [END gsuiteaddons_v1_generated_gsuiteaddonsclient_getdeployment_sync]
