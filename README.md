
# WorkOut App
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)
[![Kotlin](https://img.shields.io/badge/Kotlin-1.4.10-blue.svg)](https://kotlinlang.org)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)


Easy to use exercise workout app based on modern Android application tech-stacks and MVVM architecture.


## Features

- Workout of 12 exercises (30 seconds each).
- Play aloud the name of the exercise.
- Screen to rest after each exercise (10 seconds).
- Play a sound to indicate that rest for next exercise.
- History of past workouts.
- BMI Calculator with 2 units system (Metrics and US).


## Tech Stack & Open-source libraries

 - Minimum SDK level 21.
 - [Kotlin](https://kotlinlang.org/) - Official programming language for Android development.
 - [Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) - for asynchronous programming.
 - [Android Architecture Componentse](https://developer.android.com/topic/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
   
    🔹[LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - data objects that notify views when the underlying database changes.
    
    🔹[Data Binding](https://developer.android.com/topic/libraries/data-binding) - data objects to bind UI components in your layouts to data sources in your app.
     
    🔹[ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - stores UI-related data that isn't destroyed on UI changes.  

    🔹[Room](https://developer.android.com/training/data-storage/room) - access your app's SQLite database with in-app objects and compile-time checks.  

    🔹[lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle) - components to perform actions in response to a change in the lifecycle status of another component, such as activities and fragments.
- [Navigation](https://developer.android.com/guide/navigation) - interactions that allow users to navigate across, into, and back out from the different pieces of content within your app.
- [Fragment](https://developer.android.com/guide/fragments) - represents a behavior or a portion of user interface in a FragmentActivity.
- [Recyclerview](https://developer.android.com/develop/ui/views/layout/recyclerview) - for display a scrolling list of elements based on large data sets.  

   🔹RecyclerView Animators - library that allows developers to easily create RecyclerView with animations.
- [Material-Components](https://github.com/material-components/material-components-android) - Material design components.

   🔹[Material Dialog] - library with extensible dialogs API for Kotlin & Android.


## Architecture
This app uses MVVM [Model View View-Model](https://developer.android.com/topic/architecture#recommended-app-arch) architecture.

![Alt text](https://github.com/jaysinghpatel0/WorkoutApp/blob/main/architecture.png)
## Contribute
Awesome! If you would like to contribute you're always welcome!
