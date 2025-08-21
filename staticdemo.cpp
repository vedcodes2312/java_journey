#include<iostream>
using namespace std;

class Box {
private: 
    double length, breadth, height;
    static int count;

public:
    Box(double length, double breadth, double height) {
        this->length = length;
        this->breadth = breadth;
        this->height = height;
        count = count + 1;
    }

    static void printcount() {
        cout << "count is: " << count << endl;
    }

    static void printCountAddress() {
        cout << "Address of count: " << &count << endl;
    }
};

int Box::count = 0;

int main() {
    Box b1(6.5566, 7.88, 6.455);
    Box::printcount();
    Box::printCountAddress();

    Box b2(7.14, 2.399, 5.0098);
    Box::printcount();
    Box::printCountAddress();

    Box b3(8, 9, 9);
    Box b4(7, 8, 0.8888);
    Box::printcount();
    Box::printCountAddress();

    return 0;
}

