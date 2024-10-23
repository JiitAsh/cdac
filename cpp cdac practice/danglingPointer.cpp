// delete method deletes the value in heap,still pointer in stack points the address of heap memory. so delete just 
// deletes(or just revert the porcess means if there was a garbage value 489, then after assigning a new value 
// using *ptr=45 the value will change to 45, but when we delete like delete []ptr, it erases 45, and now the value 
// is again 489.)


#include<bits/stdc++.h>
using namespace std;

int main(){

    int* p1=new int;
    cout<<p1<<endl;
    cout<<*p1<<endl;
    cout<<&p1<<endl<<endl;

    int* p2=new int;
    
    cout<<p2<<endl;
    cout<<*p2<<endl;
    cout<<&p2<<endl<<endl;
    *p1=67;
    p2=p1;

    cout<<p1<<endl;
    cout<<*p1<<endl;
    cout<<&p1<<endl<<endl;

    cout<<p2<<endl;
    cout<<*p2<<endl;
    cout<<&p2<<endl<<endl;
    // string s="0x681850";
    // cout<<*s<<endl;
    delete []p1;
    cout<<p1<<endl;
    cout<<*p1<<endl;
    cout<<&p1<<endl<<endl;

    cout<<p2<<endl;
    cout<<*p2<<endl;
    cout<<&p2<<endl<<endl;
    
    return 0;
}