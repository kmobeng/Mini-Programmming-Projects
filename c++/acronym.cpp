#include <iostream>

using namespace std;

int main()
{
    string phrase,acronym="";
    cout << "Enter the phrase: ";
    getline(cin, phrase);
    if (phrase[0] >= 97 && phrase[0] <= 122)
    {
        acronym += phrase[0] - 32;
    }
    else
    {
        acronym += phrase[0];
    }
    for (int i = 1; i < phrase.length(); i++)
    {
        if (phrase[i] == ' ' || phrase[i] == '-')
        {
            if (phrase[i+1] >= 97 && phrase[i+1] <= 122 && phrase[i + 1] != ' ')
            {
                acronym += phrase[i+1] - 32;
            }
            else if(phrase[i + 1] != ' ' && phrase[i + 1] != '-')
            {
                acronym += phrase[i+1];
            } 
        }
    }
    cout << "The acronym for the phrase is " << acronym;
    return 0;
}