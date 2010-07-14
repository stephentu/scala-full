/*
 * Copyright (C) 2007 The Android Open Source Project
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

package com.example.android.apis.view

// Need the following import to get access to the app resources, since this
// class is in a sub-package.
import com.example.android.apis.R

import android.app.Activity
import android.os.Bundle
import android.widget.{Spinner, ArrayAdapter}

/**
 * A gallery of basic controls: Button, EditText, RadioButton, Checkbox,
 * Spinner. This example uses the light theme.
 */
object Controls1 {
  private final val mStrings = Array(
    "Mercury", "Venus", "Earth", "Mars", "Jupiter",
    "Saturn", "Uranus", "Neptune"
  )
}

class Controls1 extends Activity {
  import Controls1._  // companion object

  override protected def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.controls_1)

    val s1 = findViewById(R.id.spinner1).asInstanceOf[Spinner]
    val adapter = new ArrayAdapter[String](this,
                android.R.layout.simple_spinner_item, mStrings)
    adapter setDropDownViewResource android.R.layout.simple_spinner_dropdown_item
    s1 setAdapter adapter
  }

}
