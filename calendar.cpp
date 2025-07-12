#include <iostream>

using namespace std;
void tab(int x);

int main()
{
    int numofDays,index;
    string firstDay;
    cout << "Enter the number of days: ";
    cin >> numofDays;
    cout << "What is the first day: ";
    cin >> firstDay;
    if (firstDay == "Monday" || firstDay == "monday")
    {
        index = 1;
    }
    else if (firstDay == "Tuesday" || firstDay == "tuesday")
    {
        index = 2;
    }
    else if (firstDay == "Wednesday" || firstDay == "wednesday")
    {
        index = 3;
    }
    else if (firstDay == "Thursday" || firstDay == "thursday")
    {
        index = 4;
    }
    else if (firstDay == "Friday" || firstDay == "friday")
    {
        index = 5;
    }
    else if (firstDay == "Saturday" || firstDay == "saturday")
    {
        index = 6;
    }
    else if (firstDay == "Sunday" || firstDay == "sunday")
    {
        index = 7;
    }

    cout << "MON\t" << "TUE\t" << "WED\t" << "THUR\t" << "FRI\t" << "SAT\t" << "SUN" << endl; 
    int space = index - 1;
    int count = 1;
    for (int i = 0; i <= (numofDays + space)/7 + 1; i++)
    {
        for (int j = space; j < 7; j++)
        {
            if (count > numofDays)
            {
                return 0;
            }
            else
            {
                tab(space);
                cout << count << "\t";
                count ++;
            }  
            space = 0;
        }
        cout << endl;
    }
    return 0;
}

void tab(int x)
{
    for (int i = 0; i < x; i++)
    {
        cout << "\t";
    }   
}