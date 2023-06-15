#include<iostream>
#include<stdlib.h>
#define size 5
using namespace std;

class queue{
	int a[size];
	int front;
	int rear;
	public:
		queue(){
			front=-1;
			rear=-1;
		}
		int isFull();
		int isEmpty();
		void insert(int );
		int del();
		void display();
};

int queue ::isFull(){
	if((rear+1)%size==front){
		return 1;
	}
	return 0;
}

int queue ::isEmpty(){
	if(front==rear){
		return 1;
	}
	return 0;
}

void queue ::insert(int item){
	if(isFull()){
		cout<<"Queue overflow."<<endl;
		return ;
	}
	rear=(rear+1)%size;
	a[rear]=item;
}

int queue ::del(){
	if(isEmpty()){
		cout<<"Queue underflow."<<endl;
		return 1;
	}
	front=front%size;
	front++;
	int x=a[front];
	return x;
}

void queue ::display(){
	int i;
	if(isEmpty()){
		cout<<"Queue is empty."<<endl;
		return ;
	}
	front=front%size;
	rear=rear%size;
	for(i=front+1;i<=rear;i++){
		cout<<a[i]<<endl;
	}
}
int main(){
	queue q;
	int ch;
	int k,l;
	int item;
	while(1){
		cout<<"1.Check full or not."<<endl;
		cout<<"2.Check empty or not."<<endl;
		cout<<"3.Insert."<<endl;
		cout<<"4.Delete."<<endl;
		cout<<"5.Display"<<endl;
		cout<<"0.Exit."<<endl;
		cout<<"Enter your choice = ";
		cin>>ch;
		switch(ch){
			case 1:
				if(q.isFull()){
					cout<<"Queue is full."<<endl;
				}
				else{
					cout<<"Queue is not full."<<endl;
				}
				break;
			case 2:
				if(q.isEmpty()){
					cout<<"Queue is empty."<<endl;
				}
				else{
					cout<<"Queue is not empty."<<endl;
				}
				break;
			case 3:
				cout<<"Enter the item= "<<endl;
				cin>>item;
				q.insert(item);
				break;
			case 4:
				l=q.del();
				cout<<l<<endl;
				break;
			case 5:
				q.display();
				break;
			case 0:
				return 0;
				break;
			default:
				cout<<"Enter right choice."<<endl;
		}
	}
	return 0;
}
