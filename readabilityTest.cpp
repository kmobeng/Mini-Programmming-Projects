#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    string paragraph;
    double averageLetters, averageSentence,score,countLetters=0,countSentence=0,countSpace=0,countWords,roundscore;

    cout << "Enter the paragraph:\n";
    getline(cin , paragraph);

    for (int i = 0; i < paragraph.length(); i++)
    {
        if (paragraph[i] == '.' || paragraph[i] == '?' || paragraph[i] == '!')
        {
            countSentence++;
        }
        else if ((paragraph[i] >= 'A' && paragraph[i] <= 'Z') || (paragraph[i] >= 'a' && paragraph[i] <= 'z'))
        {
            countLetters++;
        }
        else if (paragraph[i] == ' ')
        {
            countSpace++;
        }
    }
    countWords = countSpace + 1;
    averageLetters = (countLetters / countWords) * 100;
    averageSentence = (countSentence / countWords) * 100;
    score = (0.0588 * averageLetters) - (0.296 * averageSentence) - 15.8;
    roundscore = round(score);

    if (score >= 16)
    {
        cout << "Grade 16+";
    }
    else if (score >= 1)
    {
        cout << "Grade " << roundscore;
    }
    else
    {
        cout << "Before Grade 1";
    }
    return 0;
}