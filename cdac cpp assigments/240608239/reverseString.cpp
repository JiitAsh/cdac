#include<iostream>
#include<string>
using namespace std;

void reverse(char* ch, int s, int n){
  if(s==n) return;
  char temp=ch[s];
  reverse(ch, s+1, n);
  cout<<temp;
}

int main(){
  char ch[]="ACTS";
  cout<<"Before Reversal: "<<ch<<endl;
  int n=sizeof(ch)/sizeof(ch[0]);
cout<<"After Reversal: ";
  reverse(ch, 0, n);
  return 0;
}
