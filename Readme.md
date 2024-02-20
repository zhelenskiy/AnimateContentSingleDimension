## Description

This project is a tiny Kotlin Multiplatform Compose library that provides `animateContentHeight` and `animateContentWidth` functions which are similar to the existing `androidx.compose.animation.animateContentSize` but affects only one dimension. They reuse implementation of the latter one.

## Use case

Some content might `fillContentWidth` but have variable height which should be animated. In this case standard `animateContentSize` would lead to unintended dragging during changing width, so you need `animateContentHeight`. The same thing is with `animateContentWidth`.

## API

```kotlin
fun Modifier.animateContentHeight(
    animationSpec: FiniteAnimationSpec<Int> = spring(),
    finishedListener: ((initialValue: Int, targetValue: Int) -> Unit)? = null
): Modifier 
```

```kotlin
fun Modifier.animateContentWidth(
    animationSpec: FiniteAnimationSpec<Int> = spring(),
    finishedListener: ((initialValue: Int, targetValue: Int) -> Unit)? = null
): Modifier
```