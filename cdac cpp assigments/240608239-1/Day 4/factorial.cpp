#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int findFactorial(int n){
if(n==0||n==1){
  return 1;
}
return n*findFactorial(n-1);
}
int main(){
int n;
cin>>n;
vector<int> ans;
ans.push_back(findFactorial(n));
for(auto it: ans) cout<<it<<" ";
return 0;
}
