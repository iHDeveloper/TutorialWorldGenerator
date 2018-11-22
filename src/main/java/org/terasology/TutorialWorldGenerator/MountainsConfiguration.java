/*
 * Copyright 2018 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.TutorialWorldGenerator;

import org.terasology.entitySystem.Component;
import org.terasology.rendering.nui.properties.Range;

public class MountainsConfiguration implements Component {

    @Range(min = 200, max = 500f, increment = 20f, precision = 1, description = "Mountain Height")
    public float mountainHeight = 400;

}
