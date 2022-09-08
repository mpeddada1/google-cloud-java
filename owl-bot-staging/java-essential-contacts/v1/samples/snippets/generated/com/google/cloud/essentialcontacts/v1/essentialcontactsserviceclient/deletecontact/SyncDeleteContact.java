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

package com.google.cloud.essentialcontacts.v1.samples;

// [START essentialcontacts_v1_generated_essentialcontactsserviceclient_deletecontact_sync]
import com.google.cloud.essentialcontacts.v1.ContactName;
import com.google.cloud.essentialcontacts.v1.DeleteContactRequest;
import com.google.cloud.essentialcontacts.v1.EssentialContactsServiceClient;
import com.google.protobuf.Empty;

public class SyncDeleteContact {

  public static void main(String[] args) throws Exception {
    syncDeleteContact();
  }

  public static void syncDeleteContact() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (EssentialContactsServiceClient essentialContactsServiceClient =
        EssentialContactsServiceClient.create()) {
      DeleteContactRequest request =
          DeleteContactRequest.newBuilder()
              .setName(ContactName.ofProjectContactName("[PROJECT]", "[CONTACT]").toString())
              .build();
      essentialContactsServiceClient.deleteContact(request);
    }
  }
}
// [END essentialcontacts_v1_generated_essentialcontactsserviceclient_deletecontact_sync]