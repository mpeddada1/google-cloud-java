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

package com.google.cloud.resourcemanager.v3.samples;

// [START cloudresourcemanager_v3_generated_TagHolds_DeleteTagHold_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.resourcemanager.v3.DeleteTagHoldMetadata;
import com.google.cloud.resourcemanager.v3.DeleteTagHoldRequest;
import com.google.cloud.resourcemanager.v3.TagHoldName;
import com.google.cloud.resourcemanager.v3.TagHoldsClient;
import com.google.protobuf.Empty;

public class AsyncDeleteTagHoldLRO {

  public static void main(String[] args) throws Exception {
    asyncDeleteTagHoldLRO();
  }

  public static void asyncDeleteTagHoldLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TagHoldsClient tagHoldsClient = TagHoldsClient.create()) {
      DeleteTagHoldRequest request =
          DeleteTagHoldRequest.newBuilder()
              .setName(TagHoldName.of("[TAG_VALUE]", "[TAG_HOLD]").toString())
              .setValidateOnly(true)
              .build();
      OperationFuture<Empty, DeleteTagHoldMetadata> future =
          tagHoldsClient.deleteTagHoldOperationCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END cloudresourcemanager_v3_generated_TagHolds_DeleteTagHold_LRO_async]
