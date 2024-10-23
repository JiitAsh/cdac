#include<iostream>
#include<bits/stdc++.h>
using namespace std;


struct Student{
  int rNo;
  string name;
}; 

void display(Student *s, int n){
  for(int i=0; i<n; i++){
    cout<<"Student 1: "<<s[i].name<<" "<<s[i].rNo<<endl;
  }
 return; 
}
int main(){
 int n;
 cout<<"Enter the no of students: ";
 cin>>n;
 Student s[n];
 for(int i=0; i<n; i++){
   cout<<"Enter the name of the student "<<(i+1)<<" ";
   cin>>s[i].name;
   cout<<"\nEnter the roll no of student "<<(i+1)<<" ";
   cin>>s[i].rNo; 
 }
 display(s, n);
return 0;
}
