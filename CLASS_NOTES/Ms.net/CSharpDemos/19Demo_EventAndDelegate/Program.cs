namespace _19Demo_EventAndDelegate
{
    public delegate void MyHandler(int mrk);
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your marks:");
            

            Student student = new Student();

            // Coupling of Events with Delegate by using += coupling operator
            // this.button1.Click += new EventHandler(this.button1_Click);

            student._Pass += new MyHandler(student.student_Pass);
            student._Fail += new MyHandler(student.student_Fail);

            student.Marks = Convert.ToInt32(Console.ReadLine());

            student.TriggerEvents(student.Marks);

            //MyHandler passHandler = new MyHandler(student.student_Pass);
            //MyHandler failHandler = new MyHandler(student.student_Fail);

            

            
            //student._Pass(2);// not allowed outsid ethe type Class Student

            #region 01 Approach
            //if (mrk > 40)
            //{
            //    student.student_Pass(mrk);
            //}
            //else
            //{
            //    student.student_Fail(mrk);
            //} 
            #endregion


        }
    }
    public class Student
    {
        // Event Syntax:
        // accessModifier 'event' DelegateName/EventHandlerName Event_Name;

        public event MyHandler _Pass;
        public event MyHandler _Fail;

        private int _Marks;

        public int Marks
        {
            set
            {
                _Marks = value;
                if (_Marks > 40)
                {
                    _Pass(_Marks);
                }
                else
                {
                    _Fail.Invoke(_Marks);
                }
            }
            get
            {
                return _Marks;
            }
        }

        #region 02 Approach 
        //public int Marks
        //{
        //    set 
        //    {
        //        _Marks = value;
        //        if (_Marks > 40)
        //        {
        //            student_Pass(_Marks);
        //        }
        //        else
        //        {
        //            student_Fail(_Marks);
        //        }
        //    }
        //    get
        //    {
        //        return _Marks;
        //    }
        //} 
        #endregion

        public void TriggerEvents(int mrk)
        {
            if (mrk > 40)
            {
                _Pass(_Marks);
            }
            else 
            {
                _Fail.Invoke(mrk);
            }
        }
        public void student_Pass(int marks)
        {
            Console.WriteLine($"Congratulations!!!, you have passed with {marks} marks!!!");
        }
        public void student_Fail(int marks)
        {
            Console.WriteLine($"Congratulations!!!, you have failed with {marks} marks!!!");
        }
    }
}
