/*
 * Copyright 2018 Google LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package example;

import com.google.common.io.CharStreams;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HelloWorld {

  public static void main(String[] args) throws URISyntaxException, IOException {
    Package pack = HelloWorld.class.getPackage();
    System.out.println(pack.getImplementationTitle());
    System.out.println(pack.getImplementationVersion());

    try (Reader reader = new InputStreamReader(
        HelloWorld.class.getResourceAsStream("world"), StandardCharsets.UTF_8)) {
      String world = CharStreams.toString(reader);
      System.out.println("Hello " + world);
    }
  }
}
