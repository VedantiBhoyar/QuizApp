
This is QuizApp in Android which contains multiple choice questions.<br>
The Topics Covered in this Project are: <br>
1.Activity<br>
2.Intent<br>
3.Android UI and Layouts<br>

Before moving towards project let understand the following topics:

#

<h3>1.Activity:</h3> An Activity is an fundamental component that provides a screen with which users can interact in order to do something.
Android activity is the subclass of ContextThemeWrapper class.

#

  <h3>2.Intent:</h3> Android uses Intent for communicating between the components of an Application and also from one application to another application. 
Intent are the objects which is used in android for passing the information among Activities in an Application and from one app to another also.

There are three types of intents: <br>
i).Explicit Intent <br>
ii)Implicit Intent <br>
iii)Pending Intent<br>

#

<h3>3.Android UI and Layouts:</h3> Android Layout is used to define the user interface that holds the UI controls or widgets that will appear on the screen of an android 
application or activity screen. Generally, every application is a combination of View and ViewGroup. As we know, an android application contains a large number of
activities and we can say each activity is one page of the application. So, each activity contains multiple user interface components and those components are the 
instances of the View and ViewGroup. All the elements in a layout are built using a hierarchy of View and ViewGroup objects.

#

Now moving towards our project, In this project there are 4 java files namely MainActivity.java,AboutActivity.java,question1MainActivity.java,
QuitMainActivity2.java and each file have their separate layout xml file namely activity_main.xml,aboutlayout.xml,activity_question1_main.xml,
activity_quit_main2.xml.

MainActivity.java is for front screen of application,AboutActivity.java is for about screen of application,question1MainActivity.java 
this is for handdling the questions and answers ,QuitMainActivity2.java is for showing the result of quiz.

#

<h3>ScreenShot Of QuizzApp:</h3>

To start a Quiz you must enter your name otherwise it will display Toast Message that "First Enter Your Name to Start a Quiz"..

![Screenshot (51)](https://github.com/VedantiBhoyar/QuizApplication/assets/71519458/368319ad-dd06-4a47-bf36-44eab1c0f613)

#

A Quiz will start only if user enters the name.

![Screenshot (52)](https://github.com/VedantiBhoyar/QuizApplication/assets/71519458/f956a667-56de-4a15-967b-aeb33afa8cbb)

#

This page contains one question which has 4 options and only one option is correct,If user doesn't select one of the option toast message will appear to select one of the option.If selected ans is correct then toast message will appear showing correct message if it is wrong it will show wrong message.


![Screenshot (53)](https://github.com/VedantiBhoyar/QuizApplication/assets/71519458/51aaa450-8712-4e59-b422-4eb88f282097)



![Screenshot (54)](https://github.com/VedantiBhoyar/QuizApplication/assets/71519458/38e8d503-37b6-47fc-8edc-d0dc255d82d0)

#

This is the result page which contains number of correct questions attempted by user along with wrong questions and final score.


![Screenshot (55)](https://github.com/VedantiBhoyar/QuizApplication/assets/71519458/04735e9c-0c0b-47d2-b22a-8ffa8deabe0e)

#

This Video illustrates how the application works:


https://github.com/VedantiBhoyar/QuizApplication/assets/71519458/dd719acb-64e8-46b9-b20f-ac9fa67a7069

#





