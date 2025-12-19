namespace EventAndDelegate
{
    public delegate void MyHandler(int mark);
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your marks");
            Student student = new Student();

            student._pass += new MyHandler(student.student_Pass);
            student._fail += new MyHandler(student.student_Fail);

            student.Marks=Convert.ToInt32(Console.ReadLine());

            student.TriggerEvents(student.Marks);
        }
    }
    public class Student
    {
        public event MyHandler _pass;
        public event MyHandler _fail;

        private int _marks;

        public int Marks
        {
            get
            { 
                return _marks; 
            }
            set 
            {
                _marks = value;
                if(_marks > 16)
                {
                    _pass(_marks);
                }
                else
                {
                    _fail.Invoke(_marks);
                }
            }
        }
        public void TriggerEvents(int mark)
        {
            if (mark > 40)
            {
                _pass(mark);
            }
            else
            {
                _fail(mark);
            }

        }
        public void student_Pass(int mark)
        {
            Console.WriteLine($"Congratulations !!! ,you have passed with {mark} marks ");
        }
        public void student_Fail(int marks)
        {
            Console.WriteLine($"Sorry you have failed with {marks} marks !!!");
        }


    }
}
