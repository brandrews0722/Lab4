# Lab4
CS590 Lab 4

##Objectives

1)Welcome page to show the application name and should have two buttons as follows:
Sign In
SignUp
2)On clicking Sign In button user should provide authentication details in twoways:
ManualLogin
Social Login using Facebook or Google orTwitter 
Implement Forgot Password Feature
3)On clicking Sign Up buttonuser should have a form to take basic information from theuser.
Takes the user to IndexPage4)IndexPageShould have buttons like Go to Home Page,help, settings etc. 
(You can have more as  per  your  imagination  to  make  the  application  look  more  interactive  and  better) 
and should navigate to different pages when user click on these respective buttons

### Technologies Used
Android Studio
Firebase

### Solution
I implemented the Google login with Firebase.  I created a handful of activities for the various pages.
To implement the manual user login and sign up I created a class that extends the Application.
This allowed me to create a global Map to store usernames and passwords.  These would be used for 
logging in and retrieving passwords.