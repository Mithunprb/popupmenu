# popupmenu
popup menu with intent such as share sent email sent sms

<br><br>
Follow following instructions to run the code on your device locally
[comment]: <> (The following part is takenfrom udacity they have amazing courses regarding android do chek out!!)
### Fixing the build.gradle file
Since Android is always releasing new sums of SDK packages, whenever you open or import an old project in Android Studio, you may see an alert saying that the plugin is too old:
![alt text](https://video.udacity-data.com/topher/2017/December/5a21dbdd_screen-shot-2017-12-01-at-2.46.23-pm/screen-shot-2017-12-01-at-2.46.23-pm.png)
To resolve this, click on the hyperlink "Fix Gradle version, Open Documentation" which opens up the documentation with instructions on how to resolve the issue.
<br>
Alternatively, you can update the Gradle version directly by navigating to Gradle Scripts, double-clicking the build.gradle file to open and edit the file:
![alt text](https://video.udacity-data.com/topher/2017/August/5991f7d1_screen-shot-2017-08-14-at-12.19.29-pm/screen-shot-2017-08-14-at-12.19.29-pm.png)
<br>
Make sure you include the most up-to-date versions of: <br>

- compileSdkVersion
- buildToolsVersion
- targetSdkVersion
<br>
In addition, in the same file, check if all the dependencies are also updated, for example when the beta version of Constraint Layout beta was released, she would complain about this from an alpha version, since it is now obsolete:

![alt text](https://video.udacity-data.com/topher/2017/August/5991f7e3_screen-shot-2017-08-14-at-12.19.54-pm/screen-shot-2017-08-14-at-12.19.54-pm.png)
