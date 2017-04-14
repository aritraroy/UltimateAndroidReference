# Ultimate Android Reference

The goal of this project is to provide a hand-picked collection of Android libraries, tools, open-source projects, books, blogs, tutorials - you name it.

This project will **only showcase the best, most popular and well-tested resources** that you will actually need rather than overwhelming you with a plethora of low-quality ones.

# Contribution

This project is open to all kinds of contribution in all of its categories. **Together, we can make it the ultimate Android reference available for free, for everyone, forever.**

If you have any suggestion for including more categories, feel free to raise a Github issue for more discussion on it. Please **DO NOT** contribute low-quality, spammy or self-promtional stuff. This project is meant to only include resources, **that make the cut**.

For resource contibution, just follow the following format: `[reference-name](link) - Description`, and raise a Pull Request. If you want to contribute multiple resources, consider raising seperate PRs for each of them.


# Categories

* [Libraries](#libraries)
* [Open-Source Apps](#open-source-apps)
* Tools
* Sites
* Books
* Tech Talks


# Libraries
These are some of the best and the most popular libraries and utilities to boost up your Android development. This list only includes libraries which have been battle tested by plenty of developers for a very long time.

## Background Processing

* [Android Priority Job Queue](https://github.com/yigit/android-priority-jobqueue) - A Job Queue specifically written for Android to easily schedule jobs (tasks) that run in the background, improving UX and application stability
* [Evernote's Android Job](https://github.com/evernote/android-job) - Android library to handle jobs in the background
* [Firebase Job Dispatcher](https://github.com/firebase/firebase-jobdispatcher-android) - The Firebase JobDispatcher is a library for scheduling background jobs in your Android app. It provides a JobScheduler-compatible API that works on all recent versions of Android (API level 9+) that have Google Play services installed

## Charts
* [MPAndroidChart](https://github.com/PhilJay/MPAndroidChart) - A powerful Android chart view / graph view library, supporting line- bar- pie- radar- bubble- and candlestick charts as well as scaling, dragging and animations
* [WilliamChart](https://github.com/diogobernardino/WilliamChart) - Android library to create charts
* [HelloCharts](https://github.com/lecho/hellocharts-android) - Charts/graphs library for Android compatible with API 8+, several chart types with support for scaling, scrolling and animations


## Crash Reporting
* [Fabric Crash Analytics](https://get.fabric.io/) - Fabric is a platform that helps your mobile team build better apps, understand your users, and grow your business
* [InstaBug](https://www.bugsnag.com/) - The top apps in the world rely on Instabug for beta testing, user engagement and crash reporting.
Gather feedback from your beta testers and have live conversations with your users
* [Bugsnag](https://www.bugsnag.com/) - Monitor application errors to improve customer experiences and code quality

## Debugging
* [LeakCanary](https://github.com/square/leakcanary) - A memory leak detection library for Android and Java
* [Stetho](https://github.com/facebook/stetho) - Stetho is a debug bridge for Android applications, enabling the powerful Chrome Developer Tools and much more
* [Android Debug Database](https://github.com/amitshekhariitbhu/Android-Debug-Database) - A library for debugging android databases and shared preferences - Make Debugging Great Again
* [Takt](https://github.com/wasabeef/Takt) - Takt is Android library for measuring the FPS using Choreographer
* [Android Performance Monitor](https://github.com/markzhai/AndroidPerformanceMonitor) - A transparent ui-block detection library for Android (known as BlockCanary)
* [Debug Drawer](https://github.com/palaima/DebugDrawer) - Android Debug Drawer for faster development

## Dependency Injection
* [Dagger 2](https://github.com/google/dagger) - A fast dependency injector for Android and Java
* [Butterknife](https://github.com/JakeWharton/butterknife) - Bind Android views and callbacks to fields and methods
* [Android Annotations](https://github.com/androidannotations/androidannotations) - Fast Android Development. Easy maintainance.
* [Dart](https://github.com/f2prateek/dart) - Extras "injection" library for Android
* [Kotterknife](https://github.com/JakeWharton/kotterknife) - View "injection" library for Android (in Kotlin)

## Image Loading

* [Glide](https://github.com/bumptech/glide) - An image loading and caching library for Android focused on smooth scrolling
* [Picasso](https://github.com/square/picasso) - A powerful image downloading and caching library for Android
* [Fresco](https://github.com/facebook/fresco) - An Android library for managing images and the memory they use 

## Image Processing

* [PhotoFiltersSDK](https://github.com/Zomato/AndroidPhotoFilters) - AndroidPhotoFilters aims to provide fast, powerful and flexible image processing instrument for creating awesome effects on any image media
* [Glide Transformations](https://github.com/wasabeef/glide-transformations) - An Android transformation library providing a variety of image transformations for Glide
* [Fresco Processors](https://github.com/wasabeef/fresco-processors) - An Android image processor library providing a variety of image transformations for Fresco
* [Picasso Transformations](https://github.com/wasabeef/picasso-transformations) - An Android transformation library providing a variety of image transformations for Picasso


## Logging
* [Timber](https://github.com/JakeWharton/timber) - A logger with a small, extensible API which provides utility on top of Android's normal Log class
* [Logger](https://github.com/orhanobut/logger) - Simple, pretty and powerful logger for Android
* [Hugo](https://github.com/JakeWharton/hugo) - Annotation-triggered method call logging for your debug builds
* [LoggingInterceptor](https://github.com/ihsanbal/LoggingInterceptor) - An OkHttp interceptor which pretty logs request and response data


## Networking
* [OkHttp](https://github.com/square/okhttp) - An HTTP+HTTP/2 client for Android and Java applications
* [Retorfit](http://square.github.io/retrofit/) - Retrofit turns your REST API into a Java interface
* [Ion](https://github.com/koush/ion) - Android Asynchronous Networking and Image Loading
* [Fast Android Networking](https://github.com/amitshekhariitbhu/Fast-Android-Networking) - A Complete Fast Android Networking Library that also supports HTTP/2

## Persistent Storage
* [Realm](https://github.com/realm/realm-java) - Realm is a mobile database: a replacement for SQLite & ORMs 
* [SQL Brite](https://github.com/square/sqlbrite) - A lightweight wrapper around SQLiteOpenHelper which introduces reactive stream semantics to SQL operations
* [DBFLow](https://github.com/Raizlabs/DBFlow) - A blazing fast, powerful, and very simple ORM android database library that writes database code for you
* [ActiveAndroid](https://github.com/pardom/ActiveAndroid) - Active record style SQLite persistence for Android 
* [Firebase Realtime Database](https://firebase.google.com/docs/database/) - Store and sync data with our NoSQL cloud database. Data is synced across all clients in realtime, and remains available when your app goes offline

## Utilities
* [Dart](https://github.com/f2prateek/dart) - Extras "injection" library for Android
* [DeepLinkDispatch](https://github.com/airbnb/DeepLinkDispatch) - A simple, annotation-based library for making deep link handling better on Android
* [PermissionsDispatcher](https://github.com/hotchemi/PermissionsDispatcher) - Simple annotation-based API to handle runtime permissions
* [Guava](https://github.com/google/guava) - Google Core Libraries for Java


# Open-Source Apps

* [AmazeFileManager](https://github.com/arpitkh96/AmazeFileManager) - Amaze File Manager source code
* [AntennaPod](https://github.com/AntennaPod/AntennaPod) - A podcast manager for Android
* [ClipStack](https://github.com/heruoxin/Clip-Stack) - A tiny clipboard history manager app
* [CoCoin](https://github.com/Nightonke/CoCoin) - CoCoin, Multi-view Accounting Application
* [EverMemo](https://github.com/daimajia/EverMemo) - Fast Record,Organize,and Share. The android memo app you will deeply love
* [Google I/O App](https://github.com/google/iosched) - The Google I/O 2016 Android App
* [IconShowcase Dashbord](https://github.com/jahirfiquitiva/IconShowcase-Dashboard) - A full-of-features, easy-to-customize, free and open source, Material Design dashboard for icon packs
* [InstaMaterial](https://github.com/frogermcs/InstaMaterial) - Implementation of Instagram with Material Design (originally based on Emmanuel Pacamalan's concept)
* [Kickstarter](https://github.com/kickstarter/android-oss) - Kickstarter for Android. Bring new ideas to life, anywhere
* [KISS](https://github.com/Neamar/KISS) - Lightning fast, open-source, < 200kb Android launcher
* [LeafPic](https://github.com/HoraApps/LeafPic) - LeafPic is an ad-free, open-source and material-designed android gallery alternative
* [LibreTorrent](https://github.com/proninyaroslav/libretorrent) - Free as in Freedom torrent client for Android
* [Materialize](https://github.com/oxoooo/materialize) - Materialize all those not material
* [MinimalTodo](https://github.com/avjinder/Minimal-Todo) - Material To-Do App
* [MLManager](https://github.com/javiersantos/MLManager) - A modern, easy and customizable app manager for Android with Material Design
* [MovieGuide](https://github.com/esoxjem/MovieGuide) - Movie discovery app showcasing MVP, RxJava, Dagger 2 and Clean Architecture. Popcorn?
* [MusicDNA](https://github.com/harjot-oberai/MusicDNA) - A Music Player for android that renders beautiful DNA(Visualization) of the currently playing music
* [Muzei Wallpaper](https://github.com/romannurik/muzei) - Muzei Live Wallpaper for Android
* [Narrate](https://github.com/timothymiko/narrate-android) - 
Narrate is a beautiful and functional open source journal for Android
* [OmniNotes](https://github.com/federicoiosue/Omni-Notes) - Open source note-taking application for Android 
* [PhotoAffix](https://github.com/afollestad/photo-affix) - 
Stitch your photos together vertically or horizontally easily!
* [Plaid](https://github.com/nickbutcher/plaid) - An Android app which provides design news & inspiration as well as being an example of implementing material design
* [QkSms](https://github.com/moezbhatti/qksms) - The most beautiful SMS messenger app for Android
* [RedReader](https://github.com/QuantumBadger/RedReader) - An unofficial open source Reddit client for Android
* [Signal](https://github.com/WhisperSystems/Signal-Android) - A private messenger for Android
* [Simple Gallery](https://github.com/SimpleMobileTools/Simple-Gallery) - A gallery for viewing photos and videos without ads
* [SoundRecorder](https://github.com/dkim0419/SoundRecorder) - A simple sound recording app implementing Material Design
* [SuperCleanMaster](https://github.com/joyoyao/superCleanMaster) - CleanMaster like open-source app
* [Talon for Twitter](https://github.com/klinker24/Talon-for-Twitter) - 100% open source version of my popular Talon for Twitter app on Android
* [Telegram](https://github.com/DrKLO/Telegram) - Telegram for Android source
* [Timber](https://github.com/naman14/Timber) - Material Design Music Player
* [Turbo Editor](https://github.com/vmihalachi/turbo-editor) - Simple and powerful File Editor for Android
* [ToolWizAppLock](https://github.com/Toolwiz/ToolWizAppLock) - Smart App Lock for Android
* [WeGit](https://github.com/Leaking/WeGit) - An Android App for Github


# Sites

* [Google Developers](https://medium.com/google-developers) - Engineering and technology articles for developers, written and curated by Googlers. The views expressed are those of the authors and don’t necessarily reflect those of Google
* [Vogella](http://www.vogella.com/tutorials/android.html) - Learn almost everything about Android development in an easy way





