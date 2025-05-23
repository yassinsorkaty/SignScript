# SignScript

## Overview

SignScript is an Android application that demonstrates real-time hand gesture recognition using [MediaPipe Tasks](https://developers.google.com/mediapipe). The app uses your device’s camera to detect and recognize hand gestures, which can be used for sign language recognition, gesture-based controls, or educational purposes.



## Features
- Real-time hand gesture recognition using the device camera
- Support for image and video input from the gallery
- Built with Android Jetpack libraries and CameraX
- Uses MediaPipe’s pre-trained gesture recognition models

## Technologies Used
- **Kotlin**
- **MediaPipe Tasks**
- **CameraX**
- **Android Jetpack (Navigation, ViewModel, etc.)**

## Getting Started
1. Clone the repository.
2. Open in Android Studio.
3. Build and run on a physical Android device (API 24+ recommended).

## Models Used
Downloading, extraction, and placing the models into the *assets* folder is managed automatically by the **download.gradle** file. You do not need to manually download the models unless you wish to use your own custom gesture recognition task. If you do, place it in the app's *assets* directory.

## Prerequisites
- [Android Studio](https://developer.android.com/studio/index.html) (tested on Android Studio Dolphin)
- A physical Android device with a minimum OS version of SDK 24 (Android 7.0 - Nougat) with developer mode enabled

## Building
1. Open Android Studio. From the Welcome screen, select "Open an existing Android Studio project."
2. Navigate to and select the project directory. Click OK and trust the project if prompted.
3. If prompted, perform a Gradle Sync.
4. With your Android device connected and developer mode enabled, click the green Run arrow in Android Studio.

---

Feel free to contribute or open issues for suggestions and improvements!
