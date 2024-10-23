#include<iostream>
using namespace std;

void swapFunc(int &num1, int &num2){
 	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
}

int main(){
int num1;
int num2;
cin>>num1>>num2;
cout<<"Before swapping: "<<endl;
cout<<"Num1= "<<num1<<", Num2= "<<num2<<endl;
swapFunc(num1, num2);
cout<<"After swapping: "<<endl;
cout<<"Num1= "<<num1<<", Num2= "<<num2<<endl;
return 0;
}
