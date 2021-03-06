/*
 * Copyright 2014-2016 Squarespace, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.squarespace.jersey2.guice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@com.google.inject.Singleton
@Path(MyGuiceSingletonResource.PATH)
public class MyGuiceSingletonResource {

  public static final String PATH = "/guice-singleton";
  
  public static final String RESPONSE = "HashCode: %s";
  
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String singleton() {
    return String.format(RESPONSE, hashCode());
  }
}