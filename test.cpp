#include <iostream>

using namespace std;

class Employee
{
    public:
    string name;
    int age;
    char gender;
    double salary;
    void requestPromotion(double age)
    {
        if (age >= 40)
        {
            cout << "You are qualified for promotion and your application will be reviewed🎉\n";
        }
        else
        {
            cout << "Sorry! You are not qualified for a promotion at the moment. The age requirement is 40 and above.\n";
        }
    }
    void requestSalaryIncrease()
    {
        double salary;
        int workingYears;
        cout << "Enter your current salary: ";
        cin >> salary;
        cout << "Enter the number of years you have worked at this company: ";
        cin >> workingYears;
        cout << "Your application has been accepted and will be reviewed!🎉\n";
    }
};

int main()
{
    Employee employee;
    bool isRegistered = false;
    while (true)
    {
        int choice;
        cout << "What do you want to do: \n";
        cout << "1. Register as an employee? \t";
        cout << "2. Ask for promotion? \t";
        cout << "3. Ask for salary increase? \n";
        cin >> choice;
        cin.ignore();

        switch (choice)
        {
        case 1:
            cout << "Enter your name: ";
            getline(cin, employee.name);
            cout << "Enter your age: ";
            cin >> employee.age;
            cout << "What is your gender?\nChoose one of the options\n";
            cout << "1.Male\t 2.Female\n";
            cin >> employee.gender;
            isRegistered = true;
            break;
        case 2:
            if (!isRegistered)
            {
                cout << "You have to register first\n";
                cout << "Enter your name: ";
                getline(cin, employee.name);
                cout << "Enter your age: ";
                cin >> employee.age;
                cout << "What is your gender?\nChoose one of the options\n";
                cout << "1.Male\t 2.Female\n";
                cin >> employee.gender;
                isRegistered = true;
            }
            
            employee.requestPromotion(employee.age);
            break;
        case 3:
            if (!isRegistered)
            {
                cout << "You have to register first\n";
                cout << "Enter your name: ";
                getline(cin, employee.name);
                cout << "Enter your age: ";
                cin >> employee.age;
                cout << "What is your gender?\nChoose one of the options\n";
                cout << "1.Male\t 2.Female\n";
                cin >> employee.gender;
                isRegistered = true;
            }
            employee.requestSalaryIncrease();
            break;
        default:
            cout << "Invalid input!\n";
            break;
        }
    }
    return 0;
}