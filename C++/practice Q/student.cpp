#include <iostream>
#include <fstream>
#include <vector>
//#include <stdexcept>
using namespace std;

class Student {
public:
    int rollNo; string name; int marks[3];
    Student(int r = 0, string n = "", int m1 = 0, int m2 = 0, int m3 = 0) : rollNo(r), name(n) {
        if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100)
            throw invalid_argument("Invalid marks");
        marks[0] = m1; marks[1] = m2; marks[2] = m3;
    }
    float avg() const { return (marks[0] + marks[1] + marks[2]) / 3.0f; }
    Student& operator++() { for (int &m : marks) if (m < 100) ++m; return *this; }
    bool operator>(const Student &s) const { return avg() > s.avg(); }
    void display() const { cout << rollNo << " " << name << " " << marks[0] << " " << marks[1] << " " << marks[2] << endl; }
};

class Gradebook {
    vector<Student> students;
public:
    Gradebook() { load(); }
    void add(const Student& s) {
        for (auto& st : students) if (st.rollNo == s.rollNo) throw runtime_error("Duplicate roll number");
        students.push_back(s); save();
    }
    void save() {
        ofstream f("gradebook.txt"); for (auto& s : students)
            f << s.rollNo << " " << s.name << " " << s.marks[0] << " " << s.marks[1] << " " << s.marks[2] << endl;
    }
    void load() {
        students.clear(); ifstream f("gradebook.txt");
        int r, m1, m2, m3; string n;
        while (f >> r >> n >> m1 >> m2 >> m3) students.emplace_back(r, n, m1, m2, m3);
    }
    void searchAndUpdate(int roll, int m1, int m2, int m3) {
        if (students.empty()) throw runtime_error("Gradebook is empty");
        for (auto &s : students) if (s.rollNo == roll) {
            s = Student(roll, s.name, m1, m2, m3); save(); return;
        }
        throw runtime_error("Student not found");
    }
    vector<Student>& getAll() { return students; }  // expose for modification
    void showAll() const { for (auto& s : students) s.display(); }
};

int main() {
    Gradebook gb;
    try {
        gb.add(Student(1, "Alice", 78, 85, 90));
        gb.add(Student(2, "Bob", 88, 76, 95));
        gb.add(Student(3, "007soham", 89, 79, 100));
        for (auto& s : gb.getAll()) ++s;  // Apply bonus marks
        gb.searchAndUpdate(1, 100, 90, 91);  // update marks
        gb.showAll();
    } catch (exception &e) { cerr << "Error: " << e.what() << endl; }
    return 0;
}
