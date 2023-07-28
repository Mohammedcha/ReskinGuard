# ReskinGuard Android Library

ReskinGuard is an Android library designed to protect your app from being reskinned or cloned. It helps to prevent unauthorized use of your app's codebase by detecting package name changes and redirecting users to the original version on Google Play if a cloned version is detected.


## Integration Steps:

First of all you need to download the library  and import it to your android project 


### 1. Add the Dependency:

Open your app's `build.gradle` file and add the ReskinGuard dependency in the dependencies section:

   ```gradle
   implementation project(path: ':ReskinGuard')
  ```


### 2. Import the ReskinGuard Classes:

In the Java or Kotlin file where you want to use ReskinGuard, import the necessary classes:

  ```java
  import com.reskinning.ReskinGuard.*;
  ```


### 3. Initialize ReskinGuard:

In the `onResume()` method of your main activity or any other relevant activity, call the `ReskinGuard.Init()` method to initialize the ReskinGuard library. Pass the required parameters as follows:
  
  ```java
  protected void onResume() {
      super.onResume();
      ReskinGuard.Init(this, "Encoded Here", true);
  }
 ```

Replace `Encoded Here` with the actual encoded value that you obtained from the console during the first run of the application.


### 4. Build and Run:

Build and run your Android application. ReskinGuard will now be protecting your app from unauthorized reskinning and tampering.


## App Redirection:

If anyone reskins or clones your app and publishes it on the Play Store, the app will automatically redirect its users to the original version on Google Play. This ensures that users only interact with the legitimate version of your app.

By integrating ReskinGuard, you enhance the security of your app, protect your intellectual property, and maintain user trust in the authenticity of your application.

