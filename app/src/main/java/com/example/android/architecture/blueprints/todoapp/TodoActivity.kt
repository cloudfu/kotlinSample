/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.architecture.blueprints.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.android.architecture.blueprints.todoapp.ui.Message
import com.example.android.architecture.blueprints.todoapp.ui.MessageCard
import dagger.hilt.android.AndroidEntryPoint

/**
 * Main activity for the todoapp
 */
@AndroidEntryPoint
class TodoActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        这样的函数调用通常与实现 “全面屏” 或者 “无边框” 显示效果相关的操作有关，不过具体含义取决于它所在的编程环境和框架
        enableEdgeToEdge()
        setContent {
//            MessageCard(Message("Hua", "Hello World"))
            TodoTheme {
                TodoNavGraph()
            }
        }
    }
}
