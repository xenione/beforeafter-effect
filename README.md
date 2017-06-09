# BeforeAfterEffect [![](https://jitpack.io/v/xenione/beforeafter-effect.svg)](https://jitpack.io/#xenione/beforeafter-effect)


After-Before swipe effect is using [Easy Swipe Maker Library](https://github.com/xenione/SwipeLayout). Have a look if you want to create your own amazing swipe  effects

Download app on [google play](https://play.google.com/store/apps/details?id=com.xenione.demos)

![before-aftereffect](https://cloud.githubusercontent.com/assets/4138527/19211444/9713cbdc-8d3c-11e6-84af-18a18ab02efb.gif)

add dependecies into your project

Add it in your root build.gradle at the end of repositories:

```java 
	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```
Add the dependency

```java 
dependencies {
    compile 'com.github.xenione:beforeafter-effect:1.1.1'

}
```

Add BeforeAfterCoordinatorLayout into your layout

```java 
<?xml version="1.0" encoding="utf-8"?>
<com.xenione.library.BeforeAfterCoordinatorLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/beforeAfterView"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

Get reference from your activity or fragment like that, and set background and foreground image

```java 
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BeforeAfterCoordinatorLayout beforeAfterCoordinatorLayout = (BeforeAfterCoordinatorLayout) findViewById(R.id.beforeAfterView);

        /*set background and foreground image */
        beforeAfterCoordinatorLayout.setForegroundImage(R.drawable.before);
        beforeAfterCoordinatorLayout.setBackgroundImage(R.drawable.after);
    }
}
```

# License
-------
    Copyright 2016 Eugeni Josep Senent i Gabriel

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
