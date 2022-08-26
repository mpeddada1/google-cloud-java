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

package com.google.cloud.retail.v2.samples;

// [START retail_v2_generated_catalogserviceclient_getcompletionconfig_sync]
import com.google.cloud.retail.v2.CatalogServiceClient;
import com.google.cloud.retail.v2.CompletionConfig;
import com.google.cloud.retail.v2.CompletionConfigName;
import com.google.cloud.retail.v2.GetCompletionConfigRequest;

public class SyncGetCompletionConfig {

  public static void main(String[] args) throws Exception {
    syncGetCompletionConfig();
  }

  public static void syncGetCompletionConfig() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CatalogServiceClient catalogServiceClient = CatalogServiceClient.create()) {
      GetCompletionConfigRequest request =
          GetCompletionConfigRequest.newBuilder()
              .setName(CompletionConfigName.of("[PROJECT]", "[LOCATION]", "[CATALOG]").toString())
              .build();
      CompletionConfig response = catalogServiceClient.getCompletionConfig(request);
    }
  }
}
// [END retail_v2_generated_catalogserviceclient_getcompletionconfig_sync]