/*
 * Copyright 2016-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package kotlinx.coroutines.internal

internal expect fun disposeLockFreeLinkedList(list: () -> LockFreeLinkedListNode?) // only needed on Kotlin/Native
