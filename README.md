
This is QuizApp in Android which contains multiple choice questions.
The Topics Covered in this Project are: 
1.Activity
2.Intent
3.Android UI and Layouts

Before moving towards project let understand the following topics:

1.Activity: An Activity is an fundamental component that provides a screen with which users can interact in order to do something.
Android activity is the subclass of ContextThemeWrapper class.

2.Intent: Android uses Intent for communicating between the components of an Application and also from one application to another application. 
Intent are the objects which is used in android for passing the information among Activities in an Application and from one app to another also.

There are three types of intents: 
i).Explicit Intent 
ii)Implicit Intent 
iii)Pending Intent

3.Android UI and Layouts: Android Layout is used to define the user interface that holds the UI controls or widgets that will appear on the screen of an android 
application or activity screen. Generally, every application is a combination of View and ViewGroup. As we know, an android application contains a large number of
activities and we can say each activity is one page of the application. So, each activity contains multiple user interface components and those components are the 
instances of the View and ViewGroup. All the elements in a layout are built using a hierarchy of View and ViewGroup objects.

Now moving towards our project, In this project there are 4 java files namely MainActivity.java,AboutActivity.java,question1MainActivity.java,
QuitMainActivity2.java and each file have their separate layout xml file namely activity_main.xml,aboutlayout.xml,activity_question1_main.xml,
activity_quit_main2.xml.

MainActivity.java is for front screen of application,AboutActivity.java is for about screen of application,question1MainActivity.java 
this is for handdling the questions and answers ,QuitMainActivity2.java is for showing the result of quiz.

ScreenShot Of QuizzApp:

To start a Quiz you must enter your name otherwise it will display Toast Message that "First Enter Your Name to Start a Quiz"..

QuizzApp1

A Quiz will start only if user enters the name.

QuizzApp2

This page contains one question which has 4 options and only one option is correct,If user doesn't select one of the option toast message will appear to select one of the option.If selected ans is correct then toast message will appear showing correct message if it is wrong it will show wrong message.

QuizzApp3

This is the result page which contains number of correct questions attempted by user along with wrong questions and final score.

QuizApp

This is the about page which cotains the static information regarding the developers.

QuizzApp5


This Video illustrates how the application works:

https://github.com/VedantiBhoyar/QuizApplication/assets/71519458/985314fa-c6d5-41e7-86a5-d2150942013e




