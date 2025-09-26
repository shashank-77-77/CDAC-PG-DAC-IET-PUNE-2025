#include <iostream>
#include <fstream>
#include <string>
#include <vector>

using namespace std;

// ---------------- Exceptions ----------------
struct InvalidMarkException {
    string msg;
    InvalidMarkException(string m) : msg(m) {}
};

struct DuplicateRollNoException {
    string msg;
    DuplicateRollNoException(int roll) { msg = "Duplicate roll number: " + to_string(roll); }
};

struct EmptyGradebookException {
    string msg;
    EmptyGradebookException() { msg = "Gradebook is empty."; }
};

struct StudentNotFoundException {
    string msg;
    StudentNotFoundException(int roll) { msg = "Student with roll number " + to_string(roll) + " not found."; }
};

// ---------------- Student ----------------
class Student {
    int rollNo;
    string name;
    int marks[3]; // plain C array

    void validateMark(int m) {
        if (m < 0 || m > 100) throw InvalidMarkException("Marks must be between 0 and 100.");
    }
public:
    Student() { rollNo = 0; name = ""; marks[0]=marks[1]=marks[2]=0; }
    Student(int roll, string n, int m1, int m2, int m3) {
        rollNo = roll; name = n;
        setMarks(m1, m2, m3);
    }

    int getRollNo() const { return rollNo; }
    string getName() const { return name; }

    void setMarks(int m1, int m2, int m3) {
        validateMark(m1); validateMark(m2); validateMark(m3);
        marks[0]=m1; marks[1]=m2; marks[2]=m3;
    }

    double average() const {
        return (marks[0]+marks[1]+marks[2]) / 3.0;
    }

    bool operator>(const Student& other) const {
        return this->average() > other.average();
    }

    Student& operator++() { // prefix
        for (int i=0;i<3;i++) if (marks[i] < 100) marks[i]++;
        return *this;
    }

    Student operator++(int) { // postfix
        Student tmp = *this;
        ++(*this);
        return tmp;
    }

    string toLine() const {
        return to_string(rollNo) + "|" + name + "|" +
               to_string(marks[0]) + "|" + to_string(marks[1]) + "|" + to_string(marks[2]);
    }

    static Student fromLine(const string& line) {
        int parts[5], count=0;
        string tokens[5];
        string temp="";
        for (char c : line) {
            if (c=='|') { tokens[count++]=temp; temp=""; }
            else temp+=c;
        }
        tokens[count++]=temp;

        if (count!=5) throw InvalidMarkException("Corrupt record.");

        int roll = stoi(tokens[0]);
        string name = tokens[1];
        int m1 = stoi(tokens[2]);
        int m2 = stoi(tokens[3]);
        int m3 = stoi(tokens[4]);

        return Student(roll, name, m1, m2, m3);
    }

    void print() const {
        cout << "Roll: " << rollNo << " | Name: " << name
             << " | Marks: " << marks[0] << " " << marks[1] << " " << marks[2]
             << " | Avg: " << average() << "\n";
    }
};

// ---------------- Gradebook ----------------
class Gradebook {
    vector<Student> students;

public:
    void addStudent(const Student& s) {
        for (auto& st : students)
            if (st.getRollNo() == s.getRollNo()) throw DuplicateRollNoException(s.getRollNo());
        students.push_back(s);
    }

    Student& getStudent(int roll) {
        if (students.empty()) throw EmptyGradebookException();
        for (auto& s : students) if (s.getRollNo()==roll) return s;
        throw StudentNotFoundException(roll);
    }

    void updateMarks(int roll, int m1, int m2, int m3) {
        getStudent(roll).setMarks(m1,m2,m3);
    }

    void giveBonusToStudent(int roll) {
        ++getStudent(roll);
    }

    void giveBonusToAll() {
        if (students.empty()) throw EmptyGradebookException();
        for (auto& s : students) ++s;
    }

    void listStudents() const {
        if (students.empty()) throw EmptyGradebookException();
        for (auto& s : students) s.print();
    }

    void topper() const {
        if (students.empty()) throw EmptyGradebookException();
        const Student* best = &students[0];
        for (auto& s : students) {
            if (s > *best) best = &s;
        }
        cout << "Topper: "; best->print();
    }

    void loadFromFile(const string& filename) {
        students.clear();
        ifstream in(filename);
        if (!in) return;
        string line;
        while (getline(in, line)) {
            if (line.empty()) continue;
            students.push_back(Student::fromLine(line));
        }
    }

    void saveToFile(const string& filename) const {
        ofstream out(filename);
        for (auto& s : students) out << s.toLine() << "\n";
    }
};

// ---------------- Main ----------------
int main() {
    Gradebook gb;
    string filename = "gradebook.txt";
    gb.loadFromFile(filename);

    while (true) {
        cout << "\nMenu:\n"
             << "1. Add student\n"
             << "2. List students\n"
             << "3. Update marks\n"
             << "4. Bonus to student\n"
             << "5. Bonus to all\n"
             << "6. Show topper\n"
             << "7. Save & Exit\n"
             << "Choice: ";
        int choice; cin >> choice;
       
            if (choice==1) {
                int roll,m1,m2,m3; string name;
                cout << "Roll No: "; cin >> roll;
                cin.ignore();
                cout << "Name: "; getline(cin,name);
                cout << "Marks (3): "; cin >> m1 >> m2 >> m3;
                gb.addStudent(Student(roll,name,m1,m2,m3));
            }
            else if (choice==2) gb.listStudents();
            else if (choice==3) {
                int roll,m1,m2,m3;
                cout << "Roll No: "; cin >> roll;
                cout << "Marks (3): "; cin >> m1 >> m2 >> m3;
                gb.updateMarks(roll,m1,m2,m3);
            }
            else if (choice==4) {
                int roll; cout << "Roll No: "; cin >> roll;
                gb.giveBonusToStudent(roll);
            }
            else if (choice==5) gb.giveBonusToAll();
            else if (choice==6) gb.topper();
            else if (choice==7) { gb.saveToFile(filename); cout << "Saved. Bye!\n"; break; }
            else cout << "Invalid choice.\n";
       
    }
    return 0;
}
