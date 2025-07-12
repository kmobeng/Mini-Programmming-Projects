#include <iostream>

using namespace std;

int main()
{
    int creditHours,numofCourses,creditscore;
    double marks,totalMarks=0,totalCreditHours=0,CWA;
    cout << "Enter the number of courses: ";
    cin >> numofCourses;
    cout << "Enter the number of credit hours: ";
    cin >> creditHours;
    for (int i = 0; i < numofCourses; i++)
    {
        cout << "Enter the marks for course " << i+1 << " : ";
        cin >> marks;
        cout << "Enter the credit score of course " << i+1 << " : ";
        cin >> creditscore;
        totalMarks+= (marks * creditscore);
        totalCreditHours+= creditscore;
    }
    if (totalCreditHours != creditHours)
    {
        cout << "Enter correct number of credit hours!";
        return 0;
    }
    CWA = (totalMarks/totalCreditHours);
    cout << "Your total marks is " << totalMarks << endl;
    cout << "Your CWA is " << CWA;
    return 0;
}