#include<iostream>
using namespace std;


void Add(){
        int num1, num2;
        cout<<"Please enter the two numbers: ";
        cin>>num1>>num2;
        cout<<"\nThe addition is: "<<num1+num2;
}
void Sub(){
        int num1, num2;
        cout<<"Please enter the two numbers: ";
        cin>>num1>>num2;
        cout<<"\nThe subtraction is: "<<num1-num2;
}
void Mult(){
        int num1, num2;
        cout<<"Please enter the two numbers: ";
        cin>>num1>>num2;
        cout<<"\nThe multiplication is: "<<num1*num2;
}
void Div(){
        int num1, num2;
        cout<<"Please enter the two numbers: ";
        cin>>num1>>num2;
        cout<<"\nThe division is: "<<num1/num2;
}
int main(){
int option;
cout<<"Please enter any one: 1. Addition; 2. Subtraction; 3. Multiplication; 4. Division"<<endl;
cin>>option;
switch(option)
        {
 case 1: Add();
        break;
 case 2: Sub();
        break;
 case 3: Mult();
        break;
 case 4: Div();
        break;
 default: cout<<"Please Enter a number from the above."<<endl;
        }
return 0;
}
                                                                                                                                                                                                           
                                                                                                                                                                                                           
         
